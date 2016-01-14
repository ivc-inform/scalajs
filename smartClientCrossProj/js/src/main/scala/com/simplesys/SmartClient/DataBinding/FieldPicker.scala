package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.Layout.{AbstractVLayoutCompanion, VLayout}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait FieldPicker extends VLayout {
}

@js.native
abstract trait AbstractFieldPickerCompanion extends AbstractVLayoutCompanion {
}

@js.native
object FieldPicker extends AbstractFieldPickerCompanion

