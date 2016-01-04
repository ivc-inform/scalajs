package com.simplesys.SmartClient.DataBinding.dataSource

import com.simplesys.SmartClient.DataBinding.{DSRequest, DSResponse}
import com.simplesys.SmartClient.RPC.{RPCRequest, RPCResponse}

import scala.scalajs.js

@js.native
trait DSCallback extends js.Function3[DSResponse,js.Dictionary[js.Any], DSRequest, Unit]

@js.native
trait RPCCallback extends js.Function3[RPCResponse,js.Dictionary[js.Any], RPCRequest, Unit]
