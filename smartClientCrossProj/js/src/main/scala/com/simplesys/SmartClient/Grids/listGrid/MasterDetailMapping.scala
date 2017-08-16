package com.simplesys.SmartClient.Grids.listGrid

import com.simplesys.System.JSObject

import scala.scalajs.js

@js.native
trait MasterDetailMapping extends JSObject {
    val masterGridField: String
    val detailGridField: String
}


