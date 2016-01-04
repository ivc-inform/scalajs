package com.simplesys.isc.System.Types

import language.implicitConversions

object DragTrackerMode extends Enumeration {
    type DragTrackerMode = Value
    val none, icon, title, record = Value
}
