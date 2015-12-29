package com.simplesys.macros

import com.simplesys.SmartClient.System.props.AbstractPropsClass
import com.simplesys.SmartClient.option.{ScSome, ScOption}
import com.simplesys.common.Strings._

import scala.language.experimental.macros
import scala.reflect.macros.whitebox.Context

trait PropsToMap[T <: AbstractPropsClass] {
    def getMap(props: T): Map[String, Any]
}

object PropsToMap {
    implicit def materializePropsMap[P <: AbstractPropsClass]: PropsToMap[P] = macro materializePropsMapImpl[P]

    def typeToConvertedValue(context: Context)(typeDef: context.universe.Type, valueAccess: context.universe.Tree): context.universe.Tree = {
        import context.universe._
        def typeToConvertedValueInt(typeDef: context.universe.Type, valueAccess: context.universe.Tree): Option[context.universe.Tree] = {

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

    def materializePropsMapImpl[P <: AbstractPropsClass : context.WeakTypeTag](context: Context): context.Expr[PropsToMap[P]] = {
        import context.universe._

        val tpeAbstractPropsClass = weakTypeOf[P]

        val tsScOption = typeOf[ScOption[_]].typeSymbol
        val tsScSome = typeOf[ScSome[_]].typeSymbol

        val fields = tpeAbstractPropsClass.members.collect { case field if field.isPublic &&
          field.isMethod &&
          !field.asMethod.isGetter &&
          (field.asMethod.returnType.typeSymbol == tsScOption || field.asMethod.returnType.typeSymbol == tsScSome) &&
          field.owner.isClass &&
          field.owner.asClass.baseClasses.contains(tsScOption)
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
            q"""t.$name.foreach {v => res.update($decoded, ${typeToConvertedValue(context)(typeDef, q"v")})}"""
        }

        val simpleFields = fSimple.map { case (field, typeDef, _) =>
            val name = field.name.toTermName
            val decoded = name.decodedName.toString
            q"""res.update($decoded, ${typeToConvertedValue(context)(typeDef, q"t.$name")})"""
        }

        val simpleFieldsExpansion = if (simpleFields.nonEmpty)
            q"..$simpleFields"
        else q""

        val AbstractPropsClassFieldsExpansion = if (abstractPropsClassFields.nonEmpty)
            q"""..$abstractPropsClassFields"""
        else q""

        val res = context.Expr[PropsToMap[P]] {
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

