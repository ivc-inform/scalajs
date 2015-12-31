package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System.props.ClassProps

import scala.reflect.ClassTag
import scala.scalajs.js
import inst._

abstract class AbstractClass[T <: Class, P <: ClassProps](implicit classTag_T: ClassTag[T], classTag_P: ClassTag[P]) {

    def create(propsClass: P): T = {
        val className = classTag_T.runtimeClass.getClass.getSimpleName
        println(className)
        js.Dynamic.global.isc.selectDynamic(className).create().asInstanceOf[T]
    }
}

object Class extends AbstractClass[Class, ClassProps]
