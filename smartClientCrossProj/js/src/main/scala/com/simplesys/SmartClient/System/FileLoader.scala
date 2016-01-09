package com.simplesys.SmartClient.System

import com.simplesys.isc.System.Types.void

import scala.scalajs.js

@js.native
object FileLoader extends Types.Object{
   def loadISC (skin:String = js.native, modules:js.Array[String] = js.native, onload:js.Function0[_] = js.native):void = js.native
   def loadSkin (skin: String , onload: js.Function0[_] = js.native):void = js.native
}
