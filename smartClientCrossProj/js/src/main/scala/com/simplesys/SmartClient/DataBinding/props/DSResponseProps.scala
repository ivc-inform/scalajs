package com.simplesys.SmartClient.DataBinding.props

import com.simplesys.SmartClient.RPC.props.{ResponseCommon, RPCResponseProps}
import com.simplesys.SmartClient.System.Types._
import com.simplesys.System.Types2.DSOperationType._
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.Types1.{JSDictionaryAny, JSDictionary, JSAny}

import scala.scalajs.js
import scala.scalajs.js.{Object, _}

class DSResponseProps extends ResponseCommon[JSDictionaryAny] {
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
