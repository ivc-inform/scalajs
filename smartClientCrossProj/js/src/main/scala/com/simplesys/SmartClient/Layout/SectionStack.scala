package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Layout.sectionStack.SectionStackSection.SectionStackSection

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait SectionStack extends VLayout {
    def addItem(section: String | Int, item: Canvas, index: Int): Unit
    def addSection (sections: SectionStackSection | js.Array[SectionStackSection], position:Int)
}

@js.native
abstract trait AbstractSectionStackCompanion extends AbstractVLayoutCompanion {
}

@js.native
object SectionStack extends AbstractSectionStackCompanion        
