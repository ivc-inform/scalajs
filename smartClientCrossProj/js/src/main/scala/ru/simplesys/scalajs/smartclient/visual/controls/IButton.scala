package ru.simplesys.scalajs
package smartclient
package visual
package controls

import scala.scalajs.js
import ru.simplesys.macrojs._

trait IButton extends Canvas {
  //def title: String = js.native
  def getTitle(): String = js.native
  def setTitle(s: String): Unit = js.native
}

object IButton extends SCApply[IButton, IButtonProps[IButton]]


case class IButtonProps[T <: IButton](title: String, canvasProps: CanvasProps[T]) extends SCProps[IButton, T] {
  //override def create: IButton = IButton(this)
}
