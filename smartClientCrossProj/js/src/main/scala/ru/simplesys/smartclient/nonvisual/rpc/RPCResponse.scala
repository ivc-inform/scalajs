package ru.simplesys
package smartclient
package nonvisual
package rpc

import macrojs._
import common.SCClass
import cmntypes.SCProps

trait RPCResponse extends SCClass {

}

object RPCResponse extends SCApply[RPCResponse, RPCResponseProps]

class RPCResponseProps extends SCProps {

}
