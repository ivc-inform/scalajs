package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.DataBinding.{ShowSectionCallback, ExpandSectionCallback, HideSectionCallback, CollapseSectionCallback}
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Layout.sectionStack.SectionHeader
import com.simplesys.SmartClient.Layout.sectionStack.SectionStackSection.SectionStackSection
import com.simplesys.isc.System.Types.CSSStyleName
import com.simplesys.isc.System.Types.LocatorStrategy.LocatorStrategy
import com.simplesys.isc.System.Types.LocatorTypeStrategy.LocatorTypeStrategy
import com.simplesys.isc.System.Types.VisibilityMode.VisibilityMode

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait SectionStack extends VLayout {
    def addItem(section: String | Int, item: Canvas, index: Int): Unit
    def addSection(sections: SectionStackSection | js.Array[SectionStackSection], position: Int = js.native): Unit
    var canCollapseAll: Boolean
    val canReorderSections: Boolean
    val canResizeSections: Boolean
    val canTabToHeaders: Boolean
    def collapseSection(sections: String | js.Array[Int] | js.Array[String], callback: CollapseSectionCallback = js.native): Unit
    def expandSection(sections: String | js.Array[Int] | js.Array[String], callback: ExpandSectionCallback = js.native): Unit
    def getExpandedSections(): js.Array[SectionStackSection]
    def getSectionHeader(section: String | Int): SectionHeader
    def getSectionNumber(sectionName: String): Int
    def getSections(): js.Array[String]
    def getVisibleSections(): js.Array[String]
    val headerHeight: Int
    def hideSection(sections: String | js.Array[Int] | js.Array[String], callback: HideSectionCallback = js.native): Unit
    var itemEndIndent: Int
    var itemIndent: Int
    var itemStartIndent: Int
    var locateSectionsBy: LocatorStrategy
    var locateSectionsType: LocatorTypeStrategy
    def moveSection(sections: Int | String | js.Array[Int] | js.Array[String], position: Int): Unit
    def removeItem(sections: Int | String | js.Array[Int] | js.Array[String], position: Int): Unit
    def removeSection(sections: Int | String | js.Array[Int] | js.Array[String]): Unit
    def sectionForItem(item: Canvas): SectionStackSection
    val sectionHeaderClass: String
    var sectionHeaderClick: js.Function1[Canvas, Unit]
    def sectionIsExpanded(section: String | Int): Boolean
    def sectionIsVisible(section: String | Int): Boolean
    val sections: js.Array[SectionStackSection]
    def setSectionProperties(section: String | Int, properties: SectionStackSection): Unit
    def setSectionTitle(section: String | Int, newTitle: String): Unit
    def setVisibilityMode(newVisibilityMode: VisibilityMode): Unit
    var showExpandControls: Boolean
    def showSection(sections: String | js.Array[Int] | js.Array[String], callback: ShowSectionCallback = js.native): Unit
    val useGlobalSectionIDs: Boolean
    var visibilityMode: VisibilityMode
}

@js.native
abstract trait AbstractSectionStackCompanion extends AbstractVLayoutCompanion {
}

@js.native
object SectionStack extends AbstractSectionStackCompanion        
