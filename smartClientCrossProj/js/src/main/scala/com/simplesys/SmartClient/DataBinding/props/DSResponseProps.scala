package com.simplesys.SmartClient.DataBinding.props

import com.simplesys.SmartClient.RPC.props.RPCResponseProps
import com.simplesys.SmartClient.System.Types._
import com.simplesys.System.Types.DSOperationType._
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js.Object
import scala.scalajs.js._

class DSResponseProps extends RPCResponseProps {
    var data: ScOption[Array[Record]] = ScNone
        var dataSource: ScOption[String] = ScNone
        var endRow: ScOption[Int] = ScNone
        var errors: ScOption[Object] = ScNone
        var fromOfflineCache: ScOption[Boolean] = ScNone
        var offlineTimestamp: ScOption[Int] = ScNone
        var operationType: ScOption[DSOperationType] = ScNone
        var queueStatus: ScOption[Int] = ScNone
        var startRow: ScOption[Int] = ScNone
        var totalRows: ScOption[Int] = ScNone
}
