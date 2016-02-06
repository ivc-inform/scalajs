package com.simplesys.SmartClient.Forms.dynamicForm

import com.simplesys.SmartClient.Forms.FormsItems.FormItem

import scala.scalajs.js

@js.native
trait FormItemEventInfo extends js.Object {
    val icon: String
    val item: FormItem
    val overItem: Boolean
    val overTitle: Boolean
}


