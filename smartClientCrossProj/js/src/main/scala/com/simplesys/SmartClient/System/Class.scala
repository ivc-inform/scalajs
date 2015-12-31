package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System.props.ClassProps

import scala.scalajs.js
import inst.Class

@js.native
abstract class AbstractClass[T <: Class, P <: ClassProps] {

    lazy protected val className: String = classOf[T].getClass.getSimpleName

    def create(propsClass: P): T = js.Dynamic.global.isc.selectDynamic(className).create().asInstanceOf[T]
}

object Class extends AbstractClass[Class, ClassProps]
