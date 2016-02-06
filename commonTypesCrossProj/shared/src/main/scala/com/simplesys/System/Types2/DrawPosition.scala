package com.simplesys.System.Types2

import scala.language.implicitConversions

object DrawPosition extends Enumeration {
    type DrawPosition = Value
    val beforeBegin, afterBegin, beforeEnd, afterEnd, replace = Value
}
