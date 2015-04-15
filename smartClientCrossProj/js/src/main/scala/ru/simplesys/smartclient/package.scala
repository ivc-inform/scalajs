package ru.simplesys

import scala.scalajs.js

package object smartclient {
  import cmntypes._
  import macrojs._

  implicit class ToJSLiteral[P <: SCProps](p: P)(implicit toLiteral: ToLiteralMacro[P]) {
    def toJSLiteral: js.Dictionary[js.Any] = toLiteral.toLiteralMacro(p)
  }

//  implicit class ToSCPropOpt[A](x: A) {
//    def sc: SCPropOpt[A] = SCPropVal(x)
//  }
}
