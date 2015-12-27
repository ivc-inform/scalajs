package com.simplesys.isc.System.Types

import language.implicitConversions

object RelativeDateShortcut extends Enumeration {
    type RelativeDateShortcut = Value
    val now = Value("$now")
    val today = Value("$today")
    val startOfToday = Value("$startOfToday")
    val endOfToday = Value("$endOfToday")
    val yesterday = Value("$yesterday")
    val startOfYesterday = Value("$startOfYesterday")
    val endOfYesterday = Value("$endOfYesterday")
    val tomorrow = Value("$tomorrow")
    val startOfTomorrow = Value("$startOfTomorrow")
    val endOfTomorrow = Value("$endOfTomorrow")
    val weekAgo = Value("$weekAgo")
    val weekFromNow = Value("$weekFromNow")
    val startOfWeek = Value("$startOfWeek")
    val endOfWeek = Value("$endOfWeek")
    val monthAgo = Value("$monthAgo")
    val monthFromNow = Value("$monthFromNow")
    val startOfMonth = Value("$startOfMonth")
    val endOfMonth = Value("$endOfMonth")
    val startOfYear = Value("$startOfYear")
    val endOfYear = Value("$endOfYear")
}

