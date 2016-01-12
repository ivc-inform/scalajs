package com.simplesys.SmartClient.option

import javax.swing.GroupLayout.Alignment


sealed abstract class DoubleType[+A, +B]

case class Type1[+A, +B](a: A) extends DoubleType[A, B]

case class Type2[+A, +B](b: B) extends DoubleType[A, B]

sealed abstract class IntString[+A, +B]

case class IntFRomIntString(a: Int) extends IntString[Int, String]

case class StringFRomIntString(a: String) extends IntString[Int, String]

