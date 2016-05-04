package com.simplesys.SmartClient.Drawing

import com.simplesys.SmartClient.System.{IscArray, Point}

object Point {
    def apply(x: Int, y: Int) : Point = IscArray(x,y)
}


