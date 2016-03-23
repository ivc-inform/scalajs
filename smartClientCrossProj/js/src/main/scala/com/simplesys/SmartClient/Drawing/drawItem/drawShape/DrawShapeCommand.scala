package com.simplesys.SmartClient.Drawing.drawItem.drawShape

import com.simplesys.System.Types.DrawShapeCommandType.DrawShapeCommandType
import com.simplesys.System.{JSArrayAny, JSObject}

import scala.scalajs.js

@js.native
trait DrawShapeCommand extends JSObject {
    val args: JSArrayAny
    val `type`: DrawShapeCommandType
}


