package com.simplesys.SmartClient.Forms.props

import com.simplesys.SmartClient.DataBinding.AdvancedCriteria
import com.simplesys.SmartClient.RPC.ServerObject
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.System.Types.ValidatorType._
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.Types1.JSArray

import scala.scalajs.js
import scala.scalajs.js._

class ValidatorProps extends ClassProps {
    var applyWhen: ScOption[AdvancedCriteria] = ScNone
    var dependentFields: ScOption[JSArray[String]] = ScNone
    var serverOnly: ScOption[Boolean] = ScNone
    var stopOnError: ScOption[Boolean] = ScNone
    var validateOnChange: ScOption[Boolean] = ScNone
    var caseSensitive: ScOption[Boolean] = ScNone
    var precision: ScOption[Any] = ScNone
    var min: ScOption[Any] = ScNone
    var stopIfFalse: ScOption[Boolean] = ScNone
    var clientOnly: ScOption[Boolean] = ScNone
    var resultingValue: ScOption[Types.Object] = ScNone
    var serverObject: ScOption[ServerObject] = ScNone
    var errorMessage: ScOption[String] = ScNone
    var serverCondition: ScOption[String] = ScNone
    var `type`: ScOption[ValidatorType] = ScNone
}
