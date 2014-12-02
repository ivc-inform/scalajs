package ru.simplesys.scalajs

import ru.simplesys.scalajs.smartclient.visual._

import scala.annotation.meta.field
import scala.reflect.ClassTag
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, JSExport, JSExportAll}

/*
object SCButtonProps {
  implicit def toSCButton(x: SCButtonProps): SCButton = x.asInstanceOf[SCButton]
}

@JSExportAll
class SCButtonProps (
  val left: Int,
  val top: Int,
  val width: Int,
  val height: Int,
  val title: String
) /*extends SCButtonCmn*/ {
  //self: SCButton =>
  var clickCount = 0
  def click(): Boolean = {
    clickCount += 1
    this.setTitle(s"clicked!!! $clickCount times")
    println(s"$clickCount vs ${this.asInstanceOf[js.Dynamic].clickCount} vs ${this.asInstanceOf[js.Dynamic].clickCountttt}")
    //println(s"new title is $title")
    true
  }
}
*/

trait SCButton extends IButton {
  var clickCount: Int = ???
}

object SCButton {
  val click: js.ThisFunction0[SCButton, Boolean] = {(curr: SCButton) =>
    import curr._
    clickCount += 1
    setTitle(s"clicked!!! $clickCount times getLeft is ${getLeft()}, getRight is ${getRight()}, getWidth is ${getWidth()}, getHeight is ${getHeight()}")
    println(s"${getTitle()}")
    true
  }

  def apply(left: PointSpec, top: PointSpec, width: SizeSpec, height: SizeSpec, title: String): SCButton = {
    import js.Dynamic.{ literal => lit }
    //import PointSpec._
    js.Dynamic.global.isc.IButton.create(lit (
      left = left,
      top = top,
      width = width,
      height = height,
      title = title,
      clickCount = 0,

      click = click
    )).asInstanceOf[SCButton]
  }
}

