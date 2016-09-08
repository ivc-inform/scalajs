package com.simplesys

import com.simplesys.option.{ScNone, ScOption, ScSome}

import scala.scalajs.js
import scala.scalajs.js._

package object System {
    type JSAny = js.Any
    type JSFunction = js.Function
    type JSDynamic = js.Dynamic
    type JSObject = js.Object
    type JSArray[T] = js.Array[T]
    type JSUndefined[T] = js.UndefOr[T]
    type JSUndefinedOpt[T] = js.UndefOrOps[T]
    type JSDictionary[T] = js.Dictionary[T]
    type JSArrayAny = JSArray[JSAny]
    type JSDictionaryAny = JSDictionary[JSAny]
    val jSUndefined = js.undefined

    implicit class StringOpts(string: String) {
        def nameStrong: NameStrong = new NameStrong {
            override val name = string
        }

        def nameStrongOpt: ScOption[NameStrong] = ScSome(new NameStrong {
            override val name = string
        })
    }


    implicit class UndefinedOpts[T](x: js.UndefOr[T]) {
        def opt: ScOption[T] = if (x.isDefined) ScSome(x.get) else ScNone
        def opt(defValue:T): ScOption[T] = if (x.isDefined) ScSome(x.get) else ScSome(defValue)
    }

    implicit class anyToUndef[T](x: T) {
           def undef: JSUndefined[T] = js.UndefOr.any2undefOrA(x)
       }
}
