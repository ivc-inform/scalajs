package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.DataBinding.SortSpecifier.SortSpecifier
import com.simplesys.SmartClient.DataBinding.dataSource.{DSCallback, DataSourceField, Operator}
import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.detailViewer.DetailViewerField
import com.simplesys.SmartClient.Grids.listGrid.ListGridField
import com.simplesys.SmartClient.System.{Types, Criterion, AbstractClassCompanion, Class}
import com.simplesys.SmartClient.System.Types.AdvancedCriteria.AdvancedCriteria
import com.simplesys.SmartClient.System.Types.{Callback, Criteria, DataSourceRecord, Record}
import com.simplesys.isc.System.Types.CriteriaCombineOperator.CriteriaCombineOperator
import com.simplesys.isc.System.Types.FieldType.FieldType
import com.simplesys.isc.System.Types.OperatorId.OperatorId
import com.simplesys.isc.System.Types.SummaryFunction.SummaryFunction
import com.simplesys.isc.System.Types.TextMatchStyle.TextMatchStyle
import com.simplesys.isc.System.Types.{URL, DataPath, ID, void}

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait DataSource extends Class {
}

@js.native
abstract trait AbstractDataSourceCompanion extends AbstractClassCompanion {
    def addSearchOperator(operator: Operator): void = js.native
    def applyRecordSummaryFunction(summaryFunction: SummaryFunction, record: DataSourceRecord, fields: Array[DataSourceField], summaryField: DataSourceField): js.Any = js.native
    def canFlattenCriteria(criteria: AdvancedCriteria): Boolean = js.native
    def combineCriteria(criteria1: Criteria, criteria2: Criteria, outerOperator: CriteriaCombineOperator = js.native, textMatchStyle: TextMatchStyle = js.native): Criteria = js.native
    def convertCriteria(criteria: Criteria, textMatchStyle: TextMatchStyle = js.native): AdvancedCriteria = js.native
    def copyCriteria(criteria: Criteria): Criteria = js.native
    var deepCloneOnEdit: Boolean = js.native
    def exportClientData(data: Array[Record], requestProperties: DSRequest, callback: DSCallback): void = js.native
    def flattenCriteria(criteria: AdvancedCriteria): AdvancedCriteria = js.native
    def get(id: ID): DataSource = js.native
    def getAdvancedCriteriaDescription(criteria: AdvancedCriteria | Criterion, dataSource: DataSource): String = js.native
    def getAutoTitle(identifier: ID): String = js.native
    def getDataSource(id: ID): DataSource = js.native
    def getFieldValue(field: DataSourceField | ListGridField | DetailViewerField | FormItem, record: Record | DataPath | Canvas | String): js.Any = js.native
    def getLoaderURL(): String = js.native
    def getSimpleErrors(dsResponse: DSResponse): Types.Object = js.native
    def getSortBy(sortSpecifiers: Array[SortSpecifier]): Array[String] = js.native
    def getSortSpecifiers(sortBy: Array[String]): Array[String] = js.native
    def isFlatCriteria(criteria: AdvancedCriteria): Boolean = js.native
    def load(dsID: ID | js.Array[ID], callback: Callback, forceReload: Boolean = js.native): void = js.native
    var loaderURL: URL = js.native
    def loadWithParents(dsID: ID | js.Array[ID], callback: Callback, forceReload: Boolean = js.native): void = js.native
    var maxFileSizeExceededMessage: String = js.native
    var offlineMessage: String = js.native
    def registerRecordSummaryFunction(methodName: String, summaryFunction: SummaryFunction): void = js.native
    def saveValueViaDataPath(field: DataSourceField | ListGridField | DetailViewerField | FormItem, dataPath: DataPath, value: js.Any, values: Record, reason: String): void = js.native
    var serializeTimeAsDatetime: Boolean = js.native
    def setLoaderURL(url: URL): void = js.native
    def setTypeOperators(typeName: String | FieldType, operators: Array[OperatorId]): void = js.native
}


@js.native
object DataSource extends AbstractDataSourceCompanion        
