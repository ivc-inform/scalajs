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
    val accessKey: ScOption[String] = ScNone
    val alwaysShowScrollbars: ScOption[Boolean] = ScNone
    val animateAcceleration: ScOption[AnimationAcceleration] = ScNone
    val animateFadeTime: ScOption[Number] = ScNone
    val animateHideAcceleration: ScOption[AnimationAcceleration] = ScNone
    val animateHideEffect: ScOption[AnimateShowEffectId] = ScNone
    val animateHideTime: ScOption[Number] = ScNone
    val animateMoveAcceleration: ScOption[AnimationAcceleration] = ScNone
    val animateMoveTime: ScOption[Number] = ScNone
    val animateRectAcceleration: ScOption[AnimationAcceleration] = ScNone
    val animateRectTime: ScOption[Number] = ScNone
    val animateResizeAcceleration: ScOption[AnimationAcceleration] = ScNone
    val animateResizeTime: ScOption[Number] = ScNone
    val animateScrollAcceleration: ScOption[AnimationAcceleration] = ScNone
    val animateScrollTime: ScOption[Number] = ScNone
    val animateShowAcceleration: ScOption[AnimationAcceleration] = ScNone
    val animateShowEffect: ScOption[AnimateShowEffectId] = ScNone
    val animateShowTime: ScOption[Number] = ScNone
    val animateTime: ScOption[Number] = ScNone
    val appImgDir: ScOption[URL] = ScNone
    val ariaRole: ScOption[String] = ScNone
    val ariaState: ScOption[String] = ScNone
    val autoDraw: ScOption[Boolean] = ScNone
    val autoShowParent: ScOption[Boolean] = ScNone
    val backgroundColor: ScOption[CSSColor] = ScNone
    val backgroundImage: ScOption[SCImgURL] = ScNone
    val backgroundPosition: ScOption[String] = ScNone
    val backgroundRepeat: ScOption[BackgroundRepeat] = ScNone
    val border: ScOption[String] = ScNone
    val canAcceptDrop: ScOption[Boolean] = ScNone
    val canDrag: ScOption[Boolean] = ScNone
    val canDragReposition: ScOption[Boolean] = ScNone
    val canDragResize: ScOption[Boolean] = ScNone
    val canDragScroll: ScOption[Boolean] = ScNone
    val canDrop: ScOption[Boolean] = ScNone
    val canDropBefore: ScOption[Boolean] = ScNone
    val canFocus: ScOption[Boolean] = ScNone
    val canHover: ScOption[Boolean] = ScNone
    val canSelectText: ScOption[Boolean] = ScNone
    val canvasItem: ScOption[CanvasItem] = ScNone
    val children: ScOption[Array[Canvas]] = ScNone
    val childrenResizeSnapAlign: ScOption[Boolean] = ScNone
    val childrenSnapAlign: ScOption[Boolean] = ScNone
    val childrenSnapCenterAlign: ScOption[Boolean] = ScNone
    val childrenSnapEdgeAlign: ScOption[Boolean] = ScNone
    val childrenSnapResizeToGrid: ScOption[Boolean] = ScNone
    val childrenSnapToGrid: ScOption[Boolean] = ScNone
    val click: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val componentMask: ScOption[Canvas with AutoChild] = ScNone
    val componentMaskDefaults: ScOption[CanvasProps] = ScNone
    val contents: ScOption[HTMLString] = ScNone
    val contextMenu: ScOption[Menu] = ScNone
    val cursor: ScOption[Cursor] = ScNone
    val customEdges: ScOption[Array[String]] = ScNone
    val dataPath: ScOption[DataPath] = ScNone
    val defaultHeight: ScOption[Int] = ScNone
    val defaultWidth: ScOption[Int] = ScNone
    val destroyed: ScOption[Boolean] = ScNone
    val destroying: ScOption[Boolean] = ScNone
    val disabled: ScOption[Boolean] = ScNone
    val disabledCursor: ScOption[Cursor] = ScNone
    val disableTouchScrollingForDrag: ScOption[Boolean] = ScNone
    val doubleClick: ScOption[Function[Canvas#canvasHandler, Boolean]] = ScNone
    val doubleClickDelay: ScOption[Int] = ScNone
    val dragAppearance: ScOption[DragAppearance] = ScNone
    val dragIntersectStyle: ScOption[DragIntersectStyle] = ScNone
    val dragMaskType: ScOption[DragMaskType] = ScNone
    val dragMove: ScOption[Function[Canvas#canvasHandler, Boolean]] = ScNone
    val dragOpacity: ScOption[Int] = ScNone
    val dragRepositionAppearance: ScOption[DragAppearance] = ScNone
    val dragRepositionCursor: ScOption[Cursor] = ScNone
    val dragRepositionMove: ScOption[Function[Canvas#canvasHandler, Boolean]] = ScNone
    val dragRepositionStart: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val dragRepositionStop: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val dragResizeAppearance: ScOption[DragAppearance] = ScNone
    val dragResizeMove: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val dragResizeStart: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val dragResizeStop: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val dragScrollDelay: ScOption[Number] = ScNone
    val dragStart: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val dragStartDistance: ScOption[Number] = ScNone
    val dragStop: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val dragTarget: ScOption[Canvas] = ScNone
    val dragType: ScOption[String] = ScNone
    val drop: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val dropMove: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val dropOut: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val dropOver: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val dropTypes: ScOption[Array[String]] = ScNone
    val dynamicContents: ScOption[Boolean] = ScNone
    val dynamicContentsVars: ScOption[ValueMap] = ScNone
    val edgeBackgroundColor: ScOption[Color] = ScNone
    val edgeCenterBackgroundColor: ScOption[Color] = ScNone
    val edgeCursorMap: ScOption[Object] = ScNone
    val edgeImage: ScOption[SCImgURL] = ScNone
    val edgeMarginSize: ScOption[Number] = ScNone
    val edgeOffset: ScOption[Number] = ScNone
    val edgeOpacity: ScOption[Number] = ScNone
    val edgeShowCenter: ScOption[Boolean] = ScNone
    val edgeSize: ScOption[Number] = ScNone
    val editNode: ScOption[EditNode] = ScNone
    val editProxy: ScOption[EditNode with AutoChild] = ScNone
    val editProxyConstructor: ScOption[SCClassName] = ScNone
    val extraSpace: ScOption[Int] = ScNone
    val focusChanged: ScOption[Function2[Canvas#canvasHandler, Boolean, Unit]] = ScNone
    val groupBorderCSS: ScOption[String] = ScNone
    val groupLabelBackgroundColor: ScOption[CSSColor] = ScNone
    val groupLabelStyleName: ScOption[CSSStyleName] = ScNone
    val groupTitle: ScOption[HTMLString] = ScNone
    val height: ScOption[Number] = ScNone
    val hideUsingDisplayNone: ScOption[Boolean] = ScNone
    val hover: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val hoverAlign: ScOption[Alignment] = ScNone
    val hoverAutoDestroy: ScOption[Boolean] = ScNone
    val hoverDelay: ScOption[Number] = ScNone
    val hoverHeight: ScOption[Int] = ScNone
    val hoverMoveWithMouse: ScOption[Boolean] = ScNone
    val hoverOpacity: ScOption[Number] = ScNone
    val hoverStyle: ScOption[CSSStyleName] = ScNone
    val hoverVAlign: ScOption[VerticalAlignment] = ScNone
    val hoverWidth: ScOption[Int] = ScNone
    val hoverWrap: ScOption[Boolean] = ScNone
    val htmlElement: ScOption[HTMLElement] = ScNone
    val htmlPosition: ScOption[DrawPosition] = ScNone
    val ID: ScOption[String] = ScNone
    val isGroup: ScOption[Boolean] = ScNone
    val isPrinting: ScOption[Boolean] = ScNone
    val isSnapAlignCandidate: ScOption[Boolean] = ScNone
    val keepInParentRect: ScOption[VerticalAlignment] = ScNone
    val keyDown: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val keyPress: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val keyUp: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val layoutAlign: ScOption[Alignment] = ScNone
    val leavePageSpace: ScOption[Int] = ScNone
    val left: ScOption[Number] = ScNone
    val locateChildrenBy: ScOption[LocatorStrategy] = ScNone
    val locateChildrenType: ScOption[LocatorTypeStrategy] = ScNone
    val locatePeersBy: ScOption[LocatorStrategy] = ScNone
    val locatePeersType: ScOption[LocatorTypeStrategy] = ScNone
    val margin: ScOption[Number] = ScNone
    val masterElement: ScOption[Canvas] = ScNone
    val matchElement: ScOption[Boolean] = ScNone
    val maxHeight: ScOption[Number] = ScNone
    val maxWidth: ScOption[Number] = ScNone
    val menuConstructor: ScOption[SCClassName] = ScNone
    val minHeight: ScOption[Number] = ScNone
    val minNonEdgeSize: ScOption[Number] = ScNone
    val minWidth: ScOption[Number] = ScNone
    val momentumScrollMinSpeed: ScOption[Number] = ScNone
    val mouseDown: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val mouseMove: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val mouseOut: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val mouseOver: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val mouseStillDown: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val mouseStillDownDelay: ScOption[Number] = ScNone
    val mouseStillDownInitialDelay: ScOption[Number] = ScNone
    val mouseUp: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val mouseWheel: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val moved: ScOption[Function3[Canvas#canvasHandler, Number, Number, Unit]] = ScNone
    val noDoubleClicks: ScOption[Boolean] = ScNone
    val opacity: ScOption[Number] = ScNone
    val overflow: ScOption[Overflow] = ScNone
    val padding: ScOption[Number] = ScNone
    val parentCanvas: ScOption[Canvas] = ScNone
    val parentMoved: ScOption[Function3[Canvas#canvasHandler, Number, Number, Unit]] = ScNone
    val peers: ScOption[Array[Canvas]] = ScNone
    val percentBox: ScOption[PercentBoxModel] = ScNone
    val percentSource: ScOption[Canvas] = ScNone
    val position: ScOption[Positioning] = ScNone
    val printChildrenAbsolutelyPositioned: ScOption[Boolean] = ScNone
    val prompt: ScOption[HTMLString] = ScNone
    val proportionalResizeModifiers: ScOption[Array[KeyName]] = ScNone
    val proportionalResizing: ScOption[ProportionalResizeMode] = ScNone
    val redrawOnResize: ScOption[Boolean] = ScNone
    val resizeBarTarget: ScOption[String] = ScNone
    val resized: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val resizeFrom: ScOption[Array[EdgeName]] = ScNone
    val rightMouseDown: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val scrollbarConstructor: ScOption[String] = ScNone
    val scrollbarSize: ScOption[Number] = ScNone
    val scrolled: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val setDragTracker: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val shadowDepth: ScOption[Number] = ScNone
    val shadowImage: ScOption[Number] = ScNone
    val shadowOffset: ScOption[Number] = ScNone
    val shadowSoftness: ScOption[Number] = ScNone
    val shouldPrint: ScOption[Boolean] = ScNone
    val showContextMenu: ScOption[Function1[Canvas#canvasHandler, Boolean]] = ScNone
    val showCustomScrollbars: ScOption[Boolean] = ScNone
    val showDragShadow: ScOption[Boolean] = ScNone
    val showEdges: ScOption[Boolean] = ScNone
    val showHover: ScOption[Boolean] = ScNone
    val showHoverComponents: ScOption[Boolean] = ScNone
    val showResizeBar: ScOption[Boolean] = ScNone
    val showShadow: ScOption[Boolean] = ScNone
    val showSnapGrid: ScOption[Boolean] = ScNone
    val shrinkElementOnHide: ScOption[Boolean] = ScNone
    val skinImgDir: ScOption[URL] = ScNone
    val snapAlignCandidates: ScOption[Array[Canvas]] = ScNone
    val snapAlignCenterLineStyle: ScOption[String] = ScNone
    val snapAlignEdgeLineStyle: ScOption[String] = ScNone
    val snapAxis: ScOption[String] = ScNone
    val snapEdge: ScOption[String] = ScNone
    val snapHDirection: ScOption[String] = ScNone
    val snapHGap: ScOption[Number] = ScNone
    val snapOffsetLeft: ScOption[Int] = ScNone
    val snapOffsetTop: ScOption[Int] = ScNone
    val snapOnDrop: ScOption[Int] = ScNone
    val snapResizeToAlign: ScOption[Int] = ScNone
    val snapResizeToGrid: ScOption[Int] = ScNone
    val snapTo: ScOption[String] = ScNone
    val snapToAlign: ScOption[Boolean] = ScNone
    val snapToCenterAlign: ScOption[Boolean] = ScNone
    val snapToEdgeAlign: ScOption[Boolean] = ScNone
    val snapToGrid: ScOption[Boolean] = ScNone
    val snapVDirection: ScOption[String] = ScNone
    val snapVGap: ScOption[Number] = ScNone
    val styleName: ScOption[CSSStyleName] = ScNone
    val tabIndex: ScOption[Number] = ScNone
    val top: ScOption[Number] = ScNone
    val topElement: ScOption[Canvas] = ScNone
    val useBackMask: ScOption[Boolean] = ScNone
    val useDragMask: ScOption[Boolean] = ScNone
    val useNativeDrag: ScOption[Boolean] = ScNone
    val useOpacityFilter: ScOption[Boolean] = ScNone
    val useTouchScrolling: ScOption[Boolean] = ScNone
    val valuesManager: ScOption[ValuesManager] = ScNone
    val visibility: ScOption[Visibility] = ScNone
    val visibilityChanged: ScOption[Function2[Canvas#canvasHandler, Boolean, Unit]] = ScNone
    val width: ScOption[Number] = ScNone
}
