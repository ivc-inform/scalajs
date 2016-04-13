package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.Drawing.DrawItem
import com.simplesys.System.{JSDictionaryAny, JSObject}
import com.simplesys.json.JSON._
import com.simplesys.macros.PropsToDictionary
import com.simplesys.props.AbstractClassProps

import scala.reflect.ClassTag
import scala.scalajs.js

class SCApply[T <: Class, P <: AbstractClassProps](implicit classTag_T: ClassTag[T], propsToDictionary: PropsToDictionary[P]) {
    def create(propsClass: P): T = js.Dynamic.global.isc.selectDynamic(classTag_T.runtimeClass.getSimpleName).create(propsToDictionary.getDictionary(propsClass)).asInstanceOf[T]
    def create(): T = js.Dynamic.global.isc.selectDynamic(classTag_T.runtimeClass.getSimpleName).create().asInstanceOf[T]
    def apply(propsClass: P): T = propsToDictionary.getDictionary(propsClass).asInstanceOf[T]
    def jsonString(propsClass: P): String = propsToDictionary.getMap(propsClass).toMap.toJsonString()

}

/*class SCApply1[NewClassType <: Class, SuperClassType <: Class, P <: AbstractClassProps](implicit classTag_OLD: ClassTag[SuperClassType], classTag_NEW: ClassTag[NewClassType], propsToDictionary: PropsToDictionary[P]) {
    def addProperties(propsClass: P): NewClassType = js.Dynamic.global.isc.defineClass(classTag_NEW.runtimeClass.getSimpleName.dblQuoted, s"isc.${classTag_OLD.runtimeClass.getSimpleName.dblQuoted}").addProperties(propsToDictionary.getDictionary(propsClass)).asInstanceOf[NewClassType]

    def apply(): NewClassType = js.Dynamic.global.isc.defineClass(classTag_NEW.runtimeClass.getSimpleName.dblQuoted, s"isc.${classTag_OLD.runtimeClass.getSimpleName.dblQuoted}").asInstanceOf[NewClassType]
}*/

class SCApplyDrawItem[T <: DrawItem, P <: AbstractClassProps](implicit classTag_T: ClassTag[T], propsToDictionary: PropsToDictionary[P]) {
    def apply(propsClass: P): T = propsToDictionary.getDictionary(propsClass).asInstanceOf[T]
    def create(propsClass: P): T = js.Dynamic.global.isc.selectDynamic(classTag_T.runtimeClass.getSimpleName).create(propsToDictionary.getDictionary(propsClass)).asInstanceOf[T]
}

/*class SCApplyDrawItem1[NewClassType <: DrawItem,  SuperClassType <: DrawItem, P <: AbstractClassProps](implicit classTag_OLD: ClassTag[SuperClassType], classTag_NEW: ClassTag[NewClassType], propsToDictionary: PropsToDictionary[P]) {
    def addProperties(propsClass: P): NewClassType = js.Dynamic.global.isc.defineClass(classTag_NEW.runtimeClass.getSimpleName, s"isc.${classTag_OLD.runtimeClass.getSimpleName}").addProperties(propsToDictionary.getDictionary(propsClass)).asInstanceOf[NewClassType]

    def apply(): NewClassType = js.Dynamic.global.isc.defineClass(classTag_NEW.runtimeClass.getSimpleName, s"isc.${classTag_OLD.runtimeClass.getSimpleName}").asInstanceOf[NewClassType]
}*/

class SCApply4Object[T <: JSObject, P <: AbstractClassProps](implicit classTag_T: ClassTag[T], propsToDictionary: PropsToDictionary[P]) {
    def apply(propsClass: P): T = propsToDictionary.getDictionary(propsClass).asInstanceOf[T]
}

class SCApply4Props[P <: AbstractClassProps](implicit propsToDictionary: PropsToDictionary[P]) {
    def apply(propsClass: P): JSDictionaryAny = propsToDictionary.getDictionary(propsClass)
}
