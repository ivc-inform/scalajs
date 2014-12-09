package ru.simplesys.scalajs


import scala.scalajs.js
import ru.simplesys.macrojs._
import smartclient.visual._

trait SCButton extends IButton {
  var clickCount: Int = ???
}

class ToSCButton(val props: js.Dictionary[js.Any]) extends ToSC[SCButton] {
  override def initBlock: js.Function0[SCButton] = () => {
    val l = props.asInstanceOf[js.Dynamic]
    js.Dictionary
    l.clickCount = 0
    l.click = SCButton.click
    js.Dynamic.global.isc.IButton.create(l).asInstanceOf[SCButton]
  }
}


case class SCButtonProps[T <: SCButton](btnProps: IButtonProps[T]) extends SCProps[SCButton, T] {
  override def toSC: ToSCButton = new ToSCButton(this.toJSLiteral)
}


object SCButton {
  val click: js.ThisFunction0[SCButton, js.Boolean] = {(curr: SCButton) =>
    import curr._
    clickCount += 1
    setTitle(s"clicked!!! $clickCount times getLeft is ${getLeft()}, getRight is ${getRight()}, getWidth is ${getWidth()}, getHeight is ${getHeight()}")
    println(s"${getTitle()}")
    true
  }
}