package com.simplesys.SmartClient.Foundation

import com.simplesys.SmartClient.Control.Menu
import com.simplesys.SmartClient.DataBinding.AnimationCallback
import com.simplesys.SmartClient.Forms.FormsItems.CanvasItem
import com.simplesys.SmartClient.Forms.ValuesManager
import com.simplesys.SmartClient.Foundation.AnimateShowEffect.AnimateShowEffect
import com.simplesys.SmartClient.Foundation.Point._
import com.simplesys.SmartClient.Foundation.props.CanvasProps
import com.simplesys.SmartClient.Layout.PrintWindow
import com.simplesys.SmartClient.System.Types._
import com.simplesys.SmartClient.System._
import com.simplesys.SmartClient.Tools.inst.{EditContext, EditNode}
import com.simplesys.isc.System.Types.Alignment._
import com.simplesys.isc.System.Types.AnimationAcceleration.AnimationAcceleration
import com.simplesys.isc.System.Types.BackgroundRepeat._
import com.simplesys.isc.System.Types.ClickMaskMode._
import com.simplesys.isc.System.Types.Cursor._
import com.simplesys.isc.System.Types.DragAppearance._
import com.simplesys.isc.System.Types.DragIntersectStyle._
import com.simplesys.isc.System.Types.DragMaskType._
import com.simplesys.isc.System.Types.DrawPosition._
import com.simplesys.isc.System.Types.EdgeName._
import com.simplesys.isc.System.Types.LocatorStrategy._
import com.simplesys.isc.System.Types.LocatorTypeStrategy._
import com.simplesys.isc.System.Types.Overflow._
import com.simplesys.isc.System.Types.PercentBoxModel._
import com.simplesys.isc.System.Types.Positioning._
import com.simplesys.isc.System.Types.ProportionalResizeMode._
import com.simplesys.isc.System.Types.VerticalAlignment._
import com.simplesys.isc.System.Types.Visibility._
import com.simplesys.isc.System.Types._
import org.scalajs.dom.DocumentEvent
import org.scalajs.dom.html.{Element, Document}
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Canvas extends com.simplesys.SmartClient.System.Class {
    type callbackHandler <: this.type

    val accessKey: String
    def addChild(newChild: Canvas, name: String = js.native, autoDraw: Boolean = js.native): Canvas
    def addPeer(newChild: Canvas, name: String = js.native, autoDraw: Boolean = js.native, preDraw: Boolean = js.native): Canvas
    def addSnapAlignCandidate(newCandidate: Canvas): void
    def adjustForContent(immediate: Boolean): void
    val alwaysShowScrollbars: Boolean
    var animateAcceleration: AnimationAcceleration
    def animateFade(opacity: Int, callback: AnimationCallback = js.native, duration: Int = js.native, acceleration: AnimationAcceleration = js.native): void
    var animateFadeTime: Int
    def animateHide(effect: AnimateShowEffectId | AnimateShowEffect = js.native, callback: AnimationCallback = js.native, duration: Int = js.native, acceleration: AnimationAcceleration = js.native): void
    var animateHideAcceleration: AnimationAcceleration
    var animateHideEffect: AnimateShowEffectId
    var animateHideTime: Int
    def animateMove(left: Int, top: Int, callback: AnimationCallback = js.native, duration: Int = js.native, acceleration: AnimationAcceleration = js.native): void
    var animateMoveAcceleration: AnimationAcceleration
    var animateMoveTime: Int
    def animateRect(left: Int, top: Int, width: Int, height: Int, callback: AnimationCallback = js.native, duration: Int = js.native, acceleration: AnimationAcceleration = js.native): void
    var animateRectAcceleration: AnimationAcceleration
    var animateRectTime: Int
    def animateResize(width: Int, height: Int, callback: AnimationCallback = js.native, duration: Int = js.native, acceleration: AnimationAcceleration = js.native): void
    var animateResizeAcceleration: AnimationAcceleration
    var animateResizeTime: Int
    def animateScroll(scrollLeft: Int, scrollTop: Int, callback: AnimationCallback = js.native, duration: Int = js.native, acceleration: AnimationAcceleration = js.native): void
    var animateScrollAcceleration: AnimationAcceleration
    var animateScrollTime: Int
    def animateShow(effect: AnimateShowEffectId | AnimateShowEffect = js.native, callback: AnimationCallback = js.native, duration: Int = js.native, acceleration: AnimationAcceleration = js.native): void
    var animateShowAcceleration: AnimationAcceleration
    var animateShowEffect: AnimateShowEffectId
    var animateShowTime: Int
    var animateTime: Int
    var appImgDir: URL
    val ariaRole: String
    val ariaState: String
    val autoDraw: Boolean
    var autoShowParent: Boolean
    val backgroundColor: CSSColor
    val backgroundImage: SCImgURL
    val backgroundPosition: String
    val backgroundRepeat: BackgroundRepeat
    def blur(): void
    val border: String
    def bringToFront(): void
    var canAcceptDrop: Boolean
    var canDrag: Boolean
    var canDragReposition: Boolean
    var canDragResize: Boolean
    var canDragScroll: Boolean
    var canDrop: Boolean
    var canDropBefore: Boolean
    val canFocus: Boolean
    var canHover: Boolean
    var canSelectText: Boolean
    val canvasItem: CanvasItem
    val children: js.Array[Canvas]
    var childrenResizeSnapAlign: Boolean
    var childrenSnapAlign: Boolean
    var childrenSnapCenterAlign: Boolean
    var childrenSnapEdgeAlign: Boolean
    var childrenSnapResizeToGrid: Boolean
    var childrenSnapToGrid: Boolean
    def clear(): void
    var click: js.ThisFunction0[callbackHandler, Boolean]
    def clickMaskUp(ID: String = js.native): Boolean
    val componentMask: Canvas with AutoChild
    val componentMaskDefaults: CanvasProps
    def contains(canvas: Canvas, testSelf: Boolean = js.native): Boolean
    def containsEvent(): Boolean
    def containsFocus(): Boolean
    def containsPoint(x: Int, y: Int, withinViewport: Boolean = js.native): Boolean
    var contents: HTMLString
    var contextMenu: Menu
    val cursor: Cursor
    val customEdges: js.Array[String]
    val dataPath: DataPath
    var defaultHeight: Int
    var defaultWidth: Int
    def deparent(): void
    def depeer(): void
    val destroyed: Boolean
    val destroying: Boolean
    def disable(): void
    val disabled: Boolean
    var disabledCursor: Cursor
    val disableTouchScrollingForDrag: Boolean
    var doubleClick: js.ThisFunction0[callbackHandler, Boolean]
    var doubleClickDelay: Int
    var dragAppearance: DragAppearance
    var dragIntersectStyle: DragIntersectStyle
    var dragMaskType: DragMaskType
    var dragMove: js.ThisFunction0[callbackHandler, Boolean]
    var dragOpacity: Int
    var dragRepositionAppearance: DragAppearance
    var dragRepositionCursor: Cursor
    var dragRepositionMove: js.ThisFunction0[callbackHandler, Boolean]
    var dragRepositionStart: js.ThisFunction0[callbackHandler, Boolean]
    var dragRepositionStop: js.ThisFunction0[callbackHandler, Boolean]
    var dragResizeAppearance: DragAppearance
    var dragResizeMove: js.ThisFunction0[callbackHandler, Boolean]
    var dragResizeStart: js.ThisFunction0[callbackHandler, Boolean]
    var dragResizeStop: js.ThisFunction0[callbackHandler, Boolean]
    var dragScrollDelay: Int
    var dragStart: js.ThisFunction0[callbackHandler, Boolean]
    var dragStartDistance: Int
    var dragStop: js.ThisFunction0[callbackHandler, Boolean]
    var dragTarget: Canvas
    var dragType: String
    def draw(): Canvas
    var drop: js.ThisFunction0[callbackHandler, Boolean]
    var dropMove: js.ThisFunction0[callbackHandler, Boolean]
    var dropOut: js.ThisFunction0[callbackHandler, Boolean]
    var dropOver: js.ThisFunction0[callbackHandler, Boolean]
    var dropTypes: js.Array[String] | String
    var dynamicContents: Boolean
    var dynamicContentsVars: ValueMap
    val edgeBackgroundColor: Color
    val edgeCenterBackgroundColor: Color
    var edgeCursorMap: Types.Object
    val edgeImage: SCImgURL
    var edgeMarginSize: Int
    val edgeOffset: Int
    val edgeOpacity: Int
    val edgeShowCenter: Boolean
    val edgeSize: Int
    val editNode: EditNode
    var editProxy: EditNode with AutoChild
    val editProxyConstructor: SCClassName
    def enable(): void
    def encloses(other: Canvas): Boolean
    def enclosesRect(left: Int | js.Array[Int], top: Int, width: Int, height: Int): Boolean
    val extraSpace: Int
    def focus(): void
    var focusChanged: js.ThisFunction1[callbackHandler, Boolean, void]
    def focusInNextTabElement(): void
    def focusInPreviousTabElement(): void
    def getBottom(): Int
    def getByLocalId(localId: String): Canvas
    def getContentElement(): Element
    def getContents(): HTMLElement
    def getFullDataPath(): DataPath
    def getHeight(): Int
    def getHoverComponent(): Canvas
    def getHoverHTML(): HTMLString
    def getHSnapOrigin(snapChild: Canvas = js.native): Int
    def getHSnapPosition(coordinate: Int, direction: String = js.native): Int
    def getImage(identifier: String): DocumentEvent
    def getImgURL(URL: String, imgDir: String = js.native): String
    def getInnerContentHeight(): Int
    def getInnerContentWidth(): Int
    def getInnerHeight(): Int
    def getInnerHTML(): HTMLString
    def getInnerWidth(): Int
    def getLeft(): Int
    def getMasterCanvas(): Canvas
    def getOffsetX(): Int
    def getOffsetY(): Int
    def getOuterElement(): DocumentEvent
    def getPageBottom(): Int
    def getPageLeft(): Int
    def getPageRight(): Int
    def getPageTop(): Int
    def getPanelContainer(): Canvas
    def getParentCanvas(): Canvas
    def getParentElements(): js.Array[Canvas]
    def getPrintHTML(printProperties: PrintProperties = js.native, callback: Callback): HTMLString
    def getRight(): Int
    def getScrollbarSize(): Int
    def getScrollBottom(): Int
    def getScrollHeight(): Int
    def getScrollLeft(): Int
    def getScrollRight(): Int
    def getScrollTop(): Int
    def getScrollWidth(): Int
    def getSnapEdge(): String
    def getSnapTo(): String
    def getTop(): Int
    def getViewportHeight(): Int
    def getViewportWidth(): Int
    def getVisibleHeight(): Int
    def getVisibleWidth(): Int
    def getVSnapOrigin(snapChild: Canvas): Int
    def getVSnapPosition(coordinate: Int, direction: String = js.native): Int
    def getWidth(): Int
    def getZIndex(resolveToNumber: Boolean): Int
    val groupBorderCSS: String
    val groupLabelBackgroundColor: CSSColor
    val groupLabelStyleName: CSSStyleName
    val groupTitle: HTMLString
    def handleHover(): void
    val height: String | Int
    def hide(): void
    def hideClickMask(ID: String = js.native): void
    def hideComponentMask(): void
    def hideContextMenu(): void
    val hideUsingDisplayNone: Boolean
    var hover: js.ThisFunction0[callbackHandler, Boolean]
    var hoverAlign: Alignment
    var hoverAutoDestroy: Boolean
    var hoverDelay: Int
    var hoverHeight: Int
    def hoverHidden(): void
    var hoverMoveWithMouse: Boolean
    var hoverOpacity: Int
    var hoverStyle: CSSStyleName
    var hoverVAlign: VerticalAlignment
    var hoverWidth: Int
    var hoverWrap: Boolean
    val htmlElement: HTMLElement
    val htmlPosition: DrawPosition
    val ID: String
    def imgHTML(src: SCImgURL, width: Int = js.native, height: Int = js.native, name: String = js.native, extraStuff: String = js.native, imgDir: String = js.native): String
    var initWidget: js.ThisFunction0[callbackHandler, void]
    def intersects(other: Canvas): Boolean
    def intersectsRect(left: Int | js.Array[Int], top: Int, width: Int, height: Int): Boolean
    def isDirty(): Boolean
    def isDisabled(): Boolean
    def isDrawn(): Boolean
    def isFocused(): Boolean
    val isGroup: Boolean
    val isPrinting: Boolean
    var isSnapAlignCandidate: Boolean
    def isVisible(): Boolean
    var keepInParentRect: Boolean | js.Array[Int]
    var keyDown: js.ThisFunction0[callbackHandler, Boolean]
    var keyPress: js.ThisFunction0[callbackHandler, Boolean]
    var keyUp: js.ThisFunction0[callbackHandler, Boolean]
    var layoutAlign: Alignment | VerticalAlignment
    def layoutChildren(reason: String): void
    val leavePageSpace: Int
    val left: String | Int
    def linkHTML(href: String, text: HTMLString = js.native, target: String = js.native, ID: String = js.native, tabIndex: Int = js.native, accessKey: String = js.native): HTMLString
    var locateChildrenBy: LocatorStrategy
    var locateChildrenType: LocatorTypeStrategy
    var locatePeersBy: LocatorStrategy
    var locatePeersType: LocatorTypeStrategy
    val margin: Int
    def markForDestroy(): void
    def markForRedraw(reason: String = js.native): void
    val masterElement: Canvas
    var matchElement: Boolean
    var maxHeight: Int
    var maxWidth: Int
    var menuConstructor: SCClassName
    var minHeight: Int
    var minNonEdgeSize: Int
    var minWidth: Int
    var momentumScrollMinSpeed: Int
    var mouseDown: js.ThisFunction0[callbackHandler, Boolean]
    var mouseMove: js.ThisFunction0[callbackHandler, Boolean]
    var mouseOut: js.ThisFunction0[callbackHandler, Boolean]
    var mouseOver: js.ThisFunction0[callbackHandler, Boolean]
    var mouseStillDown: js.ThisFunction0[callbackHandler, Boolean]
    var mouseStillDownDelay: Int
    var mouseStillDownInitialDelay: Int
    var mouseUp: js.ThisFunction0[callbackHandler, Boolean]
    var mouseWheel: js.ThisFunction0[callbackHandler, Boolean]
    def moveAbove(canvas: Canvas): void
    def moveBelow(canvas: Canvas): void
    def moveBy(deltaX: Int, deltaY: Int): Boolean
    var moved: js.ThisFunction2[callbackHandler, Int, Int, void]
    def moveTo(left: Int = js.native, top: Int = js.native): Boolean
    var noDoubleClicks: Boolean
    val opacity: Int
    val overflow: Overflow
    val padding: Int
    def pageScrollDown(): void
    def pageScrollUp(): void
    val parentCanvas: Canvas
    var parentMoved: js.ThisFunction2[callbackHandler, Int, Int, void]
    def parentResized()
    val peers: js.Array[Canvas]
    val percentBox: PercentBoxModel
    val percentSource: Canvas
    def placeNear(left: Int = js.native, top: Int = js.native): void
    var position: Positioning
    var printChildrenAbsolutelyPositioned: Boolean
    var prompt: HTMLString
    val proportionalResizeModifiers: js.Array[KeyName]
    val proportionalResizing: ProportionalResizeMode
    def redraw(reason: String = js.native): void
    var redrawOnResize: Boolean
    def removeChild(child: Canvas, name: String = js.native): void
    def removePeer(peer: Canvas, name: String = js.native): void
    def removeSnapAlignCandidate(candidate: Canvas): void
    val resizeBarTarget: String
    def resizeBy(deltaX: Int = js.native, deltaY: Int = js.native): Boolean
    var resized: js.ThisFunction0[callbackHandler, Boolean]
    var resizeFrom: js.Array[EdgeName]
    def resizeTo(width: Int = js.native, height: Int = js.native): Boolean
    def revealChild(child: Canvas | String): void
    var rightMouseDown: js.ThisFunction0[callbackHandler, Boolean]
    val scrollbarConstructor: String
    val scrollbarSize: Int
    def scrollBy(dX: Int, dY: Int): void
    def scrollByPercent(dX: Int, dY: Int): void
    var scrolled: js.ThisFunction0[callbackHandler, Boolean]
    def scrollTo(left: Int = js.native, top: Int = js.native): Int
    def scrollToBottom(): void
    def scrollToLeft(): void
    def scrollToPercent(left: Int, top: Int): void
    def scrollToRight(): void
    def scrollToTop(): void
    def sendToBack(): void
    def setAccessKey(accessKey: Char): void
    def setAriaState(stateName: String, stateValue: String | Boolean | Int | Double): void
    def setBackgroundColor(newColor: CSSColor): void
    def setBackgroundImage(newImage: URL): void
    def setBorder(newBorder: String): void
    def setBottom(bottom: Int): void
    def setCanFocus(canFocus: Boolean): void
    def setContents(newContents: HTMLString): void
    def setCursor(newCursor: Cursor): void
    def setDataPath(dataPath: DataPath): void
    def setDisabled(disabled: Boolean): void
    var setDragTracker: js.ThisFunction0[callbackHandler, Boolean]
    def setEdgeOpacity(newOpacity: Int): void
    def setEditMode(editingOn: Boolean, editContext: EditContext = js.native, editNode: EditNode = js.native): void
    def setGroupLabelBackgroundColor(groupLabelBackgroundColor: CSSColor): void
    def setGroupTitle(newTitle: HTMLString): void
    def setHeight(height: Int): void
    def setHtmlElement(element: DocumentEvent): void
    def setHtmlPosition(element: DrawPosition): void
    def setImage(identifier: String, URL: SCImgURL = js.native, imgDir: String = js.native): void
    def setLeavePageSpace(newPageSpace: Int): void
    def setLeft(left: Int): void
    def setMargin(margin: Int): void
    def setOpacity(newOpacity: Int): void
    def setOverflow(newOverflow: Overflow): void
    def setPadding(newPadding: Int): void
    def setPageLeft(left: Int): void
    def setPageTop(top: Int): void
    def setPercentSource(sourceWidget: Canvas = js.native): void
    def setRect(left: Int = js.native, top: Int = js.native, width: Int = js.native, height: Int = js.native): void
    def setRight(right: Int): void
    def setShowResizeBar(show: Boolean): void
    def setShowShadow(showShadow: Boolean): void
    def setShowSnapGrid(show: Boolean): void
    def setSnapEdge(snapEdge: String): void
    def setSnapOffsetLeft(snapOffsetLeft: Int): void
    def setSnapOffsetTop(snapOffsetTop: Int): void
    def setSnapTo(snapTo: String): void
    def setStyleName(newStyle: CSSStyleName): void
    def setTabIndex(tabIndex: Int): void
    def setTop(top: Int): void
    def setValuesManager(dataPath: DataPath): void
    def setWidth(width: Int): void
    val shadowDepth: Int
    val shadowImage: Int
    var shadowOffset: Int
    var shadowSoftness: Int
    def shouldDragScroll(): void
    var shouldPrint: Boolean
    def shouldSnapOnDrop(dragTarget: Canvas): Boolean
    def show(): void
    def showClickMask(clickAction: Callback, mode: ClickMaskMode, unmaskedTargets: Canvas | js.Array[Canvas]): String
    def showComponentMask(unmaskedChildren: js.Array[Canvas] = js.native): void
    def showContextMenu ():Boolean
    val showCustomScrollbars: Boolean
    var showDragShadow: Boolean
    val showEdges: Boolean
    var showHover: Boolean
    var showHoverComponents: Boolean
    def showNextTo(otherWidget: Canvas, side: String = js.native, canOcclude: Boolean = js.native, skipAnimation: Boolean = js.native): void
    def showRecursively(): void
    var showResizeBar: Boolean
    var showShadow: Boolean
    var showSnapGrid: Boolean
    var shrinkElementOnHide: Boolean
    var skinImgDir: URL
    var snapAlignCandidates: js.Array[Canvas]
    val snapAlignCenterLineStyle: String
    val snapAlignEdgeLineStyle: String
    var snapAxis: String
    var snapEdge: String
    val snapHDirection: String
    var snapHGap: Int
    var snapOffsetLeft: Int
    var snapOffsetTop: Int
    var snapOnDrop: Int
    var snapResizeToAlign: Int
    var snapResizeToGrid: Int
    var snapTo: String
    var snapToAlign: Boolean
    var snapToCenterAlign: Boolean
    var snapToEdgeAlign: Boolean
    var snapToGrid: Boolean
    var snapVDirection: String
    var snapVGap: Int
    var styleName: CSSStyleName
    var tabIndex: Int
    val top: Int | String
    val topElement: Canvas
    def updateEditNode(editContext: EditContext, editNode: EditNode): void
    def updateHover(hoverHTML: HTMLString = js.native): void
    var useBackMask: Boolean
    var useDragMask: Boolean
    var useNativeDrag: Boolean
    val useOpacityFilter: Boolean
    val useTouchScrolling: Boolean
    var valuesManager: ValuesManager
    var visibility: Visibility
    var visibilityChanged: js.ThisFunction1[callbackHandler, Boolean, void]
    def visibleAtPoint(x: Int, y: Int, withinViewport: Boolean = js.native, ignoreWidgets: Canvas = js.native, upToParent: Canvas = js.native): Boolean
    val width: Int | String
    def willAcceptDrop(): Boolean
}

@js.native
abstract class AbstractCanvasCompanion extends AbstractClassCompanion {
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
    def printComponents(components: js.Array[Canvas], printProperties: PrintProperties = js.native): void = js.native
    def setAllowExternalFilters(allExternalFilters: Boolean): void = js.native
    def setDefaultPageSpace(newDefaultPageSpace: Int): void = js.native
    def setNeverUseFilters(neverUseFilters: Boolean): void = js.native
    def showPrintPreview(components: js.Array[Canvas], printProperties: PrintProperties = js.native, printWindowProperties: PrintWindow = js.native, callback: Callback = js.native, separator: String): void = js.native
    val TAB_INDEX_FLOOR: Int = js.native
}
