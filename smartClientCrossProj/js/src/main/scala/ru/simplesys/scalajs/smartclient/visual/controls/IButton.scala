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


trait IButtonProps[T <: IButton] extends CanvasProps[T] {
  var title = noSCProp[String]
}

object IButton extends SCApply[IButton, IButtonProps[IButton]]


