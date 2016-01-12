package com.simplesys.SmartClient.option


sealed abstract class DoubleType[+A, +B]

case class Type1[+A, +B](a: A) extends DoubleType[A, B]

case class Type2[+A, +B](b: B) extends DoubleType[A, B]

sealed abstract class IntString[+A, +B]

case class IntFRomIntString(a: Int) extends IntString[Int, String]

case class StringFRomIntString(a: String) extends IntString[Int, String]

object DoubleType {
    implicit def Int2IntString(x: Int) = ScSome(IntFRomIntString(x))
    implicit def Stringt2IntString(x: String) = ScSome(StringFRomIntString(x))

}

