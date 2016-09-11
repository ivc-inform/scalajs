package com.simplesys.SmartClient.Forms.formsItems.props

import com.simplesys.SmartClient.Control.Button
import com.simplesys.SmartClient.Forms.DynamicFormSS
import com.simplesys.SmartClient.Forms.formsItems.{FormItem, GradientItem}
import com.simplesys.SmartClient.Forms.props.DynamicFormSSProps
import com.simplesys.SmartClient.System._
import com.simplesys.System.Types._
import com.simplesys.System._
import com.simplesys.function._
import com.simplesys.option.DoubleType._
import com.simplesys.option.ScOption._
import com.simplesys.option.{ScNone, ScOption}

class GradientItemProps extends FormItemWithButtonsProps {
    type classHandler <: GradientItem

    width = "100%"
    nameStrong = "fillGradient".nameStrongOpt
    title = "Градиентная заливка".opt
    typeEditorField = FormItemComponentType.TextAreaItem
    showTitle = false.opt
    colSpan = 2.opt

    clearValue = {
        (thiz: classHandler) ⇒
            thiz.Super("clearValue")

            thiz.innerForm.foreach {
                innerForm ⇒
                    innerForm.setValue("startColor", null)
                    innerForm.setValue("endColor", null)
                    innerForm.setValue("direction", null)

                    thiz.startColor = jSUndefined
                    thiz.endColor = jSUndefined
                    thiz.direction = jSUndefined
            }
    }.toThisFunc.opt

    setValue = {
        (thiz: classHandler, value: JSUndefined[JSAny]) ⇒
            //isc debugTrap value
            value.foreach {
                value ⇒
                    if (value == null)
                        thiz.clearValue()
                    else {
                        thiz.innerForm.foreach {
                            innerForm ⇒

                                import com.simplesys.SmartClient.Drawing.gradient.SimpleGradient
                                val _value = value.asInstanceOf[SimpleGradient]

                                innerForm.setValue("startColor", _value.startColor)
                                innerForm.setValue("endColor", _value.endColor)
                                innerForm.setValue("direction", _value.direction)

                                thiz.startColor = _value.startColor
                                thiz.endColor = _value.endColor
                                thiz.direction = _value.direction
                        }
                    }
            }
            thiz.Super("setValue", IscArray(value))

    }.toThisFunc.opt

    getValue = {
        (thiz: classHandler) ⇒

            import com.simplesys.SmartClient.Drawing.gradient.props.SimpleGradientProps
            if (thiz.startColor.isEmpty && thiz.endColor.isEmpty && thiz.direction.isEmpty)
                jSUndefined
            else
                SimpleGradient(
                    new SimpleGradientProps {
                        startColor = thiz.startColor.opt
                        endColor = thiz.endColor.opt
                        direction = thiz.direction.opt
                    }
                ).undef
    }.toThisFunc.opt

    var startColor: ScOption[CSSColor] = ScNone
    var endColor: ScOption[CSSColor] = ScNone
    var direction: ScOption[Double] = ScNone

    init = {
        (thisTop: classHandler, args: IscArray[JSAny]) ⇒
            //isc debugTrap thisTop.drawItem

            thisTop.innerForm = DynamicFormSS.create(
                new DynamicFormSSProps {
                    width = "100%"
                    isGroup = true.opt
                    groupTitle = "Градиентная заливка".opt
                    fields = Seq(
                        ColorItem(
                            new ColorItemProps {
                                nameStrong = "startColor".nameStrongOpt
                                title = "Начальный цвет".opt
                                defaultValue = thisTop.startColor.optAny
                                changed = {
                                    (form: DynamicFormSS, formItem: FormItem, value: CSSColor) ⇒
                                        thisTop.startColor = value
                                        thisTop.form.foreach(form ⇒ thisTop.changed.foreach(_ (form, formItem, thisTop.getValue())))
                                }.toFunc.opt
                            }
                        ),
                        ColorItem(
                            new ColorItemProps {
                                nameStrong = "endColor".nameStrongOpt
                                title = "Конечный цвет".opt
                                defaultValue = thisTop.endColor.optAny
                                changed = {
                                    (form: DynamicFormSS, formItem: FormItem, value: CSSColor) ⇒
                                        thisTop.endColor = value
                                        thisTop.form.foreach(form ⇒ thisTop.changed.foreach(_ (form, formItem, thisTop.getValue())))
                                }.toFunc.opt
                            }
                        ),
                        SpinnerItem(
                            new SpinnerItemProps {
                                nameStrong = "direction".nameStrongOpt
                                title = "Направление".opt
                                defaultValue = thisTop.direction.optAny
                                min = 0.0.opt
                                max = 360.0.opt
                                step = 1.0.opt
                                changed = {
                                    (form: DynamicFormSS, formItem: FormItem, value: Double) ⇒
                                        thisTop.direction = value
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

    `type` = FormItemComponentType.GradientItem
}
