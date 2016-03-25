package com.simplesys.System.Types

import scala.language.implicitConversions

object ConnectorStyle extends Enumeration {
    type ConnectorStyle = Value
    val diagonal, rightAngle = Value
}
