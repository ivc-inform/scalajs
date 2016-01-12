package com.simplesys.SmartClient.DataBinding.fieldPicker

import com.simplesys.SmartClient.Layout.{AbstractWindowCompanion, Window}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait FieldPickerWindow extends Window {
}

@js.native
abstract trait AbstractFieldPickerWindowCompanion extends AbstractWindowCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object FieldPickerWindow extends AbstractFieldPickerWindowCompanion
}

