package com.simplesys.isc.System.Types

import language.implicitConversions

object LogicalOperator extends Enumeration {
    type LogicalOperator = Value
    val and, or, not = Value
}
