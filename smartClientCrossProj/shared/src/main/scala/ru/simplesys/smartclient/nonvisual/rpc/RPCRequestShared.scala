package ru.simplesys
package smartclient
package nonvisual
package rpc

import cmntypes.{SCPropsFromJSON, SCProps}

trait RPCRequestSharedProps extends SCProps with SCPropsFromJSON {
//  type Request <: RPCRequest
//  type Response <: RPCResponse
//  type Data <: js.Any
//
//  var actionURL = noSCProp[String]
//  var callback = noSCProp[js.Function3[Request, Data, Response, Unit]]
//  var httpMethod = noSCProp[HttpMethod]
//  var useSimpleHttp = noSCProp[Boolean]
//
//  var clientContext = noSCProp[js.Object]
}