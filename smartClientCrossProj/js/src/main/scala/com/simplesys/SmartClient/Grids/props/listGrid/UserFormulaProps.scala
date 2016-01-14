package com.simplesys.SmartClient.Grids.props.listGrid

import com.simplesys.option.{ScOption, ScNone}
import com.simplesys.props.AbstractClassProps

import scala.scalajs.js
import scala.scalajs.js._

class UserFormulaProps extends AbstractClassProps {
    var formulaVars: ScOption[js.Dictionary[js.Any]] = ScNone
    var text: ScOption[String] = ScNone
}
