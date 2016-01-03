package com.simplesys.SmartClient.Foundation

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Img extends StatefulCanvas {
}

@js.native
abstract trait AbstractImgCompanion extends AbstractCanvasCompanion {
}

@js.native
object Img extends AbstractImgCompanion        
