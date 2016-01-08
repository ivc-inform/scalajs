package com.simplesys.SmartClient.Forms

import com.simplesys.SmartClient.System.AbstractClassCompanion
import com.simplesys.SmartClient.System.Class

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait ValuesManager extends Class {
    def addFieldErrors(fieldName: String, errors: Array[String], showErrors: Boolean): Unit
}

@js.native
abstract trait AbstractValuesManagerCompanion extends AbstractClassCompanion {
}

@js.native
object ValuesManager extends AbstractValuesManagerCompanion        
