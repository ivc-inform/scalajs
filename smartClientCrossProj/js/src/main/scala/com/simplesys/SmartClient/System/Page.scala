package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System.Types.FireStyle.FireStyle
import com.simplesys.SmartClient.System.Types.PageEvent.PageEvent
import com.simplesys.SmartClient.System.Types.URL

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
object Page extends Types.Object {
    type Page = Page.type

    def setAppImgDir(url: URL = js.native) : Unit = js.native
    def setEvent(eventType: PageEvent, action: scalajs.js.Function1[Types.Object, _], fireStyle: FireStyle = js.native, functionName: scalajs.js.Function = js.native): Number = js.native
    def setSkinDir(url: URL): Unit = js.native
}
