package com.simplesys.SmartClient.Grids.listGrid

import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types.Alignment.Alignment
import com.simplesys.System.Types.VerticalAlignment.VerticalAlignment
import com.simplesys.System.Types._

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait HeaderSpan extends Types.Object {
    val align: Alignment
    val fields: Array[String]
    var headerBaseStyle: SCClassName
    val headerTitle: String
    var headerTitleStyle: SCClassName
    val height: Int
    val name: String
    val spans: Array[HeaderSpan]
    val title: String
    val valign: VerticalAlignment
}
