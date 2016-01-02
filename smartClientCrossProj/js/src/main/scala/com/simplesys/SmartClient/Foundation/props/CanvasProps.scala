package com.simplesys.SmartClient.Foundation.props

import com.simplesys.SmartClient.Control.inst.Menu
import com.simplesys.SmartClient.Forms.FormsItems.inst.CanvasItem
import com.simplesys.SmartClient.Forms.inst.ValuesManager
import com.simplesys.SmartClient.Foundation.inst.Canvas
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
    var accessKey: ScOption[String] = ScNone
    var alwaysShowScrollbars: ScOption[Boolean] = ScNone
    var animateAcceleration: ScOption[AnimationAcceleration] = ScNone
    var animateFadeTime: ScOption[Int] = ScNone
    var animateHideAcceleration: ScOption[AnimationAcceleration] = ScNone
    var animateHideEffect: ScOption[AnimateShowEffectId] = ScNone
    var animateHideTime: ScOption[Int] = ScNone
    var animateMoveAcceleration: ScOption[AnimationAcceleration] = ScNone
    var animateMoveTime: ScOption[Int] = ScNone
    var animateRectAcceleration: ScOption[AnimationAcceleration] = ScNone
    var animateRectTime: ScOption[Int] = ScNone
    var animateResizeAcceleration: ScOption[AnimationAcceleration] = ScNone
    var animateResizeTime: ScOption[Int] = ScNone
    var animateScrollAcceleration: ScOption[AnimationAcceleration] = ScNone
    var animateScrollTime: ScOption[Int] = ScNone
    var animateShowAcceleration: ScOption[AnimationAcceleration] = ScNone
    var animateShowEffect: ScOption[AnimateShowEffectId] = ScNone
    var animateShowTime: ScOption[Int] = ScNone
    var animateTime: ScOption[Int] = ScNone
    var appImgDir: ScOption[URL] = ScNone
    var ariaRole: ScOption[String] = ScNone
    var ariaState: ScOption[String] = ScNone
    var autoDraw: ScOption[Boolean] = ScNone
    var autoShowParent: ScOption[Boolean] = ScNone
    var backgroundColor: ScOption[CSSColor] = ScNone
    var backgroundImage: ScOption[SCImgURL] = ScNone
    var backgroundPosition: ScOption[String] = ScNone
    var backgroundRepeat: ScOption[BackgroundRepeat] = ScNone
    var border: ScOption[String] = ScNone
    var canAcceptDrop: ScOption[Boolean] = ScNone
    var canDrag: ScOption[Boolean] = ScNone
    var canDragReposition: ScOption[Boolean] = ScNone
    var canDragResize: ScOption[Boolean] = ScNone
    var canDragScroll: ScOption[Boolean] = ScNone
    var canDrop: ScOption[Boolean] = ScNone
    var canDropBefore: ScOption[Boolean] = ScNone
    var canFocus: ScOption[Boolean] = ScNone
    var canHover: ScOption[Boolean] = ScNone
    var canSelectText: ScOption[Boolean] = ScNone
    var canvasItem: ScOption[CanvasItem] = ScNone
    var children: ScOption[Seq[Canvas]] = ScNone
    var childrenResizeSnapAlign: ScOption[Boolean] = ScNone
    var childrenSnapAlign: ScOption[Boolean] = ScNone
    var childrenSnapCenterAlign: ScOption[Boolean] = ScNone
    var childrenSnapEdgeAlign: ScOption[Boolean] = ScNone
    var childrenSnapResizeToGrid: ScOption[Boolean] = ScNone
    var childrenSnapToGrid: ScOption[Boolean] = ScNone
    var click: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var componentMask: ScOption[Canvas with AutoChild] = ScNone
    var componentMaskDefaults: ScOption[Canvas] = ScNone
    var contents: ScOption[HTMLString] = ScNone
    var contextMenu: ScOption[Menu] = ScNone
    var cursor: ScOption[Cursor] = ScNone
    var customEdges: ScOption[Seq[String]] = ScNone
    var dataPath: ScOption[DataPath] = ScNone
    var defaultHeight: ScOption[Int] = ScNone
    var defaultWidth: ScOption[Int] = ScNone
    var destroyed: ScOption[Boolean] = ScNone
    var destroying: ScOption[Boolean] = ScNone
    var disabled: ScOption[Boolean] = ScNone
    var disabledCursor: ScOption[Cursor] = ScNone
    var disableTouchScrollingForDrag: ScOption[Boolean] = ScNone
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
    var dragScrollDelay: ScOption[Int] = ScNone
    var dragStart: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var dragStartDistance: ScOption[Int] = ScNone
    var dragStop: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var dragTarget: ScOption[Canvas] = ScNone
    var dragType: ScOption[String] = ScNone
    var drop: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var dropMove: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var dropOut: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var dropOver: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var dropTypes: ScOption[Seq[String]] = ScNone
    var dynamicContents: ScOption[Boolean] = ScNone
    var dynamicContentsVars: ScOption[ValueMap] = ScNone
    var edgeBackgroundColor: ScOption[Color] = ScNone
    var edgeCenterBackgroundColor: ScOption[Color] = ScNone
    var edgeCursorMap: ScOption[Object] = ScNone
    var edgeImage: ScOption[SCImgURL] = ScNone
    var edgeMarginSize: ScOption[Int] = ScNone
    var edgeOffset: ScOption[Int] = ScNone
    var edgeOpacity: ScOption[Int] = ScNone
    var edgeShowCenter: ScOption[Boolean] = ScNone
    var edgeSize: ScOption[Int] = ScNone
    var editNode: ScOption[EditNode] = ScNone
    var editProxy: ScOption[EditNode with AutoChild] = ScNone
    var editProxyConstructor: ScOption[SCClassName] = ScNone
    var extraSpace: ScOption[Int] = ScNone
    var focusChanged: ScOption[Function2[Canvas#canvasHandler, Boolean, Unit]] = ScNone
    var groupBorderCSS: ScOption[String] = ScNone
    var groupLabelBackgroundColor: ScOption[CSSColor] = ScNone
    var groupLabelStyleName: ScOption[CSSStyleName] = ScNone
    var groupTitle: ScOption[HTMLString] = ScNone
    var height: ScOption[Int] = ScNone
    var hideUsingDisplayNone: ScOption[Boolean] = ScNone
    var hover: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var hoverAlign: ScOption[Alignment] = ScNone
    var hoverAutoDestroy: ScOption[Boolean] = ScNone
    var hoverDelay: ScOption[Int] = ScNone
    var hoverHeight: ScOption[Int] = ScNone
    var hoverMoveWithMouse: ScOption[Boolean] = ScNone
    var hoverOpacity: ScOption[Int] = ScNone
    var hoverStyle: ScOption[CSSStyleName] = ScNone
    var hoverVAlign: ScOption[VerticalAlignment] = ScNone
    var hoverWidth: ScOption[Int] = ScNone
    var hoverWrap: ScOption[Boolean] = ScNone
    var htmlElement: ScOption[HTMLElement] = ScNone
    var htmlPosition: ScOption[DrawPosition] = ScNone
    var ID: ScOption[String] = ScNone
    var isGroup: ScOption[Boolean] = ScNone
    var isPrinting: ScOption[Boolean] = ScNone
    var isSnapAlignCandidate: ScOption[Boolean] = ScNone
    var keepInParentRect: ScOption[VerticalAlignment] = ScNone
    var keyDown: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var keyPress: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var keyUp: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var layoutAlign: ScOption[Alignment] = ScNone
    var leavePageSpace: ScOption[Int] = ScNone
    var left: ScOption[Int] = ScNone
    var locateChildrenBy: ScOption[LocatorStrategy] = ScNone
    var locateChildrenType: ScOption[LocatorTypeStrategy] = ScNone
    var locatePeersBy: ScOption[LocatorStrategy] = ScNone
    var locatePeersType: ScOption[LocatorTypeStrategy] = ScNone
    var margin: ScOption[Int] = ScNone
    var masterElement: ScOption[Canvas] = ScNone
    var matchElement: ScOption[Boolean] = ScNone
    var maxHeight: ScOption[Int] = ScNone
    var maxWidth: ScOption[Int] = ScNone
    var menuConstructor: ScOption[SCClassName] = ScNone
    var minHeight: ScOption[Int] = ScNone
    var minNonEdgeSize: ScOption[Int] = ScNone
    var minWidth: ScOption[Int] = ScNone
    var momentumScrollMinSpeed: ScOption[Int] = ScNone
    var mouseDown: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var mouseMove: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var mouseOut: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var mouseOver: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var mouseStillDown: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var mouseStillDownDelay: ScOption[Int] = ScNone
    var mouseStillDownInitialDelay: ScOption[Int] = ScNone
    var mouseUp: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var mouseWheel: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var moved: ScOption[Function3[Canvas#canvasHandler, Int, Int, Unit]] = ScNone
    var noDoubleClicks: ScOption[Boolean] = ScNone
    var opacity: ScOption[Int] = ScNone
    var overflow: ScOption[Overflow] = ScNone
    var padding: ScOption[Int] = ScNone
    var parentCanvas: ScOption[Canvas] = ScNone
    var parentMoved: ScOption[Function3[Canvas#canvasHandler, Int, Int, Unit]] = ScNone
    var peers: ScOption[Seq[Canvas]] = ScNone
    var percentBox: ScOption[PercentBoxModel] = ScNone
    var percentSource: ScOption[Canvas] = ScNone
    var position: ScOption[Positioning] = ScNone
    var printChildrenAbsolutelyPositioned: ScOption[Boolean] = ScNone
    var prompt: ScOption[HTMLString] = ScNone
    var proportionalResizeModifiers: ScOption[Seq[KeyName]] = ScNone
    var proportionalResizing: ScOption[ProportionalResizeMode] = ScNone
    var redrawOnResize: ScOption[Boolean] = ScNone
    var resizeBarTarget: ScOption[String] = ScNone
    var resized: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var resizeFrom: ScOption[Seq[EdgeName]] = ScNone
    var rightMouseDown: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var scrollbarConstructor: ScOption[String] = ScNone
    var scrollbarSize: ScOption[Int] = ScNone
    var scrolled: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var setDragTracker: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var shadowDepth: ScOption[Int] = ScNone
    var shadowImage: ScOption[Int] = ScNone
    var shadowOffset: ScOption[Int] = ScNone
    var shadowSoftness: ScOption[Int] = ScNone
    var shouldPrint: ScOption[Boolean] = ScNone
    var showContextMenu: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    var showCustomScrollbars: ScOption[Boolean] = ScNone
    var showDragShadow: ScOption[Boolean] = ScNone
    var showEdges: ScOption[Boolean] = ScNone
    var showHover: ScOption[Boolean] = ScNone
    var showHoverComponents: ScOption[Boolean] = ScNone
    var showResizeBar: ScOption[Boolean] = ScNone
    var showShadow: ScOption[Boolean] = ScNone
    var showSnapGrid: ScOption[Boolean] = ScNone
    var shrinkElementOnHide: ScOption[Boolean] = ScNone
    var skinImgDir: ScOption[URL] = ScNone
    var snapAlignCandidates: ScOption[Seq[Canvas]] = ScNone
    var snapAlignCenterLineStyle: ScOption[String] = ScNone
    var snapAlignEdgeLineStyle: ScOption[String] = ScNone
    var snapAxis: ScOption[String] = ScNone
    var snapEdge: ScOption[String] = ScNone
    var snapHDirection: ScOption[String] = ScNone
    var snapHGap: ScOption[Int] = ScNone
    var snapOffsetLeft: ScOption[Int] = ScNone
    var snapOffsetTop: ScOption[Int] = ScNone
    var snapOnDrop: ScOption[Int] = ScNone
    var snapResizeToAlign: ScOption[Int] = ScNone
    var snapResizeToGrid: ScOption[Int] = ScNone
    var snapTo: ScOption[String] = ScNone
    var snapToAlign: ScOption[Boolean] = ScNone
    var snapToCenterAlign: ScOption[Boolean] = ScNone
    var snapToEdgeAlign: ScOption[Boolean] = ScNone
    var snapToGrid: ScOption[Boolean] = ScNone
    var snapVDirection: ScOption[String] = ScNone
    var snapVGap: ScOption[Int] = ScNone
    var styleName: ScOption[CSSStyleName] = ScNone
    var tabIndex: ScOption[Int] = ScNone
    var top: ScOption[Int] = ScNone
    var topElement: ScOption[Canvas] = ScNone
    var useBackMask: ScOption[Boolean] = ScNone
    var useDragMask: ScOption[Boolean] = ScNone
    var useNativeDrag: ScOption[Boolean] = ScNone
    var useOpacityFilter: ScOption[Boolean] = ScNone
    var useTouchScrolling: ScOption[Boolean] = ScNone
    var valuesManager: ScOption[ValuesManager] = ScNone
    var visibility: ScOption[Visibility] = ScNone
    var visibilityChanged: ScOption[Function2[Canvas#canvasHandler, Boolean, Unit]] = ScNone
    var width: ScOption[Int] = ScNone
}
