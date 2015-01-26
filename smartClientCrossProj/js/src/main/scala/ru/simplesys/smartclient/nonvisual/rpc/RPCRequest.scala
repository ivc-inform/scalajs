package ru.simplesys
package smartclient
package nonvisual
package rpc

import macrojs._
import common.SCClass
import cmntypes.SCProps

trait RPCRequest extends SCClass {

}

object RPCRequest extends SCApply[RPCRequest, RPCRequestProps]

class RPCRequestProps extends SCProps {

}
