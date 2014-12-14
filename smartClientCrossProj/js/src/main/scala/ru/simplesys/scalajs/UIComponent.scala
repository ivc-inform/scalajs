package ru.simplesys.scalajs

import ru.simplesys.macrojs._
import smartclient.visual.layouts.{VLayoutProps, VLayout}
import smartclient.visual._
import smartclient._
import scala.scalajs.js

trait MyComplexComponent extends VLayout {

}

trait MyComplexComponentProps extends VLayoutProps[MyComplexComponent]

object MyComplexComponent extends SCApply[MyComplexComponent, MyComplexComponentProps](Some("VLayout"))