package com.simplesys.System.Types

object LogPriority extends Enumeration {
    type LogPriority = Value
    val FATAL = Value(1)
    val ERROR = Value(2)
    val WARN = Value(3)
    val INFO = Value(4)
    val DEBUG = Value(5)
}

