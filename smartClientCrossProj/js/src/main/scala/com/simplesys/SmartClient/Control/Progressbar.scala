package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.Foundation.{AbstractStretchImgCompanion, StretchImg}
import com.simplesys.System.Types.{SCImgURL, void}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Progressbar extends StretchImg {
    var breadth: Int
    def getBreadth(): Int
    def getLength(): Int
    val length: Int
    var percentChanged: js.Function1[void, _]
    var percentDone: Int
    def setBreadth(newBreadth: Int): void
    def setLength(newLength: Int): void
    def setPercentDone(newPercent: Int): void
}

@js.native
abstract trait AbstractProgressbarCompanion extends AbstractStretchImgCompanion {
}

@js.native
object Progressbar extends AbstractProgressbarCompanion

