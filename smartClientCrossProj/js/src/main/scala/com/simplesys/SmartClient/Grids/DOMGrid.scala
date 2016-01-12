package com.simplesys.SmartClient.Grids

import com.simplesys.System.Types.void
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

package companion {

import scala.scalajs.js

@js.native
   object DOMGrid extends AbstractDOMGridCompanion
}

