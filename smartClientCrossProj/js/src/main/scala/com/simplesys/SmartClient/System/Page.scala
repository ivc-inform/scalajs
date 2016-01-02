package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System.Types._
import com.simplesys.isc.System.Types.FireStyle._
import com.simplesys.isc.System.Types.PageEvent.PageEvent
import com.simplesys.isc.System.Types.PageOrientation._
import com.simplesys.isc.System.Types._

import scala.scalajs.js

@js.native
trait Page extends Class

@js.native
abstract trait AbstractPageCompanion extends AbstractClassCompanion {
    def checkBrowserAndRedirect(url: URL): Unit = js.native
    def clearEvent(eventType: PageEvent, ID: Int): Unit = js.native
    var defaultUnsupportedBrowserURL: URL = js.native
    def getAppDir(): String = js.native
    def getAppFilesDir(url: URL = js.native): Unit = js.native
    def getAppImgDir(): String = js.native
    def getHeight(wd: Object = js.native): Int = js.native
    def getImgURL(src: SCImgURL, imgDir: String): String = js.native
    def getIsomorphicDir(): String = js.native
    def getOrientation(): PageOrientation = js.native
    def getScreenHeight(): Int = js.native
    def getScreenWidth(): Int = js.native
    def getScrollHeight(): Int = js.native
    def getScrollLeft(): Int = js.native
    def getScrollTop(): Int = js.native
    def getScrollWidth(): Int = js.native
    def getSkinDir(): String = js.native
    def getSkinImgDir(url: URL = js.native): String = js.native
    def getUnsupportedBrowserPromptString(): String = js.native
    def getURL(fileName: String): String = js.native
    def getWidth(wd: Object = js.native): Int = js.native
    def goBack(): Unit = js.native
    def isAddVersionToSkinCSS(): Boolean = js.native
    def isLoaded(): Boolean = js.native
    def isRTL(): Boolean = js.native
    def loadStyleSheet(url: URL): Unit = js.native
    def moveTo(left: Int, top: Int): Unit = js.native
    val protocolURLs: js.Array[String] = js.native
    def registerKey(key: KeyIdentifier, action: js.Function1[Types.Object, _]): Unit = js.native
    def resizeTo(width: Int, height: Int): Unit = js.native
    def scrollTo(left: Int, top: Int): Unit = js.native
    def setAddVersionToSkinCSS(addVersionToSkinCss: Boolean): Unit = js.native
    def setAppFilesDir(url: URL = js.native): Unit = js.native
    def setAppImgDir(url: URL = js.native) : Unit = js.native
    def setEvent(eventType: PageEvent, action: js.Function1[Types.Object, _], fireStyle: FireStyle = js.native, functionName: js.Function = js.native): Int = js.native
    def setIsomorphicDir(url: URL): Unit = js.native
    def setSkinDir(url: URL): Unit = js.native
    def setTitle(title: String): Unit = js.native
    var suppressBackspaceNavigation: Boolean = js.native
    def unregisterKey(actionID: KeyName, target: Types.Object = js.native): Unit = js.native
    val unsupportedBrowserAction: UnsupportedOperationException = js.native
    def updateViewport(scale: Int, width: Int, height: Int, scalable: Int): Unit = js.native
    def waitFor(obj: Types.Object, methodName: String, callback: Callback, timeout: Int = js.native, timeoutCallback: Callback = js.native): Boolean = js.native
    def waitForMultiple(obj: Types.Object, methodName: String, callback: Callback, timeout: Int = js.native, timeoutCallback: Callback = js.native): Boolean = js.native
}

@js.native
object Page extends AbstractPageCompanion
