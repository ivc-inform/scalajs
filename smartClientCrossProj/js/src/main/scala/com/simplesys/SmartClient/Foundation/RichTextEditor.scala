package com.simplesys.SmartClient.Foundation

import com.simplesys.SmartClient.Forms.FormsItems.SelectItem
import com.simplesys.SmartClient.Foundation.richTextEditor.ListPropertiesDialog
import com.simplesys.SmartClient.Layout.{Layout, VLayout}
import com.simplesys.System.Types.ControlName.ControlName
import com.simplesys.System.Types.{AutoChild, MultiAutoChild, void}
import com.simplesys.Types1.{JSAny, JSArray}

import scala.scalajs.js


@js.native
trait RichTextEditor extends VLayout {
    var alignCenterPrompt: String
    var alignLeftPrompt: String
    var alignRightPrompt: String
    var backgroundColorPrompt: String
    var boldSelectionPrompt: String
    val bulletControls: JSArray[ControlName]
    val colorControls: JSArray[ControlName]
    var colorPrompt: String
    var controlGroups: JSArray[ControlName]
    var copySelectionPrompt: String
    var cutSelectionPrompt: String
    def doWarn(): void
    val editArea: Canvas with AutoChild
    val editAreaBackgroundColor: String
    var fontControls: JSArray[ControlName]
    var fontNames: js.Object
    val fontSelectorItem: SelectItem with AutoChild
    var fontSelectorPrompt: String
    val fontSizes: js.Object
    val fontSizeSelectorItem: SelectItem with AutoChild
    var fontSizeSelectorPrompt: String
    var formatControls: JSArray[ControlName]
    def getValue(): JSAny
    var indentPrompt: String
    var italicSelectionPrompt: String
    var justifyPrompt: String
    var linkPrompt: String
    var linkUrlTitle: String
    var listPropertiesDialog: ListPropertiesDialog with AutoChild
    var listPropertiesPrompt: String
    var listPropertiesWarningText: String
    var moveFocusOnTab: Boolean
    var orderedListPrompt: String
    var outdentPrompt: String
    var pasteSelectionPrompt: String
    def richEditorSupported(): Boolean
    def setMoveFocusOnTab(moveFocusOnTab: Boolean): void
    def setValue(value: String): void
    var strikethroughSelectionPrompt: String
    val styleControls: JSArray[ControlName]
    val toolArea: Layout with AutoChild
    val toolbar: Layout with MultiAutoChild
    val toolbarBackgroundColor: String
    val underlineSelectionPrompt: String
    val unorderedListPrompt: String
    val value: String
}



