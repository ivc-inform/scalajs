package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.System.Types.void

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait RichTextItem extends CanvasItem {
    var controlGroups: Array[String]
    var moveFocusOnTab:Boolean
    def  setMoveFocusOnTab (moveFocusOnTab:Boolean):void
}

@js.native
abstract trait AbstractRichTextItemCompanion extends AbstractCanvasItemCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object RichTextItem extends AbstractRichTextItemCompanion
}

