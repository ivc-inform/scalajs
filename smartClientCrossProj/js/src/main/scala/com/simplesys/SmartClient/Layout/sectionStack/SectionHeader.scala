package com.simplesys.SmartClient.Layout.sectionStack

import com.simplesys.SmartClient.Foundation.{Canvas, AbstractCanvasCompanion, Label}
import com.simplesys.SmartClient.Layout.{SectionStack, Layout}
import com.simplesys.System.Types.{HTMLString, AutoChild}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait SectionHeader extends Label {
    var clipTitle: Boolean
    val controls: js.Array[Canvas]
    val controlsLayout: Layout with AutoChild
    def getSectionStack(): SectionStack
}


