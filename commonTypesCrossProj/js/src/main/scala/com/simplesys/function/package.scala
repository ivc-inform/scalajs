package com.simplesys
import scala.scalajs.js

package object function {

    implicit class f01tf0_[+R](function0: Function0[R]) {
        def toFunc = function0: js.Function0[R]
    }

    implicit class f12tf0[-T1, +R](function1: Function1[T1, R]) {
        def toThisFunc = function1: js.ThisFunction0[T1, R]
    }

    implicit class f12tf0_[-T1, +R](function1: Function1[T1, R]) {
        def toFunc = function1: js.Function1[T1, R]
    }

    implicit class f22tf1[-T1, -T2, +R](function2: Function2[T1, T2, R]) {
        def toThisFunc = function2: js.ThisFunction1[T1, T2, R]
    }

    implicit class f22tf1_[-T1, -T2, +R](function2: Function2[T1, T2, R]) {
        def toFunc = function2: js.Function2[T1, T2, R]
    }

    implicit class f32tf1[-T1, -T2, -T3, +R](function3: Function3[T1, T2, T3, R]) {
        def toThisFunc = function3: js.ThisFunction2[T1, T2, T3, R]
    }

    implicit class f32tf1_[-T1, -T2, -T3, +R](function3: Function3[T1, T2, T3, R]) {
        def toFunc = function3: js.Function3[T1, T2, T3, R]
    }

    implicit class f42tf4[-T1, -T2, -T3, -T4, +R](function4: Function4[T1, T2, T3, T4, R]) {
        def toThisFunc = function4: js.ThisFunction3[T1, T2, T3, T4, R]
    }

    implicit class f42tf3_[-T1, -T2, -T3, -T4, +R](function4: Function4[T1, T2, T3, T4, R]) {
        def toFunc = function4: js.Function4[T1, T2, T3, T4, R]
    }

    implicit class f44tf4[-T1, -T2, -T3, -T4, -T5, +R](function5: Function5[T1, T2, T3, T4, T5, R]) {
        def toThisFunc = function5: js.ThisFunction4[T1, T2, T3, T4, T5, R]
    }

    implicit class f52tf5_[-T1, -T2, -T3, -T4, -T5, +R](function5: Function5[T1, T2, T3, T4, T5, R]) {
        def toFunc = function5: js.Function5[T1, T2, T3, T4, T5, R]
    }

    implicit class f55tf5_[-T1, -T2, -T3, -T4, -T5, -T6, +R](function6: Function6[T1, T2, T3, T4, T5, T6, R]) {
        def toThisFunc = function6: js.ThisFunction5[T1, T2, T3, T4, T5, T6, R]
    }

    implicit class f6tf5_[-T1, -T2, -T3, -T4, -T5, -T6, -T7, +R](function7: Function7[T1, T2, T3, T4, T5, T6, T7, R]) {
        def toThisFunc = function7: js.ThisFunction6[T1, T2, T3, T4, T5, T6, T7, R]
    }

    implicit class f7tf6_[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, +R](function8: Function7[T1, T2, T3, T4, T5, T6, T7, T8, R]) {
        def toThisFunc = function8: js.ThisFunction7[T1, T2, T3, T4, T5, T6, T7, T8, R]
    }

    //implicit def str2Any(x: String): ScOption[JSAny] = ScSome(js.use(x).as[JSAny])

}
