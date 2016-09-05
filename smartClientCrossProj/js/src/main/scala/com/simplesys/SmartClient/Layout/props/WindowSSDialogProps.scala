package com.simplesys.SmartClient.Layout.props

import com.simplesys.System.Types.HTMLString
import com.simplesys.function._
import com.simplesys.option.DoubleType._
import com.simplesys.option.ScOption._

class WindowSSDialogProps extends WindowSSProps {

    import com.simplesys.SmartClient.Foundation.Canvas
    import com.simplesys.SmartClient.Layout.WindowSSDialog
    import com.simplesys.SmartClient.System.OkCancelPanel
    import com.simplesys.option.{ScNone, ScOption}

    import scala.scalajs.js.ThisFunction0

    type classHandler <: WindowSSDialog

    height = 400
    width = 300
    canDragResize = true.opt
    canDragReposition = true.opt
    keepInParentRect = true.opt
    autoCenter = false.opt
    autoSize = false.opt
    showMinimizeButton = false.opt
    showMaximizeButton = false.opt

    var wrapCanvas: ScOption[Canvas] = ScNone
    var okCaption: ScOption[HTMLString] = "Сохранить".opt
    var okFunction: ScOption[ThisFunction0[classHandler, _]] = ScNone
    var cancelFunction: ScOption[ThisFunction0[classHandler, _]] = ScNone
    var cancelCaption: ScOption[HTMLString] = ScNone

    initWidget = {
        import com.simplesys.SmartClient.System.IscArray
        import com.simplesys.System.JSAny
        (thisTop: classHandler, args: IscArray[JSAny]) ⇒

            thisTop.Super("initWidget", args)
            //isc debugTrap thizTop.wrapCanvas

            thisTop.wrapCanvas.foreach(thisTop addItem _)
            val okCancelPanel = OkCancelPanel.create(
                new OkCancelPanelProps {
                    owner = thisTop.opt
                    okCaption = if (thisTop.okCaption.isEmpty) ScNone else thisTop.okCaption.get.opt
                    cancelCaption = if (thisTop.cancelCaption.isEmpty) ScNone else thisTop.cancelCaption.get.opt
                    ownerDestroy = false.opt
                    ownerHide = false.opt
                    cancelFunction =
                      if (thisTop.cancelFunction.isDefined) {
                          (thiz: classHandler) ⇒
                              thisTop.cancelFunction.get()
                      }.toThisFunc.opt
                      else {
                          (thiz: classHandler) ⇒
                              thisTop.markForDestroy()
                      }.toThisFunc.opt
                }
            )

            thisTop addItem okCancelPanel


    }.toThisFunc.opt
}
