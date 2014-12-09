package ru.simplesys.scalajs
package smartclient

import ru.simplesys.macrojs._
import ToLiteralMacro._

import scala.scalajs.js

package object visual {
  type JSProps = js.Dictionary[js.Any]

  implicit def intToPixelPointSpec(i: Int): PixelPointSpec = PixelPointSpec(i)

  implicit def toSCToJSProps[T <: js.Object](toSC: ToSC[T]): js.Object = toSC.initBlock

  implicit class ToPointSpec(i: Int) {
    def p = PixelPointSpec(i)
    // % doesnt work. Why?
    def pct = PctPointSpec(i)
  }

  implicit class ToJSLiteral[T <: SCProps[_, _] : ToLiteralMacro](p: T) {
    def toJSLiteral: js.Dictionary[js.Any] = implicitly[ToLiteralMacro[T]].toLiteralMacro(p)
  }
}
