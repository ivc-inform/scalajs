package com.simplesys.SmartClient.Grids.listGrid

import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types2.Alignment.Alignment
import com.simplesys.System.Types2.VerticalAlignment.VerticalAlignment
import com.simplesys.System.Types2._
import com.simplesys.Types1.JSArray

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait HeaderSpan extends Types.Object {
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
