package com.simplesys.isc.System.Types

import language.implicitConversions

object PromptStyle extends Enumeration {
    type PromptStyle = Value
    val dialog, cursor = Value
}
