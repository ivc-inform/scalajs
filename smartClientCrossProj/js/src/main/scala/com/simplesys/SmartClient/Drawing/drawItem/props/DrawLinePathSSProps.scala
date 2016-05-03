package com.simplesys.SmartClient.Drawing.drawItem.props

import com.simplesys.SmartClient.Control.MenuSS
import com.simplesys.SmartClient.Control.menu.MenuSSItem
import com.simplesys.SmartClient.Control.props.MenuSSProps
import com.simplesys.SmartClient.Control.props.menu.MenuSSItemProps
import com.simplesys.SmartClient.Drawing.drawItem.DrawLinePathSS
import com.simplesys.SmartClient.Drawing.props.DrawKnobProps
import com.simplesys.SmartClient.Drawing.{DrawKnob, Point}
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.System._
import com.simplesys.SmartClient.math.AffineTransform
import com.simplesys.System.Types.ConnectorOrientation._
import com.simplesys.System.Types.ConnectorStyle.ConnectorStyle
import com.simplesys.System.Types.{ConnectorOrientation, ConnectorStyle, TitleRotationMode}
import com.simplesys.System.{JSAny, JSObject, JSUndefined, jSUndefined}
import com.simplesys.function._
import com.simplesys.option.ScOption
import com.simplesys.option.ScOption._

import scala.scalajs.js._

class DrawLinePathSSProps extends DrawPathProps {
    type classHandler <: DrawLinePathSS

    var connectorOrientation: ScOption[ConnectorOrientation] = ConnectorOrientation.auto.opt

    var connectorStyle: ScOption[ConnectorStyle] = ConnectorStyle.diagonal.opt

    titleRotationMode = TitleRotationMode.withItemAlwaysUp.opt

    showTitleLabelBackground = true.opt

    var startPoint: ScOption[Point] = Point(0, 0).opt

    var endPoint: ScOption[Point] = Point(100, 100).opt

    var tailSize: ScOption[Int] = 30.opt

    contextMenu = MenuSS.create(
        new MenuSSProps {
            unserialize = true.opt
            items = Seq(
                new MenuSSItemProps {
                    title = "Установить контрольную точку".ellipsis.opt
                    identifier = "controlPoint".opt
                    icon = "insert.png".opt
                    click = {
                        (target: Canvas, item: MenuSSItem, menu: MenuSS, colNum: JSUndefined[Int]) =>


                    }.toFunc.opt
                }
            ).opt
        }).opt

    init = {
        (thiz: classHandler, arguments: IscArray[JSAny]) =>

            isc debugTrap 0

            thiz.startPoint = thiz.startPoint.duplicate()
            thiz.endPoint = thiz.endPoint.duplicate()

            if (thiz.startLeft.isEmpty)
                thiz.startLeft = thiz.startPoint.getX()

            if (thiz.startTop.isEmpty)
                thiz.startTop = thiz.startPoint.getY()

            if (thiz.endLeft.isEmpty)
                thiz.endLeft = thiz.endPoint.getX()

            if (thiz.endTop.isEmpty)
                thiz.endTop = thiz.endPoint.getY()

            thiz.points = IscArray(Point(thiz.startLeft.get, thiz.startTop.get), Point(thiz.startLeft.get, thiz.startTop.get))

            isc debugTrap thiz.points

            thiz.Super("init", arguments)

    }.toThisFunc.opt

    var getConnectorOrientationState: ScOption[ThisFunction0[classHandler, ConnectorOrientation]] = {
        (thiz: classHandler) =>
          isc.debugTrap("getConnectorOrientationState")
            if (thiz.connectorOrientation == ConnectorOrientation.auto) {
                val width = Math.abs(thiz.endLeft.get - thiz.startLeft.get)
                val height = Math.abs(thiz.endTop.get - thiz.startTop.get)
                if (width >= height) ConnectorOrientation.horizontal else ConnectorOrientation.vertical
            } else
                thiz.connectorOrientation
    }.toThisFunc.opt

