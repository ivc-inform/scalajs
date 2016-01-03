package com.simplesys.SmartClient.Layout.sectionStack

import com.simplesys.SmartClient.Foundation.{Canvas, StretchImg}
import com.simplesys.SmartClient.Layout.{SectionStack, Layout, AbstractHLayoutCompanion, HLayout}
import com.simplesys.isc.System.Types.{URL, HTMLString, SCImgURL, AutoChild}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ImgSectionHeader extends HLayout {
    var background: StretchImg with AutoChild
    var clipTitle: Boolean
    var controls: js.Array[Canvas]
    val controlsLayout: Layout with AutoChild
    def getSectionStack(): SectionStack
    var icon: SCImgURL
    val iconAlign: String
    val iconHeight: Int
    val iconOrientation: String
    val iconSize: Int
    val iconWidth: Int
    def setAlign(align: String): Unit
    def setIcon(icon: URL): Unit
    def setIconOrientation(orientation: String): Unit
    def setPrompt(prompt: HTMLString): Unit
    var showClippedTitleOnHover: Boolean
    var title: HTMLString
    var titleClipped: js.ThisFunction0[callbackHandler, Boolean]
    var titleHover: js.ThisFunction0[callbackHandler, Boolean]
    def titleHoverHTML(defaultHTML: HTMLString): HTMLString
}

@js.native
abstract trait AbstractImgSectionHeaderCompanion extends AbstractHLayoutCompanion {
}

@js.native
object ImgSectionHeader extends AbstractImgSectionHeaderCompanion        
