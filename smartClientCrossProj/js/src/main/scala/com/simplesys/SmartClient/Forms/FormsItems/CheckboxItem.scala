package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.Forms.DynamicForm
import com.simplesys.System.Types._

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait CheckboxItem extends FormItem {
    var allowEmptyValue: Boolean
    var booleanBaseStyle: CSSStyleName
    var checkedDescription: HTMLString
    var checkedImage: SCImgURL
    val editProxyConstructor: SCClassName
    def getValueAsBoolean(): Boolean
    var labelAsTitle: Boolean
    val partialSelectedDescription: HTMLString
    var partialSelectedImage: SCImgURL
    val printBooleanBaseStyle:CSSStyleName
    var printCheckedImage:SCImgURL
    var printPartialSelectedImage:SCImgURL
    var printUncheckedImage:SCImgURL
    var printUnsetImage:SCImgURL
    def setValueMap():void
    var showLabel:Boolean
    var showUnsetImage:Boolean
    var showValueIconDisabled:Boolean
    var showValueIconDown:Boolean
    var showValueIconOver:Boolean
    var uncheckedDescription:HTMLString
    var uncheckedImage:SCImgURL
    val unsetDescription:HTMLString
    var unsetImage:SCImgURL
}

@js.native
abstract trait AbstractCheckboxItemCompanion extends AbstractFormItemCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object CheckboxItem extends AbstractCheckboxItemCompanion
}

