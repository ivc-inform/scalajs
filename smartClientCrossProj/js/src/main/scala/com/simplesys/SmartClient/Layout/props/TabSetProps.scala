package com.simplesys.SmartClient.Layout.props

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Foundation.props.CanvasProps
import com.simplesys.SmartClient.Layout.props.tabSet.TabProps
import com.simplesys.SmartClient.Layout.tabSet.Tab
import com.simplesys.System.Types.ID
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js

class TabSetProps extends CanvasProps {
    var animateTabScrolling: ScOption[Boolean] = ScNone
    //var canAddTabs: ScOption[Boolean] = ScNone  не работает
    var canCloseTabs: ScOption[Boolean] = ScNone
    var canReorderTabs: ScOption[Boolean] = ScNone
    var locateTabsBy: ScOption[String] = ScNone
    var showTabScroller: ScOption[Boolean] = ScNone
    var tabs: ScOption[Seq[TabProps]] = ScNone
    var tabSelected: ScOption[js.Function5[Int, Canvas, ID, Tab, String, _]] = ScNone
    var tabsReordered: ScOption[js.Function0[_]] = ScNone
    var useIOSTabs: ScOption[Boolean] = ScNone
    var useSimpleTabs: ScOption[Boolean] = ScNone
}
