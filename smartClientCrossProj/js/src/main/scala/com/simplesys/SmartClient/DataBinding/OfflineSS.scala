package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.DataBinding.Callbacks.RPCCallback
import com.simplesys.SmartClient.System.AbstractClassCompanion
import com.simplesys.System.Types._
import com.simplesys.System._

import scala.scalajs.js
import scala.scalajs.js.|


@js.native
abstract trait AbstractOfflineSSCompanion extends AbstractOfflineCompanion {
    def get(key: String, defValue: JSAny): JSAny = js.native
    def getBoolean(key: String, defValue: Boolean): Boolean = js.native
    def putBoolean(key: String, value: Boolean): void = js.native
    def getNumber(key: String, defValue: Double): Double = js.native
    def putNumber(key: String, value: Double): void = js.native
    def putArray(key: String, values: JSArray[Any]): void = js.native
    def getArray(key: String): JSArray[Any] = js.native
    def removeArray(key: String): JSArray[Any] = js.native
    def getFromBase(key: String, defValue: JSAny, _callback: js.Function2[String, JSArrayAny, _]): JSAny = js.native
    def putToBase(key:String, value: JSAny, callback: RPCCallback):void = js.native
}


@js.native
object OfflineSS extends AbstractOfflineSSCompanion

