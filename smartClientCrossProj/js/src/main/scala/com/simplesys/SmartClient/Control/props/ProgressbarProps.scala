package com.simplesys.SmartClient.Control.props

import com.simplesys.SmartClient.Foundation.props.StretchImgProps
import com.simplesys.System.Types2.void
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js

class ProgressbarProps extends StretchImgProps {
    var breadth: ScOption[Int] = ScNone
    var length: ScOption[Int] = ScNone
    var percentChanged: ScOption[js.Function1[void, _]] = ScNone
    var percentDone: ScOption[Int] = ScNone
}
