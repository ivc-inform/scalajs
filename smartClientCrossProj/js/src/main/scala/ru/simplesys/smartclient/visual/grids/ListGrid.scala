package ru.simplesys
package smartclient
package visual
package grids

import macrojs._
import cmntypes._
import smartclient.visual.common.{DataBoundComponentProps, DataBoundComponent}
import smartclient.visual.layouts.{VLayoutProps, VLayout}

import scala.scalajs.js


trait ListGrid extends VLayout with DataBoundComponent {

  def rowClick(): String = js.native

}

class ListGridProps[RecordType <: js.Object ] extends VLayoutProps with DataBoundComponentProps {
  //var fields = SC
  var rowClick = noSCProp[ RecordType => Unit]

}

object ListGrid extends SCApply[ListGrid, ListGridProps[_]]{}




/*class SCButtonProps extends IButtonProps {

  override type ClickHandler <: SCButton
  var clickCount = 0
  //override def click: SCPropOpt[js.ThisFunction0[SCButton, Boolean]] = SCPropVal(SCButton.clickHandler)
  click = SCButton.clickHandler
}

object SCButton extends SCApply[SCButton, SCButtonProps](Some("IButton")) {
  val clickHandler = {(that: SCButton) =>
    import that._
    clickCount += 1
    setTitle(s"clicked!!! ${clickCount} times getLeft is ${getLeft()}, getRight is ${getRight()}, getWidth is ${getWidth()}, getHeight is ${getHeight()}")
    println(s"${getTitle()}")
    true
  }: js.ThisFunction0[SCButton, Boolean]

  val clickHandlerCanvas = {(that: Canvas) =>
    import that._
    true
  }: js.ThisFunction0[SCButton, Boolean]
}*/
