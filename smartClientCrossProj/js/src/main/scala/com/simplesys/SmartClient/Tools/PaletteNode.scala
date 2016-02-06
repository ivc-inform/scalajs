package com.simplesys.SmartClient.Tools

import com.simplesys.System.Types.{SCClassName, SCImgURL}
import com.simplesys.Types1.JSDictionaryAny

import scala.scalajs.js

@js.native
trait PaletteNode extends js.Object {
    val defaults: JSDictionaryAny
    val editNodeProperties: EditNode
    val editProxyProperties: EditProxy
    val icon: SCImgURL
    val idPrefix: String
    val liveObject: js.Object
    val title: String
    val `type`: SCClassName
}
