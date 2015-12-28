package com.simplesys.SmartClient.Foundation.props

import com.simplesys.SmartClient.Control.inst.Menu
import com.simplesys.SmartClient.DataBinding.AnimationCallback
import com.simplesys.SmartClient.Forms.FormsItems.inst.CanvasItem
import com.simplesys.SmartClient.Forms.inst.ValuesManager
import com.simplesys.SmartClient.Foundation.AnimateShowEffect._
import com.simplesys.SmartClient.Foundation.inst.Canvas
import com.simplesys.SmartClient.System.Number._
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types._
import com.simplesys.SmartClient.System.inst.PrintProperties
import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.SmartClient.Tools.inst.{EditContext, EditNode}
import com.simplesys.SmartClient.option.{ScNone, ScOption}
import com.simplesys.isc.System.Types.Alignment
import com.simplesys.isc.System.Types.Alignment._
import com.simplesys.isc.System.Types.AnimationAcceleration.AnimationAcceleration
import com.simplesys.isc.System.Types.AnimationAcceleration._
import com.simplesys.isc.System.Types.BackgroundRepeat._
import com.simplesys.isc.System.Types.ClickMaskMode._
import com.simplesys.isc.System.Types.Cursor
import com.simplesys.isc.System.Types.Cursor._
import com.simplesys.isc.System.Types.DragAppearance
import com.simplesys.isc.System.Types.DragAppearance._
import com.simplesys.isc.System.Types.DragIntersectStyle._
import com.simplesys.isc.System.Types.DragMaskType._
import com.simplesys.isc.System.Types.DrawPosition
import com.simplesys.isc.System.Types.DrawPosition._
import com.simplesys.isc.System.Types.EdgeName._
import com.simplesys.isc.System.Types.LocatorStrategy
import com.simplesys.isc.System.Types.LocatorStrategy._
import com.simplesys.isc.System.Types.LocatorTypeStrategy
import com.simplesys.isc.System.Types.LocatorTypeStrategy._
import com.simplesys.isc.System.Types.Overflow
import com.simplesys.isc.System.Types.Overflow._
import com.simplesys.isc.System.Types.PercentBoxModel._
import com.simplesys.isc.System.Types.Positioning._
import com.simplesys.isc.System.Types.ProportionalResizeMode._
import com.simplesys.isc.System.Types.VerticalAlignment
import com.simplesys.isc.System.Types.VerticalAlignment._
import com.simplesys.isc.System.Types.Visibility._
import com.simplesys.isc.System.Types._
import org.scalajs.dom.raw.{HTMLElement, DocumentEvent}

import scala.scalajs.js

