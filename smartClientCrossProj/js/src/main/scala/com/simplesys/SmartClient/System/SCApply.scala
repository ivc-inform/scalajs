package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System.props.AbstractPropsClass
import com.simplesys.macros.PropsToMap

import scala.reflect.ClassTag
import scala.scalajs.js
import scala.scalajs.js.Dictionary

class SCApply[T <: Types.Object, P <: AbstractPropsClass](implicit ct: ClassTag[T], propsToMap: PropsToMap[P]) {

    lazy protected val className: String = ct.runtimeClass.getSimpleName.capitalize

    def create(propsClass: P): T =  js.Dynamic.global.isc.selectDynamic(className).create(propsToMap getDictionary propsClass).asInstanceOf[T]

    private def getMap(propsClass: P): Map[String, Any] = {
        val res = propsToMap getMap propsClass
        res
    }
}
