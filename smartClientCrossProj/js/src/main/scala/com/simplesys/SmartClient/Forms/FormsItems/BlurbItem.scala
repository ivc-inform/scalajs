package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.System.Types.SCClassName

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait BlurbItem extends FormItem {
    var clipValue: Boolean
    var editProxyConstructor: SCClassName
    var wrap: Boolean
}

@js.native
abstract trait AbstractBlurbItemCompanion extends AbstractFormItemCompanion {
}

import scala.scalajs.js

@js.native
@JSName("BlurbItem")
object BlurbItemStatic extends AbstractBlurbItemCompanion


