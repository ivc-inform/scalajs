package com.simplesys.SmartClient.Grids.listGrid

import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types2.HTMLString
import com.simplesys.Types1.{JSArray, JSAny}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait groupNode extends Types.Object {
    val groupMembers: JSArray[ListGridRecord]
    val groupTitle: HTMLString
    val groupValue: JSAny
}


