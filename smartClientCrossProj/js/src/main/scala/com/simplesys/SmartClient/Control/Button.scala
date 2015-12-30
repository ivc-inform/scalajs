package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.Control.inst._
import com.simplesys.SmartClient.Control.props.ButtonProps
import com.simplesys.SmartClient.Foundation.AbstractCanvasCompanion
import com.simplesys.SmartClient.System.SCApply
import com.simplesys.macros.PropsToMap

import scala.language.implicitConversions
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
object Button extends AbstractCanvasCompanion {
    private val sCApply = new SCApply[Button, ButtonProps]()
    def create(props: ButtonProps): Button = sCApply create props
}

