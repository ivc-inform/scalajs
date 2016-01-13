package com.simplesys.SmartClient.DataBinding.props

import com.simplesys.SmartClient.DataBinding.dataSource.{DataSourceField, OperationBinding}
import com.simplesys.SmartClient.DataBinding.{DSRequest, DSResponse, DataSource, JSON}
import com.simplesys.SmartClient.RPC.ServerObject
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types.{Record, VelocityExpression, XPathExpression}
import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.System.Types.CriteriaPolicy.CriteriaPolicy
import com.simplesys.System.Types.DSDataFormat.DSDataFormat
import com.simplesys.System.Types.DSInheritanceMode.DSInheritanceMode
import com.simplesys.System.Types.DSProtocol.DSProtocol
import com.simplesys.System.Types.DSServerType.DSServerType
import com.simplesys.System.Types.EnumTranslateStrategy.EnumTranslateStrategy
import com.simplesys.System.Types.MultiUpdatePolicy.MultiUpdatePolicy
import com.simplesys.System.Types.RPCTransport.RPCTransport
import com.simplesys.System.Types.SQLPagingStrategy.SQLPagingStrategy
import com.simplesys.System.Types.SequenceMode.SequenceMode
import com.simplesys.System.Types.TextMatchStyle.TextMatchStyle
import com.simplesys.System.Types.{ID, URL, URN}
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js
import scala.scalajs.js._

