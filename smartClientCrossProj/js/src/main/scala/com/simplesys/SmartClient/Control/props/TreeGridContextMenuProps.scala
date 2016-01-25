package com.simplesys.SmartClient.Control.props

import com.simplesys.SmartClient.Grids.TreeGridEditor
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js._

class TreeGridContextMenuProps extends MenuSSProps {
    var owner: ScOption[TreeGridEditor] = ScNone
}
