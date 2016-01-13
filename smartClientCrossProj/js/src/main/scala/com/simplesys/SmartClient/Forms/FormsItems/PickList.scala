package com.simplesys.SmartClient.Forms.FormsItems

import javax.security.auth.callback.Callback

import com.simplesys.SmartClient.DataBinding.{DSCallback, DataSource, DSRequest, ResultSet}
import com.simplesys.SmartClient.Grids.ListGrid
import com.simplesys.SmartClient.Grids.listGrid.{ListGridField, ListGridRecord}
import com.simplesys.SmartClient.System.AbstractClassCompanion
import com.simplesys.SmartClient.System.Class
import com.simplesys.SmartClient.System.SortSpecifier.SortSpecifier
import com.simplesys.SmartClient.System.Types.{ValueMap, Criteria}
import com.simplesys.System.Types.TextMatchStyle.TextMatchStyle
import com.simplesys.System.Types.{void, SCClassName, CSSStyleName}
import com.simplesys.System.Types.PickListItemIconPlacement.PickListItemIconPlacement

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait PickList extends Class {
    var animatePickList: Boolean
    var animationTime: Int
    var cachePickListResults: Boolean
    var dataArrived: js.Function3[Int, Int, ResultSet, _]
    var displayField: String
    var emptyPickListHeight: Int
    var emptyPickListMessage: String
    def fetchData(callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    var fetchDelay: Int
    var fetchDisplayedFieldsOnly: Boolean
    def filterClientPickListData(): Array[ListGridRecord]
    var filterLocally: Boolean
    def getClientPickListData(): Array[ListGridRecord]
    def getDisplayFieldName(): String
    def getOptionDataSource(): DataSource
    def getPickListFilterCriteria(): Criteria
    def getValueFieldName(): String
    var hideEmptyPickList: Boolean
    val iconPlacement: PickListItemIconPlacement
    val initialSort: Array[SortSpecifier]
    val optionDataSource: String| DataSource
    val optionFilterContext: DSRequest
    var pickListApplyRowNumberStyle: Boolean
    val pickListBaseStyle: CSSStyleName
    var pickListCellHeight: Int
    val pickListConstructor: SCClassName
    var pickListCriteria: Criteria
    val pickListFields: Array[ListGridField]
    var pickListHeaderHeight: Int
    var pickListHeight: Int
    var pickListMaxWidth: Int
    var pickListProperties: ListGrid[ListGridField, ListGridRecord]
    val pickListTallBaseStyle: CSSStyleName
    var pickListWidth: Int
    var separatorRows: Array[ListGridRecord]
    val showAllOptions: Boolean
    var showOptionsFromDataSource: Boolean
    val sortField: String | js.Array[String] | Int
    val specialValues: ValueMap
    var textMatchStyle: TextMatchStyle
    val useClientFiltering: Boolean
    val valueField: js.Any
    var valueIconField: String
}

@js.native
abstract trait AbstractPickListCompanion extends AbstractClassCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object PickList extends AbstractPickListCompanion
}

