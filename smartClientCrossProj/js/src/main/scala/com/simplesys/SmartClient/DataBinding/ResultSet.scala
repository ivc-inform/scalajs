package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.System.Types.{ValueMap, Criteria, Record}
import com.simplesys.SmartClient.System._
import com.simplesys.isc.System.Types.CriteriaPolicy.CriteriaPolicy
import com.simplesys.isc.System.Types.FetchMode.FetchMode
import com.simplesys.isc.System.Types.TextMatchStyle.TextMatchStyle
import com.simplesys.isc.System.Types.void

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ResultSet extends Class with List {
    def allMatchingRowsCached(): Boolean
    val allRows: js.Array[Record]
    def allRowsCached(): Boolean
    val alwaysRequestVisibleRows: Boolean
    def applyFilter(data: js.Array[Record], criteria: Criteria, requestProperties: DSRequest = js.native): js.Array[Record]
    def compareCriteria(newCriteria: Criteria, oldCriteria: Criteria, requestProperties: DSRequest = js.native, policy: String = js.native): Int
    val criteria: Criteria
    val criteriaPolicy: CriteriaPolicy
    var dataArrived: js.Function2[Int, Int, _]
    val dataSource: DataSource
    val disableCacheSync: Boolean
    val dropCacheOnUpdate: Boolean
    val fetchDelay: Int
    val fetchMode: FetchMode
    val fetchOperation: String
    def filterLocalData(): void
    def find(propertyName: String, value: js.Any = js.native): Types.Object
    def findAll(propertyName: String, value: js.Any = js.native): js.Array[Types.Object]
    def findByKey(keyValue: Types.Object): Record
    def findIndex(propertyName: String, value: js.Any = js.native): Int
    def findNextIndex(startIndex: Int, propertyName: String | Function | Types.Object, value: js.Any = js.native, endIndex: Int = js.native): Int
    def getAllCachedRows(): js.Array[Record]
    def getAllVisibleRows(): js.Array[Record]
    def getCriteria(): Criteria
    def getSort(): js.Array[SortSpecifier]
    val initialData: js.Array[Record]
    val initialLength: Int
    def invalidateCache(): void
    def lengthIsKnown(): Boolean
    val neverDropUpdatedRows: Boolean
    val progressiveLoading: Boolean
    def rangeIsLoaded(startRow: Int, endRow: Int): Boolean
    def resort(): void
    val resultSize: Int
    def rowIsLoaded(rowNum: Int): Boolean
    def setCriteria(newCriteria: Criteria): Boolean
    def setSort(): void
    def sortByProperty(property: String, up: Boolean, normalizer: Function | ValueMap = js.native, context: js.Any = js.native): this.type
    val sortSpecifiers: js.Array[SortSpecifier]
    var transformData: js.Function2[js.Any, DSResponse, js.Array[Types.Object]]
    val updateCacheFromRequest: Boolean
    val updatePartialCache: Boolean
    val useClientFiltering: Boolean
    val useClientSorting: Boolean
    def usingFilteredData(): Boolean
    def willFetchData(newCriteria: Criteria, textMatchStyle: TextMatchStyle = js.native): Boolean
}

@js.native
abstract trait AbstractResultSetCompanion extends AbstractClassCompanion {
}

@js.native
object ResultSet extends AbstractResultSetCompanion        
