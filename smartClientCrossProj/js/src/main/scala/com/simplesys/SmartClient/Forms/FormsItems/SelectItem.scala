package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.DataBinding.DSRequest
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.Grid
import com.simplesys.SmartClient.Grids.listGrid.{ListGridField, ListGridRecord}
import com.simplesys.SmartClient.Layout.NavigationBar
import com.simplesys.SmartClient.Layout.navigationBar.NavigationButton
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types.Object
import com.simplesys.System.Types.MultipleAppearance.MultipleAppearance
import com.simplesys.System.Types.PanelPlacement.PanelPlacement
import com.simplesys.System.Types.{HTMLString, AutoChild, SCClassName}

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait SelectItem extends FormItem with PickList {
    var addUnknownValues: Boolean
    var allowEmptyValue: Boolean
    var autoFetchData: Boolean
    var defaultToFirstOption: Boolean
    var editProxyConstructor: SCClassName
    var escapeHTML: Boolean
    def getSelectedRecords(): Array[ListGridRecord]
    var hiliteColor: String
    val multiple:Boolean
    val multipleAppearance : MultipleAppearance
    var openOnDownArrow:Boolean
    var openOnSpace:Boolean
    val pickerExitButton :NavigationButton with AutoChild
    val pickerExitButtonTitle:HTMLString
    var pickerNavigationBar :NavigationBar with AutoChild
    val pickListPlacement :PanelPlacement | Canvas | String
    val progressiveLoading: Boolean
    val separateSpecialValues: Boolean
    val separateValuesList:Grid[ListGridField, ListGridRecord]
    var showHintInField:Boolean
    var showOver:Boolean
}


