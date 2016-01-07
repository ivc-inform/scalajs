package com.simplesys.SmartClient.Forms.FormsItems

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait SectionItem extends CanvasItem {
    var canCollapse:Boolean
    var canTabToHeader:Boolean
    def collapseSection ():Unit
    def expandSection ():Unit
    def isExpanded():Boolean
    val itemIds: Array[String]
    val sectionExpanded:Boolean
    val sectionHeaderClass:String
}

@js.native
abstract trait AbstractSectionItemCompanion extends AbstractCanvasItemCompanion {
}

@js.native
object SectionItem extends AbstractSectionItemCompanion        
