package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.System.{Date, AbstractClassCompanion, Class}
import com.simplesys.System.Types.JSONCircularReferenceMode.JSONCircularReferenceMode
import com.simplesys.System.Types.JSONDateFormat.JSONDateFormat
import com.simplesys.System.Types.JSONInstanceSerializationMode.JSONInstanceSerializationMode

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait JSONEncoder extends Class {
    val circularReferenceMarker: String
    val circularReferenceMode: JSONCircularReferenceMode
    val dateFormat: JSONDateFormat
    def encode(obj: js.Any): String
    def encodeDate(theDate: Date): String
    val prettyPrint: Boolean
    val serializeInstances: JSONInstanceSerializationMode
    val showDebugOutput: Boolean
    val skipInternalProperties: Boolean
    val strictQuoting: Boolean
}

@js.native
abstract trait AbstractJSONEncoderCompanion extends AbstractClassCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object JSONEncoder extends AbstractJSONEncoderCompanion
}

