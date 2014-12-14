package ru.simplesys.scalajs


import ru.simplesys.scalajs.smartclient.SCApply

import scala.scalajs.js
import ru.simplesys.macrojs._
import smartclient.visual._
import smartclient.visual.controls._
import smartclient._

trait SCButton extends IButton {
  var clickCount: Int = js.native
}


trait SCButtonProps[T <: SCButton] extends IButtonProps[T] {
  var clickCount = 0
  click = {(that: SCButton) =>
    import that._
    that.clickCount += 1
    setTitle(s"clicked!!! ${that.clickCount} times getLeft is ${getLeft()}, getRight is ${getRight()}, getWidth is ${getWidth()}, getHeight is ${getHeight()}")
    println(s"${getTitle()}")
    true
  }: js.ThisFunction0[SCButton, js.Boolean]
}

object SCButton extends SCApply[SCButton, SCButtonProps[SCButton]](Some("IButton"))


