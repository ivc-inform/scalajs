package com.simplesys.SmartClient.Grids.listGrid

import com.simplesys.System.Types.Alignment.Alignment
import com.simplesys.System.Types.VerticalAlignment.VerticalAlignment
import com.simplesys.System.Types._
import com.simplesys.System.JSArray

import scala.scalajs.js

@js.native
trait HeaderSpan extends js.Object {
    val align: Alignment
    val fields: JSArray[String]
    var headerBaseStyle: SCClassName
    val headerTitle: String
    var headerTitleStyle: SCClassName
    val height: Int
    val name: String
    val spans: JSArray[HeaderSpan]
    val title: String
    val valign: VerticalAlignment
}
