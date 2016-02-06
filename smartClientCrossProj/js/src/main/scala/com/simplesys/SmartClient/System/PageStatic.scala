package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System.Types._
import com.simplesys.System.Types2.FireStyle._
import com.simplesys.System.Types2.PageEvent.PageEvent
import com.simplesys.System.Types2.PageOrientation._
import com.simplesys.System.Types2._
import com.simplesys.Types1.JSArray

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait Page extends Class

@js.native
abstract trait AbstractPageCompanion extends AbstractClassCompanion {
    def checkBrowserAndRedirect(url: URL): void = js.native
    def clearEvent(eventType: PageEvent, ID: Int): void = js.native
    var defaultUnsupportedBrowserURL: URL = js.native
    def getAppDir(): String = js.native
    def getAppFilesDir(url: URL = js.native): void = js.native
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
    def goBack(): void = js.native
    def isAddVersionToSkinCSS(): Boolean = js.native
    def isLoaded(): Boolean = js.native
    def isRTL(): Boolean = js.native
    def loadStyleSheet(url: URL): void = js.native
    def moveTo(left: Int, top: Int): void = js.native
    val protocolURLs: JSArray[String] = js.native
    def registerKey(key: KeyIdentifier, action: js.Function1[Types.Object, _]): void = js.native
    def resizeTo(width: Int, height: Int): void = js.native
    def scrollTo(left: Int, top: Int): void = js.native
    def setAddVersionToSkinCSS(addVersionToSkinCss: Boolean): void = js.native
    def setAppFilesDir(url: URL = js.native): void = js.native
    def setAppImgDir(url: URL = js.native) : void = js.native
    def setEvent(eventType: PageEvent, action: js.Function1[Types.Object, _], fireStyle: FireStyle = js.native, functionName: js.Function = js.native): Int = js.native
    def setIsomorphicDir(url: URL): void = js.native
    def setSkinDir(url: URL): void = js.native
    def setTitle(title: String): void = js.native
    var suppressBackspaceNavigation: Boolean = js.native
    def unregisterKey(actionID: KeyName, target: Types.Object = js.native): void = js.native
    val unsupportedBrowserAction: UnsupportedOperationException = js.native
    def updateViewport(scale: Int, width: Int, height: Int, scalable: Int): void = js.native
    def waitFor(obj: Types.Object, methodName: String, callback: Callback, timeout: Int = js.native, timeoutCallback: Callback = js.native): Boolean = js.native
    def waitForMultiple(obj: Types.Object, methodName: String, callback: Callback, timeout: Int = js.native, timeoutCallback: Callback = js.native): Boolean = js.native
}

@js.native
object Page extends AbstractPageCompanion