class DataSourceProps extends ClassProps {
    var addGlobalId: ScOption[Boolean] = ScNone
    var allowAdvancedCriteria: ScOption[Boolean] = ScNone
    var allowClientRequestedSummaries: ScOption[Boolean] = ScNone
    var audit: ScOption[Boolean] = ScNone
    var auditDataSourceID: ScOption[String] = ScNone
    var auditDSConstructor: ScOption[String] = ScNone
    var auditRevisionFieldName: ScOption[String] = ScNone
    var auditTimeStampFieldName: ScOption[String] = ScNone
    var auditTypeFieldName: ScOption[String] = ScNone
    var auditUserFieldName: ScOption[String] = ScNone
    var autoCacheAllData: ScOption[Boolean] = ScNone
    var autoConvertRelativeDates: ScOption[Boolean] = ScNone
    var autoCreateAuditTable: ScOption[Boolean] = ScNone
    var autoDeriveSchema: ScOption[Boolean] = ScNone
    var autoDeriveTitles: ScOption[Boolean] = ScNone
    var autoJoinTransactions: ScOption[Boolean] = ScNone
    var beanClassName: ScOption[String] = ScNone
    var cacheAcrossOperationIds: ScOption[Boolean] = ScNone
    var cacheAllData: ScOption[Boolean] = ScNone
    var cacheAllOperationId: ScOption[String] = ScNone
    var cacheData: ScOption[Array[Record]] = ScNone
    var cacheMaxAge: ScOption[Int] = ScNone
    var callbackParam: ScOption[String] = ScNone
    var canMultiSort: ScOption[Boolean] = ScNone
    var childrenField: ScOption[String] = ScNone
    var clientOnly: ScOption[Boolean] = ScNone
    var configBean: ScOption[String] = ScNone
    var creatorOverrides: ScOption[Boolean] = ScNone
    var criteriaPolicy: ScOption[CriteriaPolicy] = ScNone
    var dataField: ScOption[String] = ScNone
    var dataFormat: ScOption[DSDataFormat] = ScNone
    var dataProtocol: ScOption[DSProtocol] = ScNone
    var dataTransport: ScOption[RPCTransport] = ScNone
    var dataURL: ScOption[URL] = ScNone
    var dbName: ScOption[String] = ScNone
    var deepCloneOnEdit: ScOption[Boolean] = ScNone
    var defaultBooleanStorageStrategy: ScOption[String] = ScNone
    var defaultMultiUpdatePolicy: ScOption[MultiUpdatePolicy] = ScNone
    var defaultTextMatchStyle: ScOption[TextMatchStyle] = ScNone
    var descriptionField: ScOption[String] = ScNone
    var dropExtraFields: ScOption[Boolean] = ScNone
    var dropUnknownCriteria: ScOption[Boolean] = ScNone
    var endGap: ScOption[Int] = ScNone
    var enumConstantProperty: ScOption[String] = ScNone
    var enumOrdinalProperty: ScOption[String] = ScNone
    var enumTranslateStrategy: ScOption[EnumTranslateStrategy] = ScNone
    var fields: ScOption[Array[DataSourceField]] = ScNone
    var fileContentsField: ScOption[String] = ScNone
    var fileFormatField: ScOption[String] = ScNone
    var fileLastModifiedField: ScOption[String] = ScNone
    var fileNameField: ScOption[String] = ScNone
    var fileTypeField: ScOption[String] = ScNone
    var fileVersionField: ScOption[String] = ScNone
    var globalNamespaces: ScOption[Types.Object] = ScNone
    var guestUserId: ScOption[String] = ScNone
    var handleError: ScOption[js.Function2[DSResponse, DSRequest, Boolean]] = ScNone
    var iconField: ScOption[String] = ScNone
    var ID: ScOption[ID] = ScNone
    var idClassName: ScOption[String] = ScNone
    var ignoreTextMatchStyleCaseSensitive: ScOption[Boolean] = ScNone
    var infoField: ScOption[String] = ScNone
    var inheritanceMode: ScOption[DSInheritanceMode] = ScNone
    var inheritsFrom: ScOption[DataSource] = ScNone
    var jsonPrefix: ScOption[String] = ScNone
    var jsonSuffix: ScOption[String] = ScNone
    var lookAhead: ScOption[Int] = ScNone
    var maxFileVersions: ScOption[Int] = ScNone
    var noNullUpdates: ScOption[Boolean] = ScNone
    var nullBooleanValue: ScOption[Boolean] = ScNone
    var nullDateValue: ScOption[Date] = ScNone
    var nullFloatValue: ScOption[Float] = ScNone
    var nullIntegerValue: ScOption[Int] = ScNone
    var nullStringValue: ScOption[String] = ScNone
    var omitNullDefaultsOnAdd: ScOption[String] = ScNone
    var operationBindings: ScOption[Array[OperationBinding]] = ScNone
    var ownerIdField: ScOption[String] = ScNone
    var patternEscapeChar: ScOption[String] = ScNone
    var patternMultiWildcard: ScOption[Array[String]] = ScNone
    var patternSingleWildcard: ScOption[Array[String]] = ScNone
    var pluralTitle: ScOption[String] = ScNone
    var preventHTTPCaching: ScOption[Boolean] = ScNone
    var progressiveLoading: ScOption[Boolean] = ScNone
    var progressiveLoadingThreshold: ScOption[Int] = ScNone
    var projectFileKey: ScOption[String] = ScNone
    var projectFileLocations: ScOption[Array[String]] = ScNone
    var qualifyColumnNames: ScOption[Boolean] = ScNone
    var quoteColumnNames: ScOption[Boolean] = ScNone
    var quoteTableName: ScOption[Boolean] = ScNone
    var recordName: ScOption[String] = ScNone
    var recordXPath: ScOption[XPathExpression] = ScNone
    var requestProperties: ScOption[DSRequest] = ScNone
    var requiredMessage: ScOption[String] = ScNone
    var requires: ScOption[VelocityExpression] = ScNone
    var requiresAuthentication: ScOption[Boolean] = ScNone
    var requiresRole: ScOption[String] = ScNone
    var resultBatchSize: ScOption[Int] = ScNone
    var resultSetClass: ScOption[Types.Object] = ScNone
    var resultTreeClass: ScOption[Types.Object] = ScNone
    var schema: ScOption[String] = ScNone
    var schemaBean: ScOption[String] = ScNone
    var schemaNamespace: ScOption[URN] = ScNone
    var script: ScOption[String] = ScNone
    var sendExtraFields: ScOption[Boolean] = ScNone
    var sendParentNode: ScOption[Boolean] = ScNone
    var sequenceMode: ScOption[SequenceMode] = ScNone
    var serverConstructor: ScOption[String] = ScNone
    var serverObject: ScOption[ServerObject] = ScNone
    var serverType: ScOption[DSServerType] = ScNone
    var serviceNamespace: ScOption[URN] = ScNone
    var showLocalFieldsOnly: ScOption[Boolean] = ScNone
    var showPrompt: ScOption[Boolean] = ScNone
    var sparseUpdates: ScOption[Boolean] = ScNone
    var sqlPaging: ScOption[SQLPagingStrategy] = ScNone
    var sqlUsePagingHint: ScOption[Boolean] = ScNone
    var strictSQLFiltering: ScOption[Boolean] = ScNone
    var tableCode: ScOption[String] = ScNone
    var tableName: ScOption[String] = ScNone
    var tagName: ScOption[String] = ScNone
    var title: ScOption[String] = ScNone
    var titleField: ScOption[String] = ScNone
    var transformMultipleFields: ScOption[Boolean] = ScNone
    var transformReques: ScOption[js.Function1[DSRequest, js.Any]] = ScNone
    var transformResponse: ScOption[js.Function3[DSResponse, DSRequest, JSON, DSResponse]] = ScNone
    var translatePatternOperators: ScOption[Boolean] = ScNone
    var trimMilliseconds: ScOption[Boolean] = ScNone
    var useAnsiJoins: ScOption[Boolean] = ScNone
    var useFlatFields: ScOption[Boolean] = ScNone
    var useHttpProxy: ScOption[Boolean] = ScNone
    var useLocalValidators: ScOption[Boolean] = ScNone
    var useOfflineStorage: ScOption[Boolean] = ScNone
    var useParentFieldOrder: ScOption[Boolean] = ScNone
    var useSpringTransaction: ScOption[Boolean] = ScNone
    var useStrictJSON: ScOption[Boolean] = ScNone
    var useSubselectForRowCount: ScOption[Boolean] = ScNone
    var useTestDataFetch: ScOption[Boolean] = ScNone
    var validateRelatedRecords: ScOption[Boolean] = ScNone
    var xmlNamespaces: ScOption[Types.Object] = ScNone
}
