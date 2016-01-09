package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.isc.System.Types.void

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait UploadItem extends TextItem {
    val accept:String
    val multiple:Boolean
    def  setSelectionRange ():void
    def  setValue ():void
}

@js.native
abstract trait AbstractUploadItemCompanion extends AbstractTextItemCompanion {
}

@js.native
object UploadItem extends AbstractUploadItemCompanion        
