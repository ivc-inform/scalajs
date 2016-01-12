package com.simplesys.SmartClient.Foundation

import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types.SCImgURL

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait StretchItem extends Types.Object {
    val height: String | Int
    val name: String
    var src: SCImgURL
    val width: String | Int
}


