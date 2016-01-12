package com.simplesys.SmartClient.Foundation

import com.simplesys.System.Types.ImageStyle.ImageStyle
import com.simplesys.System.Types.{URL, void, CSSStyleName, SCImgURL}

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait StretchImg extends StatefulCanvas {
    var gripImgSuffix: String
    var hSrc: SCImgURL
    val imageType: ImageStyle
    var itemBaseStyle: CSSStyleName
    val items: Array[StretchItem]
    def setItems (items: Array[StretchItem]):void
    def setSrc (src:URL):void
    def setState (newState:String, whichPart:String = js.native):void
    var showDownGrip:Boolean
    var showGrip:Boolean
    var showRollOverGrip:Boolean
    var showTitle: Boolean
    var src:SCImgURL
    var vertical:Boolean
    var vSrc:SCImgURL
}

@js.native
abstract trait AbstractStretchImgCompanion extends AbstractCanvasCompanion {
}

@js.native
object StretchImg extends AbstractStretchImgCompanion        
