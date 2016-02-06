package com.simplesys.SmartClient.Foundation

import com.simplesys.System.Types2.ImageStyle.ImageStyle
import com.simplesys.System.Types2.{URL, void, CSSStyleName, SCImgURL}
import com.simplesys.Types1.JSArray

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait StretchImg extends StatefulCanvas {
    var gripImgSuffix: String
    var hSrc: SCImgURL
    val imageType: ImageStyle
    var itemBaseStyle: CSSStyleName
    val items: JSArray[StretchItem]
    def setItems (items: JSArray[StretchItem]):void
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


