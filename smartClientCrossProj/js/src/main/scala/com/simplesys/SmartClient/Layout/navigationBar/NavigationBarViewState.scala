package com.simplesys.SmartClient.Layout.navigationBar

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.System.Types.HTMLString
import com.simplesys.Types1.JSArray

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait NavigationBarViewState extends js.Object {
    var alwaysShowLeftButtonTitle: Boolean
    var controls: JSArray[String] | JSArray[Canvas]
    var leftButtonTitle: HTMLString
    var shortLeftButtonTitle: HTMLString
    var showLeftButton: Boolean
    var title: HTMLString
}
