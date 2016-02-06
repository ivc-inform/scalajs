package com.simplesys.SmartClient.System

import com.simplesys.System.Types.void
import com.simplesys.Types1.JSDictionary

import scala.scalajs.js

@js.native
object ClassFactory extends js.Object {
    type ClassFactory = ClassFactory.type
    def defineClass(className: String, superClass: Class = js.native): Class = js.native
    def GetClass(): Class = js.native
    def newInstance(className: String, props: JSDictionary[js.Object] = js.native, props2: JSDictionary[js.Object] = js.native, props3: JSDictionary[js.Object] = js.native): Class = js.native
    def overwriteClass(): void = js.native
}
