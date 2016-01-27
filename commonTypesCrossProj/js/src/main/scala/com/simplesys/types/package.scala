package com.simplesys

import scala.scalajs.js

package object types {
    type JSAny = js.Any
    type JSArray[T] = js.Array[T]
    type JSDictionary[T] = js.Dictionary[T]
    type JSArrayAny = JSArray[JSAny]
    type JSDictionaryAny = JSDictionary[JSAny]
}
