package com.simplesys.SmartClient.Grids

import com.simplesys.isc.System.Types.void
import org.scalajs.dom.html._
import org.scalajs.dom.raw.Document

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait DOMGrid extends TreeGrid {
    var rootElement: Element
    def setRootElement(rootElement: Element): void
}

@js.native
abstract trait AbstractDOMGridCompanion extends AbstractTreeGridCompanion {
}

@js.native
object DOMGrid extends AbstractDOMGridCompanion        
