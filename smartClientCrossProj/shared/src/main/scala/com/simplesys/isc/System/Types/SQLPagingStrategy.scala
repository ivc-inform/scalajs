package com.simplesys.isc.System.Types

import language.implicitConversions

object SQLPagingStrategy extends Enumeration {
    type SQLPagingStrategy = Value
    val sqlLimit, jdbcScroll, dropAtServer, none = Value
}
