package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Control.ImgButton
import com.simplesys.SmartClient.Foundation.{Img, Canvas, AbstractCanvasCompanion, Label}
import com.simplesys.SmartClient.System.Types
import com.simplesys.isc.System.Types.AnimationAcceleration.AnimationAcceleration
import com.simplesys.isc.System.Types.ContentLayoutPolicy.ContentLayoutPolicy
import com.simplesys.isc.System.Types.PanelPlacement.PanelPlacement
import com.simplesys.isc.System.Types._

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Window extends Layout {
    def addItem(item: Canvas): js.Array[Canvas]
    def addItems(items: js.Array[Canvas]): js.Array[Canvas]
    var animateMinimize: Boolean
    var autoCenter: Boolean
    var autoSize: Boolean
    val body: Canvas with AutoChild
    var bodyColor: CSSColor
    var bodyConstructor: String
    var bodyDefaults: Types.Object
    var bodyStyle: CSSStyleName
    var bringToFrontOnMouseUp: Boolean
    var canFocusInHeaderButtons: Boolean
    def centerInPage(): Unit
    def close(): Unit
    val closeButton: ImgButton with AutoChild
    var closeClick: js.ThisFunction0[callbackHandler, Boolean]
    var contentLayout: ContentLayoutPolicy
    val contentsType: String
    var defaultMinimizeHeight: Int
    var dismissOnEscape: Boolean
    var dismissOnOutsideClick: Boolean
    val fillSpaceStyleName: CSSStyleName
    def flash(): Unit
    val footer: HLayout with AutoChild
    val footerControls: js.Array[String]
    val footerHeight: Int
    val header: HLayout with AutoChild
    val headerBackground: Img with AutoChild
    val headerControls: js.Array[String]
    val headerIcon: Img with AutoChild
    var headerIconDefaults: Types.Object
    val headerLabel: Label with AutoChild
    var headerLabelDefaults: Types.Object
    var headerSrc: SCImgURL
    var headerStyle: CSSStyleName
    var hiliteBodyColor: CSSColor
    var hiliteHeaderSrc: SCImgURL
    var hiliteHeaderStyle: CSSStyleName
    var isModal: Boolean
    val items: js.Array[Canvas]
    def maximize(): Unit
    val maximizeButton: ImgButton with AutoChild
    var maximized: Boolean
    def minimize(): Unit
    var minimizeAcceleration: AnimationAcceleration
    val minimizeButton: ImgButton with AutoChild
    val minimized: Boolean
    var minimizeHeight: Int
    var minimizeTime: Int
    val modalMask: Canvas with AutoChild
    val modalMaskOpacity: Int
    val modalMaskStyle: String
    val placement: PanelPlacement
    val printBodyStyle: CSSStyleName
    val printHeaderStyle: CSSStyleName
    def removeItem(item: Canvas): js.Array[Canvas]
    def removeItems(items: js.Array[Canvas]): js.Array[Canvas]
    val resizer: ImgButton with AutoChild
    def restore(): Unit
    val restoreButton: ImgButton with AutoChild
    def setAutoSize(autoSize: Boolean): Unit
    def setBodyColor(newBodyColor: CSSColor): Unit
    def setBodyStyle(newBodyStyle: CSSStyleName): Unit
    def setHeaderStyle(newHeaderStyle: CSSStyleName): Unit
    def setHiliteBodyColor(newHiliteBodyColor: CSSColor): Unit
    def setShowCloseButton(): Unit
    def setShowHeaderIcon(): Unit
    def setShowMaximizeButton(): Unit
    def setShowMinimizeButton(): Unit
    def setSrc(url: String): Unit
    def setStatus(statusString: String): Unit
    def setTitle(newTitle: String): Unit
    def shouldDismissOnEscape(): Unit
    var showBody: Boolean
    var showCloseButton: Boolean
    var showFooter: Boolean
    val showHeader: Boolean
    val showHeaderBackground: Boolean
    var showHeaderIcon: Boolean
    var showMinimizeButton: Boolean
    val showModalMask: Boolean
    var showResizer: Boolean
    var showStatusBar: Boolean
    var showTitle: Boolean
    var src: String
    var status: String
    val statusBar: Canvas with AutoChild
    var title: HTMLString
}

@js.native
abstract trait AbstractWindowCompanion extends AbstractCanvasCompanion {
}

@js.native
object Window extends AbstractWindowCompanion        
