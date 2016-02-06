package com.simplesys.SmartClient.Layout.props.tabSet

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Layout.TabSet
import com.simplesys.SmartClient.Layout.tabSet.Tab
import com.simplesys.System.Types2._
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.props.AbstractClassProps

import scala.scalajs.js
import scala.scalajs.js._

class TabProps extends AbstractClassProps {
    var canClose: ScOption[Boolean] = ScNone
    var canEditTitle: ScOption[Boolean] = ScNone
    var canReorder: ScOption[Boolean] = ScNone
    var closeIcon: ScOption[SCImgURL] = ScNone
    var closeIconSize: ScOption[Int] = ScNone
    var disabled: ScOption[Boolean] = ScNone
    var icon: ScOption[SCImgURL] = ScNone
    var iconHeight: ScOption[Int] = ScNone
    var iconSize: ScOption[Int] = ScNone
    var iconWidth: ScOption[Int] = ScNone
    var ID: ScOption[String] = ScNone
    var name: ScOption[String] = ScNone
    var pane: ScOption[Canvas] = ScNone
    var paneMargin: ScOption[Int] = ScNone
    var pickerTitle: ScOption[HTMLString] = ScNone
    var prompt: ScOption[HTMLString] = ScNone
    var tabDeselected: ScOption[js.Function7[TabSet, Int, Canvas, String, Tab, Tab, String, Boolean]] = ScNone
    var tabSelected: ScOption[js.Function6[TabSet, Int, Canvas, String, Tab, String, void]] = ScNone
    var title: ScOption[HTMLString] = ScNone
    var width: ScOption[Int] = ScNone
}
