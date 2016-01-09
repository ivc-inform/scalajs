package com.simplesys.SmartClient.Foundation

import com.simplesys.SmartClient.Control.{AbstractStretchImgButtonCompanion, StretchImgButton}
import com.simplesys.isc.System.Types.SCImgURL

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ImgTab extends StretchImgButton {
    var src: SCImgURL
}

@js.native
abstract trait AbstractImgTabCompanion extends AbstractStretchImgButtonCompanion {
}

@js.native
object ImgTab extends AbstractImgTabCompanion        
