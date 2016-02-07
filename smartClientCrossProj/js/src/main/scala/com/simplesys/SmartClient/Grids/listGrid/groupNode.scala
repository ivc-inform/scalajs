package com.simplesys.SmartClient.Grids.listGrid

import com.simplesys.System.Types.HTMLString
import com.simplesys.System.{JSObject, JSAny, JSArray}

import scala.scalajs.js

@js.native
trait groupNode extends JSObject {
    val groupMembers: JSArray[ListGridRecord]
    val groupTitle: HTMLString
    val groupValue: JSAny
}


