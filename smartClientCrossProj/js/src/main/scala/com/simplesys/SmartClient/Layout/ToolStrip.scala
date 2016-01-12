package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Forms.DynamicForm
import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.Foundation.AbstractCanvasCompanion
import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types.Alignment.Alignment
import com.simplesys.System.Types.VerticalAlignment.VerticalAlignment

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ToolStrip extends Layout {
    def addFormItem(formItem: FormItem, formProperties: DynamicForm = js.native, position: Int = js.native): DynamicForm
    val formWrapper: DynamicForm
    val formWrapperConstructor: String
    val formWrapperDefaults: Types.Object
    val formWrapperProperties: Types.Object
    val groupTitleAlign: Alignment
    val groupTitleOrientation: VerticalAlignment
    val separatorClass: String
    val separatorSize: Int
    val showGroupTitle: Boolean
    val verticalStyleName: String
}

@js.native
abstract trait AbstractToolStripCompanion extends AbstractCanvasCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object ToolStrip extends AbstractToolStripCompanion
}

