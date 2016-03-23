package com.simplesys.SmartClient.Drawing.drawItem

import com.simplesys.SmartClient.Drawing.{AbstractDrawItemCompanion, DrawItem}
import com.simplesys.System.Types.{CSSColor, void}

import scala.scalajs.js

@js.native
trait DrawLabel extends DrawItem {
    val alignment: String
    var contents: String
    val fontFamily: String
    var fontSize:Int
    val fontStyle: String
    val fontWeight: String
    val left: Int
    def setContents (contents: String): void
    def setFontSize (size: Int): void
    val top: Int
}

@js.native
abstract trait AbstractDrawLabelCompanion extends AbstractDrawItemCompanion {
    var defaultCursiveFont: String = js.native
    var defaultFantasyFont: String = js.native
    var defaultMonospaceFont: String = js.native
    var defaultSansSerifFont: String = js.native
    var defaultSerifFont: String = js.native
}

@js.native
object DrawLabel extends AbstractDrawLabelCompanion
