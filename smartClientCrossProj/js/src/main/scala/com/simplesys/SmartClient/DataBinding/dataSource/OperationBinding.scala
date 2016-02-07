package com.simplesys.SmartClient.DataBinding.dataSource

import com.simplesys.SmartClient.DataBinding.{DSRequest, DataSource}
import com.simplesys.SmartClient.RPC.ServerObject
import com.simplesys.System.Types.DSDataFormat.DSDataFormat
import com.simplesys.System.Types.DSOperationType.DSOperationType
import com.simplesys.System.Types.DSProtocol.DSProtocol
import com.simplesys.System.Types.ExportFormat.ExportFormat
import com.simplesys.System.Types.RPCTransport.RPCTransport
import com.simplesys.System.Types.SQLPagingStrategy.SQLPagingStrategy
import com.simplesys.System.Types.SQLType.SQLType
import com.simplesys.System.Types.{XPathExpression, VelocityExpression, URL}
import com.simplesys.System.JSArray

import scala.scalajs.js

@js.native
trait OperationBinding extends js.Object {
    val allowAdvancedCriteria: Boolean
    val allowMultiUpdate: Boolean
    val autoJoinTransactions: Boolean
    val cacheSyncOperation: String
    val callbackParam: String
    val canSyncCache: Boolean
    val creatorOverrides: Boolean
    val criteria: JSArray[DSRequestModifier]
    val customCriteriaFields: JSArray[String]
    val customFields: JSArray[String]
    val customHQL: String
    val customJQL: String
    val customSQL: String
    val customValueFields: JSArray[String]
    val dataFormat: DSDataFormat
    val dataProtocol: DSProtocol
    val dataTransport: RPCTransport
    val dataURL: URL
    val defaultParams: js.Object
    val excludeCriteriaFields: JSArray[String]
    val exportAs: ExportFormat
    val exportFields: JSArray[String]
    val exportFilename: String
    val exportResults: Boolean
    val groupBy: JSArray[String]
    val groupClause: String
    val guestUserId: String
    val invalidateCache: Boolean
    val lineBreakStyle: String
    val mail: Mail
    val methodArguments: String
    val namedQuery: String
    val operationId: String
    val operationType: DSOperationType
    var orderClause: String
    var outputs: String
    var ownerIdField: String
    val preventHTTPCaching: Boolean
    val progressiveLoading: Boolean
    val providesMissingKeys: Boolean
    val qualifyColumnNames: Boolean
    val recordName: String
    val recordXPath: XPathExpression
    val requestProperties: DSRequest
    val requires: VelocityExpression
    val requiresAuthentication: Boolean
    val requiresRole: String
    val responseDataSchema: DataSource
    val script: String
    val selectClause: String
    val serverMethod: String
    val serverObject: ServerObject
    val skipAudit: Boolean
    val skipRowCount: Boolean
    val spoofResponses: Boolean
    val sqlPaging: SQLPagingStrategy
    val sqlType: SQLType
    val sqlUsePagingHint: Boolean
    val summaryFunctions: js.Object
    val tableClause: String
    val transformMultipleFields: Boolean
    val useFlatFields: Boolean
    val useForCacheSync: Boolean
    val useHttpProxy: Boolean
    val useSpringTransaction: Boolean
    val useSubselectForRowCount: Boolean
    val values: JSArray[DSRequestModifier]
    val valuesClause: String
    val whereClause: String
    val wsOperation: String
    val xmlNamespaces: js.Object
}

