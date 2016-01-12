package com.simplesys.option

import com.simplesys.System.Types.Alignment._
import com.simplesys.System.Types.VerticalAlignment._


sealed abstract class DoubleType[+A, +B]

case class Type1[+A, +B](a: A) extends DoubleType[A, B]

case class Type2[+A, +B](b: B) extends DoubleType[A, B]

//<editor-fold desc="IntString">
sealed abstract class IntString[+A, +B]

case class IntFRomIntString(a: Int) extends IntString[Int, String]

case class StringFRomIntString(a: String) extends IntString[Int, String]
//</editor-fold>

//<editor-fold desc="DoubleAlignment">
sealed abstract class DoubleAlignment[+A, +B]

case class AlignmentfromDoubleAlignment(a: Alignment) extends DoubleAlignment[Alignment, VerticalAlignment]
case class VerticalAlignmentfromDoubleAlignment(a: VerticalAlignment) extends DoubleAlignment[Alignment, VerticalAlignment]
//</editor-fold>

object DoubleType {
    implicit def Int2IntString(x: Int) = ScSome(IntFRomIntString(x))
    implicit def Stringt2IntString(x: String) = ScSome(StringFRomIntString(x))
}

