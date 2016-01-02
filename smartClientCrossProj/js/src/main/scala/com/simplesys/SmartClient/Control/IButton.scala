package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.Control.props.IButtonProps
import com.simplesys.SmartClient.System.SCApply
import com.simplesys.macros.PropsToDictionary

import scala.scalajs.js

@js.native
trait IButton extends Button

@js.native
object IButton extends SCApply[IButton, IButtonProps]





