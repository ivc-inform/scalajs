package com.simplesys.SmartClient.Forms.FormsItems.multiFileItem

import com.simplesys.SmartClient.Layout.{AbstractVStackCompanion, VStack}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait MultiFilePicker extends VStack {
    var maxUploadFields:Int
    var minUploadFields:Int
}

@js.native
abstract trait AbstractMultiFilePickerCompanion extends AbstractVStackCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object MultiFilePicker extends AbstractMultiFilePickerCompanion
}

