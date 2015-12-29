package com.simplesys

import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.SmartClient.option.ScSome
import com.simplesys.SmartClient.System._

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

object Test_Class extends App{
   val map = Class.getMap(
     new ClassProps {
         override val addPropertiesOnCreate = ScSome(true)
     }
   )
    //Class.isA("")
   val a  = 0
}
