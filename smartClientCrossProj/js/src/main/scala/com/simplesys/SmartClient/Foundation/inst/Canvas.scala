package com.simplesys.SmartClient.Foundation.inst

import com.simplesys.SmartClient.Control.inst.Menu
import com.simplesys.SmartClient.DataBinding.AnimationCallback
import com.simplesys.SmartClient.Forms.FormsItems.inst.CanvasItem
import com.simplesys.SmartClient.Foundation.props.CanvasProps
import com.simplesys.SmartClient.System
import com.simplesys.SmartClient.System.Number._
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types.{Callback, ValueMap}
import com.simplesys.SmartClient.System.inst.{PrintProperties, Class}
import com.simplesys.SmartClient.Tools.inst.{EditContext, EditNode}
import com.simplesys.isc.System.Types.Alignment.Alignment
import com.simplesys.isc.System.Types.BackgroundRepeat.BackgroundRepeat
import com.simplesys.isc.System.Types.Cursor.Cursor
import com.simplesys.isc.System.Types.DragAppearance.DragAppearance
import com.simplesys.isc.System.Types.DragIntersectStyle.DragIntersectStyle
import com.simplesys.isc.System.Types.DragMaskType.DragMaskType
import com.simplesys.isc.System.Types.DrawPosition.DrawPosition
import com.simplesys.isc.System.Types.EdgeName.EdgeName
import com.simplesys.isc.System.Types.LocatorStrategy.LocatorStrategy
import com.simplesys.isc.System.Types.LocatorTypeStrategy.LocatorTypeStrategy
import com.simplesys.isc.System.Types.Overflow.Overflow
import com.simplesys.isc.System.Types.PercentBoxModel.PercentBoxModel
import com.simplesys.isc.System.Types.Positioning.Positioning
import com.simplesys.isc.System.Types.ProportionalResizeMode.ProportionalResizeMode
import com.simplesys.isc.System.Types.VerticalAlignment.VerticalAlignment
import com.simplesys.isc.System.Types._
import com.simplesys.isc.System.Types.AnimationAcceleration.AnimationAcceleration
import com.simplesys.SmartClient.Foundation.AnimateShowEffect._
import org.scalajs.dom.raw.{HTMLElement, DocumentEvent}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Canvas extends Class {
    type canvasHandler <: this.type

    var accessKey: String
    def addChild(newChild: Canvas, name: String = js.native, autoDraw: Boolean = js.native): Canvas
    def addPeer(newChild: Canvas, name: String = js.native, autoDraw: Boolean = js.native, preDraw: Boolean = js.native): Canvas
    def addSnapAlignCandidate(newCandidate: Canvas): Unit
    def adjustForContent(immediate: Boolean): Unit
    val alwaysShowScrollbars: Boolean
    var animateAcceleration: AnimationAcceleration
    def animateFade(opacity: Int, callback: AnimationCallback = js.native, duration: Int = js.native, acceleration: AnimationAcceleration = js.native): Unit
    var animateFadeTime: Number
    def animateHide(effect: AnimateShowEffectId | AnimateShowEffect = js.native, callback: AnimationCallback = js.native, duration: Int = js.native, acceleration: AnimationAcceleration = js.native): Unit
    var animateHideAcceleration: AnimationAcceleration
    var animateHideEffect: AnimateShowEffectId
    var animateHideTime: Number
    def animateMove(left: Int, top: Int, callback: AnimationCallback = js.native, duration: Int = js.native, acceleration: AnimationAcceleration = js.native): Unit
    var animateMoveAcceleration: AnimationAcceleration
    var animateMoveTime: Number
    def animateRect(left: Int, top: Int, width: Int, height: Int, callback: AnimationCallback = js.native, duration: Int = js.native, acceleration: AnimationAcceleration = js.native): Unit
    var animateRectAcceleration: AnimationAcceleration
    var animateRectTime: Number
    def animateResize(width: Int, height: Int, callback: AnimationCallback = js.native, duration: Int = js.native, acceleration: AnimationAcceleration = js.native): Unit
    var animateResizeAcceleration: AnimationAcceleration
    var animateResizeTime: Number
    def animateScroll(scrollLeft: Int, scrollTop: Int, callback: AnimationCallback = js.native, duration: Int = js.native, acceleration: AnimationAcceleration = js.native): Unit
    var animateScrollAcceleration: AnimationAcceleration
    var animateScrollTime: Number
    def animateShow(effect: AnimateShowEffectId | AnimateShowEffect = js.native, callback: AnimationCallback = js.native, duration: Int = js.native, acceleration: AnimationAcceleration = js.native): Unit
    var animateShowAcceleration: AnimationAcceleration
    var animateShowEffect: AnimateShowEffectId
    var animateShowTime: Number
    var animateTime: Number
    var appImgDir: URL
    val ariaRole: String
    val ariaState: String
    val autoDraw: Boolean
    var autoShowParent: Boolean
    var backgroundColor: CSSColor
    var backgroundImage: SCImgURL
    val backgroundPosition: String
    val backgroundRepeat: BackgroundRepeat
    def blur(): Unit
    var border: String
    def bringToFront(): Unit
    var canAcceptDrop: Boolean
    var canDrag: Boolean
    var canDragReposition: Boolean
    var canDragResize: Boolean
    var canDragScroll: Boolean
    var canDrop: Boolean
    var canDropBefore: Boolean
    var canFocus: Boolean
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
    def clear(): Unit
    var click: js.ThisFunction0[canvasHandler, Boolean]
    def clickMaskUp(ID: String = js.native): Boolean
    val componentMask: Canvas with AutoChild
    val componentMaskDefaults: CanvasProps
    def contains(canvas: Canvas, testSelf: Boolean = js.native): Boolean
    def containsEvent(): Boolean
    def containsFocus(): Boolean
    def containsPoint(x: Int, y: Int, withinViewport: Boolean = js.native): Boolean
    var contents: HTMLString
    var contextMenu: Menu
    var cursor = Cursor
    val customEdges: js.Array[String]
    var dataPath: DataPath
    var defaultHeight: Int
    var defaultWidth: Int
    def deparent(): Unit
    def depeer(): Unit
    val destroyed: Boolean
    val destroying: Boolean
    def disable(): Unit
    var disabled: Boolean
    var disabledCursor: Cursor
    val disableTouchScrollingForDrag: Boolean
    var doubleClick: js.ThisFunction0[canvasHandler, Boolean]
    var doubleClickDelay: Int
    var dragAppearance: DragAppearance
    var dragIntersectStyle: DragIntersectStyle
    var dragMaskType: DragMaskType
    var dragMove: js.ThisFunction0[canvasHandler, Boolean]
    var dragOpacity: Int
    var dragRepositionAppearance: DragAppearance
    var dragRepositionCursor: Cursor
    var dragRepositionMove: js.ThisFunction0[canvasHandler, Boolean]
    var dragRepositionStart: js.ThisFunction0[canvasHandler, Boolean]
    var dragRepositionStop: js.ThisFunction0[canvasHandler, Boolean]
    var dragResizeAppearance: DragAppearance
    var dragResizeMove: js.ThisFunction0[canvasHandler, Boolean]
    var dragResizeStart: js.ThisFunction0[canvasHandler, Boolean]
    var dragResizeStop: js.ThisFunction0[canvasHandler, Boolean]
    var dragScrollDelay: Number
    var dragStart: js.ThisFunction0[canvasHandler, Boolean]
    var dragStartDistance: Number
    var dragStop: js.ThisFunction0[canvasHandler, Boolean]
    var dragTarget: Canvas
    var dragType: String
    def draw(): Canvas
    var drop: js.ThisFunction0[canvasHandler, Boolean]
    var dropMove: js.ThisFunction0[canvasHandler, Boolean]
    var dropOut: js.ThisFunction0[canvasHandler, Boolean]
    var dropOver: js.ThisFunction0[canvasHandler, Boolean]
    var dropTypes: js.Array[String] | String
    var dynamicContents: Boolean
    var dynamicContentsVars: ValueMap
    val edgeBackgroundColor: Color
    val edgeCenterBackgroundColor: Color
    var edgeCursorMap: Types.Object
    val edgeImage: SCImgURL
    var edgeMarginSize: Number
    val edgeOffset: Number
    val edgeOpacity: Number
    val edgeShowCenter: Boolean
    val edgeSize: Number
    val editNode: EditNode
    var editProxy: EditNode with AutoChild
    val editProxyConstructor: SCClassName
    def enable(): Unit
    def encloses(other: Canvas): Boolean
    def enclosesRect(left: Number | js.Array[Number], top: Number, width: Number, height: Number): Boolean
    val extraSpace: Int
    def focus(): Unit
    var focusChanged: js.ThisFunction1[canvasHandler, Boolean, Unit]
    def focusInNextTabElement(): Unit
    def focusInPreviousTabElement(): Unit
    def getBottom(): Number
    def getByLocalId(localId: String): Canvas
    def getContentElement(): DocumentEvent
    def getContents(): HTMLElement
    def getFullDataPath(): DataPath
    def getHeight(): Number
    def getHoverComponent(): Canvas
    def getHoverHTML(): HTMLString
    def getHSnapOrigin(snapChild: Canvas = js.native): Int
    def getHSnapPosition(coordinate: Int, direction: String = js.native): Int
    def getImage(identifier: String): DocumentEvent
    def getImgURL(URL: String, imgDir: String = js.native): String
    def getInnerContentHeight(): Number
    def getInnerContentWidth(): Number
    def getInnerHeight(): Number
    def getInnerHTML(): HTMLString
    def getInnerWidth(): Number
    def getLeft(): Number
    def getMasterCanvas(): Canvas
    def getOffsetX(): Number
    def getOffsetY(): Number
    def getOuterElement(): DocumentEvent
    def getPageBottom(): Number
    def getPageLeft(): Number
    def getPageRight(): Number
    def getPageTop(): Number
    def getPanelContainer(): Canvas
    def getParentCanvas(): Canvas
    def getParentElements(): js.Array[Canvas]
    def getPrintHTML(printProperties: PrintProperties = js.native, callback: Callback): HTMLString
    def getRight(): Number
    def getScrollbarSize(): Number
    def getScrollBottom(): Number
    def getScrollHeight(): Number
    def getScrollLeft(): Number
    def getScrollRight(): Number
    def getScrollTop(): Number
    def getScrollWidth(): Number
    def getSnapEdge(): String
    def getSnapTo(): String
    def getTop(): Number
    def getViewportHeight(): Number
    def getViewportWidth(): Number
    def getVisibleHeight(): Number
    def getVisibleWidth(): Number
    def getVSnapOrigin(snapChild: Canvas): Number
    def getVSnapPosition(coordinate: Int, direction: String = js.native): Number
    def getWidth(): Number
    def getZIndex(resolveToNumber: Boolean): Number
    val groupBorderCSS: String
    var groupLabelBackgroundColor: CSSColor
    val groupLabelStyleName: CSSStyleName
    var groupTitle: HTMLString
    def handleHover(): Unit
    var height: String | Number
    def hide(): Unit
    def hideClickMask(ID: String = js.native): Unit
    def hideComponentMask(): Unit
    def hideContextMenu(): Unit
    val hideUsingDisplayNone: Boolean
    var hover: js.ThisFunction0[canvasHandler, Boolean]
    var hoverAlign: Alignment
    var hoverAutoDestroy: Boolean
    var hoverDelay: Number
    var hoverHeight: Int
    def hoverHidden(): Unit
    var hoverMoveWithMouse: Boolean
    var hoverOpacity: Number
    var hoverStyle: CSSStyleName
    var hoverVAlign: VerticalAlignment
    var hoverWidth: Int
    var hoverWrap: Boolean
    var htmlElement: HTMLElement
    var htmlPosition: DrawPosition
    val ID: String
    def imgHTML(src: SCImgURL, width: Number = js.native, height: Number = js.native, name: String = js.native, extraStuff: String = js.native, imgDir: String = js.native): String
    def init(arguments: js.Dictionary[js.Any]): Unit
    def initWidget(arguments: js.Dictionary[js.Any]): Unit
    def intersects(other: Canvas): Boolean
    def intersectsRect(left: Number | js.Array[Number], top: Number, width: Number, height: Number): Boolean
    def isDirty(): Boolean
    def isDisabled(): Boolean
    def isDrawn(): Boolean
    def isFocused(): Boolean
    val isGroup: Boolean
    val isPrinting: Boolean
    var isSnapAlignCandidate: Boolean
    def isVisible(): Boolean
    var keepInParentRect: Boolean | VerticalAlignment
    var keyDown: js.ThisFunction0[canvasHandler, Boolean]
    var keyPress: js.ThisFunction0[canvasHandler, Boolean]
    var keyUp: js.ThisFunction0[canvasHandler, Boolean]
    var layoutAlign: Alignment | VerticalAlignment
    def layoutChildren(reason: String): Unit
    var leavePageSpace: Int
    var left: String | Number
    def linkHTML(href: String, text: HTMLString = js.native, target: String = js.native, ID: String = js.native, tabIndex: Int = js.native, accessKey: String = js.native): HTMLString
    var locateChildrenBy: LocatorStrategy
    var locateChildrenType: LocatorTypeStrategy
    var locatePeersBy: LocatorStrategy
    var locatePeersType: LocatorTypeStrategy
    var margin: Number
    def markForDestroy(): Unit
    def markForRedraw(reason: String = js.native): Unit
    val masterElement: Canvas
    var matchElement: Boolean
    var maxHeight: Number
    var maxWidth: Number
    var menuConstructor: SCClassName
    var minHeight: Number
    var minNonEdgeSize: Number
    var minWidth: Number
    var momentumScrollMinSpeed: Number
    var mouseDown: js.ThisFunction0[canvasHandler, Boolean]
    var mouseMove: js.ThisFunction0[canvasHandler, Boolean]
    var mouseOut: js.ThisFunction0[canvasHandler, Boolean]
    var mouseOver: js.ThisFunction0[canvasHandler, Boolean]
    var mouseStillDown: js.ThisFunction0[canvasHandler, Boolean]
    var mouseStillDownDelay: Number
    var mouseStillDownInitialDelay: Number
    var mouseUp: js.ThisFunction0[canvasHandler, Boolean]
    var mouseWheel: js.ThisFunction0[canvasHandler, Boolean]
    def moveAbove(canvas: Canvas): Unit
    def moveBelow(canvas: Canvas): Unit
    def moveBy(deltaX: Number, deltaY: Number): Boolean
    var moved: js.ThisFunction2[canvasHandler, Number, Number, Unit]
    def moveTo(left: Number = js.native, top: Number = js.native): Boolean
    var noDoubleClicks: Boolean
    var opacity: Number
    var overflow: Overflow
    var padding: Number
    def pageScrollDown(): Unit
    def pageScrollUp(): Unit
    val parentCanvas: Canvas
    var parentMoved: js.ThisFunction2[canvasHandler, Number, Number, Unit]
    def parentResized()
    val peers: js.Array[Canvas]
    val percentBox: PercentBoxModel
    var percentSource: Canvas
    def placeNear(left: Number = js.native, top: Number = js.native): Unit
    var position: Positioning
    var printChildrenAbsolutelyPositioned: Boolean
    var prompt: HTMLString
    val proportionalResizeModifiers: js.Array[KeyName]
    val proportionalResizing: ProportionalResizeMode
    def redraw(reason: String = js.native): Unit
    var redrawOnResize: Boolean
    def removeChild(child: Canvas, name: String = js.native): Unit
    def removePeer(peer: Canvas, name: String = js.native): Unit
    def removeSnapAlignCandidate(candidate: Canvas): Unit
    val resizeBarTarget: String
    def resizeBy(deltaX: Number = js.native, deltaY: Number = js.native): Boolean
    var resized: js.ThisFunction0[canvasHandler, Boolean]
    var resizeFrom: js.Array[EdgeName]
    def resizeTo(width: Number = js.native, height: Number = js.native): Boolean
    def revealChild(child: Canvas | String): Unit
    var rightMouseDown: js.ThisFunction0[canvasHandler, Boolean]
    val scrollbarConstructor: String
    val scrollbarSize: Number
    def scrollBy(dX: Number, dY: Number): Unit
    def scrollByPercent(dX: Number, dY: Number): Unit
    var scrolled: js.ThisFunction0[canvasHandler, Boolean]
    def scrollTo(left: Number = js.native, top: Number = js.native): Number
    def scrollToBottom(): Unit
    def scrollToLeft(): Unit
    def scrollToPercent(left: Number, top: Number): Unit
    def scrollToRight(): Unit
    def scrollToTop(): Unit
    def sendToBack(): Unit
    def setAccessKey(accessKey: Char): Unit
    def setAriaState(stateName: String, stateValue: String | Boolean | Int | Double): Unit
    def setBackgroundColor(newColor: CSSColor): Unit
    def setBackgroundImage(newImage: URL): Unit
    def setBorder(newBorder: String): Unit
    def setBottom(bottom: Number): Unit
    def setCanFocus(canFocus: Boolean): Unit
    def setContents(newContents: HTMLString): Unit
    def setCursor(newCursor: Cursor): Unit
    def setDataPath(dataPath: DataPath): Unit
    def setDisabled(disabled: Boolean): Unit
    var setDragTracker: js.ThisFunction0[canvasHandler, Boolean]
    def setEdgeOpacity(newOpacity: Number): Unit
    def setEditMode(editingOn: Boolean, editContext: EditContext = js.native, editNode: EditNode = js.native): Unit
    def setGroupLabelBackgroundColor(groupLabelBackgroundColor: CSSColor): Unit
    def setGroupTitle(newTitle: HTMLString): Unit
    def setHeight(height: Number): Unit
    def setHtmlElement(element: DocumentEvent): Unit
    def setHtmlPosition(element: DrawPosition): Unit
    def setImage(identifier: String, URL: SCImgURL = js.native, imgDir: String = js.native): Unit
    def setLeavePageSpace(newPageSpace: Int): Unit
    def setLeft(left: Number): Unit
    def setMargin(margin: Number): Unit
    def setOpacity(newOpacity: Number): Unit
    def setOverflow(newOverflow: Overflow): Unit
    def setPadding(newPadding: Number): Unit
    def setPageLeft(left: Number): Unit
    def setPageTop(top: Number): Unit
    def setPercentSource(sourceWidget: Canvas = js.native): Unit
    def setRect(left: Number = js.native, top: Number = js.native, width: Number = js.native, height: Number = js.native): Unit
    def setRight(right: Number): Unit
    def setShowResizeBar(show: Boolean): Unit
    def setShowShadow(showShadow: Boolean): Unit
    def setShowSnapGrid(show: Boolean): Unit
    def setSnapEdge(snapEdge: String): Unit
    def setSnapOffsetLeft(snapOffsetLeft: Int): Unit
    def setSnapOffsetTop(snapOffsetTop: Int): Unit
    def setSnapTo(snapTo: String): Unit
    def setStyleName(newStyle: CSSStyleName): Unit
    def setTabIndex (tabIndex:Number) : Unit
    def setTop (top:Number):Unit
    def  setValuesManager (dataPath:DataPath):Unit
    def  setWidth (width:Number):Unit
    val shadowDepth:Number
    val shadowImage:Number
    var shadowOffset:Number
    var shadowSoftness:Number
    def shouldDragScroll () :Unit
    var shouldPrint:Boolean
    def shouldSnapOnDrop (dragTarget:Canvas):Boolean
    def show ():Unit
    def showClickMask (clickAction:Callback, mode, unmaskedTargets)
}
