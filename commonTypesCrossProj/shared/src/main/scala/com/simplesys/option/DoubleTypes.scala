package com.simplesys.option

import com.simplesys.System.Types.Alignment._
import com.simplesys.System.Types.FormItemType.FormItemType
import com.simplesys.System.Types.VerticalAlignment._
import com.simplesys.System._
import scala.language.existentials
import scala.scalajs.js

sealed abstract class DoubleType[+A, +B]

case class Type1[+A, +B](a: A) extends DoubleType[A, B]

case class Type2[+A, +B](b: B) extends DoubleType[A, B]

//<editor-fold desc="IntString">
sealed abstract class IntString[+A, +B]

case class IntFRomIntString(a: Int) extends IntString[Int, String]
case class StringFRomIntString(a: String) extends IntString[Int, String]

object DoubleType {
    implicit def Int2IntString(x: Int) = ScSome(IntFRomIntString(x))
    implicit def Stringt2IntString(x: String) = ScSome(StringFRomIntString(x))
}
//</editor-fold>

//<editor-fold desc="DoubleAlignment">
sealed abstract class DoubleAlignment[+A, +B]

case class AlignmentfromDoubleAlignment(a: Alignment) extends DoubleAlignment[Alignment, VerticalAlignment]
case class VerticalAlignmentfromDoubleAlignment(a: VerticalAlignment) extends DoubleAlignment[Alignment, VerticalAlignment]

object DoubleAlignment {
    implicit def Alignment2DoubleAlignment(x: Alignment) = ScSome(AlignmentfromDoubleAlignment(x))
    implicit def VerticalAlignment2DoubleAlignment(x: VerticalAlignment) = ScSome(VerticalAlignmentfromDoubleAlignment(x))
}
//</editor-fold>

//<editor-fold desc="FormItemType_String">
sealed abstract class FormItemType_FormItemComponentType[+A, +B]

case class FormItemTypefromFormItemType_String(a: FormItemType) extends FormItemType_FormItemComponentType[FormItemType, String]
case class StringfromFormItemType_String(a: String) extends FormItemType_FormItemComponentType[FormItemType, String]

object FormItemType_FormItemComponentType {
    implicit def FormItemType2FormItemType_String(x: FormItemType) = ScSome(FormItemTypefromFormItemType_String(x))
    implicit def String2FormItemType_String(x: String) = ScSome(StringfromFormItemType_String(x))
}
//</editor-fold>

//<editor-fold desc="Function_String">
sealed abstract class Function1_String[+A, +B]

case class Function1CanvasClickfromFunction1_String(a: js.ThisFunction1[_,String, _]) extends Function1_String[js.ThisFunction1[_,String, _], String]
case class StringfromFunction1_String(a: String) extends Function1_String[js.ThisFunction1[_, String, _], String]

object Function1_String {
    implicit def Function1CanvasClick2Function1CanvasClick_String(x: js.ThisFunction1[_, String, _]) = ScSome(Function1CanvasClickfromFunction1_String(x))
    implicit def String2Function1CanvasClick_String(x: String) = ScSome(StringfromFunction1_String(x))
}
//</editor-fold>

//<editor-fold desc="ArrayAny_DictAny">
sealed abstract class ArrayAny_DictAny[+A, +B]

case class ArrayAnyfromArrayAny_DictAny(a: JSArrayAny) extends ArrayAny_DictAny[JSArrayAny, JSDictionaryAny]
case class DictfromArrayAny_DictAny(a: JSDictionaryAny) extends ArrayAny_DictAny[JSArrayAny, JSDictionaryAny]

object ArrayAny_DictAny {
    implicit def ArrayAny2ArrayAny_DictAny(x: JSArrayAny) = ScSome(ArrayAnyfromArrayAny_DictAny(x))
    implicit def Dict2ArrayAny_DictAny(x: JSDictionaryAny) = ScSome(DictfromArrayAny_DictAny(x))
}
//</editor-fold>






