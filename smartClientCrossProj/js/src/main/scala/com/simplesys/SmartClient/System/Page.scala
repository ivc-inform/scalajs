package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System.Number._
import com.simplesys.SmartClient.System.Types._
import com.simplesys.SmartClient.System.inst._
import com.simplesys.isc.System.Types.FireStyle._
import com.simplesys.isc.System.Types.PageOrientation._
import com.simplesys.isc.System.Types._

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
abstract class AbstractPageCompanion extends AbstractClassCompanion {
    def checkBrowserAndRedirect(url: URL): Unit = js.native
    def clearEvent(eventType: PageEvent, ID: Number): Unit = js.native
    var defaultUnsupportedBrowserURL: URL = js.native
    def getAppDir(): String = js.native
    def getAppFilesDir(url: URL = js.native): Unit = js.native
    def getAppImgDir(): String = js.native
    def getHeight(wd: Object = js.native): Number = js.native
    def getImgURL(src: SCImgURL, imgDir: String): String = js.native
    def getIsomorphicDir(): String = js.native
    def getOrientation(): PageOrientation = js.native
    def getScreenHeight(): Number = js.native
    def getScreenWidth(): Number = js.native
    def getScrollHeight(): Number = js.native
    def getScrollLeft(): Number = js.native
    def getScrollTop(): Number = js.native
    def getScrollWidth(): Number = js.native
    def getSkinDir(): String = js.native
    def getSkinImgDir(url: URL = js.native): String = js.native
    def getUnsupportedBrowserPromptString(): String = js.native
    def getURL(fileName: String): String = js.native
    def getWidth(wd: Object = js.native): Number = js.native
    def goBack(): Unit = js.native
    def isAddVersionToSkinCSS(): Boolean = js.native
    def isLoaded(): Boolean = js.native
    def isRTL(): Boolean = js.native
    def loadStyleSheet(url: URL): Unit = js.native
    def moveTo(left: Number, top: Number): Unit = js.native
    val protocolURLs: js.Array[String] = js.native
    def registerKey(key: KeyIdentifier, action: js.Function1[Types.Object, _]): Unit = js.native
    def resizeTo(width: Number, height: Number): Unit = js.native
    def scrollTo(left: Number, top: Number): Unit = js.native
    def setAddVersionToSkinCSS(addVersionToSkinCss: Boolean): Unit = js.native
    def setAppFilesDir(url: URL = js.native): Unit = js.native
    def setAppImgDir(url: URL = js.native) : Unit = js.native
    def setEvent(eventType: PageEvent, action: scalajs.js.Function1[Types.Object, _], fireStyle: FireStyle = js.native, functionName: scalajs.js.Function = js.native): Number = js.native
    def setIsomorphicDir(url: URL): Unit = js.native
    def setSkinDir(url: URL): Unit = js.native
    def setTitle(title: String): Unit = js.native
    var suppressBackspaceNavigation: Boolean = js.native
    def unregisterKey(actionID: KeyName, target: Types.Object = js.native): Unit = js.native
    val unsupportedBrowserAction: UnsupportedOperationException = js.native
    def updateViewport(scale: Number, width: Number, height: Number, scalable: Number): Unit = js.native
    def waitFor(obj: Types.Object, methodName: String, callback: Callback, timeout: Number = js.native, timeoutCallback: Callback = js.native): Boolean = js.native
    def waitForMultiple(obj: Types.Object, methodName: String, callback: Callback, timeout: Number = js.native, timeoutCallback: Callback = js.native): Boolean = js.native
}

@js.native
object Page extends AbstractPageCompanion {

}
