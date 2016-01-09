package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.Control.IButton
import com.simplesys.SmartClient.Layout.{AbstractLayoutCompanion, Layout}
import com.simplesys.isc.System.Types.AutoChild

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait MultiSortPanel extends Layout {
    val addLevelButton:IButton with AutoChild
}

@js.native
abstract trait AbstractMultiSortPanelCompanion extends AbstractLayoutCompanion {
}

@js.native
object MultiSortPanel extends AbstractMultiSortPanelCompanion        
