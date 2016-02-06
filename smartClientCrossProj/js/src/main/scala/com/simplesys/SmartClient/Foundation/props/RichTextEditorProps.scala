package com.simplesys.SmartClient.Foundation.props

import com.simplesys.SmartClient.Forms.FormsItems.SelectItem
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Foundation.richTextEditor.ListPropertiesDialog
import com.simplesys.SmartClient.Layout.Layout
import com.simplesys.SmartClient.Layout.props.VLayoutProps
import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types2.ControlName.ControlName
import com.simplesys.System.Types2.MultiAutoChild
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.Types1.JSArray

import scala.scalajs.js
import scala.scalajs.js._

class RichTextEditorProps extends VLayoutProps {
    var alignCenterPrompt: ScOption[String] = ScNone
    var alignLeftPrompt: ScOption[String] = ScNone
    var alignRightPrompt: ScOption[String] = ScNone
    var backgroundColorPrompt: ScOption[String] = ScNone
    var boldSelectionPrompt: ScOption[String] = ScNone
    var bulletControls: ScOption[Seq[ControlName]] = ScNone
    var colorControls: ScOption[Seq[ControlName]] = ScNone
    var colorPrompt: ScOption[String] = ScNone
    var controlGroups: ScOption[Seq[ControlName]] = ScNone
    var copySelectionPrompt: ScOption[String] = ScNone
    var cutSelectionPrompt: ScOption[String] = ScNone
    var editArea: ScOption[Canvas] = ScNone
    var editAreaBackgroundColor: ScOption[String] = ScNone
    var fontControls: ScOption[Seq[ControlName]] = ScNone
    var fontNames: ScOption[Types.Object] = ScNone
    var fontSelectorItem: ScOption[SelectItem] = ScNone
    var fontSelectorPrompt: ScOption[String] = ScNone
    var fontSizes: ScOption[Types.Object] = ScNone
    var fontSizeSelectorItem: ScOption[SelectItem] = ScNone
    var fontSizeSelectorPrompt: ScOption[String] = ScNone
    var formatControls: ScOption[Seq[ControlName]] = ScNone
    var indentPrompt: ScOption[String] = ScNone
    var italicSelectionPrompt: ScOption[String] = ScNone
    var justifyPrompt: ScOption[String] = ScNone
    var linkPrompt: ScOption[String] = ScNone
    var linkUrlTitle: ScOption[String] = ScNone
    var listPropertiesDialog: ScOption[ListPropertiesDialog] = ScNone
    var listPropertiesPrompt: ScOption[String] = ScNone
    var listPropertiesWarningText: ScOption[String] = ScNone
    var moveFocusOnTab: ScOption[Boolean] = ScNone
    var orderedListPrompt: ScOption[String] = ScNone
    var outdentPrompt: ScOption[String] = ScNone
    var pasteSelectionPrompt: ScOption[String] = ScNone
    var strikethroughSelectionPrompt: ScOption[String] = ScNone
    var styleControls: ScOption[JSArray[ControlName]] = ScNone
    var toolArea: ScOption[Layout] = ScNone
    var toolbar: ScOption[Layout with MultiAutoChild] = ScNone
    var toolbarBackgroundColor: ScOption[String] = ScNone
    var underlineSelectionPrompt: ScOption[String] = ScNone
    var unorderedListPrompt: ScOption[String] = ScNone
    var value: ScOption[String] = ScNone
}
