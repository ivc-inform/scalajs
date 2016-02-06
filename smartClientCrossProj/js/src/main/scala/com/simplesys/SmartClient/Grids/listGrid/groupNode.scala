package com.simplesys.SmartClient.Grids.listGrid

import com.simplesys.System.Types.HTMLString
import com.simplesys.Types1.{JSAny, JSArray}

import scala.scalajs.js

@js.native
trait groupNode extends js.Object {
    val groupMembers: JSArray[ListGridRecord]
    val groupTitle: HTMLString
    val groupValue: JSAny
}


