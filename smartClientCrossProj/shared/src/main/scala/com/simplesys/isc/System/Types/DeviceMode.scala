package com.simplesys.isc.System.Types

import language.implicitConversions

object DeviceMode extends Enumeration {
    type DeviceMode = Value
    val handset, tablet, desktop = Value
}
