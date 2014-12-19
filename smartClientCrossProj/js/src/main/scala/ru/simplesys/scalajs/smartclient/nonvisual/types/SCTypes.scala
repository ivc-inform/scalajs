package ru.simplesys.scalajs
package smartclient
package nonvisual
package types

import scala.scalajs.js

trait SCType
sealed trait BuiltInSCType
case object SCTextType extends BuiltInSCType

trait SimpleType extends js.Object {

}
