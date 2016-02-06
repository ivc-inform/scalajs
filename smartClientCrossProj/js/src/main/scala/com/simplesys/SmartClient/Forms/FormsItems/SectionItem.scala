package com.simplesys.SmartClient.Forms.FormsItems

import com.simplesys.System.Types.void
import com.simplesys.Types.JSArray

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait SectionItem extends CanvasItem {
    var canCollapse:Boolean
    var canTabToHeader:Boolean
    def collapseSection ():void
    def expandSection ():void
    def isExpanded():Boolean
    val itemIds: JSArray[String]
    val sectionExpanded:Boolean
    val sectionHeaderClass:String
}


