package com.simplesys.SmartClient.Foundation.props

import com.simplesys.SmartClient.Foundation.StretchItem
import com.simplesys.System.Types.ImageStyle.ImageStyle
import com.simplesys.System.Types.{CSSStyleName, SCImgURL}
import com.simplesys.option.{ScOption, ScNone}
import com.simplesys.System.JSArray

import scala.scalajs.js._

class StretchImgProps extends StatefulCanvasProps {
    var gripImgSuffix: ScOption[String] = ScNone
    var hSrc: ScOption[SCImgURL] = ScNone
    var imageType: ScOption[ImageStyle] = ScNone
    var itemBaseStyle: ScOption[CSSStyleName] = ScNone
    var items: ScOption[JSArray[StretchItem]] = ScNone
    var showDownGrip: ScOption[Boolean] = ScNone
    var showGrip: ScOption[Boolean] = ScNone
    var showRollOverGrip: ScOption[Boolean] = ScNone
    var showTitle: ScOption[Boolean] = ScNone
    var src: ScOption[SCImgURL] = ScNone
    var vertical: ScOption[Boolean] = ScNone
    var vSrc: ScOption[SCImgURL] = ScNone
}
