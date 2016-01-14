package com.simplesys.SmartClient.Foundation

import com.simplesys.SmartClient.Control.{AbstractStretchImgButtonCompanion, StretchImgButton}
import com.simplesys.System.Types.SCImgURL

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ImgTab extends StretchImgButton {
}

@js.native
abstract trait AbstractImgTabCompanion extends AbstractStretchImgButtonCompanion {
}

@js.native
object ImgTab extends AbstractImgTabCompanion

