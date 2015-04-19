package ru.simplesys
package smartclient
package macrojvm

import scala.language.experimental.macros
import scala.reflect.macros._
import scala.reflect.macros.whitebox.Context
import scala.collection._

//import upickle._
//import upickle.Aliases._

import prickle._
import cmntypes._

object SCPropsPickler {
  private def resolvingCollection[P](coll: Any, elems: Seq[P], state: PickleState, config: PConfig[P]): P = {
    config.makeArray(elems: _*)
  }


  implicit def immutableSeqPickler[T](implicit pickler: Pickler[T]): Pickler[collection.immutable.Seq[T]] =
    new Pickler[collection.immutable.Seq[T]] {

      def pickle[P](value: collection.immutable.Seq[T], state: PickleState)(implicit config: PConfig[P]): P = {
        resolvingCollection[P](value, value.map(e => Pickle(e, state)), state, config)
      }
    }

  implicit def seqPickler[T](implicit pickler: Pickler[T]): Pickler[Seq[T]] = new Pickler[Seq[T]] {
    def pickle[P](value: Seq[T], state: PickleState)(implicit config: PConfig[P]): P = {
      resolvingCollection[P](value, value.map(e => Pickle(e, state)), state, config)
    }
  }

  implicit def iterablePickler[T](implicit pickler: Pickler[T]): Pickler[Iterable[T]] = new Pickler[Iterable[T]] {
    def pickle[P](value: Iterable[T], state: PickleState)(implicit config: PConfig[P]): P = {
      resolvingCollection[P](value, value.map(e => Pickle(e, state)).toSeq, state, config)
    }
  }

  implicit def setPickler[T](implicit pickler: Pickler[T]): Pickler[Set[T]] = new Pickler[Set[T]] {
    def pickle[P](value: Set[T], state: PickleState)(implicit config: PConfig[P]): P = {
      resolvingCollection[P](value, value.map(e => Pickle(e, state)).toSeq, state, config)
    }
  }


  implicit def materializePicklerSCProp[T <: SCProps]: Pickler[T] = macro SCPropPicklerMaterializersImpl.materializePickler[T]

  implicit def materializeUnpicklerSCProp[T <: SCProps with SCPropsFromJSON]: Unpickler[T] = macro SCPropPicklerMaterializersImpl.materializeUnpickler[T]

  implicit def scPropOptUnpickler[X](implicit ku: Unpickler[X]): Unpickler[SCPropOpt[X]] = new Unpickler[SCPropOpt[X]] {

    import scala.collection._
    import prickle._

    def unpickle[P](pickle: P, state: mutable.Map[String, Any])(implicit config: PConfig[P]): scala.util.Try[SCPropOpt[X]] = {
      ku.unpickle(pickle, state).map(x => SCPropVal(x))
    }
  }

  implicit def immutableSeqUnpickler[T](implicit unpickler: Unpickler[T]): Unpickler[collection.immutable.Seq[T]] =  new Unpickler[collection.immutable.Seq[T]] {
    def unpickle[P](pickle: P, state: mutable.Map[String, Any])(implicit config: PConfig[P]): scala.util.Try[collection.immutable.Seq[T]] = {
      unpickleSeqish[T, collection.immutable.Seq[T], P](x => collection.immutable.Seq.apply(x: _*), pickle, state)
    }
  }

  implicit def seqUnpickler[T](implicit unpickler: Unpickler[T]): Unpickler[Seq[T]] =  new Unpickler[Seq[T]] {
    def unpickle[P](pickle: P, state: mutable.Map[String, Any])(implicit config: PConfig[P]): scala.util.Try[Seq[T]] = {
      unpickleSeqish[T, Seq[T], P](x => x, pickle, state)
    }
  }

  implicit def iterableUnpickler[T](implicit unpickler: Unpickler[T]): Unpickler[Iterable[T]] =  new Unpickler[Iterable[T]] {
    def unpickle[P](pickle: P, state: mutable.Map[String, Any])(implicit config: PConfig[P]): scala.util.Try[Iterable[T]] = {
      unpickleSeqish[T, Iterable[T], P](x => x, pickle, state)
    }
  }

  implicit def setUnpickler[T](implicit unpickler: Unpickler[T]): Unpickler[Set[T]] =  new Unpickler[Set[T]] {
    def unpickle[P](pickle: P, state: mutable.Map[String, Any])(implicit config: PConfig[P]): scala.util.Try[Set[T]] = {
      unpickleSeqish[T, Set[T], P](x => x.toSet, pickle, state)
    }
  }

  private def unpickleSeqish[T, S, P](f: Seq[T] => S, pickle: P, state: mutable.Map[String, Any])
                                     (implicit config: PConfig[P],
                                      u: Unpickler[T]): scala.util.Try[S] = {

    import config._
    readArrayLength(pickle).flatMap(len => {
      val seq = (0 until len).map(index => u.unpickle(readArrayElem(pickle, index).get, state).get)
      val result = f(seq)
      //Unpickler.resolvingSharing(result, pickle, state, config)
      scala.util.Try(result)

    })
  }
}

