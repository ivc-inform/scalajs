package com.simplesys.System.Types

import language.implicitConversions

object ChartType extends Enumeration {
    type ChartType = Value
    val Area, Column, Bar, Line, Radar, Pie, Doughnut, Scatter, Bubble = Value
}
