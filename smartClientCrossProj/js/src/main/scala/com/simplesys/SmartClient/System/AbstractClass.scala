package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System.props.{AbstractPropsClass, ClassProps}
import com.simplesys.macros.PropsToDictionary

import scala.reflect.ClassTag
import scala.scalajs.js
import inst._

import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
abstract class AbstractClass[T <: Class, P <: AbstractPropsClass](implicit classTag_T: ClassTag[T], propsToDictionary: PropsToDictionary[P]) extends js.Any{
    def create(propsClass: P): T = js.Dynamic.global.isc.selectDynamic(classTag_T.runtimeClass.getSimpleName).create(propsToDictionary.getDictionary(propsClass)).asInstanceOf[T]
}

abstract class AbstractPage[T <: Page, P <: AbstractPropsClass](implicit classTag_T: ClassTag[T], propsToDictionary: PropsToDictionary[P]) extends AbstractClass{

}

