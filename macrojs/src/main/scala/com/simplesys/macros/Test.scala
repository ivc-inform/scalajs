package com.simplesys.macros

import com.simplesys.SmartClient.System.props.AbstractPropsClass

import collection.immutable.HashMap

class Test {
    val a = new PropsToMap[AbstractPropsClass] {
        def getMap(t: AbstractPropsClass): Map[String, Any] = HashMap.empty[String, Any]
    }
}
