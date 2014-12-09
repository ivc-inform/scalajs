package ru.simplesys.scalajs
package smartclient
package visual

import scala.scalajs.js
import ru.simplesys.macrojs._


trait Layout extends Canvas {
  def vertical: js.Boolean = ???

  //def members
  def getMembers(): js.Array[Canvas] = ???
  def setMembers(m: js.Array[Canvas]): Unit = ???
}



trait LayoutPropsAbs[T <: Layout] extends SCProps[Layout, T] {
  //def vertical: Boolean
  //def members: js.Array[ToSC[Canvas]]
  def members: js.Array[Canvas]
  def canvasProps: CanvasProps[T]
}



//case class LayoutProps[T <: Layout](vertical: Boolean, members: js.Array[ToSC[Canvas]], canvasProps: CanvasProps[T]) extends LayoutPropsAbs[T] {
case class LayoutProps[T <: Layout](vertical: Boolean, members: js.Array[Canvas], canvasProps: CanvasProps[T]) extends LayoutPropsAbs[T] {
  override def toSC: ToLayout = new ToLayout(this.toJSLiteral)
}

class ToLayout(val props: JSProps) extends ToSC[Layout] {
  override def initBlock: js.Function0[Layout] = () => js.Dynamic.global.isc.Layout.create(props).asInstanceOf[Layout]
}



trait HLayout extends Layout

case class HLayoutProps[T <: HLayout](members: js.Array[Canvas], canvasProps: CanvasProps[T]) extends LayoutPropsAbs[T] {
//case class HLayoutProps[T <: HLayout](members: js.Array[ToSC[Canvas]], canvasProps: CanvasProps[T]) extends LayoutPropsAbs[T] {
  override def toSC: ToHLayout = new ToHLayout(this.toJSLiteral)
}

class ToHLayout(val props: JSProps) extends ToSC[HLayout] {
  override def initBlock: js.Function0[HLayout] = () => js.Dynamic.global.isc.HLayout.create(props).asInstanceOf[HLayout]
}


trait VLayout extends Layout

case class VLayoutProps[T <: VLayout](members: js.Array[Canvas], canvasProps: CanvasProps[T]) extends LayoutPropsAbs[T] {
//case class VLayoutProps[T <: VLayout](members: js.Array[ToSC[Canvas]], canvasProps: CanvasProps[T]) extends LayoutPropsAbs[T] {
  def toSC: ToVLayout = new ToVLayout(this.toJSLiteral)
}

class ToVLayout(val props: JSProps) extends ToSC[VLayout] {
  override def initBlock: js.Function0[VLayout] = () => js.Dynamic.global.isc.VLayout.create(props).asInstanceOf[VLayout]
}

