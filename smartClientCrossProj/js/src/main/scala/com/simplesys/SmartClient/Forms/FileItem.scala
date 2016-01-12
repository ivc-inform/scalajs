package com.simplesys.SmartClient.Forms

import com.simplesys.SmartClient.Forms.FormsItems.{UploadItem, StaticTextItem, AbstractCanvasItemCompanion, CanvasItem}
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.System.Types.{void, SCImgURL, AutoChild}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait FileItem extends CanvasItem {
    var accept: String
    val displayCanvas: Canvas with AutoChild
    val displayForm: DynamicForm with AutoChild
    val displayItem: StaticTextItem with AutoChild
    val downloadIconSrc: SCImgURL
    val editForm: DynamicForm with AutoChild
    def setMultiple(multiple: Boolean): void
    val showFileInline: Boolean
    val uploadItem: UploadItem with AutoChild
    val viewIconSrc: SCImgURL
}

@js.native
abstract trait AbstractFileItemCompanion extends AbstractCanvasItemCompanion {
}

@js.native
object FileItem extends AbstractFileItemCompanion        
