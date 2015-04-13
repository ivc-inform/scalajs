package ru.simplesys
package smartclient


package object cmntypes {
  import scala.scalajs.js

  object SCPropOpt {
    implicit def scPropOpt2jsAny[A](value: SCPropOpt[A])(implicit ev: A => js.Any): js.Any =
      value.map(ev).asInstanceOf[js.Any]
  }
}
