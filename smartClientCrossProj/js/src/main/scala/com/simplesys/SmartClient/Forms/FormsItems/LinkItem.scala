package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.System.Types.{void, HTMLString}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait LinkItem extends TextItem {
    var linkTitle: HTMLString
    def setLinkTitle(title: HTMLString): void
    var target: String
}

@js.native
abstract trait AbstractLinkItemCompanion extends AbstractTextItemCompanion {
}

@js.native
object LinkItem extends AbstractLinkItemCompanion        
