package com.simplesys.SmartClient.Tools

import com.simplesys.System.Types.{SCClassName, SCImgURL}
import com.simplesys.System.{JSObject, JSDictionaryAny}
import com.simplesys.SmartClient.System.Class

import scala.scalajs.js

@js.native
trait PaletteNode extends JSObject {
    val defaults: JSDictionaryAny
    val editNodeProperties: EditNode
    val editProxyProperties: EditProxy
    val icon: SCImgURL
    val idPrefix: String
    val liveObject: Class
    val title: String
    val `type`: SCClassName
}
