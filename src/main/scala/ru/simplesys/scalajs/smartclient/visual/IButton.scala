package ru.simplesys.scalajs
package smartclient
package visual

import scala.scalajs.js
import ru.simplesys.macrojs._

trait IButton extends Canvas {
  //def title: String = ???
  def getTitle(): String = ???
  def setTitle(s: String): Unit = ???
}




case class IButtonProps[T <: IButton](title: String, canvasProps: CanvasProps[T]) extends SCProps

object IButton {
  def apply(props: IButtonProps[IButton]): () => IButton =
    () => js.Dynamic.global.isc.IButton.create(props.toJSLiteral).asInstanceOf[IButton]
}