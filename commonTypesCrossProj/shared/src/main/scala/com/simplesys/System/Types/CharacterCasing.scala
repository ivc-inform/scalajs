package com.simplesys.System.Types

import language.implicitConversions

object CharacterCasing extends Enumeration {
    type CharacterCasing = Value
    val default, upper, lower = Value
}
