package com.simplesys

import com.simplesys.SmartClient.System.props.ClassProps

/*object TestMacro extends App{
    class A {
        def a: Int = 42
        def b: String = "b"
      }

      class B {
        def beta: String = "beta"
      }

      println(methodNames[A])
      println(methodNames[B])
}*/

import com.simplesys.SmartClient.System.{Class0, Class}
object Test_Class extends App{
   val map = Class0.getMap(
     new ClassProps {

     }
   )
   val a  = 0
}
