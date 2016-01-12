package com.simplesys.SmartClient.Foundation

import com.simplesys.SmartClient.Control.Button
import com.simplesys.SmartClient.Foundation.props.LabelProps
import com.simplesys.SmartClient.System.SCApply
import com.simplesys.System.Types.{CSSStyleName, URL}
import com.simplesys.macros.PropsToDictionary

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Label extends Button {
}

@js.native
abstract trait AbstractLabelCompanion extends AbstractCanvasCompanion {
}

object Label extends SCApply[Label, LabelProps]

package companion {
    @js.native
    object Label extends AbstractLabelCompanion
}
