package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.isc.System.Types.HTMLString

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait LinkItem extends TextItem {
    var linkTitle: HTMLString
    def setLinkTitle(title: HTMLString): Unit
    var target: String
}

@js.native
abstract trait AbstractLinkItemCompanion extends AbstractTextItemCompanion {
}

@js.native
object LinkItem extends AbstractLinkItemCompanion        
