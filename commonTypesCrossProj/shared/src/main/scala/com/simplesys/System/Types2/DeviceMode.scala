package com.simplesys.System.Types2

import language.implicitConversions

object DeviceMode extends Enumeration {
    type DeviceMode = Value
    val handset, tablet, desktop = Value
}
