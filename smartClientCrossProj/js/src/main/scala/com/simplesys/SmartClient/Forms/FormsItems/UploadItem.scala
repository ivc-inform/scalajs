package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.System.Types.void

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

package companion {

import scala.scalajs.js

@js.native
   object UploadItem extends AbstractUploadItemCompanion
}

