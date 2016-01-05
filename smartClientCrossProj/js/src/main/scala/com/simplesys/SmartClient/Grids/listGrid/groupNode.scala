package com.simplesys.SmartClient.Grids.listGrid

import com.simplesys.SmartClient.System.Types
import com.simplesys.isc.System.Types.HTMLString

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait GroupNode extends Types.Object {
    val groupMembers: Array[ListGridRecord]
    val groupTitle: HTMLString
    val groupValue: js.Any
}


