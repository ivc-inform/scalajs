package com.simplesys.SmartClient.Control.props

import com.simplesys.SmartClient.Control.Menu
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js._

class MenuSSProps extends MenuProps {
    var owner: ScOption[Menu] = ScNone
}
