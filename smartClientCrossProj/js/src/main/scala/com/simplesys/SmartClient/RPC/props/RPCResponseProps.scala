package com.simplesys.SmartClient.RPC.props

import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.option.{ScOption, ScNone}

import scala.scalajs.js._
import scala.scalajs.js

class RPCResponseProps[D <: js.Any] extends ClassProps {
    var clientContext: ScOption[Types.Object] = ScNone
    val data: ScOption[D] = ScNone
    var httpHeaders: ScOption[Types.Object] = ScNone
    var httpResponseCode: ScOption[Int] = ScNone
    var httpResponseText: ScOption[String] = ScNone
    var status: ScOption[Int] = ScNone
    var transactionNum: ScOption[Int] = ScNone
}
