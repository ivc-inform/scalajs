package com.simplesys.option

import com.simplesys.types.{JSDictionary, JSDictionaryAny, JSAny, JSArrayAny}

import scala.language.existentials
import scala.scalajs.js

//<editor-fold desc="Function1CanvasClick_String">
sealed abstract class Function1CanvasClick_String[+A, +B]

case class Function1CanvasClickfromFunction1CanvasClick_String(a: js.ThisFunction0[_, _]) extends Function1CanvasClick_String[js.ThisFunction0[_, _], String]
case class StringfromFunction1CanvasClick_String(a: String) extends Function1CanvasClick_String[js.ThisFunction0[_, _], String]

object Function1CanvasClick_String {
    implicit def Function1CanvasClick2Function1CanvasClick_String(x: js.ThisFunction0[_, _]) = ScSome(Function1CanvasClickfromFunction1CanvasClick_String(x))
    implicit def String2Function1CanvasClick_String(x: String) = ScSome(StringfromFunction1CanvasClick_String(x))
}
//</editor-fold>

//<editor-fold desc="ArrayAny_DictAny">
sealed abstract class ArrayAny_DictAny[+A, +B]

case class ArrayAnyfromArrayAny_DictAny(a: JSArrayAny) extends ArrayAny_DictAny[JSArrayAny, JSDictionary[JSAny]]
case class DictfromArrayAny_DictAny(a: JSDictionaryAny) extends ArrayAny_DictAny[JSArrayAny, JSDictionary[JSAny]]

object ArrayAny_DictAny {
    implicit def ArrayAny2ArrayAny_DictAny(x: JSArrayAny) = ScSome(ArrayAnyfromArrayAny_DictAny(x))
    implicit def Dict2ArrayAny_DictAny(x: JSDictionaryAny) = ScSome(DictfromArrayAny_DictAny(x))
}

//</editor-fold>
