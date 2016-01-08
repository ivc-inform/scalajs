package com.simplesys.SmartClient.Forms.dynamicForm

import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.System.Types

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait FormItemEventInfo extends Types.Object {
    val icon: String
    val item: FormItem
    val overItem: Boolean
    val overTitle: Boolean
}


