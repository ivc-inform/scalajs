package com.simplesys.macros

import scala.language.experimental.macros
import scala.reflect.macros.whitebox


object DemoDebugMacros {
    def methodNames[A]: List[String] = macro methodNames_impl[A]

    def methodNames_impl[A: c.WeakTypeTag](c: whitebox.Context): c.Expr[List[String]] = {
        import c.universe._

        val methods: List[String] = c.weakTypeOf[A].typeSymbol.typeSignature.decls.toList.filter(_.isMethod).map(_.name.toString)

        val listApply = Select(reify(List).tree, TermName("apply"))

        val res = c.Expr[List[String]](Apply(listApply, List(methods.map(x => Literal(Constant(x))): _*)))
        println(res)
        res
    }
}
