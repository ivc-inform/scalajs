package com.simplesys.SmartClient.Foundation.canvas

import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types2.URL

import scala.scalajs.js

@js.native
trait ImgProperties extends Types.Object {
    var extraStuff: String
    var height: Int
    var imgDir: URL
    var name: String
    var src: URL
    var width: Int
}

