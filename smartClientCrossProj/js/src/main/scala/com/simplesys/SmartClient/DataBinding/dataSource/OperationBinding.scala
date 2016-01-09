package com.simplesys.SmartClient.DataBinding.dataSource

import com.simplesys.SmartClient.System.Types
import com.simplesys.isc.System.Types.DSDataFormat.DSDataFormat
import com.simplesys.isc.System.Types.DSProtocol.DSProtocol
import com.simplesys.isc.System.Types.ExportFormat.ExportFormat
import com.simplesys.isc.System.Types.RPCTransport.RPCTransport
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
    val dataURL: URL                                                                                                        K
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
}

