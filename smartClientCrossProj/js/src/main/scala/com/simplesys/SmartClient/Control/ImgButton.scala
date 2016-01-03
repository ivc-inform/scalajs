package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.Foundation.{AbstractCanvasCompanion, Img}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ImgButton extends Img {
}

@js.native
abstract trait AbstractImgButtonCompanion extends AbstractCanvasCompanion {
}

@js.native
object ImgButton extends AbstractImgButtonCompanion        
