package ru.simplesys.macrojs

import scala.language.experimental.macros
import scala.reflect.macros.whitebox.Context

import scala.scalajs.js

trait ToSC[+T <: js.Object] {
  def props: js.Dictionary[js.Any]
  def initBlock: js.Function0[T]
  def create: T = initBlock()
}


trait SCProps[T <: js.Object, R <: T] {
  def toSC: ToSC[T]
  def create: T = toSC.create
}


trait ToLiteralMacro[T <: SCProps[_, _]] {
  def toLiteralMacro(t: T): js.Dictionary[js.Any]
}

object ToLiteralMacro {
  implicit def materializeToLiteralMacro[T <: SCProps[_, _]]: ToLiteralMacro[T] = macro materializeToLiteralMacroImpl[T]

  def materializeToLiteralMacroImpl[T <: SCProps[_, _] : c.WeakTypeTag](c: Context): c.Expr[ToLiteralMacro[T]] = {
    import c.universe._
    val tpe = weakTypeOf[T]
    //println(tpe)
    if (!tpe.typeSymbol.isAbstract) {
      val companion = tpe.typeSymbol.companion


      val fields = tpe.decls.collectFirst {
        case m: MethodSymbol if m.isPrimaryConstructor => m
      }.get.paramLists.head

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
        val returnType = tpe.decl(name).typeSignature

        //val x: js.Array[String] = ???
        //x.map((s: String) => s)
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
                  case NoType =>
                    typeArg.baseType(typeOf[ToSC[_]].typeSymbol) match {
                      case TypeRef(_, _, _) => q"$decoded -> {val x: js.Array[js.Any] = t.$name.map((e: ToSC[_]) => e.props); x}"
                      // or we need to force conversion to js.Any?
                      case NoType => q"$decoded -> t.$name"
                    }
                }

              case NoType => q"$decoded -> {val x: js.Any = t.$name; x}"

          }
//            q"$decoded -> {val x: js.Any = t.$name; x}"

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

      val res = c.Expr[ToLiteralMacro[T]] { q"""
      new ToLiteralMacro[$tpe] {
        import scala.scalajs.js
        import js.JSConverters._

        def toLiteralMacro(t: $tpe): js.Dictionary[js.Any] = {
            val res = js.Dictionary.empty[js.Any]
            $complexFieldsExpansion
            $simpleFieldsExpansion
            res
        }
      }
    """
      }
      println(res)
      res
    } else c.abort(c.enclosingPosition, "this is abstract class, it cannot be converted to JSLiteral")
  }
}