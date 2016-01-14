package com.simplesys.SmartClient.Forms.props

import com.simplesys.SmartClient.DataBinding.AdvancedCriteria
import com.simplesys.SmartClient.RPC.ServerObject
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js._

class ValidatorProps extends ClassProps {
    var applyWhen: ScOption[AdvancedCriteria] = ScNone
    var dependentFields: ScOption[Array[String]] = ScNone
    var serverOnly: ScOption[Boolean] = ScNone
    var stopOnError: ScOption[Boolean] = ScNone
    var validateOnChange: ScOption[Boolean] = ScNone
    var caseSensitive: ScOption[Boolean] = ScNone
    var stopIfFalse: ScOption[Boolean] = ScNone
    var clientOnly: ScOption[Boolean] = ScNone
    var resultingValue: ScOption[Types.Object] = ScNone
    var serverObject: ScOption[ServerObject] = ScNone
    var errorMessage: ScOption[String] = ScNone
    var serverCondition: ScOption[String] = ScNone

}
