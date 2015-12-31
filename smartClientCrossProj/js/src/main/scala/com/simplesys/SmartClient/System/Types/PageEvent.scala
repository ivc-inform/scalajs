package com.simplesys.SmartClient.System.Types

object PageEvent extends Enumeration {
    type PageEvent = Value
    val idle, load, unload, resize, mouseDown, rightMouseDown, mouseMove, mouseUp, click, doubleClick, showContextMenu, keyPress, orientationChange = Value
}
