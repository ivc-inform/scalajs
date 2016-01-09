package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.DataBinding.SortSpecifier.SortSpecifier
import com.simplesys.SmartClient.DataBinding.dataSource.{FileSpec, DSCallback, DataSourceField, Operator}
import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.detailViewer.DetailViewerField
import com.simplesys.SmartClient.Grids.listGrid.ListGridField
import com.simplesys.SmartClient.System._
import com.simplesys.SmartClient.System.Types.AdvancedCriteria.AdvancedCriteria
import com.simplesys.SmartClient.System.Types._
import com.simplesys.isc.System.Types.CriteriaCombineOperator.CriteriaCombineOperator
import com.simplesys.isc.System.Types.CriteriaPolicy.CriteriaPolicy
import com.simplesys.isc.System.Types.DSDataFormat.DSDataFormat
import com.simplesys.isc.System.Types.DSInheritanceMode.DSInheritanceMode
import com.simplesys.isc.System.Types.DSProtocol.DSProtocol
import com.simplesys.isc.System.Types.EnumTranslateStrategy.EnumTranslateStrategy
import com.simplesys.isc.System.Types.FieldType.FieldType
import com.simplesys.isc.System.Types.MultiUpdatePolicy.MultiUpdatePolicy
import com.simplesys.isc.System.Types.OperatorId.OperatorId
import com.simplesys.isc.System.Types.OperatorValueType.OperatorValueType
import com.simplesys.isc.System.Types.RPCTransport.RPCTransport
import com.simplesys.isc.System.Types.SummaryFunction.SummaryFunction
import com.simplesys.isc.System.Types.TextMatchStyle.TextMatchStyle
import com.simplesys.isc.System.Types.{URL, DataPath, ID, void}

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait DataSource extends Class {
    def addData(newRecord: Record, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    val addGlobalId: Boolean
    def addSearchOperator(operator: Operator, types: Array[FieldType]): void
    var allowAdvancedCriteria: Boolean
    var allowClientRequestedSummaries: Boolean
    def applyFilter(data: Array[Record], criteria: Criteria, requestProperties: DSRequest = js.native): Array[Record]
    val audit: Boolean
    val auditDataSourceID: String
    val auditDSConstructor: String
    val auditRevisionFieldName: String
    val auditTimeStampFieldName: String
    val auditTypeFieldName: String
    val auditUserFieldName: String
    val autoCacheAllData: Boolean
    val autoConvertRelativeDates: Boolean
    val autoCreateAuditTable: Boolean
    val autoDeriveSchema: Boolean
    val autoDeriveTitles: Boolean
    val autoJoinTransactions: Boolean
    val beanClassName: String
    val cacheAcrossOperationIds: Boolean
    val cacheAllData: Boolean
    val cacheAllOperationId: String
    val cacheData: Array[Record]
    val cacheMaxAge: Int
    val callbackParam: String
    val canMultiSort: Boolean
    val childrenField: String
    val clientOnly: Boolean
    def cloneDSRequest(dsRequest: DSRequest): DSRequest
    def cloneDSResponse(dsResponse: DSResponse): DSResponse
    def compareCriteria(newCriteria: Criteria, oldCriteria: Criteria, requestProperties: DSRequest = js.native, policy: CriteriaPolicy = js.native): Int
    def compareDates(date1: Date, date2: Date, fieldName: String): Int
    val configBean: String
    def convertDataSourceCriteria(criteria: Criteria, textMatchStyle: TextMatchStyle = js.native): AdvancedCriteria
    def convertRelativeDates(criteria: Criteria, timezoneOffset: String = js.native, firstDayOfWeek: Int = js.native, baseDate: Date = js.native): Criteria
    def copyRecord(record: Record): Record
    def copyRecords(records: Array[Record]): Array[Record]
    val creatorOverrides: Boolean
    val criteriaPolicy: CriteriaPolicy
    val dataField: String
    val dataFormat: DSDataFormat
    val dataProtocol: DSProtocol
    val dataTransport: RPCTransport
    val dataURL: URL
    val dbName: String
    val deepCloneOnEdit: Boolean
    val defaultBooleanStorageStrategy: String
    val defaultMultiUpdatePolicy: MultiUpdatePolicy
    val defaultTextMatchStyle: TextMatchStyle
    val descriptionField: String
    def downloadFile(data: Record, fieldName: String = js.native, requestProperties: DSRequest = js.native): void
    val dropExtraFields: Boolean
    val dropUnknownCriteria: Boolean
    val endGap: Int
    val enumConstantProperty: String
    val enumOrdinalProperty: String
    val enumTranslateStrategy: EnumTranslateStrategy
    def evaluateCriterion(record: Record, criterion: Criterion): Boolean
    def execute(dsRequest: DSRequest): void
    def exportClientData(data: Array[Record], requestProperties: DSRequest, callback: DSCallback): void
    def exportData(criteria: Criteria = js.native, requestProperties: DSRequest = js.native, callback: DSCallback = js.native): void
    def fetchData(criteria: Criteria = js.native, requestProperties: DSRequest = js.native, callback: DSCallback = js.native): void
    def fetchRecord(pkValue: js.Any, requestProperties: DSRequest = js.native, callback: DSCallback = js.native): void
    def fieldMatchesFilter(fieldValue: js.Any, filterValue: js.Any, requestProperties: DSRequest = js.native): Boolean
    val fields: Array[DataSourceField]
    val fileContentsField: String
    val fileFormatField: String
    val fileLastModifiedField: String
    val fileNameField: String
    val fileTypeField: String
    val fileVersionField: String
    def filterData(criteria: Criteria = js.native, requestProperties: DSRequest = js.native, callback: DSCallback = js.native): void
    def getAutoTitle(identifier: ID): String
    def getCacheData(): Array[Record]
    def getClientOnlyDataSource(criteria: Criteria, callback: ClientOnlyDataSourceCallback, requestProperties: DSRequest = js.native, dataSourceProperties: DataSource = js.native): void
    def getClientOnlyResponse(request: DSRequest, serverData: Array[Record]): DSResponse
    def getDataProtocol(dsRequest: DSRequest): DSProtocol
    def getDisplayValue(fieldName: String, value: js.Any): js.Any
    def getFetchDataURL(criteria: Criteria[, requestProperties: DSRequest = js.native): String
    def getField(fieldName: String): DataSourceField
    def getFieldCriterion(criterion: Criteria, fieldName: String): Criteria
    def getFieldForDataPath(dataPath: DataPath): DataSourceField
    def getFieldNames(excludeHidden: Boolean): Array[String]
    def getFieldOperatorMap(field: String | DataSourceField, includeHidden: Boolean = js.native, valueType: OperatorValueType = js.native, omitValueType: Boolean = js.native): ValueMap
    def getFieldOperators(field: String | DataSourceField): Array[OperatorId]
    def getFile(fileSpec: FileSpec | String, callback: GetFileCallback)
    def getFileURL(data: Record, fieldName: String = js.native, requestProperties: DSRequest = js.native): String
    def getFileVersion(fileSpec: FileSpec | String, version: Date, callback: GetFileVersionCallback): void
    def getLegalChildTags(): void
    def getPrimaryKeyField(): DataSourceField
    def getPrimaryKeyFieldName(): String
    def getPrimaryKeyFieldNames(): Array[String]
    def getPrimaryKeyFields(): Record
    def getSearchOperator(operatorId: OperatorId): Operator
    def getTypeOperatorMap(`type`: FieldType, includeHidden: Boolean, valueType: OperatorValueType, omitValueType: Boolean): ValueMap
    def getTypeOperators(typeName: FieldType | String): Array[OperatorId]
    def getUpdatedData(dsRequest: DSRequest, dsResponse: DSResponse, useDataFromRequest: Boolean): Array[DataSourceRecord]
    def getXMLRequestBody(dsRequest: DSRequest): String
    var globalNamespaces: Types.Object
    val guestUserId: String
    var handleError: js.Function2[DSResponse, DSRequest, Boolean]
    def hasAllData(): Boolean
    def hasFile(fileSpec: FileSpec | String, callback: HasFileCallback)
    def hasFileVersion(fileSpec: FileSpec | String, version: Date, callback: HasFileCallback)
    val iconField: String
    val ID: ID
    val idClassName: String
    val ignoreTextMatchStyleCaseSensitive: Boolean
    val infoField: String
    val inheritanceMode: DSInheritanceMode
    val inheritsFrom: DataSource | ID
    def invalidateCache(): void
    val jsonPrefix: String
    val jsonSuffix: String
    def listFiles(criteria: Criteria, callback: DSCallback): void
    def listFileVersions (fileSpec: FileSpec| String, callback: DSCallback): void
    val lookAhead: Int
    val maxFileVersions: Int
    val noNullUpdates: Boolean
    val nullBooleanValue: Boolean
    val nullDateValue: Date
    val nullFloatValue: Float
    val nullIntegerValue: Int
    val nullStringValue: String
    val omitNullDefaultsOnAdd: String
    val operationBindings: Array[OperationBinding]
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
