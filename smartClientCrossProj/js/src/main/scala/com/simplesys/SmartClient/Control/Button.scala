package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.Control.inst._
import com.simplesys.SmartClient.Control.props.ButtonProps
import com.simplesys.SmartClient.Foundation.AbstractCanvasCompanion

import scala.scalajs.js
import language.implicitConversions
import  com.simplesys.SmartClient.System.macroJS.PropsToMap

@js.native
object Button extends AbstractCanvasCompanion[Button, ButtonProps] {
    type Button = Button.type
}

