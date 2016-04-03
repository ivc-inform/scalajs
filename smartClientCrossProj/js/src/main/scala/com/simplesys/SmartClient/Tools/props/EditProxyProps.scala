package com.simplesys.SmartClient.Tools.props

import com.simplesys.SmartClient.Forms.DynamicForm
import com.simplesys.SmartClient.Foundation.{Canvas, Label}
import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.System.Types.{CSSColor, MultiAutoChild}
import com.simplesys.System.Types.InlineEditEvent.InlineEditEvent
import com.simplesys.System.Types.SelectedAppearance.SelectedAppearance

import scala.scalajs.js._
import com.simplesys.option.{ScNone, ScOption}

class EditProxyProps extends ClassProps {
    var allowNestedDrops: ScOption[Boolean] = ScNone
    var autoMaskChildren: ScOption[Boolean] = ScNone
    var bringToFrontOnSelect: ScOption[Boolean] = ScNone
    var canSelect: ScOption[Boolean] = ScNone
    var canSelectChildren: ScOption[Boolean] = ScNone
    var childrenSnapResizeToGrid: ScOption[Boolean] = ScNone
    var childrenSnapToGrid: ScOption[Boolean] = ScNone
    var editMask: ScOption[Canvas] = ScNone
    var hoopSelector: ScOption[Canvas] = ScNone
    var inlineEditEvent: ScOption[InlineEditEvent] = ScNone
    var inlineEditForm: ScOption[DynamicForm with MultiAutoChild] = ScNone
    var inlineEditInstructionLabel: ScOption[Label] = ScNone
    var inlineEditInstructions: ScOption[String] = ScNone
    var inlineEditMultiline: ScOption[Boolean] = ScNone
    var inlineEditOnDrop: ScOption[Boolean] = ScNone
    var persistCoordinates: ScOption[Boolean] = ScNone
    var selectedAppearance: ScOption[SelectedAppearance] = ScNone
    var selectedBorder: ScOption[String] = ScNone
    var selectedLabelBackgroundColor: ScOption[String] = ScNone
    var selectedTintColor: ScOption[CSSColor] = ScNone
    var selectedTintOpacity: ScOption[Int] = ScNone
    var supportsInlineEdit: ScOption[Boolean] = ScNone
}
