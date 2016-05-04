package com.simplesys.System.Types

import language.implicitConversions

object ListStyleType extends Enumeration {
    type ListStyleType = Value
    val disc, circle, square, decimal, `upper-roman`, `lower-roman`, `upper-alpha`, `lower-alpha`, `custom-image` = Value
}
