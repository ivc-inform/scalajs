package com.simplesys.SmartClient.Foundation.scrollbar

import com.simplesys.SmartClient.Foundation.{AbstractStretchImgCompanion, StretchImg}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ScrollThumb extends StretchImg {
    var capSize:Int
}

@js.native
abstract trait AbstractScrollThumbCompanion extends AbstractStretchImgCompanion {
}

@js.native
object ScrollThumb extends AbstractScrollThumbCompanion        
