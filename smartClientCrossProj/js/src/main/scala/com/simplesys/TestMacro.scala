package com.simplesys

import com.simplesys.SmartClient.System._
import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.SmartClient.option.{ScSome, ScOption}

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

import com.simplesys.SmartClient.option.ScOption._

object Test_Class extends App {
    val map = Class.getMap(
        new ClassProps {
            override val addPropertiesOnCreate: ScOption[Boolean] = ScSome(true)
        }
    )
}
