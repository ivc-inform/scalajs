package com.simplesys.SmartClient.Forms.formsItems.props

import com.simplesys.SmartClient.Drawing.Point
import com.simplesys.SmartClient.Forms.DynamicFormSS
import com.simplesys.SmartClient.Forms.formsItems.{FormItem, PointItem}
import com.simplesys.SmartClient.Forms.props.DynamicFormSSProps
import com.simplesys.SmartClient.System._
import com.simplesys.System.Types.Alignment.{apply ⇒ _}
import com.simplesys.System.Types._
import com.simplesys.System._
import com.simplesys.function._
import com.simplesys.option.DoubleType._
import com.simplesys.option.ScOption._
import com.simplesys.option.{ScNone, ScOption}

class PointItemProps extends CanvasItemProps {
    type classHandler <: PointItem

    var x: ScOption[Double] = ScNone
    var y: ScOption[Double] = ScNone

    var point: ScOption[Point] = ScNone

    var maxX: ScOption[Double] = ScNone
    var maxY: ScOption[Double] = ScNone

    var minX: ScOption[Double] = 0.0.opt
    var minY: ScOption[Double] = 0.0.opt

    var step: ScOption[Double] = ScNone
    var titleGroup: ScOption[HTMLString] = ScNone

    clearValue = {
        (thiz: classHandler) ⇒
            thiz.Super("clearValue")

            thiz.innerForm.foreach {
                innerForm ⇒
                    innerForm.setValue("x", null)
                    innerForm.setValue("y", null)

                    thiz.x = jSUndefined
                    thiz.y = jSUndefined
                    thiz.point = jSUndefined
            }
    }.toThisFunc.opt

    createCanvas = {
        (thisTop: classHandler, form: DynamicFormSS, item: PointItem) =>
            thisTop.innerForm = DynamicFormSS.create(
                new DynamicFormSSProps {
                    colWidths = Seq[JSAny]("50%", "50%").opt
                    isGroup = true.opt
                    groupTitle = item.titleGroup.opt
                    width = "*"
                    numCols = 2.opt
                    items = Seq(
                        SpinnerItem(
                            new SpinnerItemProps {
                                nameStrong = "x".nameStrongOpt
                                title = "Координата X".opt
                                titleOrientation = TitleOrientation.top.opt
                                titleAlign = Alignment.center.opt
                                defaultValue = item.x.optAny
                                min = item.minX.opt
                                max = item.maxX.opt
                                step = item.step.opt
                                changed = {
                                    (form: DynamicFormSS, formItem: FormItem, value: Double) ⇒
                                        thisTop.x.foreach(_ ⇒ thisTop.x = value)
                                        thisTop.point = Point(thisTop.x.get, thisTop.y.get)
                                        thisTop.changed.foreach(_ (form, formItem, thisTop.getValue()))

                                }.toFunc.opt
                            }
                        ),
                        SpinnerItem(
                            new SpinnerItemProps {
                                nameStrong = "y".nameStrongOpt
                                title = "Координата Y".opt
                                titleOrientation = TitleOrientation.top.opt
                                titleAlign = Alignment.center.opt
                                defaultValue = item.y.optAny
                                min = item.minY.opt
                                max = item.maxY.opt
                                step = item.step.opt
                                changed = {
                                    (form: DynamicFormSS, formItem: FormItem, value: Double) ⇒
                                        thisTop.x.foreach(_ ⇒ thisTop.y = value)
                                        thisTop.point = Point(thisTop.x.get, thisTop.y.get)
                                        thisTop.changed.foreach(_ (form, formItem, thisTop.getValue()))
                                }.toFunc.opt
                            }
                        )
                    ).opt
                }
            )
            thisTop.innerForm.get
    }.toThisFunc.opt

    setValue = {
        (thiz: classHandler, value: JSUndefined[JSAny]) ⇒
            value.foreach {
                value ⇒
                    //isc debugTrap value
                    if (value == null)
                        thiz.clearValue()
                    else {
                        thiz.innerForm.foreach {
                            innerForm ⇒
                                val _value = value.asInstanceOf[Point]

                                innerForm.setValue("x", _value.getX())
                                innerForm.setValue("y", _value.getX())

                                thiz.x = _value.getX()
                                thiz.y = _value.getY()
                                thiz.point = _value
                        }
                    }
            }
            thiz.Super("setValue", IscArray(value))
    }.toThisFunc.opt

    getValue = {
        (thiz: classHandler) ⇒
            if (thiz.x.isEmpty && thiz.y.isEmpty && thiz.point.isEmpty)
                jSUndefined
            else
                Point(thiz.x.get, thiz.y.get).undef
    }.toThisFunc.opt

    init = {
        (thisTop: classHandler, args: IscArray[JSAny]) ⇒
            //isc debugTrap(thisTop, thisTop.x, thisTop.y, thisTop.point)

            if (thisTop.x.isEmpty && thisTop.y.isEmpty && thisTop.point.isDefined) {
                thisTop.x = thisTop.point.get.getX()
                thisTop.y = thisTop.point.get.getY()
            }

            thisTop.Super("init", args)
    }.toThisFunc.opt
}
