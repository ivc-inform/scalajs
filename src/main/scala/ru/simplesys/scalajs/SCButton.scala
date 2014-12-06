package ru.simplesys.scalajs

import smartclient.visual._

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, JSExport, JSExportAll}
import ru.simplesys.macrojs._



trait SCButton extends IButton {
  var clickCount: Int = ???
}

object SCButton {
  val click: js.ThisFunction0[SCButton, js.Boolean] = {(curr: SCButton) =>
    import curr._
    clickCount += 1
    setTitle(s"clicked!!! $clickCount times getLeft is ${getLeft()}, getRight is ${getRight()}, getWidth is ${getWidth()}, getHeight is ${getHeight()}")
    println(s"${getTitle()}")
    true
  }

  def apply(props: IButtonProps[IButton]): () => SCButton = () => {
    //import js.Dynamic.{ literal => lit }
    import js.JSConverters._
    val l = props.toJSLiteral.asInstanceOf[js.Dynamic]
    js.Dictionary
    l.clickCount = 0
    l.click = click
    js.Dynamic.global.isc.IButton.create(l).asInstanceOf[SCButton]
  }
}

