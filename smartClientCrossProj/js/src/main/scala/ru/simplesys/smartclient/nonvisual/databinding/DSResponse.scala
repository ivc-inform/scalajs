package ru.simplesys
package smartclient
package nonvisual
package databinding

import macrojs._
import rpc.{RPCResponse, RPCResponseProps}
import cmntypes.SCProps

import scala.scalajs.js

trait DSResponse extends RPCResponse {

}

object DSResponse extends SCApply[DSResponse, DSResponseProps]

trait DSUntyped extends DSData {
  var data = noSCProp[js.Object]
}