package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.System.{Types, AbstractClassCompanion, Class}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait JSON extends Class {
}

@js.native
abstract trait AbstractJSONCompanion extends AbstractClassCompanion {
    def decode(jsonString: String): Types.Object = js.native
    def encode(obj: Types.Object, settings: JSONEncoder = js.native): String = js.native
}

package companion {

import scala.scalajs.js

@js.native
   object JSON extends AbstractJSONCompanion
}

