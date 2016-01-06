package com.simplesys.SmartClient.Forms.FormsItems

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait FloatItem extends TextItem {
    def getValueAsFloat():Float
}

@js.native
abstract trait AbstractFloatItemCompanion extends AbstractTextItemCompanion {
}

@js.native
object FloatItem extends AbstractFloatItemCompanion        
