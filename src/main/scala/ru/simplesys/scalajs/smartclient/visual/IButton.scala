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

object IButton {
  def apply[T <: IButton](props: IButtonProps[T]): IButton = js.Dynamic.global.isc.IButton.create(props.toJSLiteral).asInstanceOf[IButton]
}


case class IButtonProps[T <: IButton](title: String, canvasProps: CanvasProps[T]) extends SCProps[IButton, T] {
//  def toSC: ToIButton = new ToIButton(this.toJSLiteral)
  //  def toSC: ToSC[T]
  override def create: IButton = IButton(this)
}

//class ToIButton(val props: js.Dictionary[js.Any]) extends ToSC[IButton] {
//  override def initBlock: js.Function0[IButton] = () => js.Dynamic.global.isc.IButton.create(props).asInstanceOf[IButton]
//}
