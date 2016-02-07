package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.DataBinding.Callbacks.{CollapseSectionCallback, ExpandSectionCallback, HideSectionCallback, ShowSectionCallback}
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Layout.sectionStack.{SectionHeader, SectionStackSection}
import com.simplesys.System.Types.LocatorStrategy.LocatorStrategy
import com.simplesys.System.Types.LocatorTypeStrategy.LocatorTypeStrategy
import com.simplesys.System.Types.VisibilityMode.VisibilityMode
import com.simplesys.System.Types.void
import com.simplesys.System.JSArray

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait SectionStack extends VLayout {
    def addItem(section: String | Int, item: Canvas, index: Int): void
    def addSection(sections: SectionStackSection | JSArray[SectionStackSection], position: Int = js.native): void
    var canCollapseAll: Boolean
    val canReorderSections: Boolean
    val canResizeSections: Boolean
    val canTabToHeaders: Boolean
    def collapseSection(sections: String | JSArray[Int] | JSArray[String], callback: CollapseSectionCallback = js.native): void
    def expandSection(sections: String | JSArray[Int] | JSArray[String], callback: ExpandSectionCallback = js.native): void
    def getExpandedSections(): JSArray[SectionStackSection]
    def getSectionHeader(section: String | Int): SectionHeader
    def getSectionNumber(sectionName: String): Int
    def getSections(): JSArray[String]
    def getVisibleSections(): JSArray[String]
    val headerHeight: Int
    def hideSection(sections: String | JSArray[Int] | JSArray[String], callback: HideSectionCallback = js.native): void
    var itemEndIndent: Int
    var itemIndent: Int
    var itemStartIndent: Int
    var locateSectionsBy: LocatorStrategy
    var locateSectionsType: LocatorTypeStrategy
    def moveSection(sections: Int | String | JSArray[Int] | JSArray[String], position: Int): void
    def removeItem(sections: Int | String | JSArray[Int] | JSArray[String], position: Int): void
    def removeSection(sections: Int | String | JSArray[Int] | JSArray[String]): void
    def sectionForItem(item: Canvas): SectionStackSection
    val sectionHeaderClass: String
    var sectionHeaderClick: js.Function1[Canvas, void]
    def sectionIsExpanded(section: String | Int): Boolean
    def sectionIsVisible(section: String | Int): Boolean
    val sections: JSArray[SectionStackSection]
    def setSectionProperties(section: String | Int, properties: SectionStackSection): void
    def setSectionTitle(section: String | Int, newTitle: String): void
    def setVisibilityMode(newVisibilityMode: VisibilityMode): void
    var showExpandControls: Boolean
    def showSection(sections: String | JSArray[Int] | JSArray[String], callback: ShowSectionCallback = js.native): void
    val useGlobalSectionIDs: Boolean
    var visibilityMode: VisibilityMode
}


