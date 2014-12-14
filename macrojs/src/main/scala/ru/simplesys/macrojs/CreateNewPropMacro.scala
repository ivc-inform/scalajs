package ru.simplesys.macrojs

import scala.language.experimental.macros
import scala.reflect.macros.whitebox.Context


trait CreatorMacro[P <: SCProps[_]] {
  def create: P
}

object CreatorMacro {
  implicit def materializeCreatorMacro[P <: SCProps[_]]: CreatorMacro[P] = macro materializeCreatorMacroImpl[P]

  def materializeCreatorMacroImpl[P <: SCProps[_] : c.WeakTypeTag](c: Context): c.Expr[P] = {
    import c.universe._
    val typeP = weakTypeOf[P]


    val res = c.Expr[P] {
      q"""
          new CreatorMacro[$typeP] {
            def create: $typeP = new $typeP {}
          }
      """
    }
//    println(res)
    res
  }
}
