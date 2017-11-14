package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.Control._
import com.simplesys.SmartClient.Control.menu._
import com.simplesys.SmartClient.Foundation._
import com.simplesys.SmartClient.Layout._
import com.simplesys.System.Types.{Record, URL, void}
import com.simplesys.System.{JSObject, JSUndefined}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Config extends JSObject {
    val confirmDeleting: String
    val drawAheadRatio: JSUndefined[Double]
    val dataPageSize: JSUndefined[Int]
}

@js.native
trait appStruct extends JSObject {
    val login: String
    val password: String
    val userId: Double
    val codeGroup: Double
    val captionUser: String
}

@js.native
@JSGlobal
object simpleSyS extends JSObject {
    def checkOwner(canvas: Canvas): Canvas = js.native
    def _enableDeleteFromTree(menu: MenuSSItem): Boolean = js.native
    def _openFolders(menu: MenuSS): void = js.native
    def guid(): String = js.native
    var config: Config = js.native
    val aboutData: IscArray[Record] = js.native
    var skin: JSUndefined[String] = js.native
    var fontIncrease: JSUndefined[Double] = js.native
    var sizeIncrease: JSUndefined[Double] = js.native
    var expertMode: JSUndefined[Boolean] = js.native
    var scenarioTestMode: JSUndefined[Boolean] = js.native
    val simpleSysContextPath: JSUndefined[URL] = js.native
    var qtyGraphCopies: JSUndefined[Int] = js.native
    val app: appStruct = js.native
    var functionButton: js.UndefOr[IconMenuButtonSS] = js.native
}
