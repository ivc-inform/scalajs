package com.simplesys.SmartClient.Foundation

import com.simplesys.SmartClient.Forms.FormsItems.SelectItem
import com.simplesys.SmartClient.Foundation.richTextEditor.ListPropertiesDialog
import com.simplesys.SmartClient.Layout.{Layout, AbstractVLayoutCompanion, VLayout}
import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types.ControlName.ControlName
import com.simplesys.System.Types.{MultiAutoChild, AutoChild, void}

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait RichTextEditor extends VLayout {
    var alignCenterPrompt: String
    var alignLeftPrompt: String
    var alignRightPrompt: String
    var backgroundColorPrompt: String
    var boldSelectionPrompt: String
    val bulletControls: js.Array[ControlName]
    val colorControls: js.Array[ControlName]
    var colorPrompt: String
    var controlGroups: js.Array[ControlName]
    var copySelectionPrompt: String
    var cutSelectionPrompt: String
    def doWarn(): void
    val editArea: Canvas with AutoChild
    val editAreaBackgroundColor: String
    var fontControls: js.Array[ControlName]
    var fontNames: Types.Object
    val fontSelectorItem: SelectItem with AutoChild
    var fontSelectorPrompt: String
    val fontSizes: Types.Object
    val fontSizeSelectorItem: SelectItem with AutoChild
    var fontSizeSelectorPrompt: String
    var formatControls: js.Array[ControlName]
    def getValue(): js.Any
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
    val styleControls: Array[ControlName]
    val toolArea: Layout with AutoChild
    val toolbar: Layout with MultiAutoChild
    val toolbarBackgroundColor: String
    val underlineSelectionPrompt: String
    val unorderedListPrompt: String
    val value: String
}

@js.native
abstract trait AbstractRichTextEditorCompanion extends AbstractVLayoutCompanion {
}

@js.native
object RichTextEditor extends AbstractRichTextEditorCompanion        
