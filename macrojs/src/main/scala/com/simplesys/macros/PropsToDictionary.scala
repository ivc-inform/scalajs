package com.simplesys.macros

import com.simplesys.common.Strings._
import com.simplesys.log.Logging
import com.simplesys.option._
import com.simplesys.props.AbstractClassProps
import com.simplesys.Types.{JSDictionaryAny, JSAny}

import scala.language.experimental.macros
import scala.reflect.macros.whitebox.Context
import scala.scalajs.js

trait PropsToDictionary[P <: AbstractClassProps] {
    def getDictionary(props: P): JSDictionaryAny
    def getMap(props: P): scala.collection.Map[String, scala.Any] = getDictionary(props)
}

object PropsToDictionary extends Logging {
    implicit def materialize[P <: AbstractClassProps]: PropsToDictionary[P] = macro materializeImpl[P]

    def typeToConvertedValue(context: Context)(typeDef: context.universe.Type, valueAccess: context.universe.Tree): context.universe.Tree = {
        import context.universe._

        val tsScOption = typeOf[ScOption[_]].typeSymbol
        val tsScEnumeration = typeOf[Enumeration].typeSymbol
        val tsAbstractClassProps = typeOf[AbstractClassProps].typeSymbol
        val tsJSObject = typeOf[js.Object].typeSymbol

        def typeToConvertedValueInt(typeDef: context.universe.Type, valueAccess: context.universe.Tree): Option[context.universe.Tree] = {
            typeDef.baseType(typeOf[Seq[_]].typeSymbol) match {
                case TypeRef(_, _, targs) =>
                    val arrEx = if (targs.size == 1) {
                        val checkedType: Option[context.universe.Tree] = typeToConvertedValueInt(targs.head, q"x")
                        checkedType match {
                            case Some(ex) =>
                                if (targs.head.baseClasses.contains(tsAbstractClassProps))
                                    q"$valueAccess.map(x => (new SCApply4Props[${targs.head}]).getDictionary($ex))"
                                else
                                    valueAccess

                            case None =>
                                valueAccess
                        }
                    } else valueAccess

                    Some(q"scala.scalajs.runtime.genTraversableOnce2jsArray($arrEx)")

                case NoType =>
                    def getTree4DoubleType(symb: Symbol, tp1: Tree, tp2: Tree): Option[Tree] = {
                        typeDef.baseType(symb) match {
                            case TypeRef(_, _, targs) =>
                                val access = q"ei"
                                val checkedTypes = targs.map(t => typeToConvertedValueInt(t, access))
                                val type1 = checkedTypes.head.getOrElse(valueAccess)
                                val type2 = checkedTypes.last.getOrElse(valueAccess)

                                Some(
                                    q"""$valueAccess match {
                                            case $tp1(item) => $type1
                                            case $tp2(item) => $type2
                                    }""")
                            case NoType =>
                                if (typeDef.typeSymbol.owner == tsScEnumeration)
                                    Some(q"item.toString")
                                else
                                    None
                        }
                    }
                    typeDef.baseType(tsAbstractClassProps) match {
                        case TypeRef(_, _, _) =>
                            Some(q"$valueAccess")
                        case NoType =>
                            typeDef.baseType(tsJSObject) match {
                                case TypeRef(_, _, _) =>
                                    Some(q"$valueAccess")
                                case NoType =>
                                    typeDef.baseType(tsScOption) match {
                                        case TypeRef(_, _, _) =>
                                            Some(q"$valueAccess")
                                        case NoType =>
                                            getTree4DoubleType(typeOf[DoubleType[_, _]].typeSymbol, q"Type1", q"Type2") match {
                                                case None =>
                                                    getTree4DoubleType(typeOf[IntString[_, _]].typeSymbol, q"IntFRomIntString", q"StringFRomIntString") match {
                                                        case None => getTree4DoubleType(typeOf[DoubleAlignment[_, _]].typeSymbol, q"AlignmentfromDoubleAlignment", q"VerticalAlignmentfromDoubleAlignment") match {
                                                            case None => getTree4DoubleType(typeOf[FormItemType_String[_, _]].typeSymbol, q"FormItemTypefromFormItemType_String", q"StringfromFormItemType_String")
                                                            case some => some
                                                        }
                                                        case some => some
                                                    }
                                                case some => some
                                            }
                                    }
                            }
                    }
            }
        }
        typeToConvertedValueInt(typeDef, valueAccess).getOrElse(q"$valueAccess")
    }

    def materializeImpl[P <: AbstractClassProps : context.WeakTypeTag](context: Context): context.Expr[PropsToDictionary[P]] = {
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

            q"""clazz.$name.foreach {item => res.update($decoded, ${typeToConvertedValue(context)(typeDef, q"item")})}"""
        }

        val simpleFields = fSimple.map { case (field, typeDef, _) =>
            val name = field.name.toTermName
            val decoded = name.decodedName.toString
            q"""res.update($decoded, ${typeToConvertedValue(context)(typeDef, q"clazz.$name")})"""
        }

        logger trace context.enclosingPosition.toString
        val res = context.Expr[PropsToDictionary[P]] {
            q"""
                import com.simplesys.props.AbstractClassProps
                import com.simplesys.option._
                import scala.scalajs.js
                import scala.scalajs.js.JSConverters._
                import com.simplesys.Types.{JSAny, JSDictionaryAny}

                new PropsToDictionary[$tpeAbstractPropsClass] {

                    def getDictionary(clazz: $tpeAbstractPropsClass): JSDictionaryAny = {
                         val res = js.Dictionary.empty[JSAny]
                        ..$abstractPropsClassFields
                        ..$simpleFields
                         res
                    }
                }"""
        }
        //logger debug showCode(res.tree)
        res
    }
}

