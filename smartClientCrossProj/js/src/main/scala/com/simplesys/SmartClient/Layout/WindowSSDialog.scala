package com.simplesys.SmartClient.Layout

import com.simplesys.System.Types.HTMLString
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js
import scala.scalajs.js.ThisFunction0

@js.native
trait WindowSSDialog extends WindowSS {

    import com.simplesys.SmartClient.Foundation.Canvas
    import com.simplesys.System.JSUndefined

    var wrapCanvas: JSUndefined[Canvas]

    var okFunction: JSUndefined[ThisFunction0[classHandler, _]]
    var cancelFunction: JSUndefined[ThisFunction0[classHandler, _]]

    val okCaption: JSUndefined[HTMLString]
    val cancelCaption: JSUndefined[HTMLString]
    var okCancelPanel: JSUndefined[OkCancelPanel]
}

@js.native
abstract trait AbstractWindowSSDialogCompanion extends AbstractWindowSSCompanion {
}

