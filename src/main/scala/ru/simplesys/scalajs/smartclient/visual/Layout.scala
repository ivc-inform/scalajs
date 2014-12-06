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



trait LayoutPropsAbs[T <: Layout] extends SCProps{
  //def vertical: Boolean
  def members: js.Array[Canvas]
  def canvasProps: CanvasProps[T]
}



case class LayoutProps[T <: Layout](vertical: Boolean, members: js.Array[Canvas], canvasProps: CanvasProps[T]) extends LayoutPropsAbs[T]


object Layout {
  def apply(props: LayoutProps[Layout]): () => Layout = () => {
    js.Dynamic.global.isc.Layout.create(props.toJSLiteral).asInstanceOf[Layout]
  }
}


trait HLayout extends Layout

case class HLayoutProps[T <: HLayout](members: js.Array[Canvas], canvasProps: CanvasProps[T]) extends LayoutPropsAbs[T]

object HLayout {
  def apply(props: HLayoutProps[HLayout]): () => HLayout = () => {
    js.Dynamic.global.isc.HLayout.create(props.toJSLiteral).asInstanceOf[HLayout]
  }
}



trait VLayout extends Layout

case class VLayoutProps[T <: VLayout](members: js.Array[Canvas], canvasProps: CanvasProps[T]) extends LayoutPropsAbs[T]

object VLayout {
  def apply(props: VLayoutProps[VLayout]): () => VLayout = () => {
    js.Dynamic.global.isc.VLayout.create(props.toJSLiteral).asInstanceOf[VLayout]
  }
}
