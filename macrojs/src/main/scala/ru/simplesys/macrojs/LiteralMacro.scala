package ru.simplesys.macrojs

import scala.language.experimental.macros
import scala.reflect.macros.whitebox.Context

import scala.scalajs.js

trait SCProps

trait ToLiteralMacro[T <: SCProps] {
  def toLiteralMacro(t: T): js.Dictionary[js.Any]
}

//object ToLiteralMacro {
//  implicit def materializeToLiteralMacro[T <: SCProps]: ToLiteralMacro[T] = macro materializeToLiteralMacroImpl[T]
//
//  def materializeToLiteralMacroImpl[T <: SCProps : c.WeakTypeTag](c: Context): c.Expr[ToLiteralMacro[T]] = {
//    import c.universe._
//    val tpe = weakTypeOf[T]
//
//    val toMapParams = tpe.members.map {s =>
//      val name = s.name.toTermName
//      val decodedName = name.decodedName.toString
//      if (s.typeSignature.baseClasses.contains(typeOf[Option[_]].typeSymbol.asClass))
//        q"$decodedName -> t.$name.orUndefined"
//      else
//        q"$decodedName -> t.$name"
//    }
//    val res = c.Expr[ToLiteralMacro[T]] { q"""
//      new ToLiteralMacro[$tpe] {
//        def toLiteralMacro(t: $tpe): js.Dynamic = {
//            import js.JSConverters._
//            //import ImplicitConversions._
//            scala.scalajs.js.Dynamic.literal (..$toMapParams)
//          }
//      }
//    """ }
////    println(res)
//    res
//  }
//}


object ToLiteralMacro {
  implicit def materializeToLiteralMacro[T <: SCProps]: ToLiteralMacro[T] = macro materializeToLiteralMacroImpl[T]

  def materializeToLiteralMacroImpl[T <: SCProps : c.WeakTypeTag](c: Context): c.Expr[ToLiteralMacro[T]] = {
    import c.universe._
    val tpe = weakTypeOf[T]
    if (!tpe.typeSymbol.isAbstract) {
      val companion = tpe.typeSymbol.companion


      val fields = tpe.decls.collectFirst {
        case m: MethodSymbol if m.isPrimaryConstructor => m
      }.get.paramLists.head

      val (fProps, fSimple) = fields.partition {field =>
        field.typeSignature.baseType(typeOf[SCProps].typeSymbol) match {
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


        field.typeSignature.baseType(typeOf[Option[_]].typeSymbol) match {
          case TypeRef(_, _, _) =>
            q"$decoded -> {val x: js.Any = t.$name.orUndefined; x}"
          case NoType => q"$decoded -> {val x: js.Any = t.$name; x}"

        }
      }


      val res = c.Expr[ToLiteralMacro[T]] { q"""
      new ToLiteralMacro[$tpe] {
        import scala.scalajs.js
        import js.JSConverters._

        def toLiteralMacro(t: $tpe): js.Dictionary[js.Any] = {
            val lb: js.Array[js.Dictionary[js.Any]] = js.Array(..$allProps)
            val res = js.Dictionary.empty[js.Any]
            lb.foreach {dict =>
              dict.foreach {kv =>
                res.update(kv._1, kv._2)
              }
            }

            js.Dictionary(..$simpleFields).foreach {kv => res.update(kv._1, kv._2)}
            res
        }
      }
    """
      }
//      println(res)
      res
    } else c.abort(c.enclosingPosition, "this is abstract class, it cannot be converted to JSLiteral")
  }
}