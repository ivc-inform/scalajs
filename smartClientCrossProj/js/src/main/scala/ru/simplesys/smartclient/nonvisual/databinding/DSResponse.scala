package ru.simplesys
package smartclient
package nonvisual
package databinding

import macrojs._
import rpc.{RPCResponse, RPCResponseProps}
import cmntypes.SCProps

trait DSResponse extends RPCResponse {

}

object DSResponse extends SCApply[DSResponse, DSResponseProps]

