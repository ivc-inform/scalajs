package com.simplesys.SmartClient.Forms.FormsItems

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait UploadItem extends TextItem {
    val accept:String
    val multiple:Boolean
    def  setSelectionRange ():Unit
    def  setValue ():Unit
}

@js.native
abstract trait AbstractUploadItemCompanion extends AbstractTextItemCompanion {
}

@js.native
object UploadItem extends AbstractUploadItemCompanion        
