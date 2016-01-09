package com.simplesys.SmartClient.Foundation.richTextEditor

import com.simplesys.SmartClient.System.Types
import com.simplesys.isc.System.Types.SCImgURL

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ListProperties extends Types.Object {
    val image:SCImgURL
    val startNumber:Int
    val style : ListProperties
}


