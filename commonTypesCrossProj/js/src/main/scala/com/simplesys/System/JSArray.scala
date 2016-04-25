package com.simplesys.System

import scala.scalajs.js
import scala.scalajs.js._

class JSEArray[A] extends js.Array[A] {
    def duplicate(): A = native
}

object JSArray {
    def apply[A](items: A*): JSEArray[A] = sys.error("stub")

    /** Returns true if the given value is an array. */
    def isArray(arg: Any): Boolean = native
}
