package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.Control.inst._
import com.simplesys.SmartClient.Control.props.ButtonProps
import com.simplesys.SmartClient.Foundation.AbstractCanvasCompanion
import com.simplesys.macros.PropsToMap

import scala.scalajs.js
import language.implicitConversions

@js.native
object Button extends AbstractCanvasCompanion[Button, ButtonProps] {
    type Button = Button.type
}

