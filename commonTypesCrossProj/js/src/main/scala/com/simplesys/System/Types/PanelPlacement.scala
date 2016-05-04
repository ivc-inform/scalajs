package com.simplesys.System.Types

import language.implicitConversions

object PanelPlacement extends Enumeration {
    type PanelPlacement = Value
    val nearOrigin, fillPanel, fillScreen, halfScreen = Value
}
