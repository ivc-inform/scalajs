package com.simplesys

import scala.scalajs.js

package object types {
    type JSAny = js.Any
    type JSArrayAny = js.Array[JSAny]
    type JSArray[T] = js.Array[T]
    type JSDictionary[T] = js.Dictionary[T]
    type JSDictionaryAny = JSDictionary[JSAny]
}
