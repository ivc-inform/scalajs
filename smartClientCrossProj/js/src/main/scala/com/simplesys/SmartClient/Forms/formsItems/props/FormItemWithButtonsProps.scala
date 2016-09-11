package com.simplesys.SmartClient.Forms.formsItems.props

import com.simplesys.SmartClient.Control.Button
import com.simplesys.SmartClient.Forms.DynamicFormSS
import com.simplesys.SmartClient.Forms.formsItems.{CanvasItem, FormItemWithButtons}
import com.simplesys.SmartClient.Forms.props.DynamicFormSSProps
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Layout.props.{HLayoutSSProps, LayoutSSProps}
import com.simplesys.SmartClient.System.{DynamicFormSS, _}
import com.simplesys.System.Types.FormItemComponentType.FormItemComponentType
import com.simplesys.System.Types.FormItemType._
import com.simplesys.System.Types.ReadOnlyDisplayAppearance.ReadOnlyDisplayAppearance
import com.simplesys.System.Types._
import com.simplesys.System._
import com.simplesys.function._
import com.simplesys.option.DoubleType._
import com.simplesys.option.ScOption._
import com.simplesys.option.{FormItemType_FormItemComponentType, ScNone, ScOption}

class FormItemWithButtonsProps extends CanvasItemProps {
    type classHandler <: FormItemWithButtons

    width = "100%"
    readOnlyDisplay = ReadOnlyDisplayAppearance.readOnly.opt

    var buttons: ScOption[Seq[Button]] = ScNone
    var buttonsVertical: ScOption[Boolean] = true.opt

    var typeEditorField: ScOption[FormItemType_FormItemComponentType[FormItemType, FormItemComponentType]] = FormItemComponentType.TextItem

    getValue = {
        (thiz: classHandler) ⇒
            thiz.Super("getValue").undef
    }.toThisFunc.opt

    createCanvas = {
        (thisTop: classHandler, form: DynamicFormSS, item: CanvasItem) =>

            val readOnly: ScOption[ReadOnlyDisplayAppearance] = thisTop.readOnlyDisplay.getOrElse("readOnly") match {
                case "readOnly" ⇒ ReadOnlyDisplayAppearance.readOnly.opt
                case _ ⇒ ScNone
            }

            val res = HLayoutSS.create(
                new HLayoutSSProps {
                    height = 20
                    members = Seq(
                        {
                            if (thisTop.innerForm.isEmpty)
                                thisTop.innerForm = DynamicFormSS.create(
                                    new DynamicFormSSProps {
                                        cellPadding = 0.opt
                                        owner = thisTop.asInstanceOf[Canvas].opt
                                        width = "*"
                                        minColWidth = 0.opt
                                        colWidths = Seq[JSAny](0, "*").opt
                                        items = Seq(
                                            thisTop.typeEditorField.getOrElse("TextItem").toString match {
                                                case "TextItem" ⇒
                                                    TextItemSS(
                                                        new TextItemSSProps {
                                                            colSpan = 2.opt
                                                            readOnlyDisplay = readOnly
                                                            nameStrong = "innerFormItem0".nameStrongOpt
                                                            width = "*"
                                                            showTitle = false.opt
                                                        }
                                                    )
                                                case "TextAreaItem" ⇒
                                                    TextAreaItemSS(
                                                        new TextAreaItemSSProps {
                                                            colSpan = 2.opt
                                                            readOnlyDisplay = readOnly
                                                            nameStrong = "innerFormItem0".nameStrongOpt
                                                            width = "*"
                                                            showTitle = false.opt
                                                        }
                                                    )
                                                case _ ⇒
                                                    TextItemSS(
                                                        new TextItemSSProps {
                                                            colSpan = 2.opt
                                                            readOnlyDisplay = readOnly
                                                            nameStrong = "innerFormItem0".nameStrongOpt
                                                            width = "*"
                                                            showTitle = false.opt
                                                        }
                                                    )
                                            }

                                        ).opt
                                    }
                                )

                            thisTop.innerForm.get
                        }
                    ).opt
                }
            )

            thisTop.buttons.foreach(
                buttons ⇒ res addMember
                  LayoutSS.create(
                      new LayoutSSProps {
                          width = if (thisTop.buttonsVertical) 20 else ScNone
                          height = if (!thisTop.buttonsVertical) 20 else ScNone
                          vertical = thisTop.buttonsVertical.opt
                          members = buttons.toSeq.opt
                      }
                  ))
            res
    }.toThisFunc.opt


    `type` = FormItemComponentType.FormItemWithButtons
}
