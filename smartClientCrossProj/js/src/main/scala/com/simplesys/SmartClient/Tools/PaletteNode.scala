package com.simplesys.SmartClient.Tools

import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types.{SCClassName, SCImgURL}
import com.simplesys.types.JSAny

import scala.scalajs.js

@js.native
trait PaletteNode extends Types.Object {
    val defaults: js.Dictionary[JSAny]
    val editNodeProperties: EditNode
    val editProxyProperties: EditProxy
    val icon: SCImgURL
    val idPrefix: String
    val liveObject: Types.Object
    val title: String
    val `type`: SCClassName
}
