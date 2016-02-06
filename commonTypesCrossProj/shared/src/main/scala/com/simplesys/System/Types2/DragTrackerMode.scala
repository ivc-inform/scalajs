package com.simplesys.System.Types2

import language.implicitConversions

object DragTrackerMode extends Enumeration {
    type DragTrackerMode = Value
    val none, icon, title, record = Value
}
