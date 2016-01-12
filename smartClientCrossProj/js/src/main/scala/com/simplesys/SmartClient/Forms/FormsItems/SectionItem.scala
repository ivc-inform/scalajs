package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.System.Types.void

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait SectionItem extends CanvasItem {
    var canCollapse:Boolean
    var canTabToHeader:Boolean
    def collapseSection ():void
    def expandSection ():void
    def isExpanded():Boolean
    val itemIds: Array[String]
    val sectionExpanded:Boolean
    val sectionHeaderClass:String
}

@js.native
abstract trait AbstractSectionItemCompanion extends AbstractCanvasItemCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object SectionItem extends AbstractSectionItemCompanion
}

