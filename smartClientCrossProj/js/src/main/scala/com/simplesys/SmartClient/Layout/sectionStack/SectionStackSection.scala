package com.simplesys.SmartClient.Layout.sectionStack

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.System.Types
import com.simplesys.isc.System.Types.{HTMLString, SCImgURL}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
object SectionStackSection extends Types.Object {
    type SectionStackSection = SectionStackSection.type

    var canCollapse: Boolean = js.native
    var canDropBefore: Boolean = js.native
    var canReorder: Boolean = js.native
    var canTabToHeader: Boolean = js.native
    var clipTitle: Boolean = js.native
    val controls: js.Array[Canvas] = js.native
    var expanded: Boolean = js.native
    var hidden: Boolean = js.native
    var icon: SCImgURL = js.native
    var ID: String = js.native
    val items: js.Array[Canvas] = js.native
    var name: String = js.native
    var resizeable: Boolean = js.native
    var showClippedTitleOnHover: Boolean = js.native
    var showHeader: Boolean = js.native
    var title: HTMLString = js.native
}
