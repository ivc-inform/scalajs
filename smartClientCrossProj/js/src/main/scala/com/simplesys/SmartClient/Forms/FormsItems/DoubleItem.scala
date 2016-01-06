package com.simplesys.SmartClient.Forms.FormsItems

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait DoubleItem extends FloatItem {
    def getValueAsDouble():Double
}

@js.native
abstract trait AbstractDoubleItemCompanion extends AbstractFloatItemCompanion {
}

@js.native
object DoubleItem extends AbstractDoubleItemCompanion        
