package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.Forms.DynamicForm
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.ListGrid
import com.simplesys.SmartClient.Grids.listGrid.ListGridField
import com.simplesys.SmartClient.Layout.NavigationBar
import com.simplesys.SmartClient.Layout.navigationBar.NavigationButton
import com.simplesys.SmartClient.System.Criterion
import com.simplesys.isc.System.Types.PanelPlacement.PanelPlacement
import com.simplesys.isc.System.Types.{void, HTMLString, AutoChild, CSSStyleName}
import com.simplesys.isc.System.Types.PickListItemIconPlacement.PickListItemIconPlacement

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait ComboBoxItem extends TextItem with PickList {
    var addUnknownValues: Boolean
    var allowEmptyValue: Boolean
    var autoFetchData: Boolean
    def canEditCriterion(): void
    var completeOnTab: Boolean
    var defaultToFirstOption: Boolean
    val filterFields: Array[String]
    var filterWithValue: Boolean
    var generateExactMatchCriteria: Boolean
    def getCriterion(): Criterion
    var minimumSearchLength: Int
    var pendingTextBoxStyle: CSSStyleName
    var pickerExitButton: NavigationButton with AutoChild
    val pickerExitButtonTitle: HTMLString
    var pickerNavigationBar: NavigationBar with AutoChild
    var pickerSaveButton: NavigationButton with AutoChild
    var pickerSaveButtonTitle: HTMLString
    var pickerSearchField: TextItem with AutoChild
    var pickerSearchFieldHint: HTMLString
    var pickerSearchForm: DynamicForm with AutoChild
    var pickListPlacement: PanelPlacement | Canvas | String
    var progressiveLoading:Boolean
    var searchStringTooShortMessage:String
    var separateSpecialValues:Boolean
    var separateValuesList:ListGrid[ListGridField]
    def setCriterion ():void
    def shouldGenerateExactMatchCriteria ():Boolean
    var showPickListOnKeypress:Boolean
}

@js.native
abstract trait AbstractComboBoxItemCompanion extends AbstractTextItemCompanion {
}

@js.native
object ComboBoxItem extends AbstractComboBoxItemCompanion        
