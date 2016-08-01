package com.simplesys.SmartClient.Layout.props

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Layout.WindowListGridEditorToolStrip
import com.simplesys.SmartClient.Layout.props.toolStrip.ToolStripButtonProps
import com.simplesys.SmartClient.System._
import com.simplesys.System._
import com.simplesys.function._
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.option.ScOption._

class WindowListGridEditorToolStripProps extends ToolStripProps {
    type classHandler <: WindowListGridEditorToolStrip

    var owner: ScOption[Canvas] = ScNone

    members = Seq(
        ToolStripButton.create(
            new ToolStripButtonProps {
                icon = Common.iconAdd.opt
                prompt = "Новый".ellipsis.opt
                click = {
                    (thiz: classHandler) =>
                        false
                }.toThisFunc.opt
            }
        ),
        ToolStripButton.create(
            new ToolStripButtonProps {
                icon = Common.Actions_document_edit_icon.opt
                prompt = "Изменить".ellipsis.opt
                click = {
                    (thiz: classHandler) =>
                        false
                }.toThisFunc.opt
            }
        ),
        ToolStripButton.create(
            new ToolStripButtonProps {
                icon = Common.copy_icon.opt
                prompt = "Копировать".ellipsis.opt
                click = {
                    (thiz: classHandler) =>
                        false
                }.toThisFunc.opt
            }
        ),
        ToolStripButton.create(
            new ToolStripButtonProps {
                icon = Common.delete_icon.opt
                prompt = "Удалить".ellipsis.opt
                click = {
                    (thiz: classHandler) =>
                        false
                }.toThisFunc.opt
            }
        ),
        ToolStripSeparator.create(),
        ToolStripButton.create(
            new ToolStripButtonProps {
                icon = Common.iconSave.opt
                prompt = "Сохранить изменения".opt
                click = {
                    (thiz: classHandler) =>
                        false
                }.toThisFunc.opt
                enableIf = {
                    (thiz: classHandler) =>
                        false
                }.toThisFunc.opt
            }
        ), ToolStripButton.create(
            new ToolStripButtonProps {
                icon = Common.cancel.opt
                prompt = "Отменить изменения".opt
                true.opt
                click = {
                    (thiz: classHandler) =>
                        false
                }.toThisFunc.opt
                enableIf = {
                    (thiz: classHandler) =>
                        false
                }.toThisFunc.opt
            }
        )
    ).opt

    draw = {
        (thiz: classHandler, arguments: JSUndefined[IscArray[JSAny]]) =>
            val res = thiz.Super("draw", arguments.getOrElse(IscArray()))

            thiz.members.foreach(member => member.enableIf.foreach(member setDisabled !_ ()))

            isc debugTrac(thiz.getClassName(), thiz.getIdentifier())
            res.asInstanceOf[classHandler]
    }.toThisFunc.opt

}
