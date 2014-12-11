package ru.simplesys.scalajs
package smartclient
package visual
package layouts

import ru.simplesys.macrojs._
import visual._

import scala.scalajs.js


trait Layout extends Canvas {
  def vertical: js.Boolean = js.native

  //def members
  def getMembers(): js.Array[Canvas] = js.native
  def setMembers(m: js.Array[Canvas]): Unit = js.native
}



trait LayoutPropsAbs[T <: Layout] extends SCProps[T, T] {
  //def vertical: Boolean
  def members: js.Array[Canvas]
  def canvasProps: CanvasProps[T]

}


object Layout extends SCApply[Layout, LayoutProps[Layout]]

case class LayoutProps[T <: Layout](vertical: Boolean, members: js.Array[Canvas], canvasProps: CanvasProps[T]) extends LayoutPropsAbs[T] {
  //override def create: Layout = Layout(this)
}

trait HLayout extends Layout

object HLayout extends SCApply[HLayout, HLayoutProps[HLayout]]

case class HLayoutProps[T <: HLayout](members: js.Array[Canvas], canvasProps: CanvasProps[T]) extends LayoutPropsAbs[T] {
  //override def create: HLayout = HLayout(this)
}

trait VLayout extends Layout

object VLayout extends SCApply[VLayout, VLayoutProps[VLayout]]


case class VLayoutProps[T <: VLayout](members: js.Array[Canvas], canvasProps: CanvasProps[T]) extends LayoutPropsAbs[T] {
  //override def create: VLayout = VLayout(this)
}
