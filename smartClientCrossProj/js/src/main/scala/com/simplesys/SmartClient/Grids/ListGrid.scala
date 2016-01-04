package com.simplesys.SmartClient.Grids

import com.simplesys.SmartClient.DataBinding.{DSRequest, DataBoundComponent}
import com.simplesys.SmartClient.DataBinding.dataSource.DSCallback
import com.simplesys.SmartClient.Foundation.{GridRenderer, Canvas}
import com.simplesys.SmartClient.Grids.listGrid.ListGridField.ListGridField
import com.simplesys.SmartClient.Layout.{AbstractVLayoutCompanion, VLayout}
import com.simplesys.SmartClient.System.SortSpecifier.SortSpecifier
import com.simplesys.SmartClient.System.Types.Record
import com.simplesys.isc.System.Types.AnimationAcceleration.AnimationAcceleration
import com.simplesys.isc.System.Types.AutoComplete.AutoComplete
import com.simplesys.isc.System.Types.AutoFitIconFieldType.AutoFitIconFieldType
import com.simplesys.isc.System.Types.AutoFitWidthApproach.AutoFitWidthApproach
import com.simplesys.isc.System.Types.Autofit.Autofit
import com.simplesys.isc.System.Types.Overflow.Overflow
import com.simplesys.isc.System.Types.TextMatchStyle.TextMatchStyle
import com.simplesys.isc.System.Types.{SCImgURL, MultiAutoChild, HTMLString, CSSStyleName}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ListGrid extends VLayout with DataBoundComponent {
    def addData(newRecord: Record, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): Unit
    def addEmbeddedComponent(component: Canvas, record: Record, rowNum: Int = js.native, colNum: Int = js.native, position: Int = js.native): Unit
    def addSort(sortSpecifier: SortSpecifier): Unit
    val advancedFieldPickerThreshold: Int
    val allowFilterExpressions: Boolean
    val allowRowSpanning: Boolean
    var alternateBodyStyleName: CSSStyleName
    var alternateFieldFrequency: Int
    var alternateFieldStyles: Boolean
    var alternateRecordFrequency: Int
    var alternateRecordStyles: Boolean
    val alwaysShowEditors: Boolean
    var animateFolderEffect: AnimationAcceleration
    var animateFolderMaxRows: Int
    var animateFolders: Boolean
    var animateFolderSpeed: Int
    var animateFolderTime: Int
    var animateRemoveRecord: Boolean
    var animateRemoveSpeed: Int
    var animateRemoveTime: Int
    var animateRollOver: Boolean
    var animateRollUnder: Boolean
    var animateSelection: Boolean
    var animateSelectionUnder: Boolean
    def applyCellData(cellData: js.Array[Record]): Unit
    var applyFormulaAfterSummary: Boolean
    def applyRecordData(recordData: js.Array[Record]): Unit
    var applyRowNumberStyle: Boolean
    def applySortToData(sortSpecifiers: js.Array[SortSpecifier]): Unit
    var arrowKeyAction: String
    val asynchGroupingPrompt: HTMLString
    var autoComplete: AutoComplete
    var autoConfirmSaveEdits: Boolean
    var autoFetchDisplayMap: Boolean
    val autoFetchTextMatchStyle: TextMatchStyle
    var autoFitAllText: String
    val autoFitClipFields: js.Array[String]
    var autoFitData: Autofit
    val autoFitExpandField: String
    var autoFitExtraRecords: Int
    def autoFitField(fieldName: String): Int
    def autoFitFields(fields: js.Array[ListGridField] = js.native): Unit
    val autoFitFieldsFillViewport: Boolean
    var autoFitFieldText: String
    val autoFitFieldWidths: Boolean
    val autoFitHeaderHeights: Boolean
    val autoFitIconFields: AutoFitIconFieldType
    var autoFitMaxColumns: Int
    var autoFitMaxHeight: Int
    var autoFitMaxRecords: Int
    var autoFitMaxWidth: Int
    var autoFitWidthApproach: AutoFitWidthApproach
    var autoSaveEdits: Boolean
    val autoSizeHeaderSpans: Boolean
    val backgroundComponent: Canvas with MultiAutoChild
    val baseStyle: CSSStyleName
    val body: GridRenderer with MultiAutoChild
    var bodyBackgroundColor: String
    var bodyKeyPress: js.ThisFunction0[callbackHandler, Boolean]
    var bodyOverflow: Overflow
    var bodyStyleName: CSSStyleName
    val booleanBaseStyle: CSSStyleName
    var booleanFalseImage: SCImgURL
    var booleanImageHeight: Int
    var booleanImageWidth: Int
    var booleanPartialImage: SCImgURL
    var booleanTrueImage: SCImgURL
    var canAcceptDroppedRecords: Boolean
    var canAutoFitFields: Boolean
    def cancelEditing(): Unit
    var cancelEditingConfirmationMessage: String
    val canCollapseGroup: Boolean
    var canDragRecordsOut: Boolean
    var canDragSelect: Boolean
    var canDragSelectText: Boolean
    var canDropInEmptyArea: Boolean
    var canEdit: Boolean
    def canEditCell(rowNum: Int, colNum: Int): Boolean
    val canEditFieldAttribute:Boolean
}

@js.native
abstract trait AbstractListGridCompanion extends AbstractVLayoutCompanion {
}

@js.native
object ListGrid extends AbstractListGridCompanion        
