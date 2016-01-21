import scala.scalajs.js
import scala.scalajs.js.annotation._

package com.simplesys {

    package joint {

        package dia {

            @js.native
            trait IElementSize extends js.Object {
                var width: Double = js.native
                var height: Double = js.native
            }

            @js.native
            @JSName("joint.dia.Graph")
            class Graph extends backbone.Model {
                def addCell(cell: Cell): Unit = js.native
                def addCells(cells: js.Array[Cell]): Unit = js.native
                def initialize(): Unit = js.native
                def fromJSON(json: js.Any): Unit = js.native
                def toJSON(): Object = js.native
                def clear(): Unit = js.native
                def getConnectedLinks(cell: Cell, opt: js.Any = ???): js.Array[Link] = js.native
                def disconnectLinks(cell: Cell): Unit = js.native
                def removeLinks(cell: Cell): Unit = js.native
                def findModelsFromPoint(point: js.Any): js.Array[Element] = js.native
            }

            @js.native
            @JSName("joint.dia.Cell")
            class Cell extends backbone.Model {
                def toJSON(): Object = js.native
                def remove(options: js.Any = ???): Unit = js.native
                def toFront(): Unit = js.native
                def toBack(): Unit = js.native
                def embed(cell: Cell): Unit = js.native
                def unembed(cell: Cell): Unit = js.native
                def getEmbeddedCells(): js.Array[Cell] = js.native
                @JSName("clone")
                def cloneCell(opt: js.Any = ???): Cell = js.native
                @JSName("clone")
                def cloneModel(opt: js.Any = ???): backbone.Model = js.native
                def attr(attrs: js.Any): Cell = js.native
            }

            @js.native
            @JSName("joint.dia.Element")
            class Element extends Cell {
                def position(x: Double, y: Double): Element = js.native
                def translate(tx: Double, ty: Double = ???): Element = js.native
                def resize(width: Double, height: Double): Element = js.native
                def rotate(angle: Double, options: js.Any): Element = js.native
                def remove(): Unit = js.native
            }

            @js.native
            trait IDefaults extends js.Object {
                var `type`: String = js.native
            }

            @js.native
            @JSName("joint.dia.Link")
            class Link extends Cell {
                @JSName("defaults")
                def diaDefaults(): IDefaults = js.native
                def disconnect(): Link = js.native
                def label(idx: Double = ???, value: js.Any = ???): js.Dynamic = js.native
                def remove(): Unit = js.native
            }

            @js.native
            trait IOptions extends js.Object {
                var width: Double = js.native
                var height: Double = js.native
                var gridSize: Double = js.native
                var perpendicularLinks: Boolean = js.native
                var elementView: ElementView = js.native
                var linkView: LinkView = js.native
            }

            @js.native
            @JSName("joint.dia.Paper")
            class Paper extends backbone.View[backbone.Model] {
                var options: IOptions = js.native
                def setDimensions(width: Double, height: Double): Unit = js.native
                def scale(sx: Double, sy: Double = ???, ox: Double = ???, oy: Double = ???): Paper = js.native
                def rotate(deg: Double, ox: Double = ???, oy: Double = ???): Paper = js.native
                def findView(el: js.Any): CellView = js.native
                def findViewByModel(modelOrId: js.Any): CellView = js.native
                def findViewsFromPoint(p: js.Any): js.Array[CellView] = js.native
                def findViewsInArea(r: js.Any): js.Array[CellView] = js.native
                def fitToContent(opt: js.Any = ???): Unit = js.native
            }

            @js.native
            @JSName("joint.dia.ElementView")
            class ElementView extends CellView {
                def scale(sx: Double, sy: Double): Unit = js.native
            }

            @js.native
            @JSName("joint.dia.CellView")
            class CellView extends backbone.View[Cell] {
                def getBBox(): js.Any = js.native
                def highlight(el: js.Any = ???): Unit = js.native
                def unhighlight(el: js.Any = ???): Unit = js.native
                def findMagnet(el: js.Any): Unit = js.native
                def getSelector(el: js.Any): Unit = js.native
                def pointerdblclick(evt: js.Any, x: Double, y: Double): Unit = js.native
                def pointerclick(evt: js.Any, x: Double, y: Double): Unit = js.native
                def pointerdown(evt: js.Any, x: Double, y: Double): Unit = js.native
                def pointermove(evt: js.Any, x: Double, y: Double): Unit = js.native
                def pointerup(evt: js.Any, x: Double, y: Double): Unit = js.native
            }

            @js.native
            @JSName("joint.dia.LinkView")
            class LinkView extends CellView {
                def getConnectionLength(): Double = js.native
                def getPointAtLength(length: Double): js.Any = js.native
            }

        }

        package shapes {

            package basic {

                @js.native
                @JSName("joint.shapes.basic.Generic")
                class Generic extends joint.dia.Element {
                }

                @js.native
                @JSName("joint.shapes.basic.Rect")
                class Rect extends Generic {
                }

                @js.native
                @JSName("joint.shapes.basic.Text")
                class Text extends Generic {
                }

                @js.native
                @JSName("joint.shapes.basic.Circle")
                class Circle extends Generic {
                }

                @js.native
                @JSName("joint.shapes.basic.Image")
                class Image extends Generic {
                }

            }

        }

        package util {
            @js.native
            @JSName("joint.util")
            object Util extends js.Object {
                def uuid(): String = js.native
                def guid(obj: js.Any): String = js.native
                def mixin(objects: js.Array[js.Any]): js.Dynamic = js.native
                def supplement(objects: js.Array[js.Any]): js.Dynamic = js.native
                def deepMixin(objects: js.Array[js.Any]): js.Dynamic = js.native
                def deepSupplement(objects: js.Array[js.Any], defaultIndicator: js.Any = ???): js.Dynamic = js.native
            }
        }

    }

}
