package com.simplesys.SmartClient.Layout.navigationBar

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types.HTMLString

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
object NavigationBarViewState extends Types.Object {
    type NavigationBarViewState = NavigationBarViewState.type
    var alwaysShowLeftButtonTitle: Boolean = js.native
    var controls: js.Array[String] | js.Array[Canvas] = js.native
    var leftButtonTitle: HTMLString = js.native
    var shortLeftButtonTitle: HTMLString = js.native
    var showLeftButton: Boolean = js.native
    var title: HTMLString = js.native
}
