package com.simplesys.SmartClient.Tools.palette

import com.simplesys.SmartClient.System.Class
import com.simplesys.SmartClient.Tools.{Palette, PaletteNode}
import com.simplesys.System.JSArray

import scala.scalajs.js

@js.native
trait HiddenPalette extends Palette {
    val data: JSArray[PaletteNode]
}


