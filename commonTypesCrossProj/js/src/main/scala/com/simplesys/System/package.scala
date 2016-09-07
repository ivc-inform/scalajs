package com.simplesys

import com.simplesys.option.{ScNone, ScOption, ScSome}

import scala.scalajs.js

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

    object FontItemProps {
        implicit class UndefinedOpts[T](x: js.UndefOr[T]) {
            def optUndef: ScOption[T] = if (x.isDefined) ScSome(x.get) else ScNone
        }
    }

}
