package com.simplesys

import scala.scalajs.js

package object function {
    implicit class f12tf0[-T1, +R](function1: Function1[T1, R]) {
        def toThis = function1: js.ThisFunction0[T1, R]
    }

    implicit class f22tf1[-T1, -T2, +R](function2: Function2[T1, T2, R]) {
        def toThis = function2: js.ThisFunction1[T1, T2, R]
    }

    implicit class f32tf1[-T1, -T2, -T3, +R](function3: Function3[T1, T2, T3, R]) {
        def toThis = function3: js.ThisFunction2[T1, T2, T3, R]
    }
}
