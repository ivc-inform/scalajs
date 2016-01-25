package com.simplesys.SmartClient.Control.menu

import com.simplesys.SmartClient.Control.MenuSS
import com.simplesys.SmartClient.Foundation.Canvas

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait MenuSSItem extends BaseMenuItem[MenuSS] {
    var owner: Canvas
}