class CanvasProps extends ClassProps {
    val accessKey: ScOption[String] = ScNone
    val alwaysShowScrollbars: ScOption[Boolean] = ScNone
    var animateAcceleration: ScOption[AnimationAcceleration] = ScNone
    var animateFadeTime: ScOption[Number] = ScNone
    var animateHideAcceleration: ScOption[AnimationAcceleration] = ScNone
    var animateHideEffect: ScOption[AnimateShowEffectId] = ScNone
    var animateHideTime: ScOption[Number] = ScNone
    var animateMoveAcceleration: ScOption[AnimationAcceleration] = ScNone
    var animateMoveTime: ScOption[Number] = ScNone
    var animateRectAcceleration: ScOption[AnimationAcceleration] = ScNone
    var animateRectTime: ScOption[Number] = ScNone
    var animateResizeAcceleration: ScOption[AnimationAcceleration] = ScNone
    var animateResizeTime: ScOption[Number] = ScNone
    var animateScrollAcceleration: ScOption[AnimationAcceleration] = ScNone
    var animateScrollTime: ScOption[Number] = ScNone
    var animateShowAcceleration: ScOption[AnimationAcceleration] = ScNone
    var animateShowEffect: ScOption[AnimateShowEffectId] = ScNone
    var animateShowTime: ScOption[Number] = ScNone
    var animateTime: ScOption[Number] = ScNone
    var appImgDir: ScOption[URL] = ScNone
    val ariaRole: ScOption[String] = ScNone
    val ariaState: ScOption[String] = ScNone
    val autoDraw: ScOption[Boolean] = ScNone
    var autoShowParent: ScOption[Boolean] = ScNone
    val backgroundColor: ScOption[CSSColor] = ScNone
    val backgroundImage: ScOption[SCImgURL] = ScNone
    val backgroundPosition: ScOption[String] = ScNone
    val backgroundRepeat: ScOption[BackgroundRepeat] = ScNone
    val border: ScOption[String] = ScNone
    var canAcceptDrop: ScOption[Boolean] = ScNone
    var canDrag: ScOption[Boolean] = ScNone
    var canDragReposition: ScOption[Boolean] = ScNone
    var canDragResize: ScOption[Boolean] = ScNone
    var canDragScroll: ScOption[Boolean] = ScNone
    var canDrop: ScOption[Boolean] = ScNone
    var canDropBefore: ScOption[Boolean] = ScNone
    val canFocus: ScOption[Boolean] = ScNone
    var canHover: ScOption[Boolean] = ScNone
    var canSelectText: ScOption[Boolean] = ScNone
    val canvasItem: ScOption[CanvasItem] = ScNone
    val children: ScOption[js.Array[Canvas]] = ScNone
    var childrenResizeSnapAlign: ScOption[Boolean] = ScNone
    var childrenSnapAlign: ScOption[Boolean] = ScNone
    var childrenSnapCenterAlign: ScOption[Boolean] = ScNone
    var childrenSnapEdgeAlign: ScOption[Boolean] = ScNone
    var childrenSnapResizeToGrid: ScOption[Boolean] = ScNone
    var childrenSnapToGrid: ScOption[Boolean] = ScNone
    val click: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val componentMask: ScOption[Canvas with AutoChild] = ScNone
    val componentMaskDefaults: ScOption[CanvasProps] = ScNone
    var contents: ScOption[HTMLString] = ScNone
    var contextMenu: ScOption[Menu] = ScNone
    val cursor: ScOption[Cursor] = ScNone
    val customEdges: ScOption[js.Array[String]] = ScNone
    val dataPath: ScOption[DataPath] = ScNone
    var defaultHeight: ScOption[Int] = ScNone
    var defaultWidth: ScOption[Int] = ScNone
    val destroyed: ScOption[Boolean] = ScNone
    val destroying: ScOption[Boolean] = ScNone
    val disabled: ScOption[Boolean] = ScNone
    var disabledCursor: ScOption[Cursor] = ScNone
    val disableTouchScrollingForDrag: ScOption[Boolean] = ScNone
    var doubleClick: ScOption[Function[Canvas#canvasHandler, Boolean]] = ScNone
    var doubleClickDelay: ScOption[Int] = ScNone
    var dragAppearance: ScOption[DragAppearance] = ScNone
    var dragIntersectStyle: ScOption[DragIntersectStyle] = ScNone
    var dragMaskType: ScOption[DragMaskType] = ScNone
    var dragMove: ScOption[Function[Canvas#canvasHandler, Boolean]] = ScNone
    var dragOpacity: ScOption[Int] = ScNone
    var dragRepositionAppearance: ScOption[DragAppearance] = ScNone
    var dragRepositionCursor: ScOption[Cursor] = ScNone
    var dragRepositionMove: ScOption[Function[Canvas#canvasHandler, Boolean]] = ScNone
    var dragRepositionStart: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var dragRepositionStop: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var dragResizeAppearance: ScOption[DragAppearance] = ScNone
    var dragResizeMove: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var dragResizeStart: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var dragResizeStop: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var dragScrollDelay: ScOption[Number] = ScNone
    var dragStart: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var dragStartDistance: ScOption[Number] = ScNone
    var dragStop: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var dragTarget: ScOption[Canvas] = ScNone
    var dragType: ScOption[String] = ScNone
    var drop: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var dropMove: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var dropOut: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var dropOver: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var dropTypes: ScOption[js.Array[String]] = ScNone
    var dynamicContents: ScOption[Boolean] = ScNone
    var dynamicContentsVars: ScOption[ValueMap] = ScNone
    val edgeBackgroundColor: ScOption[Color] = ScNone
    val edgeCenterBackgroundColor: ScOption[Color] = ScNone
    var edgeCursorMap: ScOption[Object] = ScNone
    val edgeImage: ScOption[SCImgURL] = ScNone
    var edgeMarginSize: ScOption[Number] = ScNone
    val edgeOffset: ScOption[Number] = ScNone
    val edgeOpacity: ScOption[Number] = ScNone
    val edgeShowCenter: ScOption[Boolean] = ScNone
    val edgeSize: ScOption[Number] = ScNone
    val editNode: ScOption[EditNode] = ScNone
    var editProxy: ScOption[EditNode with AutoChild] = ScNone
    val editProxyConstructor: ScOption[SCClassName] = ScNone
    val extraSpace: ScOption[Int] = ScNone
    var focusChanged: Function2[Canvas#canvasHandler, Boolean, Unit]
    val groupBorderCSS: ScOption[String] = ScNone
    val groupLabelBackgroundColor: ScOption[CSSColor] = ScNone
    val groupLabelStyleName: ScOption[CSSStyleName] = ScNone
    val groupTitle: ScOption[HTMLString] = ScNone
    val height: ScOption[Number] = ScNone
    val hideUsingDisplayNone: ScOption[Boolean] = ScNone
    var hover: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var hoverAlign: ScOption[Alignment] = ScNone
    var hoverAutoDestroy: ScOption[Boolean] = ScNone
    var hoverDelay: ScOption[Number] = ScNone
    var hoverHeight: ScOption[Int] = ScNone
    var hoverMoveWithMouse: ScOption[Boolean] = ScNone
    var hoverOpacity: ScOption[Number] = ScNone
    var hoverStyle: ScOption[CSSStyleName] = ScNone
    var hoverVAlign: ScOption[VerticalAlignment] = ScNone
    var hoverWidth: ScOption[Int] = ScNone
    var hoverWrap: ScOption[Boolean] = ScNone
    val htmlElement: ScOption[HTMLElement] = ScNone
    val htmlPosition: ScOption[DrawPosition] = ScNone
    val ID: ScOption[String] = ScNone
    val isGroup: ScOption[Boolean] = ScNone
    val isPrinting: ScOption[Boolean] = ScNone
    var isSnapAlignCandidate: Boolean
    def isVisible(): Boolean
    var keepInParentRect: Boolean | VerticalAlignment
    var keyDown: ScOption[Function1[Canvas#canvasHandler, Boolean] = ScNone
    var keyPress: ScOption[Function1[Canvas#canvasHandler, Boolean] = ScNone
    var keyUp: ScOption[Function1[Canvas#canvasHandler, Boolean] = ScNone
    var layoutAlign: Alignment | VerticalAlignment
    def layoutChildren(reason: String): Unit
    val leavePageSpace: Int
    val left: String | Number
    def linkHTML(href: String, text: HTMLString = js.native, target: String = js.native, ID: String = js.native, tabIndex: Int = js.native, accessKey: String = js.native): HTMLString
    var locateChildrenBy: LocatorStrategy
    var locateChildrenType: LocatorTypeStrategy
    var locatePeersBy: LocatorStrategy
    var locatePeersType: LocatorTypeStrategy
    val margin: Number
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
    var mouseDown: ScOption[Function1[Canvas#canvasHandler, Boolean] = ScNone
    var mouseMove: ScOption[Function1[Canvas#canvasHandler, Boolean] = ScNone
    var mouseOut: ScOption[Function1[Canvas#canvasHandler, Boolean] = ScNone
    var mouseOver: ScOption[Function1[Canvas#canvasHandler, Boolean] = ScNone
    var mouseStillDown: ScOption[Function1[Canvas#canvasHandler, Boolean] = ScNone
    var mouseStillDownDelay: Number
    var mouseStillDownInitialDelay: Number
    var mouseUp: ScOption[Function1[Canvas#canvasHandler, Boolean] = ScNone
    var mouseWheel: ScOption[Function1[Canvas#canvasHandler, Boolean] = ScNone
    def moveAbove(canvas: Canvas): Unit
    def moveBelow(canvas: Canvas): Unit
    def moveBy(deltaX: Number, deltaY: Number): Boolean
    var moved: js.ThisFunction2[canvasHandler, Number, Number, Unit]
    def moveTo(left: Number = js.native, top: Number = js.native): Boolean
    var noDoubleClicks: Boolean
    val opacity: Number
    val overflow: Overflow
    val padding: Number
    def pageScrollDown(): Unit
    def pageScrollUp(): Unit
    val parentCanvas: Canvas
    var parentMoved: js.ThisFunction2[canvasHandler, Number, Number, Unit]
    def parentResized()
    val peers: js.Array[Canvas]
    val percentBox: PercentBoxModel
    val percentSource: Canvas
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
    var resized: ScOption[Function1[Canvas#canvasHandler, Boolean] = ScNone
    var resizeFrom: js.Array[EdgeName]
    def resizeTo(width: Number = js.native, height: Number = js.native): Boolean
    def revealChild(child: Canvas | String): Unit
    var rightMouseDown: ScOption[Function1[Canvas#canvasHandler, Boolean] = ScNone
    val scrollbarConstructor: String
    val scrollbarSize: Number
    def scrollBy(dX: Number, dY: Number): Unit
    def scrollByPercent(dX: Number, dY: Number): Unit
    var scrolled: ScOption[Function1[Canvas#canvasHandler, Boolean] = ScNone
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
    var setDragTracker: ScOption[Function1[Canvas#canvasHandler, Boolean] = ScNone
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
    def setTabIndex(tabIndex: Number): Unit
    def setTop(top: Number): Unit
    def setValuesManager(dataPath: DataPath): Unit
    def setWidth(width: Number): Unit
    val shadowDepth: Number
    val shadowImage: Number
    var shadowOffset: Number
    var shadowSoftness: Number
    def shouldDragScroll(): Unit
    var shouldPrint: Boolean
    def shouldSnapOnDrop(dragTarget: Canvas): Boolean
    def show(): Unit
    def showClickMask(clickAction: Callback, mode: ClickMaskMode, unmaskedTargets: Canvas | js.Array[Canvas]): String
    def showComponentMask(unmaskedChildren: js.Array[Canvas] = js.native): Unit
    var showContextMenu: ScOption[Function1[Canvas#canvasHandler, Boolean] = ScNone
    val showCustomScrollbars: Boolean
    var showDragShadow: Boolean
    val showEdges: Boolean
    var showHover: Boolean
    var showHoverComponents: Boolean
    def showNextTo(otherWidget: Canvas, side: String = js.native, canOcclude: Boolean = js.native, skipAnimation: Boolean = js.native): Unit
    def showRecursively(): Unit
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
    var snapHGap: Number
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
    var snapVGap: Number
    var styleName: CSSStyleName
    var tabIndex: Number
    val top: Number | String
    val topElement: Canvas
    def updateEditNode(editContext: EditContext, editNode: EditNode): Unit
    def updateHover(hoverHTML: HTMLString = js.native): Unit
    var useBackMask: Boolean
    var useDragMask: Boolean
    var useNativeDrag: Boolean
    val useOpacityFilter: Boolean
    val useTouchScrolling: Boolean
    var valuesManager: ValuesManager
    var visibility: Visibility
    var visibilityChanged: js.ThisFunction1[canvasHandler, Boolean, Unit]
    def visibleAtPoint(x: Number, y: Number, withinViewport: Boolean = js.native, ignoreWidgets: Canvas = js.native, upToParent: Canvas = js.native): Boolean
    val width: Number | String
    def willAcceptDrop(): Boolean
}
