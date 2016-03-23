package com.simplesys.SmartClient.Drawing.drawItem

import com.simplesys.SmartClient.Drawing.{AbstractDrawItemCompanion, DrawItem}

import scala.scalajs.js

@js.native
trait DrawLabel extends DrawItem {
}

@js.native
abstract trait AbstractDrawLabelCompanion extends AbstractDrawItemCompanion {
}

@js.native
object DrawLabel extends AbstractDrawLabelCompanion
