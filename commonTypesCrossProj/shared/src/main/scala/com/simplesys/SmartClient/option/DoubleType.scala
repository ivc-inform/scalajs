package com.simplesys.SmartClient.option

import scala.language.implicitConversions


sealed abstract class DoubleType[+A, +B]

case class Type1[+A, +B](a: A) extends DoubleType[A, B]

case class Type2[+A, +B](b: B) extends DoubleType[A, B]

sealed abstract class IntString extends DoubleType[Int, String]

//case class IntFRomIntString(a: Int) extends IntString
//
//case class StringFRomIntString(a: String) extends IntString
