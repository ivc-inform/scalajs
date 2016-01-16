package com.simplesys.option

import com.simplesys.System.Types.Alignment._
import com.simplesys.System.Types.FormItemType.FormItemType
import com.simplesys.System.Types.VerticalAlignment._
import scala.language.existentials
//import scala.scalajs.js

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
sealed abstract class FormItemType_String[+A, +B]

case class FormItemTypefromFormItemType_String(a: FormItemType) extends FormItemType_String[FormItemType, String]
case class StringfromFormItemType_String(a: String) extends FormItemType_String[FormItemType, String]

object FormItemType_String {
    implicit def FormItemType2FormItemType_String(x: FormItemType) = ScSome(FormItemTypefromFormItemType_String(x))
    implicit def String2FormItemType_String(x: String) = ScSome(StringfromFormItemType_String(x))
}
//</editor-fold>





