package com.simplesys.SmartClient.Grids.listGrid

import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types.HTMLString
import com.simplesys.types.JSAny

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait groupNode extends Types.Object {
    val groupMembers: Array[ListGridRecord]
    val groupTitle: HTMLString
    val groupValue: JSAny
}


