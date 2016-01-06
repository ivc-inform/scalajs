package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.Forms.DynamicForm
import com.simplesys.SmartClient.Forms.FormsItems.formItem.FormItemIcon
import com.simplesys.isc.System.Types.CharacterCasing.CharacterCasing
import com.simplesys.isc.System.Types.CharacterCasing._
import com.simplesys.isc.System.Types._

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait TextItem extends FormItem {
    val browserAutoCapitalize: Boolean
    val browserAutoCorrect: Boolean
    val browserInputType: String
    var changeOnKeypress: js.ThisFunction0[FormItemIcon, Boolean]
    var characterCasing: CharacterCasing
    def deselectValue(start: Boolean): Unit
    val editProxyConstructor: SCClassName
    var emptyStringValue: js.Any
    var enforceLength: Boolean
    var fetchMissingValues: Boolean
    var formatOnBlur: Boolean
    var formatOnFocusChange: Boolean
    def getEnteredValue(): String
    def getHint(): HTMLString
    def getSelectionRange(): Array[Int]
    var keyPressFilter: String
    var length: Int
    var mask: String
    var maskOverwriteMode: Boolean
    var maskPadChar: String
    var maskPromptChar: String
    var maskSaveLiterals: Boolean
    var pendingStatusChanged: js.Function5[DynamicForm, FormItem, Boolean, js.Any, js.Any, Boolean]
    var printFullText: Boolean
    var saveOnEnter: Boolean
    var selectOnClick: Boolean
    var selectOnFocus: Boolean
    def selectValue(): Unit
    def setKeyPressFilter(filter: String): Unit
    def setSelectionRange(start: Int, end: Int): Unit
    def shouldFetchMissingValue(newValue: js.Any): Boolean
    var showHintInField: Boolean
    var textBoxStyle: FormItemBaseStyle
    var usePlaceholderForHint: Boolean
    var width: Int
}

@js.native
abstract trait AbstractTextItemCompanion extends AbstractFormItemCompanion {
}

@js.native
object TextItem extends AbstractTextItemCompanion        
