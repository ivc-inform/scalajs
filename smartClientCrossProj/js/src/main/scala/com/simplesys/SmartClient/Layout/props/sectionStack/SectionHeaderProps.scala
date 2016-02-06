package com.simplesys.SmartClient.Layout.props.sectionStack

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Foundation.props.LabelProps
import com.simplesys.SmartClient.Layout.Layout
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.Types1.JSArray

import scala.scalajs.js

class SectionHeaderProps extends LabelProps {
    var clipTitle: ScOption[Boolean] = ScNone
    var controls: ScOption[JSArray[Canvas]] = ScNone
    var controlsLayout: ScOption[Layout] = ScNone
}
