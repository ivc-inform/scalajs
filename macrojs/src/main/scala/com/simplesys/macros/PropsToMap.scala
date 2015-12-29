package com.simplesys.macros

import com.simplesys.SmartClient.System.props.AbstractPropsClass
import com.simplesys.SmartClient.option.{ScSome, ScOption}
import com.simplesys.common.Strings._
import com.simplesys.log.Logging

import scala.language.experimental.macros
import scala.reflect.macros.whitebox.Context

trait PropsToMap[T <: AbstractPropsClass] {
    def getMap(props: T): Map[String, Any]
}

object PropsToMap extends Logging {
    implicit def materializePropsMap[P <: AbstractPropsClass]: PropsToMap[P] = macro materializePropsMapImpl[P]

    def typeToConvertedValue(context: Context)(typeDef: context.universe.Type, valueAccess: context.universe.Tree): context.universe.Tree = {
        import context.universe._

        def typeToConvertedValueInt(typeDef: context.universe.Type, valueAccess: context.universe.Tree): Option[context.universe.Tree] = {
            val tsScOption = typeOf[ScOption[_]].typeSymbol
            val tsScSome = typeOf[ScSome[_]].typeSymbol

            typeDef.baseType(typeOf[scala.collection.Seq[_]].typeSymbol) match {
                case TypeRef(_, _, targs) =>
                    val arrEx = if (targs.size == 1) {
                        val checkedType = typeToConvertedValueInt(targs.head, q"x")
                        checkedType match {
                            case Some(ex) => q"$valueAccess.map(x => $ex)"
                            case None => valueAccess
                        }
                    } else valueAccess

                    Some(q"$arrEx")
                case NoType =>
                    typeDef.baseType(typeOf[ScOption[_]].typeSymbol) match {
                        case TypeRef(_, _, _) =>
                            Some(q"$valueAccess")
                        case NoType =>
                            None
                    }
            }
        }
        typeToConvertedValueInt(typeDef, valueAccess).getOrElse(q"$valueAccess")
    }

    def materializePropsMapImpl[P <: AbstractPropsClass : context.WeakTypeTag](context: Context): context.Expr[PropsToMap[P]] = {
        import context.universe._

        val tpeAbstractPropsClass = weakTypeOf[P]

        val tsScOption = typeOf[ScOption[_]].typeSymbol
        val tsScSome = typeOf[ScSome[_]].typeSymbol

        val fields = tpeAbstractPropsClass.members.collect { case field if field.isPublic &&
          field.isMethod &&
          !field.asMethod.isConstructor &&
          (field.asMethod.returnType.typeSymbol == tsScOption || field.asMethod.returnType.typeSymbol == tsScSome) &&
          field.isTerm &&
          field.asTerm.isGetter
        => field
        }

        logger trace s"$newLine// Class: $tpeAbstractPropsClass ///////////////////////////////////////////////////////////////".newLine

        logger trace "//////////////////////////////////////////////// Fields: ///////////////////////////////////////////////////////////////"
        fields.foreach(field => logger trace field.toString)
        logger trace "//////////////////////////////////////////////// End Fields: ///////////////////////////////////////////////////////////".newLine

        val (fAbstractPropsClass, fSimple) = fields.map { field =>
            field.typeSignature.baseType(typeOf[ScOption[_]].typeSymbol) match {
                case TypeRef(_, _, tArg) => (field, tArg.head, true)
                case NoType => (field, field.typeSignature, false)
            }
        }.partition { case (f, t, p) => p }

        val abstractPropsClassFields = fAbstractPropsClass.map { case (field, typeDef, _) =>
            val name = field.name.toTermName
            val decoded = name.decodedName.toString
            q"""clazz.$name.foreach {item => res.update($decoded, ${typeToConvertedValue(context)(typeDef, q"item")})}"""
        }

        val simpleFields = fSimple.map { case (field, typeDef, _) =>
            val name = field.name.toTermName
            val decoded = name.decodedName.toString
            q"""res.update($decoded, ${typeToConvertedValue(context)(typeDef, q"clazz.$name")})"""
        }

        logger trace context.enclosingPosition.toString
        val res = context.Expr[PropsToMap[P]] {
            q"""
                import com.simplesys.SmartClient.System.props.AbstractPropsClass
                import scala.collection.mutable
                import com.simplesys.log.Logging

                new PropsToMap[$tpeAbstractPropsClass] with Logging {
                  def getMap(clazz: $tpeAbstractPropsClass): Map[String, Any] = {
                      val res = mutable.HashMap.empty[String, Any]
                      ..$abstractPropsClassFields
                      ..$simpleFields
                      logger trace s"Size map: " + res.size.toString
                      res.toMap
                  }
            }"""
        }
        logger trace res.toString()
        res
    }
}