    var _getSegmentPoints: ScOption[ThisFunction2[classHandler, JSUndefined[Point], JSUndefined[Point], IscArray[Point]]] = {
        (thiz: classHandler, leader: JSUndefined[Point], trailer: JSUndefined[Point]) =>

            var _leader = leader
            var _trailer = trailer

            val p1 = Point(thiz.startLeft.get, thiz.startTop.get)
            val p2 = Point(thiz.endLeft.get, thiz.endTop.get)

            val orientation = thiz.getConnectorOrientationState()
            val style = thiz.connectorStyle

            var tailSize = thiz.tailSize

            // draw horizontal tail segments
            if (orientation == ConnectorOrientation.horizontal) {

                // find the length of the leading tail segment and draw the tail segment at the same
                // point on the x axis, making a right angle
                if (style == ConnectorStyle.rightAngle) {

                    if (thiz.controlPoint1.isEmpty)
                        tailSize = if (thiz.startLeft.get <= thiz.endLeft.get) -thiz.tailSize else thiz.tailSize
                    else
                        tailSize = thiz.startLeft.get - thiz.controlPoint1.get.getX().get


                    _leader = IscArray(thiz.startLeft.get - tailSize, thiz.startTop.get)
                    _trailer = IscArray(thiz.startLeft.get - tailSize, thiz.endTop.get)

                } else {

                    if (thiz.startLeft.get <= thiz.endLeft.get)
                        tailSize = -tailSize

                    // don't change any point explicitly provided by the end user (as in move, etc)
                    if (_leader.isEmpty)
                        _leader = IscArray(thiz.startLeft.get - tailSize, thiz.startTop.get)

                    if (_trailer.isEmpty)
                        _trailer = IscArray(thiz.endLeft.get + tailSize, thiz.endTop.get)
                }
            }

            if (orientation == ConnectorOrientation.vertical) {

                // find the length of the leading tail segment and draw the tail segment at the same
                // point on the y axis, making a right angle
                if (style == ConnectorStyle.rightAngle) {

                    if (thiz.controlPoint1.isEmpty)
                        tailSize = if (thiz.startTop.get <= thiz.endTop.get) -thiz.tailSize else thiz.tailSize
                    else
                        tailSize = thiz.startTop.get - thiz.controlPoint1.get.getY().get


                    _leader = IscArray(thiz.startLeft.get, thiz.startTop.get - tailSize)
                    _trailer = IscArray(thiz.endLeft.get, thiz.startTop.get - tailSize)

                } else {

                    if (thiz.startTop.get <= thiz.endTop.get)
                        tailSize = -tailSize

                    // don't change any point explicitly provided by the end user (as in move, etc)
                    if (_leader.isEmpty)
                        _leader = IscArray(thiz.startLeft.get, thiz.startTop.get - tailSize)

                    if (_trailer.isEmpty)
                        _trailer = IscArray(thiz.endLeft.get, thiz.endTop.get + tailSize)
                }
            }

            if (style == ConnectorStyle.rightAngle) {
                thiz.controlPoint1 = thiz.getCenter(leader, trailer)
            } else {
                thiz.controlPoint1 = _leader
                thiz.controlPoint2 = _trailer
            }

            thiz._segmentPoints = IscArray(p1, _leader.get, _trailer.get, p2)

            isc.debugTrap("_getSegmentPoints")
            thiz._segmentPoints

    }.toThisFunc.opt

    var getCenter: ScOption[ThisFunction2[classHandler, JSUndefined[Point], JSUndefined[Point], Point]] = {
        (thiz: classHandler, p1: JSUndefined[Point], p2: JSUndefined[Point]) =>

            val startPoint = p1.getOrElse(thiz.startPoint)
            val endPoint = p2.getOrElse(thiz.endPoint)

            isc.debugTrap("getCenter")
            Point(startPoint.getX().get + isc.DrawItem._makeCoordinate((endPoint.getX().get - startPoint.getX().get) / 2), startPoint.getY().get + isc.DrawItem._makeCoordinate((endPoint.getY().get - startPoint.getY().get) / 2))
    }.toThisFunc.opt

