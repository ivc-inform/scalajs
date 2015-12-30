package com.simplesys.isc.System.Types

//object PageEvent extends Enumeration {
//    type PageEvent = Value
//    val idle = Value
//    val load = Value
//    val unload = Value
//    val resize = Value
//    val mouseDown = Value
//    val rightMouseDown = Value
//    val mouseMove = Value
//    val mouseUp = Value
//    val click = Value
//    val doubleClick = Value
//    val showContextMenu = Value
//    val keyPress = Value
//    val orientationChange = Value
//}

sealed abstract trait PageEvent

case object idlePageEvent extends PageEvent {
  override def toString = "idle"
}

case object loadPageEvent extends PageEvent {
  override def toString = "load"
}

case object unloadPageEvent extends PageEvent {
  override def toString = "unload"
}

case object resizePageEvent extends PageEvent {
  override def toString = "resize"
}

case object mouseDownPageEvent extends PageEvent {
  override def toString = "mouseDown"
}

case object rightMouseDownPageEvent extends PageEvent {
  override def toString = "rightMouseDown"
}

case object mouseMovePageEvent extends PageEvent {
  override def toString = "mouseMove"
}

case object mouseUpPageEvent extends PageEvent {
  override def toString = "mouseUp"
}

case object clickPageEvent extends PageEvent {
  override def toString = "click"
}

case object doubleClickPageEvent extends PageEvent {
  override def toString = "doubleClick"
}

case object showContextMenuPageEvent extends PageEvent {
  override def toString = "showContextMenu"
}

case object keyPressPageEvent extends PageEvent {
  override def toString = "keyPress"
}

case object orientationChangePageEvent extends PageEvent {
  override def toString = "orientationChange"
}
