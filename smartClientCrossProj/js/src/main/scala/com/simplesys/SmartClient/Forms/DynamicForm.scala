package com.simplesys.SmartClient.Forms

import com.simplesys.SmartClient.DataBinding.DataBoundComponent
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.System.AbstractClassCompanion

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait DynamicForm extends Canvas with DataBoundComponent{
}

@js.native
abstract trait AbstractDynamicFormCompanion extends AbstractClassCompanion {
}

@js.native
object DynamicForm extends AbstractDynamicFormCompanion        
