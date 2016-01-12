package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.System.Types.SCClassName

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait BlurbItem extends FormItem {
    var clipValue:Boolean
    var editProxyConstructor:SCClassName
    var wrap:Boolean
}

@js.native
abstract trait AbstractBlurbItemCompanion extends AbstractFormItemCompanion {
}

@js.native
object BlurbItem extends AbstractBlurbItemCompanion        
