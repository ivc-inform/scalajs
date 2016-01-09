package com.simplesys.SmartClient.Foundation

import com.simplesys.SmartClient.DataBinding.DataBoundComponent
import com.simplesys.isc.System.Types.{HTMLString, void}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait HTMLFlow extends Canvas with DataBoundComponent{
    val allowCaching:Boolean
    val captureSCComponents:Boolean
    var contentLoaded:js.Function1[void, _]
    var contentsType: ContentsType
}

@js.native
abstract trait AbstractHTMLFlowCompanion extends AbstractCanvasCompanion {
}

@js.native
object HTMLFlow extends AbstractHTMLFlowCompanion        
