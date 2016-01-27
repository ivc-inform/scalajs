package com.simplesys.SmartClient.Charts

import com.simplesys.SmartClient.Analytics.Facet
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types.{CellRecord, Record}
import com.simplesys.System.Types.ChartType.ChartType
import com.simplesys.types.JSArray

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait Chart extends Types.Object {
    var chartType: ChartType
    val data: CellRecord | JSArray[CellRecord]
    val facets: Facet | JSArray[Facet]
    def getFacet(facetId: String): Facet
}

@js.native
abstract trait AbstractChartCompanion extends Types.Object {
    val allChartTypes: Array[ChartType] = js.native
}

@js.native
object Chart extends AbstractChartCompanion
