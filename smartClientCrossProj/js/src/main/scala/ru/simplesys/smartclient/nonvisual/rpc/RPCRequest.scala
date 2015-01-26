package ru.simplesys
package smartclient
package nonvisual
package rpc

import scala.scalajs.js
import macrojs._
import common.SCClass
import cmntypes.SCProps

trait RPCRequest extends SCClass {
  def actionURL: String = js.native
  def actionURL_=(url: String): Unit = js.native
  //def callback:
}

object RPCRequest extends SCApply[RPCRequest, RPCRequestProps]

class RPCRequestProps extends SCProps {
  var actionURL = noSCProp[String]

}
