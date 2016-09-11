package com.simplesys.SmartClient.Forms.formsItems.props

import com.simplesys.SmartClient.Control.Button
import com.simplesys.SmartClient.Drawing.Shadow
import com.simplesys.SmartClient.Forms.DynamicFormSS
import com.simplesys.SmartClient.Forms.formsItems.{FormItem, ShadowItem}
import com.simplesys.SmartClient.Forms.props.DynamicFormSSProps
import com.simplesys.SmartClient.System._
import com.simplesys.System.Types.FormItemComponentType
import com.simplesys.System.{JSAny, _}
import com.simplesys.function._
import com.simplesys.option.DoubleType._
import com.simplesys.option.ScOption._
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js

class ShadowItemProps extends FormItemWithButtonsProps {

    type classHandler <: ShadowItem

    width = "100%"
    nameStrong = "shadow".nameStrongOpt
    title = "Тень".opt
    typeEditorField = FormItemComponentType.TextAreaItem
    showTitle = false.opt
    colSpan = 2.opt

    var shadow: ScOption[Shadow] = ScNone

    clearValue = {
        (thiz: classHandler) ⇒
            thiz.Super("clearValue")

            thiz.innerForm.foreach {
                innerForm ⇒
                    innerForm.setValue("color", null)
                    innerForm.setValue("blur", null)
                    innerForm.setValue("offset", null)

                    thiz.shadow = jSUndefined
            }
    }.toThisFunc.opt

    setValue = {
        (thiz: classHandler, value: JSUndefined[JSAny]) ⇒
            value.foreach {
                value ⇒
                    if (value == null)
                        thiz.clearValue()
                    else {
                        thiz.innerForm.foreach {
                            innerForm ⇒

                                val _value = value.asInstanceOf[Shadow]

                                innerForm.setValue("color", _value.color)
                                innerForm.setValue("blur", _value.blur)
                                innerForm.setValue("offset", _value.offset)

                                if (thiz.shadow.isEmpty)
                                    thiz.shadow = js.Object().asInstanceOf[Shadow]

                                thiz.shadow.get.color = _value.color
                                thiz.shadow.get.blur = _value.blur
                                thiz.shadow.get.offset = _value.offset
                        }
                    }
            }
            thiz.Super("setValue", IscArray(value))

    }.toThisFunc.opt

    getValue = {
        (thiz: classHandler) ⇒
            //isc debugTrap thiz.shadow

            import com.simplesys.SmartClient.Drawing.props.ShadowProps
            if (thiz.shadow.isEmpty || (thiz.shadow.get.blur.isEmpty && thiz.shadow.get.color.isEmpty && thiz.shadow.get.offset.isEmpty))
                jSUndefined
            else
                Shadow(
                    new ShadowProps {
                        color = thiz.shadow.get.color.opt
                        blur = thiz.shadow.get.blur.opt
                        offset = thiz.shadow.get.offset.opt
                    }
                ).undef
    }.toThisFunc.opt

    changed = {
        (form: DynamicFormSS, formItem: ShadowItem, value: Shadow) ⇒
            //isc debugTrap(form, value)
            form.setPropertyOnSelection("shadow", value)

    }.toFunc.opt

    init = {
        (thisTop: classHandler, args: IscArray[JSAny]) ⇒
            //isc debugTrap (thisTop.drawItem)

            thisTop.innerForm = DynamicFormSS.create(
                new DynamicFormSSProps {
                    width = "100%"
                    isGroup = true.opt
                    groupTitle = "Тень".opt
                    fields = Seq(
                        ColorItem(
                            new ColorItemProps {
                                nameStrong = "color".nameStrongOpt
                                title = "Цвет".opt
                                defaultValue = if (thisTop.shadow.isEmpty) ScNone else thisTop.shadow.get.color.optAny
                                changed = {
                                    import com.simplesys.System.Types.CSSColor
                                    (form: DynamicFormSS, formItem: FormItem, value: CSSColor) ⇒
                                        thisTop.shadow.foreach(_.color = value)
                                        thisTop.form.foreach(form ⇒ thisTop.changed.foreach(_ (form, formItem, thisTop.getValue())))
                                }.toFunc.opt
                            }
                        ),
                        SpinnerItem(
                            new SpinnerItemProps {
                                nameStrong = "blur".nameStrongOpt
                                title = "Размытие".opt
                                defaultValue = if (thisTop.shadow.isEmpty) ScNone else thisTop.shadow.get.blur.optAny
                                min = 0.0.opt
                                max = 20.0.opt
                                step = 1.0.opt
                                changed = {
                                    (form: DynamicFormSS, formItem: FormItem, value: Int) ⇒
                                        thisTop.shadow.foreach(_.blur = value)
                                        thisTop.form.foreach(form ⇒ thisTop.changed.foreach(_ (form, formItem, thisTop.getValue())))

                                }.toFunc.opt
                            }
                        ),
                        PointItem(
                            new PointItemProps {
                                point = if (thisTop.shadow.isEmpty) ScNone else thisTop.shadow.get.offset.opt
                                maxX = 20.0.opt
                                maxY = 20.0.opt
                                titleGroup = "Относительно нулевой точки".opt
                                nameStrong = "offset".nameStrongOpt
                                title = "Смещение".opt
                                changed = {
                                    (form: DynamicFormSS, formItem: FormItem, value: Point) ⇒
                                        thisTop.shadow.foreach(_.offset = value)
                                        thisTop.form.foreach(form ⇒ thisTop.changed.foreach(_ (form, formItem, thisTop.getValue())))

                                }.toFunc.opt
                            }
                        )
                    ).opt
                }
            )

            thisTop.buttons =
              IscArray[Button](
                  CancelButton.create(
                      new CancelButtonProps {
                          width = 20
                          click = {
                              (thiz: classHandler) =>
                                  thisTop.form.foreach {
                                      form ⇒
                                          thisTop.nameStrong.foreach {
                                              nameStrong ⇒
                                                  form.setPropertyOnSelection(nameStrong.name, jSUndefined)
                                                  form.setValue(nameStrong.name, null)
                                          }
                                  }
                                  true
                          }.toThisFunc.opt
                      })
              ).undef


            thisTop.Super("init", args)

    }.toThisFunc.opt

    `type` = FormItemComponentType.ShadowItem
}
