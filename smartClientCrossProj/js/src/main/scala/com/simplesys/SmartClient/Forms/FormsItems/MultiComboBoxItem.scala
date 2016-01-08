package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.Control.IButton
import com.simplesys.SmartClient.Forms.DynamicForm
import com.simplesys.SmartClient.Layout.Layout
import com.simplesys.isc.System.Types.MultiComboBoxLayoutStyle.MultiComboBoxLayoutStyle
import com.simplesys.isc.System.Types.{CSSStyleName, SCClassName, AutoChild, MultiAutoChild}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait MultiComboBoxItem extends CanvasItem {
    var addUnknownValues: Boolean
    var alwaysExitOnTab: Boolean
    var autoFetchData: Boolean
    var autoFitButtons: Boolean
    var button: IButton with MultiAutoChild
    var comboBox: ComboBoxItem with AutoChild
    var comboBoxWidth: Int
    var comboForm: DynamicForm with AutoChild
    val deselectedButtonStyle: CSSStyleName
    var layoutStyle: MultiComboBoxLayoutStyle
    val pendingButtonStyle: CSSStyleName
    def setAutoFitButtons(autoFitButtons: Boolean): Unit
    def setLayoutStyle(layoutStyle: MultiComboBoxLayoutStyle): Unit
    val useInsertionOrder: Boolean
    val valueLayout: Layout with MultiAutoChild
}

@js.native
abstract trait AbstractMultiComboBoxItemCompanion extends AbstractCanvasItemCompanion {
}

@js.native
object MultiComboBoxItem extends AbstractMultiComboBoxItemCompanion        
