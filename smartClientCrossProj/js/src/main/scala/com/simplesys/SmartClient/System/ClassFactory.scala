package com.simplesys.SmartClient.System

import com.simplesys.System.Types.void
import com.simplesys.System.{JSAny, JSDictionaryAny, JSObject, JSUndefined}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

@js.native
trait ClassFactoryTrt extends JSObject {
    def defineClass(className: String, superClass: Class = js.native): Class
    def getClass (className: String, warnOnFailure: Boolean = js.native): JSUndefined[Class]
//    @JSName("getClass")
//    def getClass1 (className: String, warnOnFailure: Boolean = js.native): JSUndefined[AbstractClassCompanion]
    @JSName("getClass")
    def GetClass(): Class
    def newInstance(className: String, props: JSAny = js.native, props2: JSAny = js.native, props3: JSAny = js.native): Class
    def overwriteClass(): void
    def addGlobalID(id: JSObject): void
}
