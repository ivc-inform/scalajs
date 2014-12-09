package ru.simplesys.scalajs


import scala.scalajs.js
import ru.simplesys.macrojs._
import smartclient.visual._
import smartclient.visual.controls._

trait SCButton extends IButton {
  var clickCount: Int = ???
}

object SCButton {
  def apply(props: SCButtonProps[SCButton]): SCButton = {
        //val l = props.toJSLiteral.asInstanceOf[js.Dynamic]
        js.Dynamic.global.isc.IButton.create(props.toJSLiteral).asInstanceOf[SCButton]
  }
}

case class SCButtonProps[T <: SCButton] private (btnProps: IButtonProps[T]) extends SCProps[SCButton, T] {
  val clickCount: Int = 0

  //override def create: SCButton = SCButton(this)
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


