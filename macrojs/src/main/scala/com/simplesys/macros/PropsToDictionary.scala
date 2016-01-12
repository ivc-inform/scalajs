package com.simplesys.macros

import com.simplesys.SmartClient.System.props.AbstractPropsClass
import com.simplesys.SmartClient.option.{DoubleType, ScOption, ScSome}
import com.simplesys.common.Strings._
import com.simplesys.log.Logging

import scala.language.experimental.macros
import scala.reflect.macros.whitebox.Context
import scala.scalajs.js

trait PropsToDictionary[P <: AbstractPropsClass] {
    def getDictionary(props: P): js.Dictionary[js.Any]
}

object PropsToDictionary extends Logging {
    implicit def materializePropsMap[P <: AbstractPropsClass]: PropsToDictionary[P] = macro materializePropsMapImpl[P]

    def typeToConvertedValue(context: Context)(typeDef: context.universe.Type, valueAccess: context.universe.Tree): context.universe.Tree = {
        import context.universe._

        def typeToConvertedValueInt(typeDef: context.universe.Type, valueAccess: context.universe.Tree): Option[context.universe.Tree] = {

            val tsScOption = typeOf[ScOption[_]].typeSymbol
            val tsScEnumeration = typeOf[Enumeration].typeSymbol

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
                    typeDef.baseType(tsScOption) match {
                        case TypeRef(_, _, _) =>
                            Some(q"$valueAccess")
                        case NoType =>
                            typeDef.baseType(typeOf[DoubleType[_, _]].typeSymbol) match {
                                case TypeRef(_, _, targs) =>
                                    val access = q"ei"
                                    val checkedTypes = targs.map(t => typeToConvertedValueInt(t, access))
                                    val type1 = checkedTypes.head.getOrElse(valueAccess)
                                    val type2 = checkedTypes.last.getOrElse(valueAccess)

                                    Some(
                                        q"""$valueAccess match {
                                            case Type1(item) => $type1
                                            case Type2(item) => $type2
                                        }""")
                                case NoType =>
                                    if (typeDef.typeSymbol.owner == tsScEnumeration)
                                        Some(q"item.toString")
                                    else
                                        None
                            }
                    }
            }
        }
        typeToConvertedValueInt(typeDef, valueAccess).getOrElse(q"$valueAccess")
    }

    def materializePropsMapImpl[P <: AbstractPropsClass : context.WeakTypeTag](context: Context): context.Expr[PropsToDictionary[P]] = {
        import context.universe._

        val tpeAbstractPropsClass = weakTypeOf[P]

        val tsScOption = typeOf[ScOption[_]].typeSymbol
        val tsScSome = typeOf[ScSome[_]].typeSymbol
        val tsScEnumeration = typeOf[Enumeration].typeSymbol

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

            if (typeDef.typeSymbol.owner != tsScEnumeration)
                q"""clazz.$name.foreach {item => res.update($decoded, ${typeToConvertedValue(context)(typeDef, q"item")})}"""
            else
                q"""clazz.$name.foreach {item => res.update($decoded, ${typeToConvertedValue(context)(typeDef, q"item.toString")})}"""
        }

        val simpleFields = fSimple.map { case (field, typeDef, _) =>
            val name = field.name.toTermName
            val decoded = name.decodedName.toString
            q"""res.update($decoded, ${typeToConvertedValue(context)(typeDef, q"clazz.$name")})"""
        }

        logger trace context.enclosingPosition.toString
        val res = context.Expr[PropsToDictionary[P]] {
            q"""
                import com.simplesys.SmartClient.System.props.AbstractPropsClass
                import com.simplesys.SmartClient.option._
                import scala.scalajs.js
                import scala.scalajs.js.JSConverters._

                new PropsToDictionary[$tpeAbstractPropsClass] {

                    def getDictionary(clazz: $tpeAbstractPropsClass): js.Dictionary[js.Any] = {
                         val res = js.Dictionary.empty[js.Any]
                        ..$abstractPropsClassFields
                        ..$simpleFields
                         res
                 }
            }"""
        }
        //logger debug res.toString()
        res
    }
}

