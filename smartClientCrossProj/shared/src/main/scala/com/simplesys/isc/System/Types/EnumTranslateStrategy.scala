package com.simplesys.isc.System.Types

import language.implicitConversions

object EnumTranslateStrategy extends Enumeration {
    type EnumTranslateStrategy = Value
    val name, string, ordinal, bean = Value
}
