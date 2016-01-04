package com.simplesys.SmartClient.Grids

import com.simplesys.SmartClient.DataBinding.{DSRequest, DataBoundComponent}
import com.simplesys.SmartClient.DataBinding.dataSource.DSCallback
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Layout.{AbstractVLayoutCompanion, VLayout}
import com.simplesys.SmartClient.System.SortSpecifier.SortSpecifier
import com.simplesys.SmartClient.System.Types.Record

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ListGrid extends VLayout with DataBoundComponent {
    def addData(newRecord: Record, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): Unit
    def addEmbeddedComponent(component: Canvas, record: Record, rowNum: Int = js.native, colNum: Int = js.native, position: Int = js.native): Unit
    def addSort(sortSpecifier: SortSpecifier): Unit
}

@js.native
abstract trait AbstractListGridCompanion extends AbstractVLayoutCompanion {
}

@js.native
object ListGrid extends AbstractListGridCompanion        
