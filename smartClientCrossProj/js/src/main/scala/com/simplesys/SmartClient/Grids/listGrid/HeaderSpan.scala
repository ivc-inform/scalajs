package com.simplesys.SmartClient.Grids.listGrid

import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types.Alignment.Alignment
import com.simplesys.System.Types.VerticalAlignment.VerticalAlignment
import com.simplesys.System.Types._

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
object HeaderSpan extends Types.Object {
    type HeaderSpan = HeaderSpan.type

    val align: Alignment = js.native
    val fields: Array[String] = js.native
    var headerBaseStyle: SCClassName = js.native
    val headerTitle: String = js.native
    var headerTitleStyle: SCClassName = js.native
    val height: Int = js.native
    val name: String = js.native
    val spans: Array[HeaderSpan] = js.native
    val title: String = js.native
    val valign: VerticalAlignment = js.native
}
