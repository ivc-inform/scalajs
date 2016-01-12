package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.RPC.{AbstractRPCResponseCompanion, RPCResponse}
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types.{Object, Record}
import com.simplesys.System.Types.DSOperationType.DSOperationType
import com.simplesys.System.Types.void

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait DSResponse extends RPCResponse {
    val data: Array[Record]
    val dataSource: String
    val endRow: Int
    val errors: Object
    val fromOfflineCache: Boolean
    val offlineTimestamp: Int
    val operationType: DSOperationType
    val queueStatus: Int
    val startRow:Int
    val totalRows: Int
}

@js.native
abstract trait AbstractDSResponseCompanion extends AbstractRPCResponseCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object DSResponse extends AbstractDSResponseCompanion
}

