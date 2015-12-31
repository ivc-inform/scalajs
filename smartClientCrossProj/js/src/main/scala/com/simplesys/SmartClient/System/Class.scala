package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System.props.{AbstractPropsClass, ClassProps}
import com.simplesys.macros.PropsToDictionary

import scala.reflect.ClassTag
import scala.scalajs.js
import inst._

abstract class AbstractClass[T <: Class, P <: AbstractPropsClass](implicit classTag_T: ClassTag[T], propsToDictionary: PropsToDictionary[P]) {
    def create(propsClass: P): T = js.Dynamic.global.isc.selectDynamic(classTag_T.runtimeClass.getSimpleName).create(propsToDictionary.getDictionary(propsClass)).asInstanceOf[T]
}

object Class extends AbstractClass[Class, ClassProps]
