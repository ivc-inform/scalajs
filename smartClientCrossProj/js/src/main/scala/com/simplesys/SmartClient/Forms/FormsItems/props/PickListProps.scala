package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.DataBinding.{DSRequest, DataSource, ResultSet, SortSpecifier}
import com.simplesys.SmartClient.Grids.Grid
import com.simplesys.SmartClient.Grids.listGrid.{ListGridField, ListGridRecord}
import com.simplesys.SmartClient.System.Types.{Criteria, ValueMap}
import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.System.Types2.PickListItemIconPlacement.PickListItemIconPlacement
import com.simplesys.System.Types2.TextMatchStyle.TextMatchStyle
import com.simplesys.System.Types2.{CSSStyleName, SCClassName}
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.Types1.JSArray

import scala.scalajs.js
import scala.scalajs.js._

trait PickListProps extends ClassProps {
    var animatePickList: ScOption[Boolean] = ScNone
    var animationTime: ScOption[Int] = ScNone
    var cachePickListResults: ScOption[Boolean] = ScNone
    var dataArrived: ScOption[js.Function3[Int, Int, ResultSet, _]] = ScNone
    var emptyPickListHeight: ScOption[Int] = ScNone
    var emptyPickListMessage: ScOption[String] = ScNone
    var fetchDelay: ScOption[Int] = ScNone
    var fetchDisplayedFieldsOnly: ScOption[Boolean] = ScNone
    var hideEmptyPickList: ScOption[Boolean] = ScNone
    var iconPlacement: ScOption[PickListItemIconPlacement] = ScNone
    var initialSort: ScOption[JSArray[SortSpecifier]] = ScNone
    var pickListApplyRowNumberStyle: ScOption[Boolean] = ScNone
    var pickListBaseStyle: ScOption[CSSStyleName] = ScNone
    var pickListCellHeight: ScOption[Int] = ScNone
    var pickListConstructor: ScOption[SCClassName] = ScNone
    var pickListCriteria: ScOption[Criteria] = ScNone
    var pickListFields: ScOption[JSArray[ListGridField]] = ScNone
    var pickListHeaderHeight: ScOption[Int] = ScNone
    var pickListHeight: ScOption[Int] = ScNone
    var pickListMaxWidth: ScOption[Int] = ScNone
    var pickListProperties: ScOption[Grid[ListGridField, ListGridRecord]] = ScNone
    var pickListTallBaseStyle: ScOption[CSSStyleName] = ScNone
    var pickListWidth: ScOption[Int] = ScNone
    var separatorRows: ScOption[JSArray[ListGridRecord]] = ScNone
    var showAllOptions: ScOption[Boolean] = ScNone
    var showOptionsFromDataSource: ScOption[Boolean] = ScNone
    var sortField: ScOption[String | JSArray[String] | Int] = ScNone
    var specialValues: ScOption[ValueMap] = ScNone
    var textMatchStyle: ScOption[TextMatchStyle] = ScNone
    var useClientFiltering: ScOption[Boolean] = ScNone
    var valueIconField: ScOption[String] = ScNone
}
