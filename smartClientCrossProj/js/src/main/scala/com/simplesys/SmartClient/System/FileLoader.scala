package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System.Types.Callback
import com.simplesys.System.Types.void
import com.simplesys.Types.JSArray

import scala.scalajs.js

@js.native
object FileLoader extends Types.Object {
    type OnLoad = js.Function0[_]
    var addVersionToLoadTags: Boolean = js.native
    def cacheEdgeImages(baseURLs: JSArray[String], showCenter: Boolean = js.native, edges: JSArray[String] = js.native, colors: JSArray[String] = js.native, onload: OnLoad): void = js.native
    def cacheFiles(URLs: JSArray[String], onload: OnLoad = js.native, `type`: String = js.native): void = js.native
    def cacheImgStates(baseURLs: JSArray[String], states: JSArray[String] = js.native, onload: OnLoad = js.native): void = js.native
    def cacheISC(skin: String = js.native, modules: JSArray[String] = js.native, onload: OnLoad = js.native): void = js.native
    def cacheLocale(locale: String = js.native, onloa: OnLoad = js.native): void = js.native
    def cacheModules(modules: JSArray[String], onload: OnLoad = js.native): void = js.native
    def cacheShadows(baseDir: String, depths: JSArray[String], baseShadowImage: String = js.native, onload: OnLoad = js.native): void = js.native
    def cacheStretchImgStates(baseURLs: JSArray[String], states: JSArray[String] = js.native, pieces: JSArray[String] = js.native, onload: OnLoad = js.native): void = js.native
    var defaultModules: String = js.native
    var defaultSkin: String = js.native
    def ensureLoaded(callback: Callback): void = js.native
    def loadISC(skin: String = js.native, modules: JSArray[String] = js.native, onload: OnLoad = js.native): void = js.native
    def loadSkin(skin: String, onload: OnLoad = js.native): void = js.native
    def loadJSFiles(URLs: JSArray[String], onload: OnLoad = js.native): void = js.native
    def loadLocale(locale: String = js.native, onload: OnLoad = js.native): void = js.native
    def loadModules(modules: JSArray[String] = js.native, onload: OnLoad = js.native): void = js.native
    val modulesDir: String = js.native
    val versionParamName: String = js.native
}
