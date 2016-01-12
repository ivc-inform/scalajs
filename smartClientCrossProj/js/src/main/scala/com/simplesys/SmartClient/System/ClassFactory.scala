package com.simplesys.SmartClient.System

import com.simplesys.System.Types.void

import scala.scalajs.js

@js.native
object ClassFactory extends Types.Object {
    type ClassFactory = ClassFactory.type
    def defineClass(className: String, superClass: Class = js.native): Class = js.native
    def GetClass(): Class = js.native
    def newInstance(className: String, props: js.Dictionary[Types.Object] = js.native, props2: js.Dictionary[Types.Object] = js.native, props3: js.Dictionary[Types.Object] = js.native): Class = js.native
    def overwriteClass(): void = js.native
}
