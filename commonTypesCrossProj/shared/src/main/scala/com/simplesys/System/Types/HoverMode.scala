package com.simplesys.System.Types

import language.implicitConversions

object HoverMode extends Enumeration {
    type HoverMode = Value
    val detailField, details, related, detailRelated = Value
}
