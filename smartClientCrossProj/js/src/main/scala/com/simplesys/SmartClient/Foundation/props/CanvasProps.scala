package com.simplesys.SmartClient.Foundation.props

import com.simplesys.SmartClient.Control.inst.Menu
import com.simplesys.SmartClient.Forms.FormsItems.inst.CanvasItem
import com.simplesys.SmartClient.Forms.inst.ValuesManager
import com.simplesys.SmartClient.Foundation.inst.Canvas
import com.simplesys.SmartClient.System.Number._
import com.simplesys.SmartClient.System.Types._
import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.SmartClient.Tools.inst.EditNode
import com.simplesys.SmartClient.option.{ScNone, ScOption}
import com.simplesys.isc.System.Types.Alignment._
import com.simplesys.isc.System.Types.AnimationAcceleration.AnimationAcceleration
import com.simplesys.isc.System.Types.BackgroundRepeat._
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
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js.Function3

class CanvasProps extends ClassProps {
//    val accessKey: ScOption[String] = ScNone
//    val alwaysShowScrollbars: ScOption[Boolean] = ScNone
//    var animateAcceleration: ScOption[AnimationAcceleration] = ScNone
//    var animateFadeTime: ScOption[Number] = ScNone
//    var animateHideAcceleration: ScOption[AnimationAcceleration] = ScNone
//    var animateHideEffect: ScOption[AnimateShowEffectId] = ScNone
//    var animateHideTime: ScOption[Number] = ScNone
//    var animateMoveAcceleration: ScOption[AnimationAcceleration] = ScNone
//    var animateMoveTime: ScOption[Number] = ScNone
//    var animateRectAcceleration: ScOption[AnimationAcceleration] = ScNone
//    var animateRectTime: ScOption[Number] = ScNone
//    var animateResizeAcceleration: ScOption[AnimationAcceleration] = ScNone
//    var animateResizeTime: ScOption[Number] = ScNone
//    var animateScrollAcceleration: ScOption[AnimationAcceleration] = ScNone
//    var animateScrollTime: ScOption[Number] = ScNone
//    var animateShowAcceleration: ScOption[AnimationAcceleration] = ScNone
//    var animateShowEffect: ScOption[AnimateShowEffectId] = ScNone
//    var animateShowTime: ScOption[Number] = ScNone
//    var animateTime: ScOption[Number] = ScNone
//    var appImgDir: ScOption[URL] = ScNone
//    val ariaRole: ScOption[String] = ScNone
//    val ariaState: ScOption[String] = ScNone
//    val autoDraw: ScOption[Boolean] = ScNone
//    var autoShowParent: ScOption[Boolean] = ScNone
//    val backgroundColor: ScOption[CSSColor] = ScNone
//    val backgroundImage: ScOption[SCImgURL] = ScNone
//    val backgroundPosition: ScOption[String] = ScNone
//    val backgroundRepeat: ScOption[BackgroundRepeat] = ScNone
//    val border: ScOption[String] = ScNone
//    var canAcceptDrop: ScOption[Boolean] = ScNone
//    var canDrag: ScOption[Boolean] = ScNone
//    var canDragReposition: ScOption[Boolean] = ScNone
//    var canDragResize: ScOption[Boolean] = ScNone
//    var canDragScroll: ScOption[Boolean] = ScNone
//    var canDrop: ScOption[Boolean] = ScNone
//    var canDropBefore: ScOption[Boolean] = ScNone
//    val canFocus: ScOption[Boolean] = ScNone
//    var canHover: ScOption[Boolean] = ScNone
//    var canSelectText: ScOption[Boolean] = ScNone
//    val canvasItem: ScOption[CanvasItem] = ScNone
//    val children: ScOption[Array[Canvas]] = ScNone
//    var childrenResizeSnapAlign: ScOption[Boolean] = ScNone
//    var childrenSnapAlign: ScOption[Boolean] = ScNone
//    var childrenSnapCenterAlign: ScOption[Boolean] = ScNone
//    var childrenSnapEdgeAlign: ScOption[Boolean] = ScNone
//    var childrenSnapResizeToGrid: ScOption[Boolean] = ScNone
//    var childrenSnapToGrid: ScOption[Boolean] = ScNone
//    val click: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    val componentMask: ScOption[Canvas with AutoChild] = ScNone
//    val componentMaskDefaults: ScOption[CanvasProps] = ScNone
//    var contents: ScOption[HTMLString] = ScNone
//    var contextMenu: ScOption[Menu] = ScNone
//    val cursor: ScOption[Cursor] = ScNone
//    val customEdges: ScOption[Array[String]] = ScNone
//    val dataPath: ScOption[DataPath] = ScNone
//    var defaultHeight: ScOption[Int] = ScNone
//    var defaultWidth: ScOption[Int] = ScNone
//    val destroyed: ScOption[Boolean] = ScNone
//    val destroying: ScOption[Boolean] = ScNone
//    val disabled: ScOption[Boolean] = ScNone
//    var disabledCursor: ScOption[Cursor] = ScNone
//    val disableTouchScrollingForDrag: ScOption[Boolean] = ScNone
//    var doubleClick: ScOption[Function[Canvas#canvasHandler, Boolean]] = ScNone
//    var doubleClickDelay: ScOption[Int] = ScNone
//    var dragAppearance: ScOption[DragAppearance] = ScNone
//    var dragIntersectStyle: ScOption[DragIntersectStyle] = ScNone
//    var dragMaskType: ScOption[DragMaskType] = ScNone
//    var dragMove: ScOption[Function[Canvas#canvasHandler, Boolean]] = ScNone
//    var dragOpacity: ScOption[Int] = ScNone
//    var dragRepositionAppearance: ScOption[DragAppearance] = ScNone
//    var dragRepositionCursor: ScOption[Cursor] = ScNone
//    var dragRepositionMove: ScOption[Function[Canvas#canvasHandler, Boolean]] = ScNone
//    var dragRepositionStart: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var dragRepositionStop: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var dragResizeAppearance: ScOption[DragAppearance] = ScNone
//    var dragResizeMove: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var dragResizeStart: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var dragResizeStop: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var dragScrollDelay: ScOption[Number] = ScNone
//    var dragStart: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var dragStartDistance: ScOption[Number] = ScNone
//    var dragStop: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var dragTarget: ScOption[Canvas] = ScNone
//    var dragType: ScOption[String] = ScNone
//    var drop: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var dropMove: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var dropOut: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var dropOver: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var dropTypes: ScOption[Array[String]] = ScNone
//    var dynamicContents: ScOption[Boolean] = ScNone
//    var dynamicContentsVars: ScOption[ValueMap] = ScNone
//    val edgeBackgroundColor: ScOption[Color] = ScNone
//    val edgeCenterBackgroundColor: ScOption[Color] = ScNone
//    var edgeCursorMap: ScOption[Object] = ScNone
//    val edgeImage: ScOption[SCImgURL] = ScNone
//    var edgeMarginSize: ScOption[Number] = ScNone
//    val edgeOffset: ScOption[Number] = ScNone
//    val edgeOpacity: ScOption[Number] = ScNone
//    val edgeShowCenter: ScOption[Boolean] = ScNone
//    val edgeSize: ScOption[Number] = ScNone
//    val editNode: ScOption[EditNode] = ScNone
//    var editProxy: ScOption[EditNode with AutoChild] = ScNone
//    val editProxyConstructor: ScOption[SCClassName] = ScNone
//    val extraSpace: ScOption[Int] = ScNone
//    var focusChanged: ScOption[Function2[Canvas#canvasHandler, Boolean, Unit]] = ScNone
//    val groupBorderCSS: ScOption[String] = ScNone
//    val groupLabelBackgroundColor: ScOption[CSSColor] = ScNone
//    val groupLabelStyleName: ScOption[CSSStyleName] = ScNone
//    val groupTitle: ScOption[HTMLString] = ScNone
//    val height: ScOption[Number] = ScNone
//    val hideUsingDisplayNone: ScOption[Boolean] = ScNone
//    var hover: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var hoverAlign: ScOption[Alignment] = ScNone
//    var hoverAutoDestroy: ScOption[Boolean] = ScNone
//    var hoverDelay: ScOption[Number] = ScNone
//    var hoverHeight: ScOption[Int] = ScNone
//    var hoverMoveWithMouse: ScOption[Boolean] = ScNone
//    var hoverOpacity: ScOption[Number] = ScNone
//    var hoverStyle: ScOption[CSSStyleName] = ScNone
//    var hoverVAlign: ScOption[VerticalAlignment] = ScNone
//    var hoverWidth: ScOption[Int] = ScNone
//    var hoverWrap: ScOption[Boolean] = ScNone
//    val htmlElement: ScOption[HTMLElement] = ScNone
//    val htmlPosition: ScOption[DrawPosition] = ScNone
//    val ID: ScOption[String] = ScNone
//    val isGroup: ScOption[Boolean] = ScNone
//    val isPrinting: ScOption[Boolean] = ScNone
//    var isSnapAlignCandidate: ScOption[Boolean] = ScNone
//    var keepInParentRect: ScOption[VerticalAlignment] = ScNone
//    var keyDown: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var keyPress: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var keyUp: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var layoutAlign: ScOption[Alignment] = ScNone
//    val leavePageSpace: ScOption[Int] = ScNone
//    val left: ScOption[Number] = ScNone
//    var locateChildrenBy: ScOption[LocatorStrategy] = ScNone
//    var locateChildrenType: ScOption[LocatorTypeStrategy] = ScNone
//    var locatePeersBy: ScOption[LocatorStrategy] = ScNone
//    var locatePeersType: ScOption[LocatorTypeStrategy] = ScNone
//    val margin: ScOption[Number] = ScNone
//    val masterElement: ScOption[Canvas] = ScNone
//    var matchElement: ScOption[Boolean] = ScNone
//    var maxHeight: ScOption[Number] = ScNone
//    var maxWidth: ScOption[Number] = ScNone
//    var menuConstructor: ScOption[SCClassName] = ScNone
//    var minHeight: ScOption[Number] = ScNone
//    var minNonEdgeSize: ScOption[Number] = ScNone
//    var minWidth: ScOption[Number] = ScNone
//    var momentumScrollMinSpeed: ScOption[Number] = ScNone
//    var mouseDown: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var mouseMove: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var mouseOut: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var mouseOver: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var mouseStillDown: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var mouseStillDownDelay: ScOption[Number] = ScNone
//    var mouseStillDownInitialDelay: ScOption[Number] = ScNone
//    var mouseUp: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var mouseWheel: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var moved: ScOption[Function3[Canvas#canvasHandler, Number, Number, Unit]] = ScNone
//    var noDoubleClicks: ScOption[Boolean] = ScNone
//    val opacity: ScOption[Number] = ScNone
//    val overflow: ScOption[Overflow] = ScNone
//    val padding: ScOption[Number] = ScNone
//    val parentCanvas: ScOption[Canvas] = ScNone
//    var parentMoved: ScOption[Function3[Canvas#canvasHandler, Number, Number, Unit]] = ScNone
//    val peers: ScOption[Array[Canvas]] = ScNone
//    val percentBox: ScOption[PercentBoxModel] = ScNone
//    val percentSource: ScOption[Canvas] = ScNone
//    var position: ScOption[Positioning] = ScNone
//    var printChildrenAbsolutelyPositioned: ScOption[Boolean] = ScNone
//    var prompt: ScOption[HTMLString] = ScNone
//    val proportionalResizeModifiers: ScOption[Array[KeyName]] = ScNone
//    val proportionalResizing: ScOption[ProportionalResizeMode] = ScNone
//    var redrawOnResize: ScOption[Boolean] = ScNone
//    val resizeBarTarget: ScOption[String] = ScNone
//    var resized: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var resizeFrom: ScOption[Array[EdgeName]] = ScNone
//    var rightMouseDown: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    val scrollbarConstructor: ScOption[String] = ScNone
//    val scrollbarSize: ScOption[Number] = ScNone
//    var scrolled: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    var setDragTracker: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    val shadowDepth: ScOption[Number] = ScNone
//    val shadowImage: ScOption[Number] = ScNone
//    var shadowOffset: ScOption[Number] = ScNone
//    var shadowSoftness: ScOption[Number] = ScNone
//    var shouldPrint: ScOption[Boolean] = ScNone
//    var showContextMenu: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
//    val showCustomScrollbars: ScOption[Boolean] = ScNone
//    var showDragShadow: ScOption[Boolean] = ScNone
//    val showEdges: ScOption[Boolean] = ScNone
//    var showHover: ScOption[Boolean] = ScNone
//    var showHoverComponents: ScOption[Boolean] = ScNone
//    var showResizeBar: ScOption[Boolean] = ScNone
//    var showShadow: ScOption[Boolean] = ScNone
//    var showSnapGrid: ScOption[Boolean] = ScNone
//    var shrinkElementOnHide: ScOption[Boolean] = ScNone
//    var skinImgDir: ScOption[URL] = ScNone
//    var snapAlignCandidates: ScOption[Array[Canvas]] = ScNone
//    val snapAlignCenterLineStyle: ScOption[String] = ScNone
//    val snapAlignEdgeLineStyle: ScOption[String] = ScNone
//    var snapAxis: ScOption[String] = ScNone
//    var snapEdge: ScOption[String] = ScNone
//    val snapHDirection: ScOption[String] = ScNone
//    var snapHGap: ScOption[Number] = ScNone
//    var snapOffsetLeft: ScOption[Int] = ScNone
//    var snapOffsetTop: ScOption[Int] = ScNone
//    var snapOnDrop: ScOption[Int] = ScNone
//    var snapResizeToAlign: ScOption[Int] = ScNone
//    var snapResizeToGrid: ScOption[Int] = ScNone
//    var snapTo: ScOption[String] = ScNone
//    var snapToAlign: ScOption[Boolean] = ScNone
//    var snapToCenterAlign: ScOption[Boolean] = ScNone
//    var snapToEdgeAlign: ScOption[Boolean] = ScNone
//    var snapToGrid: ScOption[Boolean] = ScNone
//    var snapVDirection: ScOption[String] = ScNone
//    var snapVGap: ScOption[Number] = ScNone
//    var styleName: ScOption[CSSStyleName] = ScNone
//    var tabIndex: ScOption[Number] = ScNone
//    val top: ScOption[Number] = ScNone
//    val topElement: ScOption[Canvas] = ScNone
//    var useBackMask: ScOption[Boolean] = ScNone
//    var useDragMask: ScOption[Boolean] = ScNone
//    var useNativeDrag: ScOption[Boolean] = ScNone
//    val useOpacityFilter: ScOption[Boolean] = ScNone
//    val useTouchScrolling: ScOption[Boolean] = ScNone
//    var valuesManager: ScOption[ValuesManager] = ScNone
//    var visibility: ScOption[Visibility] = ScNone
//    var visibilityChanged: ScOption[Function2[Canvas#canvasHandler, Boolean, Unit]] = ScNone
//    val width: ScOption[Number] = ScNone
}
