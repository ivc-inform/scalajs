package com.simplesys.SmartClient.Forms.formsItems

import scala.scalajs.js

@js.native
trait ShadowItem extends FormItemWithButtons {

    import com.simplesys.SmartClient.Drawing.Shadow
    import com.simplesys.System.JSUndefined

    var shadow: JSUndefined[Shadow]
}

@js.native
abstract trait AbstractShadowItemCompanion extends AbstractFormItemWithButtonsCompanion {
}

