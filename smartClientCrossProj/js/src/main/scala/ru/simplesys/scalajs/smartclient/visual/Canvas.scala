package ru.simplesys.scalajs
package smartclient
package visual

import ru.simplesys.macrojs._
import smartclient.nonvisual.common.SCClass

import scala.scalajs.js


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

//Splitter settings
sealed trait SplitterSetting
case object ShowSplitter extends SplitterSetting
case object ShowSplitterResizeOther extends SplitterSetting
case object NoSplitter extends SplitterSetting
//Splitter settings

trait Canvas extends SCClass {
  def autoDraw: Boolean = js.native

  //def top: js.Number = js.native
  def getTop(): Int = js.native
  protected def setTop(t: js.Any): Unit = js.native

  //def left: js.Number = js.native
  def getLeft(): Int = js.native
  protected def setLeft(l: js.Any): Unit = js.native

  //def height: js.Number = js.native
  def getHeight(): Int = js.native
  protected def setHeight(h: js.Any): Unit = js.native //Number Or String

  //def width: js.Number = js.native
  def getWidth(): Int = js.native
  protected def setWidth(w: js.Any): Unit = js.native //Number Or String

  def getRight(): Int = js.native
  def setRight(r: Int): Unit = js.native //Number Or String
  //protected def setRight(r: js.Any): Unit = js.native //Number Or String

  def getBottom(): Int = js.native
  def setBottom(b: Int): Unit = js.native

  def click(): Boolean = js.native

  def showResizeBar: Boolean = js.native
  def setShowResizeBar(b: Boolean): Unit = js.native
  protected def resizeBarTarget: String = js.native
}

object Canvas extends SCApply[Canvas, CanvasProps[Canvas]] {
  implicit class ToCanvasExt(c: Canvas) {
    @inline def setHeight(h: SizeSpec) = c.setHeight(h)
    @inline def setWidth(w: SizeSpec) = c.setWidth(w)
    @inline def setTop(t: PointSpec) = c.setTop(t)
    @inline def setLeft(l: PointSpec) = c.setLeft(l)
    //def setRight(r: PointSpec) = c.setRight(r)
    @inline def getSplitterSetting: SplitterSetting = {
      if (c.showResizeBar) {
        if (c.resizeBarTarget == "next") ShowSplitterResizeOther
        else ShowSplitter
      }
      else NoSplitter
    }
  }
}

class CanvasProps[T <: Canvas] private (val left: PointSpec,
                                        val top: PointSpec,
                                        val width: SizeSpec,
                                        val height: SizeSpec,
                                        val showResizeBar: Boolean,
                                        val resizeBarTarget: String,
                                        val autoDraw: Boolean,
                                        val click: Option[js.ThisFunction0[T, Boolean]]) extends SCProps[Canvas, T] {
  //override def create: Canvas = Canvas(this)
}

object CanvasProps {
  def apply[T <: Canvas](left: PointSpec = 0 p,
            top: PointSpec = 0 p,
            width: SizeSpec,
            height: SizeSpec,
            splitterSetting: SplitterSetting = NoSplitter,
            autoDraw: Boolean = false,
            click: Option[js.ThisFunction0[T, Boolean]] = None): CanvasProps[T] = {

    val (showResizeBar, resizeBarTarget) = splitterSetting match {
      case ShowSplitter => (true, null)
      case ShowSplitterResizeOther => (true, "next")
      case NoSplitter => (false, null)
    }

    new CanvasProps(left, top, width, height, showResizeBar, resizeBarTarget, autoDraw, click)
  }
}