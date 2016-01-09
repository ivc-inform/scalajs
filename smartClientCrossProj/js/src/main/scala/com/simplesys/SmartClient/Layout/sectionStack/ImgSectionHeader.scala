package com.simplesys.SmartClient.Layout.sectionStack

import com.simplesys.SmartClient.Foundation.{Canvas, StretchImg}
import com.simplesys.SmartClient.Layout.{SectionStack, Layout, AbstractHLayoutCompanion, HLayout}
import com.simplesys.isc.System.Types._
import com.simplesys.isc.System.Types.void

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
    def setAlign(align: String): void
    def setIcon(icon: URL): void
    def setIconOrientation(orientation: String): void
    def setPrompt(prompt: HTMLString): void
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
