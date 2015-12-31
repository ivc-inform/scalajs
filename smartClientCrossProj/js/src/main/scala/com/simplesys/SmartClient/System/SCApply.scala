package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System.inst._
import com.simplesys.SmartClient.System.props.AbstractPropsClass
import com.simplesys.macros.PropsToDictionary

import scala.reflect.ClassTag
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

class SCApply[T <: Class, P <: AbstractPropsClass](implicit classTag_T: ClassTag[T], propsToDictionary: PropsToDictionary[P]) {
    def create(propsClass: P): T = js.Dynamic.global.isc.selectDynamic(classTag_T.runtimeClass.getSimpleName).create(propsToDictionary.getDictionary(propsClass)).asInstanceOf[T]
}


