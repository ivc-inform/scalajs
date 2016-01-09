package com.simplesys.SmartClient.DataBinding.dataSource

import com.simplesys.SmartClient.DataBinding.{DSRequest, DSResponse}
import com.simplesys.SmartClient.RPC.{RPCRequest, RPCResponse}
import com.simplesys.isc.System.Types.void

import scala.scalajs.js

@js.native
trait DSCallback extends js.Function3[DSResponse,js.Dictionary[js.Any], DSRequest, void]

@js.native
trait RPCCallback extends js.Function3[RPCResponse,js.Dictionary[js.Any], RPCRequest, void]
