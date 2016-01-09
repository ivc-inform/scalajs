package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.SmartClient.Forms.DynamicForm
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.System.{Types, Criterion}
import com.simplesys.isc.System.Types.{void, HTMLString}
import com.simplesys.isc.System.Types.Overflow.Overflow
import com.simplesys.isc.System.Types.ReadOnlyDisplayAppearance.ReadOnlyDisplayAppearance

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait CanvasItem extends FormItem {
    var applyPromptToCanvas: Boolean
    var autoDestroy: Boolean
    var canEditChanged: js.Function1[Boolean, Boolean]
    var canvas: Canvas
    var canvasConstructor: String
    var canvasDefaults: Types.Object
    var canvasProperties: Types.Object
    var createCanvas: js.Function2[DynamicForm, CanvasItem, Canvas]
    val editCriteriaInInnerForm: Boolean
    def getCriterion(): Criterion
    var multiple: Boolean
    var overflow: Overflow
    def readOnlyDisplayChanged(appearance: ReadOnlyDisplayAppearance): Boolean
    def setCanvas(canvas: Canvas): void
    def shouldDisableCanvas(): void
    var showValue: js.Function3[js.Any, js.Any, DynamicForm, CanvasItem]
}

@js.native
abstract trait AbstractCanvasItemCompanion extends AbstractFormItemCompanion {
}

@js.native
object CanvasItem extends AbstractCanvasItemCompanion        
