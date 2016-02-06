package com.simplesys.System.Types2

object PageEvent extends Enumeration {
    type PageEvent = Value
    val idle, load, unload, resize, mouseDown, rightMouseDown, mouseMove, mouseUp, click, doubleClick, showContextMenu, keyPress, orientationChange = Value
}
