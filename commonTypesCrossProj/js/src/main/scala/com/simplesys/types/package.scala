package com.simplesys

import scala.scalajs.js

package object types {
    type JSAny = js.Any
    type JSArrayAny = js.Array[JSAny]
    type JSDictionaryAny = js.Dictionary[JSAny]
}
