package com.simplesys.SmartClient.Layout.props

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js

class DeckProps extends LayoutProps {
    var currentPane: ScOption[Canvas] = ScNone
    var panes: ScOption[js.Array[Canvas]] = ScNone
}
