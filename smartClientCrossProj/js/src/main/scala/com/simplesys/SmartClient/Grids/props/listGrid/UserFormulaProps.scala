package com.simplesys.SmartClient.Grids.props.listGrid

import com.simplesys.option.{ScOption, ScNone}
import com.simplesys.props.AbstractClassProps
import com.simplesys.types.JSAny

import scala.scalajs.js
import scala.scalajs.js._

class UserFormulaProps extends AbstractClassProps {
    var formulaVars: ScOption[js.Dictionary[JSAny]] = ScNone
    var text: ScOption[String] = ScNone
}
