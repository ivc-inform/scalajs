package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.SmartClient.Control.IButtonSS
import com.simplesys.SmartClient.Forms.FormsItems.{FormItem, FormItemWithButton}
import com.simplesys.System.Types.FormItemComponentType.FormItemComponentType
import com.simplesys.System.Types.FormItemType._
import com.simplesys.System.Types._
import com.simplesys.System._
import com.simplesys.function._
import com.simplesys.option.ScOption._
import com.simplesys.option.{FormItemType_FormItemComponentType, ScNone, ScOption}

import scala.scalajs.js.ThisFunction0

class FormItemWithButtonProps extends CanvasItemProps {
    type classHandler <: FormItemWithButton

    var iconButton: ScOption[SCImgURL] = ScNone
    var button: ScOption[IButtonSS] = ScNone
    var editingItem: ScOption[FormItem] = ScNone

    var clickButton: ScOption[ThisFunction0[classHandler, Boolean]] = ScNone
    var typeEditorField: ScOption[FormItemType_FormItemComponentType[FormItemType, FormItemComponentType]] = FormItemComponentType.TextItem

    var getValue: ScOption[ThisFunction0[classHandler, JSAny]] = {
        (thiz: classHandler) ⇒
            thiz.Super("getValue")
    }.toThisFunc.opt


    `type` = FormItemComponentType.FormItemWithButton
}
