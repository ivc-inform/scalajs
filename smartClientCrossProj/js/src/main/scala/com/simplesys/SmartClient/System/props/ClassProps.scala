package com.simplesys.SmartClient.System.props

import com.simplesys.System.Types.void
import com.simplesys.SmartClient.System.Class
import com.simplesys.option.{ScOption, ScNone}
import com.simplesys.props.AbstractClassProps

import scala.scalajs.js
import scala.scalajs.js._

class ClassProps extends  AbstractClassProps{
    type classHandler <: Class

    var addPropertiesOnCreate: ScOption[Boolean] = ScNone
    var init: ScOption[js.ThisFunction0[classHandler, void]] = ScNone
}
