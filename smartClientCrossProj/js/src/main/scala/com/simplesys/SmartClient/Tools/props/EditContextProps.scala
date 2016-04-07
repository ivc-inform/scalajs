package com.simplesys.SmartClient.Tools.props

import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.SmartClient.Tools.{EditContext, EditNode, Palette, PaletteNode}
import com.simplesys.System.Types.CSSColor
import com.simplesys.System.Types.HoopSelectionStyle.HoopSelectionStyle
import com.simplesys.System.Types.SelectedAppearance.SelectedAppearance
import com.simplesys.System.{JSArray, JSObject, JSUndefined}
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js
import scala.scalajs.js._

trait EditContextProps extends ClassProps {
    type classHandler <: EditContext

    var allowNestedDrops: ScOption[Boolean] = ScNone
    var autoEditNewNodes: ScOption[Boolean] = ScNone
    var canDragGroup: ScOption[Boolean] = ScNone
    var canGroupSelect: ScOption[Boolean] = ScNone
    var canSelectEditNodes: ScOption[Boolean] = ScNone
    var defaultPalette: ScOption[Palette] = ScNone
    var defaultParent: ScOption[EditNode] = ScNone
    var editMaskProperties: ScOption[JSObject] = ScNone
    var editNodeUpdated: ScOption[js.Function3[EditNode, EditContext, JSArray[String], _]] = ScNone
    var enableInlineEdit: ScOption[Boolean] = ScNone
    var extraPalettes: ScOption[JSArray[Palette]] = ScNone
    var hideGroupBorderOnDrag: ScOption[Boolean] = ScNone
    var hoopSelectionMode: ScOption[HoopSelectionStyle] = ScNone
    var hoopSelectorProperties: ScOption[JSObject] = ScNone
    var persistCoordinates: ScOption[Boolean] = ScNone
    var rootComponent: ScOption[PaletteNode] = ScNone
    var selectedAppearance: ScOption[SelectedAppearance] = ScNone
    var selectedBorder: ScOption[String] = ScNone
    var selectedLabelBackgroundColor: ScOption[String] = ScNone
    var selectedTintColor: ScOption[CSSColor] = ScNone
    var selectedTintOpacity: ScOption[Int] = ScNone
    //var selectionType: ScOption[SelectionType] = ScNone //todo  сделать анотацию @JSPropsName
    var showSelectedLabel: ScOption[Boolean] = ScNone
    var showSelectedLabelOnSelect: ScOption[Boolean] = ScNone
    var selectedEditNodesUpdated: ScOption[Function2[JSUndefined[EditNode], JSArray[EditNode], _]] = ScNone
}