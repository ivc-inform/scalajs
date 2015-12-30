package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System.props.AbstractPropsClass
import com.simplesys.macros.PropsToMap

import scala.reflect.ClassTag
import scala.scalajs.js
import scala.scalajs.js.Dictionary

class SCApply[T <: Types.Object, P <: AbstractPropsClass](implicit ct: ClassTag[T], propsToMap: PropsToMap[P]) {

    lazy protected val className: String = ct.runtimeClass.getSimpleName.capitalize

    def create(propsClass: P): T = {

        def props2Dict(abstractProps: Map[String, Any]): js.Dictionary[Types.Object] = {
            val result = Dictionary.empty[Types.Object]
            abstractProps.foreach { case (key, value) => result(key) = value.asInstanceOf[Types.Object] }
            result
        }

        //js.Dynamic.global.isc.selectDynamic(className).create(props2Dict(getMap(propsClass))).asInstanceOf[T]
        js.Dynamic.global.isc.selectDynamic(className).create(Dictionary.empty[Types.Object]).asInstanceOf[T]
    }

    private def getMap(props: P): Map[String, Any] = {
        val res = propsToMap getMap props
        res
    }
}
