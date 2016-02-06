package com.simplesys.System.Types2

import language.implicitConversions

object SelectionNotificationType extends Enumeration {
    type SelectionNotificationType = Value
    val none, selectionChanged, selectionUpdated = Value
}
