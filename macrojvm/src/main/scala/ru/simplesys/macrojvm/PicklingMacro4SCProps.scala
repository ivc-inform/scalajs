package ru.simplesys.macrojvm

import prickle.{Unpickler, Pickler}

import scala.language.experimental.macros
import scala.reflect.macros._
import scala.reflect.macros.whitebox.Context

import ru.simplesys.cmntypes._

object SCPropsPickler {
  import prickle.Pickler

  implicit def materializePicklerSCProp[T <: SCProps]: Pickler[T] = macro SCPropPicklerMaterializersImpl.materializePickler[T]

  //implicit def test[T <: SCProps]: Pickler[T] = ??? //macro SCPropPicklerMaterializersImpl.materializePickler[T]
}

object SCPropPicklerMaterializersImpl {
  def materializePickler[T <: SCProps](c: Context)(implicit  tt: c.WeakTypeTag[T]): c.Expr[Pickler[T]] = {
    import c.universe._

    val tpe = weakTypeOf[T]

    if (!tpe.typeSymbol.isClass)
      throw new RuntimeException("Enclosure: " + c.enclosingPosition.toString)

    val sym = tpe.typeSymbol.asClass

//    if (!sym.isCaseClass) {
//      c.error(c.enclosingPosition,
//        s"Cannot materialize pickler for non-case class: ${sym.fullName}")
//      return c.Expr[Pickler[T]](q"null")
//    }

    val pickleLogic = if (sym.isModuleClass) {

      q"""config.makeObject("#scalaObj", config.makeString(${sym.fullName}))"""

    } else {

      val tpeSCProps = weakTypeOf[T]
      val companion = tpeSCProps.typeSymbol.companion



      //here should be getters for vals and vars, incl inherited members
      val tsSCProps = typeOf[SCProps].typeSymbol
      val tsUnit = typeOf[Unit].typeSymbol
      val fields = tpeSCProps.members.collect {case field if field.isPublic &&
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
      val (fSCProps, fSimple) = fields.filter {field =>
        field.typeSignature.baseType(typeOf[PropOpt[_]].typeSymbol) match {
          case TypeRef(_, _, _) => false
          case NoType => true

        }
      }.map {field =>
        field.typeSignature.baseType(typeOf[SCPropOpt[_]].typeSymbol) match {
          case TypeRef(_, _, tArg) => (field, tArg.head, true)
          case NoType => (field, field.typeSignature, false)
        }
      }.partition {case (f, t, p) => p}


      val scPropFields = fSCProps.map { case (field, typeDef, _) =>
        val name = field.name.toTermName
        val decoded = name.decodedName.toString
        val returnType = tpeSCProps.decl(name).typeSignature
        val nullSafeFieldPickle =
          q"""if (value.$name == null) {
              config.makeNull()
            } else if (!value.$name.isEmpty)
                      prickle.Pickle.withConfig(value.$name.get, state, config)
                   else config.makeNull()"""
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
        q"""($decoded, $nullSafeFieldPickle)"""
      }

      val pickleFields = scPropFields ++ simpleFields

      q"""
        def fieldPickles = Seq(..$pickleFields)
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

    println(result)
    c.Expr[Pickler[T]](result)
  }

//  def materializeUnpickler[T: c.WeakTypeTag](c: Context): c.Expr[Unpickler[T]] = {
//    import c.universe._
//
//    val tpe = weakTypeOf[T]
//    val sym = tpe.typeSymbol.asClass
//
//    if (!sym.isCaseClass) {
//      c.error(c.enclosingPosition,
//        s"Cannot materialize pickler for non-case class: ${sym.fullName}")
//      return c.Expr[Unpickler[T]](q"null")
//    }
//
//    val unpickleLogic = if (sym.isModuleClass) {
//      c.parse(sym.fullName)
//    } else {
//      val unpickleBody = {
//        val accessors = (tpe.declarations.collect {
//          case acc: MethodSymbol if acc.isCaseAccessor => acc
//        }).toList
//
//        val unpickledFields = for {
//          accessor <- accessors
//        } yield {
//          val fieldName = accessor.name
//          val fieldTpe = accessor.typeSignatureIn(tpe)
//          q"""
//              config.readObjectField(pickle, ${fieldName.toString}).flatMap(field =>
//                prickle.Unpickle[$fieldTpe].from(field, state)(config)).get
//          """
//        }
//        q"""
//          val result = new $tpe(..$unpickledFields)
//          Unpickler.resolvingSharing[P](result, pickle, state, config)
//          scala.util.Success(result)
//        """
//      }
//      val unpickleRef = q"""(p: P) => config.readString(p).flatMap(ref => Try{state(ref).asInstanceOf[$tpe]})"""
//
//      q"""
//      config.readObjectField(pickle, config.prefix + "ref").transform({$unpickleRef}, _ => {$unpickleBody}).get
//      """
//    }
//
//
//    val nullLogic = if (sym.isPrimitive)
//      q"""throw new RuntimeException("Cannot unpickle null into Primitive field '" +
//        ${tpe.typeSymbol.name.toString} + "'. Context: "  + config.context(pickle))"""
//    else
//      q"null"
//
//    val name = newTermName(c.fresh("GenUnpickler"))
//
//    val result = q"""
//      implicit object $name extends prickle.Unpickler[$tpe] {
//        import prickle._
//        import scala.util.Try
//        override def unpickle[P](pickle: P, state: collection.mutable.Map[String, Any])(
//          implicit config: PConfig[P]): Try[$tpe] = Try {
//            if (config.isNull(pickle))
//              $nullLogic
//            else
//              $unpickleLogic
//          }
//      }
//      $name
//    """
//
//    c.Expr[Unpickler[T]](result)
//  }
}


