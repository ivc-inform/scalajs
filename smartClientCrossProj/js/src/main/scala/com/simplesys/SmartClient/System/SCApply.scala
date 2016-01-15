package com.simplesys.SmartClient.System

import com.simplesys.props.AbstractClassProps
import com.simplesys.macros.PropsToDictionary

import scala.reflect.ClassTag
import scala.scalajs.js
import scala.scalajs.js.{Any, Dictionary}

class SCApply[T <: Class, P <: AbstractClassProps](implicit classTag_T: ClassTag[T], propsToDictionary: PropsToDictionary[P]) {
    def create(propsClass: P): T = js.Dynamic.global.isc.selectDynamic(classTag_T.runtimeClass.getSimpleName).create(propsToDictionary.getDictionary(propsClass)).asInstanceOf[T]
    def properties(propsClass: P): Dictionary[js.Any] = propsToDictionary.getDictionary(propsClass)
}


