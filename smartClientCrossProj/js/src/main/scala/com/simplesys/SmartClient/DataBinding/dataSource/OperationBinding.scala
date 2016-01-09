package com.simplesys.SmartClient.DataBinding.dataSource

import com.simplesys.SmartClient.DataBinding.{DataSource, DSRequest}
import com.simplesys.SmartClient.RPC.ServerObject
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types.{VelocityExpression, XPathExpression}
import com.simplesys.isc.System.Types.DSDataFormat.DSDataFormat
import com.simplesys.isc.System.Types.DSOperationType.DSOperationType
import com.simplesys.isc.System.Types.DSProtocol.DSProtocol
import com.simplesys.isc.System.Types.ExportFormat.ExportFormat
import com.simplesys.isc.System.Types.RPCTransport.RPCTransport
import com.simplesys.isc.System.Types.SQLPagingStrategy.SQLPagingStrategy
import com.simplesys.isc.System.Types.SQLType.SQLType
import com.simplesys.isc.System.Types.URL

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait OperationBinding extends Types.Object {
    val allowAdvancedCriteria: Boolean
    val allowMultiUpdate: Boolean
    val autoJoinTransactions: Boolean
    val cacheSyncOperation: String
    val callbackParam: String
    val canSyncCache: Boolean
    val creatorOverrides: Boolean
    val criteria: Array[DSRequestModifier]
    val customCriteriaFields: Array[String]
    val customFields: Array[String]
    val customHQL: String
    val customJQL: String
    val customSQL: String
    val customValueFields: Array[String]
    val dataFormat: DSDataFormat
    val dataProtocol: DSProtocol
    val dataTransport: RPCTransport
    val dataURL: URL
    val defaultParams: Types.Object
    val excludeCriteriaFields: Array[String]
    val exportAs: ExportFormat
    val exportFields: Array[String]
    val exportFilename: String
    val exportResults: Boolean
    val groupBy: Array[String]
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
    val summaryFunctions: Types.Object
    val tableClause: String
    val transformMultipleFields: Boolean
    val useFlatFields: Boolean
    val useForCacheSync: Boolean
    val useHttpProxy: Boolean
    val useSpringTransaction: Boolean
    val useSubselectForRowCount: Boolean
    val values: Array[DSRequestModifier]
    val valuesClause: String
    val whereClause: String
    val wsOperation: String
    val xmlNamespaces: Types.Object
}

