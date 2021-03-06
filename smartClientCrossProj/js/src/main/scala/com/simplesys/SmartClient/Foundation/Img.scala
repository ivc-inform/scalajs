package com.simplesys.SmartClient.Foundation

import com.simplesys.System.Types.ImageStyle.ImageStyle
import com.simplesys.System.Types.{SCImgURL, URL, void}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Img extends StatefulCanvas {
    var activeAreaHTML: String
    var altText: String
    var imageHeight: Int
    var imageType: ImageStyle
    var imageWidth: Int
    var name: String
    def resetSrc(): void
    def setImageType(imageType: ImageStyle): void
    def setSrc(url: URL): void
    var size: Int
    var src: SCImgURL
    var usePNGFix: Boolean
}

@js.native
@JSGlobal
abstract class AbstractImgCompanion extends AbstractStatefulCanvasCompanion



