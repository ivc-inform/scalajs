package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.System.{AbstractClassCompanion, Class}

import scala.scalajs.js

@js.native
trait JSON extends Class {
}

@js.native
abstract trait AbstractJSONCompanion extends AbstractClassCompanion {
    def decode(jsonString: String): js.Object = js.native
    def encode(obj: js.Object, settings: JSONEncoder = js.native): String = js.native
}

@js.native
object JSON extends AbstractJSONCompanion

