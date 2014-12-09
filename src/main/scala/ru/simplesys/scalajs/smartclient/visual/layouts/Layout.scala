package ru.simplesys.scalajs
package smartclient
package visual
package layouts

import ru.simplesys.macrojs._
import visual._

import scala.scalajs.js


trait Layout extends Canvas {
  def vertical: js.Boolean = ???

  //def members
  def getMembers(): js.Array[Canvas] = ???
  def setMembers(m: js.Array[Canvas]): Unit = ???
}



trait LayoutPropsAbs[T <: Layout] extends SCProps[Layout, T] {
  //def vertical: Boolean
  def members: js.Array[Canvas]
  def canvasProps: CanvasProps[T]

}


object Layout {
  def apply(props: LayoutProps[Layout]): Layout = js.Dynamic.global.isc.Layout.create(props.toJSLiteral).asInstanceOf[Layout]
}

case class LayoutProps[T <: Layout](vertical: Boolean, members: js.Array[Canvas], canvasProps: CanvasProps[T]) extends LayoutPropsAbs[T] {
  //override def create: Layout = Layout(this)
}

trait HLayout extends Layout

object HLayout {
  def apply(props: HLayoutProps[HLayout]): HLayout = js.Dynamic.global.isc.HLayout.create(props.toJSLiteral).asInstanceOf[HLayout]
}

case class HLayoutProps[T <: HLayout](members: js.Array[Canvas], canvasProps: CanvasProps[T]) extends LayoutPropsAbs[T] {
  //override def create: HLayout = HLayout(this)
}

trait VLayout extends Layout

object VLayout {
  def apply(props: VLayoutProps[VLayout]): VLayout = js.Dynamic.global.isc.VLayout.create(props.toJSLiteral).asInstanceOf[VLayout]
}


case class VLayoutProps[T <: VLayout](members: js.Array[Canvas], canvasProps: CanvasProps[T]) extends LayoutPropsAbs[T] {
  //override def create: VLayout = VLayout(this)
}
