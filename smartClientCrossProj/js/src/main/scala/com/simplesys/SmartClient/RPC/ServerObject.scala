package com.simplesys.SmartClient.RPC

import com.simplesys.SmartClient.System.Types

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ServerObject extends Types.Object {
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
    val visibleMethods : js.Array[Types.Object]
    val serverObject:ServerObject
    val errorMessage:String
    val serverCondition:String
    val `type` :
}


