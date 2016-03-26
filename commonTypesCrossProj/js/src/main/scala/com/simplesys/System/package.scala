package com.simplesys

import scala.scalajs.js

package object System {
    type JSAny = js.Any
    type JSFunction = js.Function
    type JSDynamic = js.Dynamic
    type JSObject = js.Object
    type JSArray[T] = js.Array[T]
    type JSUndefined[T] = js.UndefOr[T]
    type JSDictionary[T] = js.Dictionary[T]
    type JSArrayAny = JSArray[JSAny]
    type JSDictionaryAny = JSDictionary[JSAny]
    val jSUndefined = js.undefined
}
