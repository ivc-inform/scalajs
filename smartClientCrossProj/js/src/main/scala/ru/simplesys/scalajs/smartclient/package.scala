package ru.simplesys.scalajs

import ru.simplesys.macrojs._

import scala.scalajs.js

package object smartclient {
  implicit class ToJSLiteral[P <: SCProps[_, _]](p: P)(implicit toLiteral: ToLiteralMacro[P]) {
    def toJSLiteral: js.Dictionary[js.Any] = toLiteral.toLiteralMacro(p)
  }

}
