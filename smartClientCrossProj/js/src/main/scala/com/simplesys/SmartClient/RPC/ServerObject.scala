package com.simplesys.SmartClient.RPC

import com.simplesys.System.{JSObject, JSArray}

import scala.scalajs.js

@js.native
trait ServerObject extends JSObject {
    val attributeName:String
    val attributeScope:String
    val bean:String
    val className:String
    val crudOnly:Boolean
    val dropExtraFields:Boolean
    val ID:String
    val lookupStyle:String
    val methodName:String
    val targetXPath:String
    val visibleMethods : JSArray[JSObject]
    val serverObject:ServerObject
}


