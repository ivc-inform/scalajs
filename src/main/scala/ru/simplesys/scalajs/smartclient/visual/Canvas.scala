package ru.simplesys.scalajs
package smartclient
package visual

import ru.simplesys.macrojs._

import scala.scalajs.js
import scala.scalajs.js.Function0


// coordinates and sizes specifications
trait SizeSpec {
  def toJS: js.Any
}

object SizeSpec {
  @inline implicit def sizeSpecToJS(p: SizeSpec): js.Any = p.toJS
}

trait PointSpec {
  def toJS: js.Any
}

object PointSpec {
  @inline implicit def pointSpecToJS(p: PointSpec): js.Any = p.toJS
}

case class PixelPointSpec(pos: Int) extends PointSpec with SizeSpec {
  override def toJS: js.prim.Number = pos
}

case class PctPointSpec(pct: Int) extends PointSpec with SizeSpec {
  override def toJS: js.prim.String = s"$pct%"
}

case object WildCard extends SizeSpec {
  override def toJS: js.prim.String = "*"
}
// coordinates and sizes specifications


trait Canvas extends js.Object {
  def autoDraw: Boolean = ???

  //def top: js.Number = ???
  def getTop(): Int = ???
  protected def setTop(t: js.Any): Unit = ???

  //def left: js.Number = ???
  def getLeft(): Int = ???
  protected def setLeft(l: js.Any): Unit = ???

  //def height: js.Number = ???
  def getHeight(): Int = ???
  protected def setHeight(h: js.Any) = ??? //Number Or String

  //def width: js.Number = ???
  def getWidth(): Int = ???
  protected def setWidth(w: js.Any): Unit = ??? //Number Or String

  def getRight(): Int = ???
  def setRight(r: Int): Unit = ??? //Number Or String
  //protected def setRight(r: js.Any): Unit = ??? //Number Or String

  def getBottom(): Int = ???
  def setBottom(b: Int): Unit = ???

  def click(): Boolean = ???
}

object Canvas {
  implicit class ToCanvasExt(c: Canvas) {
    @inline def setHeight(h: SizeSpec) = c.setHeight(h)
    @inline def setWidth(w: SizeSpec) = c.setWidth(w)
    @inline def setTop(t: PointSpec) = c.setTop(t)
    @inline def setLeft(l: PointSpec) = c.setLeft(l)
    //def setRight(r: PointSpec) = c.setRight(r)
  }
}

class ToCanvas(val props: JSProps) extends ToSC[Canvas] {

  override def initBlock: js.Function0[Canvas] = () => js.Dynamic.global.isc.Canvas.create(props).asInstanceOf[Canvas]
}

case class CanvasProps[T <: Canvas](left: PointSpec = 0 p,
                                    top: PointSpec = 0 p,
                                    width: SizeSpec,
                                    height: SizeSpec,
                                    autoDraw: Boolean = false,
                                    click: Option[js.ThisFunction0[T, Boolean]] = None) extends SCProps[Canvas, T] {


  def toSC: ToCanvas = new ToCanvas(this.toJSLiteral)
  //override def toSC: ToSC[Canvas] = ???
}

