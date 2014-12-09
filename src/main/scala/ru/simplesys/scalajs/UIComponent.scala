package ru.simplesys.scalajs

import ru.simplesys.macrojs._
import smartclient.visual._

import scala.scalajs.js

trait MyComplexComponent extends VLayout {

}

case class MyComplexComponentProps private (vLayoutProps: VLayoutProps[MyComplexComponent]) extends SCProps[VLayout, VLayout] {
  //override def create: MyComplexComponent = MyComplexComponent(this)
}

object MyComplexComponent {
  def apply(props: MyComplexComponentProps): MyComplexComponent = {
    js.Dynamic.global.isc.VLayout.create(props.toJSLiteral).asInstanceOf[MyComplexComponent]
  }
}