    var _drawLineStartArrow: ScOption[ThisFunction0[classHandler, Boolean]] = {
        (thiz: classHandler) => false
    }.toThisFunc.opt

    var _drawLineEndArrow: ScOption[ThisFunction0[classHandler, Boolean]] = {
        (thiz: classHandler) => false
    }.toThisFunc.opt

    var setStartPoint: ScOption[ThisFunction5[classHandler, Int, Int, JSUndefined[Boolean], JSUndefined[Int], JSUndefined[Int], _]] = {
        (thiz: classHandler, left: Int, top: Int, fireMovedAndResized: JSUndefined[Boolean], cx: JSUndefined[Int], cy: JSUndefined[Int]) =>

            thiz.startLeft = left
            thiz.startPoint setX left

            thiz.startTop = top
            thiz.startPoint setY top

            // regenerate points

            thiz.setPoints(thiz._getSegmentPoints(jSUndefined, thiz.controlPoint2), cx, cy)
            isc.debugTrap("setStartPoint")
    }.toThisFunc.opt


    var setEndPoint: ScOption[ThisFunction5[classHandler, Int, Int, JSUndefined[Boolean], JSUndefined[Int], JSUndefined[Int], _]] = {
        (thiz: classHandler, left: Int, top: Int, fireMovedAndResized: JSUndefined[Boolean], cx: JSUndefined[Int], cy: JSUndefined[Int]) =>

            thiz.endLeft = left
            thiz.endPoint setX left

            thiz.endTop = top
            thiz.endPoint setY top

            // regenerate points

            thiz.setPoints(thiz._getSegmentPoints(thiz.controlPoint1, jSUndefined), cx, cy)
            isc.debugTrap("setEndPoint")
    }.toThisFunc.opt

    var setControlPoint1: ScOption[ThisFunction5[classHandler, Int, Int, JSUndefined[Boolean], JSUndefined[Int], JSUndefined[Int], _]] = {
        (thiz: classHandler, left: Int, top: Int, fireMovedAndResized: JSUndefined[Boolean], cx: JSUndefined[Int], cy: JSUndefined[Int]) =>

            thiz.controlPoint1.get setX left
            thiz.controlPoint1.get setY top

            // regenerate points so that the line gets dragged along with the knob
            thiz.setPoints(thiz._getSegmentPoints(thiz.controlPoint1, thiz.controlPoint2), cx, cy)

            isc.debugTrap("setControlPoint1")
    }.toThisFunc.opt

    var setControlPoint2: ScOption[ThisFunction5[classHandler, Int, Int, JSUndefined[Boolean], JSUndefined[Int], JSUndefined[Int], _]] = {
        (thiz: classHandler, left: Int, top: Int, fireMovedAndResized: JSUndefined[Boolean], cx: JSUndefined[Int], cy: JSUndefined[Int]) =>

            thiz.controlPoint2.get setX left
            thiz.controlPoint2.get setY top

            // regenerate points so that the line gets dragged along with the knob
            thiz.setPoints(thiz._getSegmentPoints(thiz.controlPoint1, thiz.controlPoint2), cx, cy)
            isc.debugTrap("setControlPoint1")
    }.toThisFunc.opt

    var getBoundingBox: ScOption[ThisFunction2[classHandler, Boolean, JSUndefined[IscArray[Int]], IscArray[Int]]] = {
        (thiz: classHandler, includeStroke: Boolean, outputBox: JSUndefined[IscArray[Int]]) =>
            val x1 = thiz.startPoint.getX().get
            val y1 = thiz.startPoint.getY().get
            val x2 = thiz.endPoint.getX().get
            val y2 = thiz.endPoint.getY().get

            val bbox = outputBox.getOrElse(IscArray())

            bbox(0) = Math.min(x1, x2)
            bbox(1) = Math.min(y1, y2)
            bbox(2) = Math.max(x1, x2)
            bbox(3) = Math.max(y1, y2)

            isc.debugTrap("getBoundingBox")
            if (includeStroke) bbox else thiz._adjustBoundingBox(true, false, bbox)
    }.toThisFunc.opt

