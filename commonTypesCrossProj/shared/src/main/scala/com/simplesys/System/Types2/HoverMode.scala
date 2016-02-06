package com.simplesys.System.Types2

import language.implicitConversions

object HoverMode extends Enumeration {
    type HoverMode = Value
    val detailField, details, related, detailRelated = Value
}
