package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.DataBinding.Callbacks.DSCallback
import com.simplesys.SmartClient.DataBinding.{DSRequest, DataSource, ResultSet}
import com.simplesys.SmartClient.Grids.Grid
import com.simplesys.SmartClient.Grids.listGrid.{ListGridField, ListGridRecord}
import com.simplesys.SmartClient.System.Class
import com.simplesys.SmartClient.System.SortSpecifier.SortSpecifier
import com.simplesys.System.Types.PickListItemIconPlacement.PickListItemIconPlacement
import com.simplesys.System.Types.TextMatchStyle.TextMatchStyle
import com.simplesys.System.Types._
import com.simplesys.System.{JSAny, JSArray}

import scala.scalajs.js
import scala.scalajs.js.|

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
    def filterClientPickListData(): JSArray[ListGridRecord]
    var filterLocally: Boolean
    def getClientPickListData(): JSArray[ListGridRecord]
    def getDisplayFieldName(): String
    def getOptionDataSource(): DataSource
    def getPickListFilterCriteria(): Criteria
    def getValueFieldName(): String
    var hideEmptyPickList: Boolean
    val iconPlacement: PickListItemIconPlacement
    val initialSort: JSArray[SortSpecifier]
    val optionDataSource: String| DataSource
    val optionFilterContext: DSRequest
    var pickListApplyRowNumberStyle: Boolean
    val pickListBaseStyle: CSSStyleName
    var pickListCellHeight: Int
    val pickListConstructor: SCClassName
    var pickListCriteria: Criteria
    val pickListFields: JSArray[ListGridField]
    var pickListHeaderHeight: Int
    var pickListHeight: Int
    var pickListMaxWidth: Int
    var pickListProperties: Grid[ListGridField, ListGridRecord]
    val pickListTallBaseStyle: CSSStyleName
    var pickListWidth: Int
    var separatorRows: JSArray[ListGridRecord]
    val showAllOptions: Boolean
    var showOptionsFromDataSource: Boolean
    val sortField: String | JSArray[String] | Int
    val specialValues: ValueMap
    var textMatchStyle: TextMatchStyle
    val useClientFiltering: Boolean
    val valueField: JSAny
    var valueIconField: String
}


