package com.simplesys.SmartClient.Layout.navigationBar

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types.HTMLString
import com.simplesys.types.JSArray

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait NavigationBarViewState extends Types.Object {
    var alwaysShowLeftButtonTitle: Boolean
    var controls: JSArray[String] | JSArray[Canvas]
    var leftButtonTitle: HTMLString
    var shortLeftButtonTitle: HTMLString
    var showLeftButton: Boolean
    var title: HTMLString
}
