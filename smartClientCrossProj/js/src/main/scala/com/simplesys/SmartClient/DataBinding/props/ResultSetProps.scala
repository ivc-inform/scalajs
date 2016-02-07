package com.simplesys.SmartClient.DataBinding.props

import com.simplesys.SmartClient.DataBinding.{DSResponse, DataSource, SortSpecifier}
import com.simplesys.SmartClient.System.props.{ClassProps, ListProps}
import com.simplesys.System.Types.CriteriaPolicy.CriteriaPolicy
import com.simplesys.System.Types.FetchMode.FetchMode
import com.simplesys.System.Types.{Criteria, Record}
import com.simplesys.System.{JSAny, JSArray}
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js

class ResultSetProps extends ClassProps with ListProps {
    var allRows: ScOption[Seq[Record]] = ScNone
    var alwaysRequestVisibleRows: ScOption[Boolean] = ScNone
    var criteria: ScOption[Criteria] = ScNone
    var criteriaPolicy: ScOption[CriteriaPolicy] = ScNone
    var dataArrived: ScOption[js.Function2[Int, Int, _]] = ScNone
    var dataSource: ScOption[DataSource] = ScNone
    var disableCacheSync: ScOption[Boolean] = ScNone
    var dropCacheOnUpdate: ScOption[Boolean] = ScNone
    var fetchDelay: ScOption[Int] = ScNone
    var fetchMode: ScOption[FetchMode] = ScNone
    var fetchOperation: ScOption[String] = ScNone
    var initialData: ScOption[JSArray[Record]] = ScNone
    var initialLength: ScOption[Int] = ScNone
    var neverDropUpdatedRows: ScOption[Boolean] = ScNone
    var progressiveLoading: ScOption[Boolean] = ScNone
    var resultSize: ScOption[Int] = ScNone
    var sortSpecifiers: ScOption[JSArray[SortSpecifier]] = ScNone
    var transformData: ScOption[js.Function2[JSAny, DSResponse, JSArray[js.Object]]] = ScNone
    var updateCacheFromRequest: ScOption[Boolean] = ScNone
    var updatePartialCache: ScOption[Boolean] = ScNone
    var useClientFiltering: ScOption[Boolean] = ScNone
    var useClientSorting: ScOption[Boolean] = ScNone
}