object SCPropPicklerMaterializersImpl {
  def materializePickler[T <: SCProps : c.WeakTypeTag](c: Context): c.Expr[Pickler[T]] = {
    import c.universe._

    val tpe = weakTypeOf[T]

    if (!tpe.typeSymbol.isClass)
      c.abort(c.enclosingPosition, s"${tpe.toString} is not class")

    val tsSCProps = typeOf[SCProps].typeSymbol
    val tsUnit = typeOf[Unit].typeSymbol

    //additional check for T <: SCProps. It works for some reason.!!
    if (!tpe.baseClasses.contains(tsSCProps)) {
      //println(s"wowowow: ${tpe.toString}")
      c.abort(c.enclosingPosition, s"${tpe.toString} is not derived from SCProps")

    }


    //throw new RuntimeException("Enclosure: " + c.enclosingPosition.toString)


    val sym = tpe.typeSymbol.asClass

    val pickleLogic = if (sym.isModuleClass) {

      q"""config.makeObject("#scalaObj", config.makeString(${sym.fullName}))"""

    } else {

      val tpeSCProps = weakTypeOf[T]
      val companion = tpeSCProps.typeSymbol.companion



      //here should be getters for vals and vars, incl inherited members
      val fields = tpeSCProps.members.collect { case field if field.isPublic &&
        field.isMethod &&
        !field.asMethod.isSetter &&
        !field.asMethod.isConstructor &&
        field.asMethod.returnType.typeSymbol != tsUnit &&
        field.owner.isClass &&
        field.owner.asClass.baseClasses.contains(tsSCProps) &&
        field.owner.asClass != tsSCProps
      => field
      }
      //println(fields)

      //filtering PropOpt fields as they aren't suitable for smartclient
      //also partition by SCPropOpt and other fields
      val (fSCProps, fSimple) = fields.filter { field =>
        field.typeSignature.baseType(typeOf[PropOpt[_]].typeSymbol) match {
          case TypeRef(_, _, _) => false
          case NoType => true

        }
      }.map { field =>
        field.typeSignature.baseType(typeOf[SCPropOpt[_]].typeSymbol) match {
          case TypeRef(_, _, tArg) => (field, tArg.head, true)
          case NoType => (field, field.typeSignature, false)
        }
      }.partition { case (f, t, p) => p }


      val scPropFields = fSCProps.map { case (field, typeDef, _) =>
        val name = field.name.toTermName
        val decoded = name.decodedName.toString
        val returnType = tpeSCProps.decl(name).typeSignature
        val nullSafeFieldPickle =
        //if (typeDef.typeSymbol.asClass.isPrimitive)
          q"""if (value.$name == null) {
              Some(config.makeNull())
            } else if (!value.$name.isEmpty)
                      Some(prickle.Pickle.withConfig(value.$name.get, state, config))
                   else None"""
        q"""($decoded, $nullSafeFieldPickle)"""
      }


      val simpleFields = fSimple.map { case (field, typeDef, _) =>
        val name = field.name.toTermName
        val decoded = name.decodedName.toString
        val returnType = tpeSCProps.decl(name).typeSignature
        val nullSafeFieldPickle =
          if (field.typeSignatureIn(tpe).typeSymbol.asClass.isPrimitive)
            q"prickle.Pickle.withConfig(value.$name, state, config)"
          else
            q"""if (value.$name == null) {
              config.makeNull()
            } else
              prickle.Pickle.withConfig(value.$name, state, config)"""
        q"""($decoded, Some($nullSafeFieldPickle))"""
      }

      val pickleFields = scPropFields ++ simpleFields

      q"""
        def fieldPickles = Seq(..$pickleFields).collect {case (f, Some(v)) => (f, v)}
        Pickler.resolvingSharing[P](value, fieldPickles, state, config)
      """
    }
    val name = TermName(c.freshName("GenPickler"))

    val result = q"""
      implicit object $name extends prickle.Pickler[$tpe] {
        import prickle._
        override def pickle[P](value: $tpe, state: PickleState)(
            implicit config: PConfig[P]): P = $pickleLogic
      }
      $name
    """

    //println(result)
    c.Expr[Pickler[T]](result)
  }

