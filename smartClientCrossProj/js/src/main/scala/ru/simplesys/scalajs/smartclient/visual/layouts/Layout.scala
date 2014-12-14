package ru.simplesys.scalajs
package smartclient
package visual
package layouts

import ru.simplesys.macrojs._
import visual._

import scala.collection.mutable
import scala.scalajs.js

// Layout
trait Layout extends Canvas {
  def vertical: js.Boolean = js.native

  //def members
  def getMembers(): js.Array[Canvas] = js.native
  def setMembers(m: js.Array[Canvas]): Unit = js.native
}


trait LayoutProps[T <: Layout] extends CanvasProps[T] {
  var vertical = noSCProp[Boolean]
  var members = noSCProp[Seq[Canvas]]
}

object Layout extends SCApply[Layout, LayoutProps[Layout]]
// Layout

// HLayout
trait HLayout extends Layout

class HLayoutProps[T <: HLayout] extends LayoutProps[T]/* {
  override def vertical_=(v: SCPropOpt[Boolean]): Unit = throw new RuntimeException("cannot set vertical in HLayout")
}*/

object HLayout extends SCApply[HLayout, HLayoutProps[HLayout]]
// HLayout

// VLayout
trait VLayout extends Layout

class VLayoutProps[T <: VLayout] extends LayoutProps[T] /*{
  override def vertical_=(v: SCPropOpt[Boolean]): Unit = throw new RuntimeException("cannot set vertical in VLayout")
}*/

object VLayout extends SCApply[VLayout, VLayoutProps[VLayout]]
// VLayout

