package com.simplesys.isc.System.Types

import scala.language.implicitConversions

object BackgroundRepeat extends Enumeration {
    type BackgroundRepeat = Value
    val repeat, `no-repeat`, `repeat-x`, `repeat-y` = Value
}
