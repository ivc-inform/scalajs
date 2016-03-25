package com.simplesys.System.Types

import scala.language.implicitConversions

object ConnectorOrientation extends Enumeration {
    type ConnectorOrientation = Value
    val horizontal, vertical, auto = Value
}