  def materializeUnpickler[T <: SCProps with SCPropsFromJSON : c.WeakTypeTag](c: Context): c.Expr[Unpickler[T]] = {
    import c.universe._

    val tpe = weakTypeOf[T]
    val sym = tpe.typeSymbol.asClass



    if (!tpe.typeSymbol.isClass)
      c.abort(c.enclosingPosition, s"${tpe.toString} is not class")

    val tsSCProps = typeOf[SCProps].typeSymbol
    val tsSCPropsFromJSON = typeOf[SCPropsFromJSON].typeSymbol
    val tsUnit = typeOf[Unit].typeSymbol
    val tsSCPropOpt = typeOf[SCPropOpt[_]].typeSymbol

    //additional check for T <: SCProps. It works for some reason.!!
    if (!(tpe.baseClasses.contains(tsSCProps) && tpe.baseClasses.contains(tsSCPropsFromJSON)))
      c.abort(c.enclosingPosition, s"${tpe.toString} is not derived from SCProps with SCPropsFromJSON")
    //throw new RuntimeException("Enclosure: " + c.enclosingPosition.toString)


    //    if (!sym.isCaseClass) {
    //      c.error(c.enclosingPosition,
    //        s"Cannot materialize pickler for non-case class: ${sym.fullName}")
    //      return c.Expr[Unpickler[T]](q"null")
    //    }

    val unpickleLogic = if (sym.isModuleClass) {
      c.parse(sym.fullName)
    } else {
      val unpickleBody = {
        //        val accessors = (tpe.declarations.collect {
        //          case acc: MethodSymbol if acc.isCaseAccessor => acc
        //        }).toList

        val tpeSCProps = weakTypeOf[T]

        val setters = tpeSCProps.members.collect { case field if field.isPublic &&
          field.isMethod &&
          field.asMethod.isSetter &&
          !field.asMethod.isConstructor &&
          field.asMethod.returnType.typeSymbol == tsUnit &&
          field.owner.isClass &&
          field.owner.asClass.baseClasses.contains(tsSCProps) &&
          field.owner.asClass != tsSCProps
        => field
        }

        val unpickledPairs = setters.map { sett =>

          //example is "operationType_$eq", length(_$eq) == 4
          val setterMethod = sett.asMethod.name
          val setterNameStr = sett.name.toString
          val setterArg = sett.asMethod.paramLists.head.head.typeSignatureIn(tpe)
          val fieldName = setterNameStr.substring(0, setterNameStr.length - 4)
          val fieldTpe = sett.typeSignatureIn(tpe)

          //          q"""
          //          $setterMethod(config.readObjectField(pickle, $fieldName).flatMap(field =>
          //            prickle.Unpickle[$setterArg].from(field, state)(config)).get)
          //            """

          if (setterArg.baseClasses.contains(tsSCPropOpt)) {
            q"""
                      config.readObjectField(pickle, $fieldName) match {
                        case scala.util.Success(field) => $setterMethod(prickle.Unpickle[$setterArg].from(field, state)(config).get)
                        case scala.util.Failure(x: NoSuchElementException) =>
                        case t @ scala.util.Failure(other) => t.get
                      }
              """

          }
          else {
            q"""
                      $setterMethod(config.readObjectField(pickle, $fieldName).flatMap(field =>
                        prickle.Unpickle[$setterArg].from(field, state)(config)).get)
              """
          }

          //          setterArg.baseType(typeOf[SCPropOpt[_]].typeSymbol) match {
          //            case TypeRef(_, _, targs) =>
          //              q"""
          //              $setterMethod(config.readObjectField(pickle, $fieldName).flatMap(field =>
          //                prickle.Unpickle[${targs.head}].from(field, state)(config)).get)
          //                """
          //            case NoType =>
          //              q"""
          //              $setterMethod(config.readObjectField(pickle, $fieldName).flatMap(field =>
          //                prickle.Unpickle[$setterArg].from(field, state)(config)).get)
          //                """
          //          }
        }

        //(..$unpickledFields)
        q"""
          val result: $tpe = new $tpe {
            ..$unpickledPairs
          }

          Unpickler.resolvingSharing[P](result, pickle, state, config)
          scala.util.Success(result)
        """
      }
      val unpickleRef = q"""(p: P) => config.readString(p).flatMap(ref => Try{state(ref).asInstanceOf[$tpe]})"""


      q"""
          config.readObjectField(pickle, config.prefix + "ref").transform({$unpickleRef}, _ => {$unpickleBody}).get
      """
    }


    val nullLogic = if (sym.isPrimitive)
      q"""throw new RuntimeException("Cannot unpickle null into Primitive field '" +
        ${tpe.typeSymbol.name.toString} + "'. Context: "  + config.context(pickle))"""
    else
      q"null"

    val name = TermName(c.freshName("GenUnpickler"))

    val result = q"""
      implicit object $name extends prickle.Unpickler[$tpe] {
        import prickle._
        import scala.util.Try
        override def unpickle[P](pickle: P, state: collection.mutable.Map[String, Any])(
          implicit config: PConfig[P]): Try[$tpe] = Try {
          if (config.isNull(pickle))
            $nullLogic
          else
            $unpickleLogic
        }
      }
      $name
    """

    println(result)
    c.Expr[Unpickler[T]](result)
  }
}
