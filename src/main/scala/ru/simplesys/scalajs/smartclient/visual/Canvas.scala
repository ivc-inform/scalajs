package ru.simplesys.scalajs
package smartclient
package visual

import scala.scalajs.js

trait SizeSpec {
  def toJS: js.Any
}

object SizeSpec {
  implicit def sizeSpecToJS(p: SizeSpec): js.Any = p.toJS
}

trait PointSpec {
  def toJS: js.Any
}

object PointSpec {
  implicit def pointSpecToJS(p: PointSpec): js.Any = p.toJS
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

trait Canvas extends js.Object {
  def autoDraw: js.Boolean = ???

  //def top: js.Number = ???
  def getTop(): js.Number = ???
  protected def setTop(t: js.Any): Unit = ???

  //def left: js.Number = ???
  def getLeft(): js.Number = ???
  protected def setLeft(l: js.Any): Unit = ???

  //def height: js.Number = ???
  def getHeight(): js.Number = ???
  protected def setHeight(h: js.Any) = ??? //Number Or String

  //def width: js.Number = ???
  def getWidth(): js.Number = ???
  protected def setWidth(w: js.Any): Unit = ??? //Number Or String

  def getRight(): js.Number = ???
  def setRight(r: js.Number): Unit = ??? //Number Or String
  //protected def setRight(r: js.Any): Unit = ??? //Number Or String

  def getBottom(): js.Number = ???
  def setBottom(b: js.Number): Unit = ???

  def click(): js.Boolean = ???
}

object Canvas {
  implicit class ToCanvasExt(c: Canvas) {
    def setHeight(h: SizeSpec) = c.setHeight(h)
    def setWidth(w: SizeSpec) = c.setWidth(w)
    def setTop(t: PointSpec) = c.setTop(t)
    def setLeft(l: PointSpec) = c.setLeft(l)
    //def setRight(r: PointSpec) = c.setRight(r)
  }
}

case class CanvasProps(left: PointSpec, top: PointSpec, width: SizeSpec, height: SizeSpec)