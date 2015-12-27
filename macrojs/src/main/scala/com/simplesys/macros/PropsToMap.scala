package com.simplesys.macros

import com.simplesys.SmartClient.System.props.AbstractPropsClass
import com.simplesys.SmartClient.option.ScOption
import com.simplesys.common.Strings._

import scala.language.experimental.macros
import scala.reflect.macros.whitebox.Context
import scala.reflect.macros.Universe

trait PropsToMap[T <: AbstractPropsClass] {
    def getMap(props: T): Map[String, Any]
}

object PropsToMap {
    def materializePropsMap[P <: AbstractPropsClass]: PropsToMap[P] = macro materializePropsMapImpl[P]

    def typeToConvertedValue(c: Context)(typeDef: c.universe.Type, valueAccess: c.universe.Tree): c.universe.Tree = {
        import c.universe._
        def typeToConvertedValueInt(typeDef: c.universe.Type, valueAccess: c.universe.Tree): Option[c.universe.Tree] = {

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
                            typeDef.baseType(typeOf[Either[_, _]].typeSymbol) match {
                                case TypeRef(_, _, targs) =>
                                    val access = q"ei"
                                    val checkedTypes = targs.map(t => typeToConvertedValueInt(t, access))
                                    val leftType = checkedTypes.head.getOrElse(valueAccess)
                                    val rightType = checkedTypes.last.getOrElse(valueAccess)

                                    Some(
                                        q"""$valueAccess match {
                                case Left(ei) => $leftType
                                case Right(ei) => $rightType
                              }""")
                                case NoType => None
                            }
                    }
            }
        }
        typeToConvertedValueInt(typeDef, valueAccess).getOrElse(q"$valueAccess")
    }

    def materializePropsMapImpl[P <: AbstractPropsClass : c.WeakTypeTag](c: Context): c.Expr[PropsToMap[P]] = {
        import c.universe._

        val tpeAbstractPropsClass = weakTypeOf[P]
        val tsScOption = typeOf[ScOption[_]].typeSymbol
        val tsUnit = typeOf[Unit].typeSymbol
        val fields = tpeAbstractPropsClass.members.collect { case field if field.isPublic &&
          field.isMethod &&
          !field.asMethod.isSetter &&
          !field.asMethod.isConstructor &&
          field.asMethod.returnType.typeSymbol != tsUnit &&
          field.owner.isClass &&
          field.owner.asClass.baseClasses.contains(tsScOption) &&
          field.owner.asClass != tsScOption
        => field
        }

        println(s"$newLine// Class: $tpeAbstractPropsClass ///////////////////////////////////////////////////////////////".newLine)

        println("//////////////////////////////////////////////// Fields: ///////////////////////////////////////////////////////////////")
        fields.foreach(println)
        println("//////////////////////////////////////////////// End Fields: ///////////////////////////////////////////////////////////".newLine)

        val (fAbstractPropsClass, fSimple) = fields.map { field =>
            field.typeSignature.baseType(typeOf[ScOption[_]].typeSymbol) match {
                case TypeRef(_, _, tArg) => (field, tArg.head, true)
                case NoType => (field, field.typeSignature, false)
            }
        }.partition { case (f, t, p) => p }

        val abstractPropsClassFields = fAbstractPropsClass.map { case (field, typeDef, _) =>
            val name = field.name.toTermName
            val decoded = name.decodedName.toString
            q"""t.$name.foreach {v => res.update($decoded, ${typeToConvertedValue(c)(typeDef, q"v")})}"""
        }

        val simpleFields = fSimple.map { case (field, typeDef, _) =>
            val name = field.name.toTermName
            val decoded = name.decodedName.toString
            q"""res.update($decoded, ${typeToConvertedValue(c)(typeDef, q"t.$name")})"""
        }

        val simpleFieldsExpansion = if (simpleFields.nonEmpty)
            q"..$simpleFields"
        else q""

        val AbstractPropsClassFieldsExpansion = if (abstractPropsClassFields.nonEmpty)
            q"""..$abstractPropsClassFields"""
        else q""

        val res = c.Expr[PropsToMap[P]] {
            q"""
                        import com.simplesys.SmartClient.System.props.AbstractPropsClass
                        import collection.immutable.HashMap

                        new PropsToMap[$tpeAbstractPropsClass] {
                          def getMap(t: $tpeAbstractPropsClass): Map[String, Any] = {
                              val res = HashMap.empty[String, Any]
                              $AbstractPropsClassFieldsExpansion
                              $simpleFieldsExpansion
                              res
                          }
                        }"""
        }
        println(res)
        res
    }
}

