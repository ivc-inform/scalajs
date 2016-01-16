package com.simplesys.option

import scala.scalajs.js
import scala.language.existentials

//<editor-fold desc="Function1CanvasClick_String">
sealed abstract class Function1CanvasClick_String[+A, +B]

case class Function1CanvasClickfromFunction1CanvasClick_String(a: js.ThisFunction0[_, _]) extends Function1CanvasClick_String[js.ThisFunction0[_, _], String]
case class StringfromFunction1CanvasClick_String(a: String) extends Function1CanvasClick_String[js.ThisFunction0[_, _], String]

object Function1CanvasClick_String {
    implicit def Function1CanvasClick2Function1CanvasClick_String(x: js.ThisFunction0[_, _]) = ScSome(Function1CanvasClickfromFunction1CanvasClick_String(x))
    implicit def String2Function1CanvasClick_String(x: String) = ScSome(StringfromFunction1CanvasClick_String(x))
}
//</editor-fold>