    var showStartPointKnobs: ScOption[ThisFunction0[classHandler, _]] = isc.DrawLine.getPrototype().showStartPointKnobs.asInstanceOf[ThisFunction0[classHandler, _]].opt
    var hideStartPointKnobs: ScOption[ThisFunction0[classHandler, _]] = isc.DrawLine.getPrototype().hideStartPointKnobs.asInstanceOf[ThisFunction0[classHandler, _]].opt
    var showEndPointKnobs: ScOption[ThisFunction0[classHandler, _]] = isc.DrawLine.getPrototype().showEndPointKnobs.asInstanceOf[ThisFunction0[classHandler, _]].opt
    var hideEndPointKnobs: ScOption[ThisFunction0[classHandler, _]] = isc.DrawLine.getPrototype().hideEndPointKnobs.asInstanceOf[ThisFunction0[classHandler, _]].opt

    var showControlPoint1Knobs: ScOption[ThisFunction0[classHandler, _]] = {
        (thiz: classHandler) =>
            if (thiz._c1Knob.isEmpty || thiz._c1Knob.get.destroyed) {

                val v = thiz._normalize(thiz.controlPoint1.get.getX().get, thiz.controlPoint1.get.getY().get, "local", "global")

                thiz._c1Knob = thiz.createAutoChild(
                    "c1Knob", DrawKnob(
                        new DrawKnobProps {
                            x = v.getX().get.opt
                            y = v.getY().get.opt
                            drawPane = thiz.drawPane.opt

                            resetKnobPosition = {
                                (thiz: DrawKnob) =>
                                    val drawItem = thiz.creator.asInstanceOf[DrawLinePathSS]
                                    val v = drawItem._normalize(drawItem.controlPoint1.get.getX().get, drawItem.controlPoint1.get.getY().get, "local", "global")
                                    thiz.setCenterPoint(v.getX().get, v.getY().get, false)

                            }.toThisFunc.opt

                            updatePoints = {
                                (thiz: DrawKnob, x: Int, y: Int, dx: Int, dy: Int, state: String) =>

                                    val drawItem = thiz.creator.asInstanceOf[DrawLinePathSS]
                                    val orientation = drawItem.getConnectorOrientationState()

                                    val v = drawItem._normalize(x, y, "global", "local")
                                    val w = drawItem._normalize(dx, dy, "global", "local")
                                    val z = drawItem._normalize(0, 0, "global", "local")

                                    var _x = v.getX().get
                                    var _y = v.getY().get

                                    val _dx = w.getX().get - z.getX().get
                                    val _dy = w.getY().get - z.getY().get

                                    // Restrict movement to the axis appropriate for a given orientation.
                                    if (orientation == ConnectorOrientation.horizontal) {
                                        _y -= _dy
                                    } else {
                                        _x -= _dx
                                    }

                                    var center = drawItem._getRotationCenter()
                                    drawItem.setControlPoint1(isc.DrawItem._makeCoordinate(_x), isc.DrawItem._makeCoordinate(_y), false, center.cx, center.cy)

                            }.toThisFunc.opt
                        }
                    )
                )
                isc.debugTrap("showControlPoint1Knobs")
            }
    }.toThisFunc.opt

    var hideControlPoint1Knobs: ScOption[ThisFunction0[classHandler, _]] = {
        (thiz: classHandler) =>
            if (thiz._c1Knob.isDefined) {
                thiz._c1Knob.get.destroy()
                thiz._c1Knob = jSUndefined
                isc.debugTrap("hideControlPoint1Knobs")
            }
    }.toThisFunc.opt

