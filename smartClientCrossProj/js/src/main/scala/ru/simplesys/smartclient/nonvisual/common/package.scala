package ru.simplesys
package smartclient
package nonvisual

import scala.scalajs.js

package object common {
  @inline implicit def stringEnumToJS[T <: SimpleStringEnum](p: T): js.Any = p.asString
}
