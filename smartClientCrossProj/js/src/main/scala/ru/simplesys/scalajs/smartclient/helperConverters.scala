package ru.simplesys.scalajs
package smartclient

import ru.simplesys.macrojs._

object helperConverters {
  //implicit def toSCPropOpt[A](x: A): SCPropOpt[A] = SCPropVal(x)
  @inline def noSCProp[A]: SCPropOpt[A] = NoSCPropVal

  //implicit def toPropOpt[A](x: A): PropOpt[A] = PropVal(x)
  @inline def noProp[A]: PropOpt[A] = NoPropVal
}
