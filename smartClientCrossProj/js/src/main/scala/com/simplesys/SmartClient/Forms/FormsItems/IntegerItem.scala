package com.simplesys.SmartClient.Forms.FormsItems

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait IntegerItem extends TextItem {
    def getValueAsInteger ():Int
}

@js.native
abstract trait AbstractIntegerItemCompanion extends AbstractTextItemCompanion {
}

@js.native
object IntegerItem extends AbstractIntegerItemCompanion        
