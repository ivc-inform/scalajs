package ru.simplesys.scalajs


import ru.simplesys.scalajs.smartclient.SCApply

import scala.scalajs.js
import ru.simplesys.macrojs._
import smartclient.visual._
import smartclient.visual.controls._

trait SCButton extends IButton {
  var clickCount: Int = js.native
}

object SCButton extends SCApply[SCButton, SCButtonProps[SCButton]](Some("IButton"))

case class SCButtonProps[T <: SCButton] private (btnProps: IButtonProps[T]) extends SCProps[SCButton, T] {
  val clickCount: Int = 0



}

object SCButtonProps {
  val click: js.ThisFunction0[SCButton, js.Boolean] = {(that: SCButton) =>
    import that._
    that.clickCount += 1
    setTitle(s"clicked!!! ${that.clickCount} times getLeft is ${getLeft()}, getRight is ${getRight()}, getWidth is ${getWidth()}, getHeight is ${getHeight()}")
    println(s"${getTitle()}")
    true
  }


  def apply(title: String, width: SizeSpec, height: SizeSpec): SCButtonProps[SCButton] = {
    SCButtonProps(IButtonProps(title, CanvasProps(width = width, height = height, click = Some(click))))
  }
}


