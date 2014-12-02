package ru.simplesys.scalajs
package smartclient
package visual

import scala.scalajs.js

trait IButton extends Canvas {
  def title: String = ???
  def getTitle(): js.String = ???
  def setTitle(s: js.String): Unit = ???
}
