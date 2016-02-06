package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.System.AbstractClassCompanion
import com.simplesys.SmartClient.System.Class
import com.simplesys.System.Types2.void
import com.simplesys.Types1.JSAny

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Offline extends Class {
}

@js.native
abstract trait AbstractOfflineCompanion extends AbstractClassCompanion {
    def get(key: String): JSAny = js.native
    def goOffline(): void = js.native
    def goOnline(): void = js.native
    def isOffline(): Boolean = js.native
    def put(key: String, value: JSAny, recycleEntries: Boolean): void = js.native
    def remove(key: String): void = js.native
    def useNativeOfflineDetection(): void = js.native
}

@js.native
object Offline extends AbstractOfflineCompanion

