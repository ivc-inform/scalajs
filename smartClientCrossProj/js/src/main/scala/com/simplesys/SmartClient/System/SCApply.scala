package com.simplesys.SmartClient.System

import com.simplesys.macros.PropsToDictionary
import com.simplesys.props.AbstractClassProps
import com.simplesys.json.Json._
import com.simplesys.common._
import com.simplesys.types.{JSDictionaryAny, JSAny}

import scala.reflect.ClassTag
import scala.scalajs.js

class SCApply[T <: Class, P <: AbstractClassProps](implicit classTag_T: ClassTag[T], propsToDictionary: PropsToDictionary[P]) {
    def create(propsClass: P): T = js.Dynamic.global.isc.selectDynamic(classTag_T.runtimeClass.getSimpleName).create(propsToDictionary.getDictionary(propsClass)).asInstanceOf[T]
    def create(): T = js.Dynamic.global.isc.selectDynamic(classTag_T.runtimeClass.getSimpleName).create().asInstanceOf[T]
    def properties(propsClass: P): T = propsToDictionary.getDictionary(propsClass).asInstanceOf[T]
    def jsonString(propsClass: P): String = propsToDictionary.getMap(propsClass).toMap.toJsonString()
}

class SCApply4Props[P <: AbstractClassProps](implicit propsToDictionary: PropsToDictionary[P]) {
    def getDictionary(propsClass: P): JSDictionaryAny = propsToDictionary.getDictionary(propsClass)
}

class isc[SuperClassType <: Class, NewClassType <: Class, PropsNewClassType <: AbstractClassProps](implicit classTag_OLD: ClassTag[SuperClassType], classTag_NEW: ClassTag[NewClassType], propsToDictionary: PropsToDictionary[PropsNewClassType]) {
    def defineClass(propsClass: PropsNewClassType): Unit = js.Dynamic.global.isc.defineClass(classTag_NEW.runtimeClass.getSimpleName.dblQuoted, s"isc.${classTag_OLD.runtimeClass.getSimpleName.dblQuoted}").addProperties(propsToDictionary.getDictionary(propsClass))
}


