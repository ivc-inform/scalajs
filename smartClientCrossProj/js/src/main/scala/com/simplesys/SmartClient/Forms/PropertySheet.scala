package com.simplesys.SmartClient.Forms

import com.simplesys.SmartClient.DataBinding.DSRequest
import com.simplesys.SmartClient.System.Types.Record

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait PropertySheet extends DynamicForm {
    def  editRecord (record:Record)
}

@js.native
abstract trait AbstractPropertySheetCompanion extends AbstractDynamicFormCompanion {
}

@js.native
object PropertySheet extends AbstractPropertySheetCompanion

