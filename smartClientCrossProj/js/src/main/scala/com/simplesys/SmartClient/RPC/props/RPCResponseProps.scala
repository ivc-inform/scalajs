package com.simplesys.SmartClient.RPC.props

import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.System.JSAny
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js

class ResponseCommon[D <: JSAny] extends ClassProps {
    val data: ScOption[D] = ScNone
    var clientContext: ScOption[js.Object] = ScNone
    var httpHeaders: ScOption[js.Object] = ScNone
    var httpResponseCode: ScOption[Int] = ScNone
    var httpResponseText: ScOption[String] = ScNone
    var status: ScOption[Int] = ScNone
    var transactionNum: ScOption[Int] = ScNone
}

class RPCResponseProps extends ResponseCommon[JSAny] {
}
