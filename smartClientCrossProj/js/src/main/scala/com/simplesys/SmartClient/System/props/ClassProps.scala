package com.simplesys.SmartClient.System.props

import com.simplesys.SmartClient.System.Class
import com.simplesys.System.Types.{ID, void}
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.props.AbstractClassProps

import scala.scalajs.js

class ClassProps extends AbstractClassProps {
    type classHandler <: Class

    var addPropertiesOnCreate: ScOption[Boolean] = ScNone
    var identifier: ScOption[ID] = ScNone
    var init: ScOption[js.ThisFunction1[classHandler, js.Array[js.Any], _]] = ScNone
}
