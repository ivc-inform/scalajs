package com.simplesys.SmartClient.System

import com.simplesys.System.Types.void
import com.simplesys.System.{JSObject, JSDictionary}

import scala.scalajs.js

@js.native
object ClassFactory extends JSObject {
    type ClassFactory = ClassFactory.type
    def defineClass(className: String, superClass: Class = js.native): Class = js.native
    def GetClass(): Class = js.native
    def newInstance(className: String, props: JSDictionary[JSObject] = js.native, props2: JSDictionary[JSObject] = js.native, props3: JSDictionary[JSObject] = js.native): Class = js.native
    def overwriteClass(): void = js.native
}
