package com.simplesys.SmartClient.Layout.sectionStack

import com.simplesys.SmartClient.Foundation.{Canvas, AbstractCanvasCompanion, Label}
import com.simplesys.SmartClient.Layout.{SectionStack, Layout}
import com.simplesys.System.Types2.{HTMLString, AutoChild}
import com.simplesys.Types1.JSArray

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait SectionHeader extends Label {
    var clipTitle: Boolean
    val controls: JSArray[Canvas]
    val controlsLayout: Layout with AutoChild
    def getSectionStack(): SectionStack
}


