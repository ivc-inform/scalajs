package com.simplesys.SmartClient.Foundation.inst

import com.simplesys.SmartClient.System
import com.simplesys.SmartClient.System.inst.Class

import scala.scalajs.js

@js.native
trait Canvas extends Class {
    type clickHandler <: this.type
    var click: js.ThisFunction0[clickHandler, Boolean]
}
