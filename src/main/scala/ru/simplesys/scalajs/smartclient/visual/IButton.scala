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

case class IButtonProps[T <: IButton](title: String, canvasProps: CanvasProps[T]) extends SCProps[IButton, T] {
  def toSC: ToIButton = new ToIButton(this.toJSLiteral)
}

class ToIButton(val props: js.Dictionary[js.Any]) extends ToSC[IButton] {
  override def initBlock: js.Function0[IButton] = () => js.Dynamic.global.isc.IButton.create(props).asInstanceOf[IButton]
}
