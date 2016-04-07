package com.simplesys.SmartClient.System

import com.simplesys.System.{JSDictionaryAny, JSObject}
import com.simplesys.json.JSON._
import com.simplesys.macros.PropsToDictionary
import com.simplesys.props.AbstractClassProps
import com.simplesys.SmartClient.Drawing.DrawItem

import scala.reflect.ClassTag
import scala.scalajs.js

class SCApply[T <: Class, P <: AbstractClassProps](implicit classTag_T: ClassTag[T], propsToDictionary: PropsToDictionary[P]) {
    def create(propsClass: P): T = js.Dynamic.global.isc.selectDynamic(classTag_T.runtimeClass.getSimpleName).create(propsToDictionary.getDictionary(propsClass)).asInstanceOf[T]
    def create(): T = js.Dynamic.global.isc.selectDynamic(classTag_T.runtimeClass.getSimpleName).create().asInstanceOf[T]
    def apply(propsClass: P): T = propsToDictionary.getDictionary(propsClass).asInstanceOf[T]
    def jsonString(propsClass: P): String = propsToDictionary.getMap(propsClass).toMap.toJsonString()
}

class SCApplyDrawItem[T <: DrawItem, P <: AbstractClassProps](implicit classTag_T: ClassTag[T], propsToDictionary: PropsToDictionary[P]) {
    def apply(propsClass: P): T = propsToDictionary.getDictionary(propsClass).asInstanceOf[T]
    def create(propsClass: P): T = js.Dynamic.global.isc.selectDynamic(classTag_T.runtimeClass.getSimpleName).create(propsToDictionary.getDictionary(propsClass)).asInstanceOf[T]
}

class SCApply4Object[T <: JSObject, P <: AbstractClassProps](implicit classTag_T: ClassTag[T], propsToDictionary: PropsToDictionary[P]) {
    def apply(propsClass: P): T = propsToDictionary.getDictionary(propsClass).asInstanceOf[T]
}

class SCApply4Props[P <: AbstractClassProps](implicit propsToDictionary: PropsToDictionary[P]) {
    def apply(propsClass: P): JSDictionaryAny = propsToDictionary.getDictionary(propsClass)
}
