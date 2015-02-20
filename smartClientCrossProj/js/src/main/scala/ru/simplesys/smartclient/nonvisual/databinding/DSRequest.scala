package ru.simplesys
package smartclient
package nonvisual
package databinding

import macrojs._
import rpc.{RPCRequest, RPCRequestProps}
import cmntypes.SCProps

trait DSRequest extends RPCRequest {

}

object DSRequest extends SCApply[DSRequest, DSRequestProps]

class DSRequestProps extends RPCRequestProps {

}