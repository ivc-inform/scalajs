package ru.simplesys
package smartclient
package nonvisual
package databinding


import scala.scalajs.js
import macrojs._
import ru.simplesys.smartclient.nonvisual.rpc.{RPCResponse, RPCRequest, RPCRequestProps}
import ru.simplesys.cmntypes.{SCPropOpt, SCProps}

import scala.scalajs.js.{Any, Function3}

trait DSRequest extends RPCRequest {
  type Request <: DSRequest
  type Response <: DSResponse
  type Data <: js.Object
}

object DSRequest extends SCApply[DSRequest, DSRequestProps]

class DSRequestProps extends RPCRequestProps {
  type Request <: DSRequest
  type Response <: DSResponse
  type Data <: js.Object
}