package com.simplesys.System.Types

import scala.language.implicitConversions

object State extends Enumeration {
    type State = Value
    val Empty, Down, Over, Disabled = Value
}
