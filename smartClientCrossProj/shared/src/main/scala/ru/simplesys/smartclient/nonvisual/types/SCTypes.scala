package ru.simplesys
package smartclient
package nonvisual
package types

import cmntypes._

trait SCType[T] {
  def name: String
}

sealed trait BuiltInSCType[T] extends SCType[T]

case object SCTextType extends BuiltInSCType[String] {
  override def name: String = "text"
}

trait SCTypeCustom[T] extends SCType[T] with SCProps {
  //def inheritsFrom
}