    var showControlPoint2Knobs: ScOption[ThisFunction0[classHandler, _]] = {
        (thiz: classHandler) =>
            if ((thiz.connectorStyle == ConnectorStyle.diagonal) && (thiz._c2Knob.isEmpty || thiz._c1Knob.get.destroyed)) {

                val v = thiz._normalize(thiz.controlPoint2.get.getX().get, thiz.controlPoint2.get.getY().get, "local", "global")

                thiz._c1Knob = thiz.createAutoChild(
                    "c2Knob", DrawKnob(
                        new DrawKnobProps {
                            x = v.getX().get.opt
                            y = v.getY().get.opt
                            drawPane = thiz.drawPane.opt

                            resetKnobPosition = {
                                (thiz: DrawKnob) =>
                                    val drawItem = thiz.creator.asInstanceOf[DrawLinePathSS]
                                    val v = drawItem._normalize(drawItem.controlPoint2.get.getX().get, drawItem.controlPoint2.get.getY().get, "local", "global")
                                    thiz.setCenterPoint(v.getX().get, v.getY().get, false)

                            }.toThisFunc.opt

                            updatePoints = {
                                (thiz: DrawKnob, x: Int, y: Int, dx: Int, dy: Int, state: String) =>

                                    val drawItem = thiz.creator.asInstanceOf[DrawLinePathSS]
                                    val orientation = drawItem.getConnectorOrientationState()

                                    val v = drawItem._normalize(x, y, "global", "local")
                                    val w = drawItem._normalize(dx, dy, "global", "local")
                                    val z = drawItem._normalize(0, 0, "global", "local")

                                    var _x = v.getX().get
                                    var _y = v.getY().get

                                    val _dx = w.getX().get - z.getX().get
                                    val _dy = w.getY().get - z.getY().get

                                    // Restrict movement to the axis appropriate for a given orientation.
                                    if (orientation == ConnectorOrientation.horizontal) {
                                        _y -= _dy
                                    } else {
                                        _x -= _dx
                                    }

                                    var center = drawItem._getRotationCenter()
                                    drawItem.setControlPoint2(isc.DrawItem._makeCoordinate(_x), isc.DrawItem._makeCoordinate(_y), false, center.cx, center.cy)

                            }.toThisFunc.opt
                        }
                    )
                )
                isc.debugTrap("showControlPoint2Knobs")
            }
    }.toThisFunc.opt

    var hideControlPoint2Knobs: ScOption[ThisFunction0[classHandler, _]] = {
        (thiz: classHandler) =>
            if (thiz._c2Knob.isDefined) {
                thiz._c2Knob.get.destroy()
                thiz._c2Knob = jSUndefined
                isc.debugTrap("hideControlPoint1Knobs")
            }
    }.toThisFunc.opt

    var updateStartPointKnob: ScOption[ThisFunction0[classHandler, _]] = {
        (thiz: classHandler) =>
            if (thiz._startKnob.isDefined) {
                val v = thiz._normalize(thiz.startLeft.get, thiz.startTop.get, "local", "global")
                thiz.setCenterPoint(v.getX().get, v.getY().get)
                isc.debugTrap("updateStartPointKnob")
            }
    }.toThisFunc.opt

    var updateEndPointKnob: ScOption[ThisFunction0[classHandler, _]] = {
        (thiz: classHandler) =>
            if (thiz._startKnob.isDefined) {
                val v = thiz._normalize(thiz.endLeft.get, thiz.endTop.get, "local", "global")
                thiz.setCenterPoint(v.getX().get, v.getY().get)
                isc.debugTrap("updateEndPointKnob")
            }
    }.toThisFunc.opt

    var updateControlPoint1Knob: ScOption[ThisFunction0[classHandler, _]] = {
        (thiz: classHandler) =>
            if (thiz._c1Knob.isDefined) {
                val v = thiz._normalize(thiz.controlPoint1.get.getX().get, thiz.controlPoint1.get.getY().get, "local", "global")
                thiz._c1Knob.get.setCenterPoint(v.getX().get, v.getY().get)
                isc.debugTrap("updateControlPoint1Knob")
            }
    }.toThisFunc.opt


