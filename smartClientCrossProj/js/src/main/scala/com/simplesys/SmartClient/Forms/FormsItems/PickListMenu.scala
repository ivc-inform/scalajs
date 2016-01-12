package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.DataBinding.ResultSet
import com.simplesys.System.Types.CSSStyleName

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait PickListMenu extends ScrollingMenu {
    var bodyStyleName: CSSStyleName
    var dataProperties: ResultSet
    var normalCellHeight: Int
    var styleName: CSSStyleName
}

@js.native
abstract trait AbstractPickListMenuCompanion extends AbstractScrollingMenuCompanion {
}

@js.native
object PickListMenu extends AbstractPickListMenuCompanion        
