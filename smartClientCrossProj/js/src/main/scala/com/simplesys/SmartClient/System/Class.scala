package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System.props.ClassProps

import scala.reflect.ClassTag
import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import inst._

abstract class AbstractClass[T <: Class, P <: ClassProps](implicit classTag_T: ClassTag[T], classTag_P: ClassTag[P]) {
    def create(propsClass: P): T = js.Dynamic.global.isc.selectDynamic(classTag_T.runtimeClass.getSimpleName).create().asInstanceOf[T]
}

object Class extends AbstractClass[Class, ClassProps]
