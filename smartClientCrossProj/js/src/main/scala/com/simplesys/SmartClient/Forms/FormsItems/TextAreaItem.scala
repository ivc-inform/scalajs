package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.isc.System.Types.SCClassName
import com.simplesys.isc.System.Types.TEXTAREA_WRAP.TEXTAREA_WRAP

import scala.scalajs.js
import scala.scalajs.js.{Any, Array, |}

@js.native
trait TextAreaItem extends FormItem {
    var browserAutoCapitalize: Boolean
    var browserAutoCorrect: Boolean
    var changeOnKeypress: Boolean
    def deselectValue(start: Boolean = js.native): Unit
    var editProxyConstructor: SCClassName
    var emptyStringValue: Any
    var enforceLength: Boolean
    var formatOnBlur: Boolean
    def getEnteredValue(): String
    def getSelectionRange(): Array[Int]
    var length: Int
    var minHeight: Int
    var printFullText: Boolean
    def selectValue(): Unit
    def setSelectionRange(start: Int, end: Int): Unit
    var showHintInField: Boolean
    var usePlaceholderForHint: Boolean
    var wrap: TEXTAREA_WRAP
}

@js.native
abstract trait AbstractTextAreaItemCompanion extends AbstractFormItemCompanion {
}

@js.native
object TextAreaItem extends AbstractTextAreaItemCompanion        
