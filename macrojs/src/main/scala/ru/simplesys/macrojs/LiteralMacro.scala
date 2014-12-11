package ru.simplesys.macrojs

import scala.language.experimental.macros
import scala.reflect.macros.whitebox.Context

import scala.scalajs.js


trait SCProps[+T <: js.Object, +R <: T]

trait ToLiteralMacro[P <: SCProps[_, _]] {
  def toLiteralMacro(t: P): js.Dictionary[js.Any]
}

object ToLiteralMacro {
  implicit def materializeToLiteralMacro[P <: SCProps[_, _]]: ToLiteralMacro[P] = macro materializeToLiteralMacroImpl[P]

  def materializeToLiteralMacroImpl[P <: SCProps[_, _] : c.WeakTypeTag](c: Context): c.Expr[ToLiteralMacro[P]] = {
    import c.universe._
    val tpeSCProps = weakTypeOf[P]
  //  val tpeLower = weakTypeOf[T]
  //  val tpeUpper = weakTypeOf[R]
    //println(tpe)
    if (!tpeSCProps.typeSymbol.isAbstract) {
      val companion = tpeSCProps.typeSymbol.companion



      //here should be getters for vals and vars, incl inherited members
      val fields = tpeSCProps.members.collect {case field if field.isMethod && field.asMethod.isGetter => field}
      //println(fields)


      val (fProps, fSimple) = fields.partition {field =>
        field.typeSignature.baseType(typeOf[SCProps[_, _]].typeSymbol) match {
          case TypeRef(_, _, _) => true
          case NoType => false
        }
      }

      val allProps = fProps.map {field =>
        val name = field.name.toTermName
        val decoded = name.decodedName.toString
        q"t.$name.toJSLiteral"
      }

      val simpleFields = fSimple.map { field =>
        val name = field.name.toTermName
        val decoded = name.decodedName.toString
        val returnType = tpeSCProps.decl(name).typeSignature

        //weirdddd
        field.typeSignature.baseType(typeOf[Option[_]].typeSymbol) match {
          case TypeRef(_, _, _) =>
            q"$decoded -> {val x: js.Any = t.$name.orUndefined; x}"
          case NoType =>
            field.typeSignature.baseType(typeOf[js.Array[_]].typeSymbol) match {
              case TypeRef(_, _, targs) =>
                val typeArg = targs.head
                typeArg.baseType(typeOf[SCProps[_, _]].typeSymbol) match {
                  case TypeRef(_, _, _) => q"$decoded -> {val x: js.Array[js.Any] = t.$name.map((e: SCProps[_, _]) => e.toJSLiteral); x}"
                  case NoType => q"$decoded -> t.$name"
                }

              case NoType => q"$decoded -> {val x: js.Any = t.$name; x}"

          }
        }
      }

      val simpleFieldsExpansion = if (simpleFields.nonEmpty)
        q"val simpleFields: js.Dictionary[js.Any] = js.Dictionary(..$simpleFields); simpleFields.foreach {kv => res.update(kv._1, kv._2)}" else q""

      val complexFieldsExpansion = if (allProps.nonEmpty)
        q"""val lb: js.Array[js.Dictionary[js.Any]] = js.Array(..$allProps)
            lb.foreach {dict =>
              dict.foreach {kv =>
                res.update(kv._1, kv._2)
              }
            }"""
      else q""

      //$tpeLower, $tpeUpper,
      val res = c.Expr[ToLiteralMacro[P]] { q"""
      new ToLiteralMacro[$tpeSCProps] {
        import scala.scalajs.js
        import js.JSConverters._

        def toLiteralMacro(t: $tpeSCProps): js.Dictionary[js.Any] = {
            val res = js.Dictionary.empty[js.Any]
            $complexFieldsExpansion
            $simpleFieldsExpansion
            res
        }
      }
    """
      }
 //     println(res)
      res
    } else c.abort(c.enclosingPosition, "this is abstract class, it cannot be converted to JSLiteral")
  }
}