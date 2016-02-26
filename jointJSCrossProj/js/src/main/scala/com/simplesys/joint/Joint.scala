import scala.scalajs.js
import scala.scalajs.js.annotation._

package com.simplesys {

    package joint {

        package dia {

            import com.simplesys.System.{JSAny, JSArray, JSObject}
            import com.simplesys.backbone.{Model, View}
            import com.simplesys.option.{ScNone, ScOption}

            @js.native
            trait IElementSize extends JSObject {
                var width: Double = js.native
                var height: Double = js.native
            }

            @js.native
            @JSName("joint.dia.Graph")
            class Graph extends Model {
                def addCell(cell: Cell): Unit = js.native
                def addCells(cells: JSArray[Cell]): Unit = js.native
                def initialize(): Unit = js.native
                def fromJSON(json: JSAny): Unit = js.native
                def toJSON(): JSObject = js.native
                def clear(): Unit = js.native
                def getConnectedLinks(cell: Cell, opt: JSAny = js.native): JSArray[Link] = js.native
                def disconnectLinks(cell: Cell): Unit = js.native
                def removeLinks(cell: Cell): Unit = js.native
                def findModelsFromPoint(point: JSAny): JSArray[Element] = js.native
            }

            @js.native
            @JSName("joint.dia.Cell")
            class Cell extends Model {
                def toJSON(): JSObject = js.native
                def remove(options: JSAny = js.native): Unit = js.native
                def toFront(): Unit = js.native
                def toBack(): Unit = js.native
                def embed(cell: Cell): Unit = js.native
                def unembed(cell: Cell): Unit = js.native
                def getEmbeddedCells(): JSArray[Cell] = js.native
                @JSName("clone")
                def cloneJS(opt: JSAny = js.native): Model /*Cell?*/ = js.native
                def attr(attrs: JSAny): Cell = js.native
            }

            @js.native
            @JSName("joint.dia.Element")
            class Element extends Cell {
                def position(x: Double, y: Double): Element = js.native
                def translate(tx: Double, ty: Double = js.native): Element = js.native
                def resize(width: Double, height: Double): Element = js.native
                def rotate(angle: Double, options: JSAny): Element = js.native
                def remove(): Unit = js.native
            }

            @js.native
            trait IDefaults extends JSObject {
                var `type`: String = js.native
            }

            @js.native
            @JSName("joint.dia.Link")
            class Link extends Cell {
                @JSName("defaults")
                def diaDefaults(): IDefaults = js.native
                def disconnect(): Link = js.native
                def label(idx: Double = js.native, value: JSAny = js.native): js.Dynamic = js.native
                def remove(): Unit = js.native
            }

            @js.native
            trait PaperOptions extends JSObject {
                var width: Double
                var height: Double
                var gridSize: Double
                val perpendicularLinks: Boolean
                val elementView: ElementView
                val linkView: LinkView
                var model: Model
                var defaultLink: Link
                var defaultRouter: Link
                var defaultConnector: Link
                var interactive: Boolean
            }

            object PaperOptions {
                def apply(width: ScOption[Double] = ScNone,
                          height: ScOption[Double] = ScNone,
                          gridSize: ScOption[Double] = ScNone,
                          perpendicularLinks: ScOption[Boolean] = ScNone,
                          elementView: ScOption[ElementView] = ScNone,
                          linkView: ScOption[LinkView] = ScNone,
                          model: ScOption[Model] = ScNone): PaperOptions = {

                    val res = js.Dynamic.literal

                    width.foreach(item => res(width = item))
                    height.foreach(item => res(height = item))
                    gridSize.foreach(item => res(gridSize = item))
                    perpendicularLinks.foreach(item => res(perpendicularLinks = item))
                    elementView.foreach(item => res(elementView = item))
                    linkView.foreach(item => res(linkViewView = item))
                    model.foreach(item => res(model = item))

                    res.asInstanceOf[PaperOptions]
                }
            }

            @js.native
            @JSName("joint.dia.Paper")
            class Paper extends View[Model] {
                var options: PaperOptions = js.native
                def setDimensions(width: Double, height: Double): Unit = js.native
                def scale(sx: Double, sy: Double = js.native, ox: Double = js.native, oy: Double = js.native): Paper = js.native
                def rotate(deg: Double, ox: Double = js.native, oy: Double = js.native): Paper = js.native
                def findView(el: JSAny): CellView = js.native
                def findViewByModel(modelOrId: JSAny): CellView = js.native
                def findViewsFromPoint(p: JSAny): JSArray[CellView] = js.native
                def findViewsInArea(r: JSAny): JSArray[CellView] = js.native
                def fitToContent(opt: JSAny = js.native): Unit = js.native
            }

            @js.native
            @JSName("joint.dia.ElementView")
            class ElementView extends CellView {
                def scale(sx: Double, sy: Double): Unit = js.native
            }

            @js.native
            @JSName("joint.dia.CellView")
            class CellView extends View[Cell] {
                def getBBox(): JSAny = js.native
                def highlight(el: JSAny = js.native): Unit = js.native
                def unhighlight(el: JSAny = js.native): Unit = js.native
                def findMagnet(el: JSAny): Unit = js.native
                def getSelector(el: JSAny): Unit = js.native
                def pointerdblclick(evt: JSAny, x: Double, y: Double): Unit = js.native
                def pointerclick(evt: JSAny, x: Double, y: Double): Unit = js.native
                def pointerdown(evt: JSAny, x: Double, y: Double): Unit = js.native
                def pointermove(evt: JSAny, x: Double, y: Double): Unit = js.native
                def pointerup(evt: JSAny, x: Double, y: Double): Unit = js.native
            }

            @js.native
            @JSName("joint.dia.LinkView")
            class LinkView extends CellView {
                def getConnectionLength(): Double = js.native
                def getPointAtLength(length: Double): JSAny = js.native
            }

        }

        package shapes {

            package basic {

                import com.simplesys.System.JSAny

                @js.native
                @JSName("joint.shapes.basic.Generic")
                class Generic[T] extends joint.dia.Element {
                    @JSName("clone")
                    def cloneSHP(opt: JSAny = js.native): T = js.native
                }

                @js.native
                @JSName("joint.shapes.basic.Rect")
                class Rect extends Generic[Rect] {
                }

                @js.native
                @JSName("joint.shapes.basic.Text")
                class Text extends Generic[Text] {
                }

                @js.native
                @JSName("joint.shapes.basic.Circle")
                class Circle extends Generic[Circle] {
                }

                @js.native
                @JSName("joint.shapes.basic.Image")
                class Image extends Generic[Image] {
                }

            }

        }

        package util {

            import com.simplesys.System._

            @js.native
            @JSName("joint.util")
            object Util extends JSObject {
                def uuid(): String = js.native
                def guid(obj: JSAny): String = js.native
                def mixin(objects: JSArrayAny): js.Dynamic = js.native
                def supplement(objects: JSArrayAny): js.Dynamic = js.native
                def deepMixin(objects: JSArrayAny): js.Dynamic = js.native
                def deepSupplement(objects: JSArrayAny, defaultIndicator: JSAny = js.native): js.Dynamic = js.native
            }
        }

    }

}
