package com.simplesys.SmartClient.Forms.FormsItems

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait RichTextItem extends CanvasItem {
    var controlGroups: Array[String]
    var moveFocusOnTab:Boolean
    def  setMoveFocusOnTab (moveFocusOnTab:Boolean):Unit

}

@js.native
abstract trait AbstractRichTextItemCompanion extends AbstractCanvasItemCompanion {
}

@js.native
object RichTextItem extends AbstractRichTextItemCompanion        