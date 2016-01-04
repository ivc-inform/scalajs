package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.RPC.{AbstractRPCResponseCompanion, RPCResponse}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait DSResponse extends RPCResponse {
}

@js.native
abstract trait AbstractDSResponseCompanion extends AbstractRPCResponseCompanion {
}

@js.native
object DSResponse extends AbstractDSResponseCompanion        
