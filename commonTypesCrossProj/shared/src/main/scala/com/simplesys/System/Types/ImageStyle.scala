package com.simplesys.System.Types

import language.implicitConversions

object ImageStyle extends Enumeration {
    type ImageStyle = Value
    val center, tile, stretch, normal = Value
}
