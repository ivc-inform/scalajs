package com.simplesys.macros

import scala.reflect.macros.whitebox
import scala.reflect.macros.Universe
import language.experimental.macros


class DemoDebugMacros {
    def methodNames[A]: List[String] = macro methodNames_impl[A]

    def methodNames_impl[A: c.WeakTypeTag](c: whitebox.Context): c.Expr[List[String]] = {
        import c.universe._

        val methods: List[String] = c.weakTypeOf[A].typeSymbol.typeSignature.decls.toList.filter(_.isMethod).map(_.name.toString)

        val listApply = Select(reify(List).tree, TermName("apply"))

        c.Expr[List[String]](Apply(listApply, List(methods.map(x => Literal(Constant(x))): _*)))
    }
}
