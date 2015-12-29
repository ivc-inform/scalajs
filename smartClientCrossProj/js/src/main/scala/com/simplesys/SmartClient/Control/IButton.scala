package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.Control.inst._
import com.simplesys.SmartClient.Control.props.IButtonProps
import com.simplesys.SmartClient.Foundation.AbstractCanvasCompanion
import com.simplesys.SmartClient.System.SCApply
import com.simplesys.macros.PropsToMap

import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
object IButton extends AbstractCanvasCompanion {
    private val sCApply = new SCApply[IButton, IButtonProps]()
    def create(props: IButtonProps): IButton = sCApply create props
}
