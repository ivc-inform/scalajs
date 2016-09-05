package com.simplesys.SmartClient.Layout

import com.simplesys.System.Types.HTMLString

import scala.scalajs.js

@js.native
trait WindowSSDialog extends WindowSS {

    import com.simplesys.SmartClient.Foundation.Canvas
    import com.simplesys.System.JSUndefined

    var wrapCanvas: JSUndefined[Canvas]

    var okFunction: JSUndefined[js.ThisFunction0[classHandler, _]]
    var cancelFunction: JSUndefined[js.Function0[_]]

    val okCaption: JSUndefined[HTMLString]
    val cancelCaption: JSUndefined[HTMLString]
}

@js.native
abstract trait AbstractWindowSSDialogCompanion extends AbstractWindowSSCompanion {
}

