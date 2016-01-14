package com.simplesys

import com.simplesys.option.{ScOption, ScSome}

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

    implicit def str2Any(x: String): ScOption[js.Any] = ScSome(js.use(x).as[js.Any])

    implicit def fromFunction0[R](f: scala.Function0[R]): ScOption[js.Function0[R]] = sys.error("stub")
    implicit def fromFunction1[T1, R](f: scala.Function1[T1, R]): ScOption[js.Function1[T1, R]] = sys.error("stub")
    implicit def fromFunction2[T1, T2, R](f: scala.Function2[T1, T2, R]): ScOption[js.Function2[T1, T2, R]] = sys.error("stub")
    implicit def fromFunction3[T1, T2, T3, R](f: scala.Function3[T1, T2, T3, R]): ScOption[js.Function3[T1, T2, T3, R]] = sys.error("stub")
    implicit def fromFunction4[T1, T2, T3, T4, R](f: scala.Function4[T1, T2, T3, T4, R]): ScOption[js.Function4[T1, T2, T3, T4, R]] = sys.error("stub")
    implicit def fromFunction5[T1, T2, T3, T4, T5, R](f: scala.Function5[T1, T2, T3, T4, T5, R]): ScOption[js.Function5[T1, T2, T3, T4, T5, R]] = sys.error("stub")
    implicit def fromFunction6[T1, T2, T3, T4, T5, T6, R](f: scala.Function6[T1, T2, T3, T4, T5, T6, R]): ScOption[js.Function6[T1, T2, T3, T4, T5, T6, R]] = sys.error("stub")
    implicit def fromFunction7[T1, T2, T3, T4, T5, T6, T7, R](f: scala.Function7[T1, T2, T3, T4, T5, T6, T7, R]): ScOption[js.Function7[T1, T2, T3, T4, T5, T6, T7, R]] = sys.error("stub")
    implicit def fromFunction8[T1, T2, T3, T4, T5, T6, T7, T8, R](f: scala.Function8[T1, T2, T3, T4, T5, T6, T7, T8, R]): ScOption[js.Function8[T1, T2, T3, T4, T5, T6, T7, T8, R]] = sys.error("stub")
    implicit def fromFunction9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R](f: scala.Function9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R]): ScOption[js.Function9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R]] = sys.error("stub")
    implicit def fromFunction10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R](f: scala.Function10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R]): ScOption[js.Function10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R]] = sys.error("stub")
    implicit def fromFunction11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R](f: scala.Function11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R]): ScOption[js.Function11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R]] = sys.error("stub")
    implicit def fromFunction12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R](f: scala.Function12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R]): ScOption[js.Function12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R]] = sys.error("stub")
    implicit def fromFunction13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R](f: scala.Function13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]): ScOption[js.Function13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]] = sys.error("stub")
    implicit def fromFunction14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R](f: scala.Function14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R]): ScOption[js.Function14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R]] = sys.error("stub")
    implicit def fromFunction15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R](f: scala.Function15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R]): ScOption[js.Function15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R]] = sys.error("stub")
    implicit def fromFunction16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R](f: scala.Function16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R]): ScOption[js.Function16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R]] = sys.error("stub")
    implicit def fromFunction17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R](f: scala.Function17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R]): ScOption[js.Function17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R]] = sys.error("stub")
    implicit def fromFunction18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R](f: scala.Function18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R]): ScOption[js.Function18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R]] = sys.error("stub")
    implicit def fromFunction19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R](f: scala.Function19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R]): ScOption[js.Function19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R]] = sys.error("stub")
    implicit def fromFunction20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R](f: scala.Function20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R]): ScOption[js.Function20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R]] = sys.error("stub")
    implicit def fromFunction21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R](f: scala.Function21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R]): ScOption[js.Function21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R]] = sys.error("stub")
    implicit def fromFunction22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R](f: scala.Function22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R]): ScOption[js.Function22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R]] = sys.error("stub")
}
