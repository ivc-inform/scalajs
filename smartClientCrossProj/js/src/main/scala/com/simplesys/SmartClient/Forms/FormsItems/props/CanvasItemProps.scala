package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.Forms.DynamicForm
import com.simplesys.SmartClient.Forms.FormsItems.CanvasItem
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types.Overflow.Overflow
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.Types.JSAny

import scala.scalajs.js

class CanvasItemProps extends FormItemProps {
    var applyPromptToCanvas: ScOption[Boolean] = ScNone
    var autoDestroy: ScOption[Boolean] = ScNone
    var canEditChanged: ScOption[js.Function1[Boolean, Boolean]] = ScNone
    var canvas: ScOption[Canvas] = ScNone
    var canvasConstructor: ScOption[String] = ScNone
    var canvasDefaults: ScOption[Types.Object] = ScNone
    var canvasProperties: ScOption[Types.Object] = ScNone
    var createCanvas: ScOption[js.Function2[DynamicForm, CanvasItem, Canvas]] = ScNone
    var editCriteriaInInnerForm: ScOption[Boolean] = ScNone
    var multiple: ScOption[Boolean] = ScNone
    var overflow: ScOption[Overflow] = ScNone
    var showValue: ScOption[js.Function3[JSAny, JSAny, DynamicForm, CanvasItem]] = ScNone
}
