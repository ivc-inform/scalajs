package com.simplesys.System.Types

import language.implicitConversions

object DateItemSelectorFormat extends Enumeration {
    type DateItemSelectorFormat = Value
    val DMY, MDY, YMD, DM, MD, YM, MY = Value
}
