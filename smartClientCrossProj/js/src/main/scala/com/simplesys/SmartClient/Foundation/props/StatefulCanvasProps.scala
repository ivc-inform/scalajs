package com.simplesys.SmartClient.Foundation.props

import com.simplesys.SmartClient.Foundation.inst.Canvas
import com.simplesys.SmartClient.option.{ScNone, ScOption}
import com.simplesys.isc.System.Types.Alignment.Alignment
import com.simplesys.isc.System.Types.IconOrientation.IconOrientation
import com.simplesys.isc.System.Types.SelectionType.SelectionType
import com.simplesys.isc.System.Types.State._
import com.simplesys.isc.System.Types.VerticalAlignment._
import com.simplesys.isc.System.Types._

class StatefulCanvasProps extends CanvasProps {
    val actionType: ScOption[SelectionType] = ScNone
    val align: ScOption[Alignment] = ScNone
    val autoFit: ScOption[Boolean] = ScNone
    val baseStyle: ScOption[CSSStyleName] = ScNone
    val icon: ScOption[SCImgURL] = ScNone
    val iconHeight: ScOption[Int] = ScNone
    val iconOrientation: ScOption[String] = ScNone
    val iconSize: ScOption[Int] = ScNone
    val iconSpacing: ScOption[Int] = ScNone
    val iconStyle: ScOption[CSSStyleName] = ScNone
    val iconWidth: ScOption[Int] = ScNone
    val ignoreRTL: ScOption[Boolean] = ScNone
    val overCanvas: ScOption[Canvas] = ScNone
    val overCanvasConstructor: ScOption[String] = ScNone
    val overCanvasDefaults: ScOption[Canvas] = ScNone
    val radioGroup: ScOption[String] = ScNone
    val redrawOnStateChange: ScOption[Boolean] = ScNone
    val selected: ScOption[Boolean] = ScNone
    val showDisabled: ScOption[Boolean] = ScNone
    val showDown: ScOption[Boolean] = ScNone
    val showDownIcon: ScOption[Boolean] = ScNone
    val showFocused: ScOption[Boolean] = ScNone
    val showFocusedAsOver: ScOption[Boolean] = ScNone
    val showFocusedIcon: ScOption[Boolean] = ScNone
    val showOverCanvas: ScOption[Boolean] = ScNone
    val showRollOver: ScOption[Boolean] = ScNone
    val showRollOverIcon: ScOption[Boolean] = ScNone
    val showRTLIcon: ScOption[Boolean] = ScNone
    val showSelectedIcon: ScOption[Boolean] = ScNone
    val state: ScOption[State] = ScNone
    val title: ScOption[HTMLString] = ScNone
    val valign: ScOption[VerticalAlignment] = ScNone
}
