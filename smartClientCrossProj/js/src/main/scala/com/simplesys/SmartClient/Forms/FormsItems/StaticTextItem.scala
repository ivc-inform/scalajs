package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.isc.System.Types.SCClassName

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait StaticTextItem extends FormItem {
    val clipValue:Boolean
    var editProxyConstructor:SCClassName
    var escapeHTML:Boolean
    var wrap:Boolean
}

@js.native
abstract trait AbstractStaticTextItemCompanion extends AbstractFormItemCompanion {
}

@js.native
object StaticTextItem extends AbstractStaticTextItemCompanion        
