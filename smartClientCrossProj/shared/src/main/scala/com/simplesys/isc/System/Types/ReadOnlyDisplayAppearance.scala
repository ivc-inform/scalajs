package com.simplesys.isc.System.Types

import language.implicitConversions

object ReadOnlyDisplayAppearance extends Enumeration {
    type ReadOnlyDisplayAppearance = Value
    val static, readOnly, disabled = Value
}
