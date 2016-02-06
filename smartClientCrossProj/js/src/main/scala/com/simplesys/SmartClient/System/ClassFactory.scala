package com.simplesys.SmartClient.System

import com.simplesys.System.Types2.void
import com.simplesys.Types1.JSDictionary

import scala.scalajs.js

@js.native
object ClassFactory extends Types.Object {
    type ClassFactory = ClassFactory.type
    def defineClass(className: String, superClass: Class = js.native): Class = js.native
    def GetClass(): Class = js.native
    def newInstance(className: String, props: JSDictionary[Types.Object] = js.native, props2: JSDictionary[Types.Object] = js.native, props3: JSDictionary[Types.Object] = js.native): Class = js.native
    def overwriteClass(): void = js.native
}
