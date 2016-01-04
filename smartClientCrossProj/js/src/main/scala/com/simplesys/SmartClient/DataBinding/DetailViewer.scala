package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.Foundation.{AbstractCanvasCompanion, Canvas}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait DetailViewer extends Canvas with DataBoundComponent{
}

@js.native
abstract trait AbstractDetailViewerCompanion extends AbstractCanvasCompanion {
}

@js.native
object DetailViewer extends AbstractDetailViewerCompanion        