    var updateControlPoint2Knob: ScOption[ThisFunction0[classHandler, _]] = {
        (thiz: classHandler) =>
            if (thiz._c2Knob.isDefined) {
                val v = thiz._normalize(thiz.controlPoint2.get.getX().get, thiz.controlPoint2.get.getY().get, "local", "global")
                thiz._c2Knob.get.setCenterPoint(v.getX().get, v.getY().get)
                isc.debugTrap("updateControlPoint2Knob")
            }
    }.toThisFunc.opt

    var updateControlKnobs: ScOption[ThisFunction1[classHandler, IscArray[JSAny], _]] = {
        (thiz: classHandler, arguments: IscArray[JSAny]) =>
            isc.debugTrap("updateControlKnobs begin")
            thiz.Super("updateControlKnobs", arguments)
            thiz.updateStartPointKnob()
            thiz.updateEndPointKnob()
            thiz.updateControlPoint1Knob()
            thiz.updateControlPoint2Knob()
            isc.debugTrap("updateControlKnobs end")
    }.toThisFunc.opt

    var moveStartPointTo: ScOption[ThisFunction2[classHandler, Int, Int, _]] = {
        (thiz: classHandler, left: Int, top: Int) =>
            thiz._movePointToPoint(left, top, thiz.startLeft.get, thiz.startTop.get)
            isc.debugTrap("moveStartPointTo")
    }.toThisFunc.opt

    var _updateLocalTransform: ScOption[ThisFunction7[classHandler, AffineTransform, Int, Int, JSObject, Boolean, Boolean, IscArray[JSAny], _]] = {
        (thiz: classHandler, transform: AffineTransform, cx: Int, cy: Int, initialShape: JSObject, fireReshaped: Boolean, viaLocalTransformOnly: Boolean, arguments: IscArray[JSAny]) =>

            isc.debugTrap("_updateLocalTransform")

            if (viaLocalTransformOnly)
                thiz.Super("_updateLocalTransform", IscArray(transform, cx, cy, initialShape, fireReshaped, true), arguments)
            else {
                val epsilon: Double = 1e-9

                val det = transform.getDeterminant()
                if (Math.abs(det) > epsilon) {
                    val dx = isc.DrawItem._makeCoordinate(transform.m02 * transform.m11 - transform.m12 * transform.m01)
                    val dy = isc.DrawItem._makeCoordinate(transform.m12 * transform.m00 - transform.m02 * transform.m10)

                    thiz.Super("_updateLocalTransform", IscArray(transform.duplicate().rightMultiply(isc.AffineTransform.getTranslateTransform(-dx, -dy)), cx, cy, initialShape, false, true), arguments)

                    var startLeft = thiz.startLeft.get
                    startLeft += dx

                    thiz.startPoint setX dx

                    var startTop = thiz.startTop.get
                    startTop += dy

                    thiz.startPoint setY dy

                    var endLeft = thiz.endLeft.get
                    endLeft += dx

                    thiz.endPoint setX dx
                    var endTop = thiz.endTop.get
                    endTop += dy

                    thiz.endPoint setY dy

                    thiz.controlPoint1.get setX dx
                    thiz.controlPoint1.get setY dy

                    thiz.controlPoint2.get setX dx
                    thiz.controlPoint2.get setY dy

                    var center = thiz._getRotationCenter()
                    thiz._updateRotationCenter(cx, cy, center.cx, center.cy)

                    // regenerate points
                    thiz.setPoints(thiz._getSegmentPoints(thiz.controlPoint1, thiz.controlPoint2))

                } else
                    thiz.Super("_updateLocalTransform", IscArray(transform, cx, cy, initialShape, fireReshaped, true), arguments)

            }
    }.toThisFunc.opt

    override val `type`: ScOption[String] = "DrawLinePathSS".opt
}
