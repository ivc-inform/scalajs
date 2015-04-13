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
  // Event handler for when rows in the body are clicked upon. The default implementation handles
  // firing +link{ListGrid.startEditing()} if appropriate, and fires
  // +link{ListGridField.recordClick()} and/or +link{ListGrid.recordClick()} if set. Developers
  // should typically implement recordClick rather than overriding this method.
  // <P>
  // Note that this method fires in addition to any specified +link{listGrid.cellClick}
  // handler (even if that method cancels the event as a whole by returning <code>false</code>).
  def rowClick(record: js.Object, recordNum: Int, fieldNum: Int/*, keyboardGenerated: Boolean = */): Boolean = js.native

  //def recordClick(viewer: ListGrid)
}

class ListGridProps extends VLayoutProps with DataBoundComponentProps {
  type GridType <: ListGrid

  //todo need to express Record, ListGridRecord and other records in separate class
  type ListGridRecordType <: js.Object

  var rowClick = noSCProp[js.ThisFunction3[GridType, ListGridRecordType, Int, Int, Boolean]]
}

object ListGrid extends SCApply[ListGrid, ListGridProps]{}




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
