package com.simplesys.SmartClient.Foundation

import com.simplesys.SmartClient.Foundation.Point.Point
import com.simplesys.SmartClient.Foundation.PrintProperties.PrintProperties
import com.simplesys.SmartClient.Foundation.inst._
import com.simplesys.SmartClient.Foundation.props.CanvasProps
import com.simplesys.SmartClient.Layout.inst.PrintWindow
import com.simplesys.SmartClient.System.Types.Callback
import com.simplesys.SmartClient.System.props.AbstractPropsClass
import com.simplesys.SmartClient.System.{AbstractClassCompanion, Types}
import com.simplesys.isc.System.Types.EdgeName.EdgeName
import com.simplesys.isc.System.Types.{HTMLString, SCImgURL}
import com.simplesys.macros.PropsToMap

import scala.reflect.ClassTag
import scala.scalajs.js
import scala.scalajs.js.|

@js.native
abstract class AbstractCanvasCompanion[T <: Types.Object, P <: AbstractPropsClass](implicit ct: ClassTag[T]) extends AbstractClassCompanion[T, P] {
    var allowExternalFilters: Boolean = js.native
    var defaultPageSpace: Int = js.native
    def getById(ID: String): Canvas = js.native
    def getEventEdge(edgeMask: EdgeName = js.native): EdgeName = js.native
    def getPrintHTML(components: js.Array[Canvas], printProperties: PrintProperties, callback: Callback, separator: String = js.native): HTMLString = js.native
    def getPrintPreview(components: js.Array[Canvas], printProperties: PrintProperties = js.native, previewProperties: Canvas = js.native, callback: Callback = js.native, separator: String = js.native): HTMLString = js.native
    def getSnapPosition(target: Canvas | js.Array[Int], snapTo: String, snapper: Canvas | js.Array[Int], snapEdge: String = js.native): Point = js.native
    def hiliteCharacter(string: String, character: Char, hilitePrefix: String = js.native, hiliteSuffix: String = js.native): String = js.native
    var loadingImageSize: Int = js.native
    var loadingImageSrc: SCImgURL = js.native
    val neverUseFilters: Boolean = js.native
    val neverUsePNGWorkaround: Boolean = js.native
    def printComponents(components: js.Array[Canvas], printProperties: PrintProperties = js.native): Unit = js.native
    def setAllowExternalFilters(allExternalFilters: Boolean): Unit = js.native
    def setDefaultPageSpace(newDefaultPageSpace: Int): Unit = js.native
    def setNeverUseFilters(neverUseFilters: Boolean): Unit = js.native
    def showPrintPreview(components: js.Array[Canvas], printProperties: PrintProperties = js.native, printWindowProperties: PrintWindow = js.native, callback: Callback = js.native, separator: String): Unit = js.native
    val TAB_INDEX_FLOOR: Int = js.native
}

@js.native
object Canvas extends AbstractCanvasCompanion[Canvas, CanvasProps] {
}

