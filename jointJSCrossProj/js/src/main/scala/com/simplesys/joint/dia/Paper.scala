package com.simplesys.joint.dia

import com.simplesys.joint.{Position, CSSSelector, LinkView}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@js.native
class Paper extends js.Object {
    var sl: CSSSelector = js.native
    var width: Int = js.native
    var height: Int = js.native
    var origin: Position = js.native
    var gridSize: Int = js.native
    var model: Graph = js.native
    var perpendicularLinks: Boolean = js.native
    var elementView: ElementView = js.native
    var linkView: LinkView = js.native
    var defaultLink: Link = js.native
    var defaultRouter: Link = js.native
    var defaultConnector: Link = js.native
    var interactive: Boolean = js.native
}
