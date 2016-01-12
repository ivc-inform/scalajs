package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System.Types.Callback
import com.simplesys.System.Types.void

import scala.scalajs.js

@js.native
object FileLoader extends Types.Object {
    type OnLoad = js.Function0[_]
    var addVersionToLoadTags: Boolean = js.native
    def cacheEdgeImages(baseURLs: js.Array[String], showCenter: Boolean = js.native, edges: js.Array[String] = js.native, colors: js.Array[String] = js.native, onload: OnLoad): void = js.native
    def cacheFiles(URLs: js.Array[String], onload: OnLoad = js.native, `type`: String = js.native): void = js.native
    def cacheImgStates(baseURLs: js.Array[String], states: js.Array[String] = js.native, onload: OnLoad = js.native): void = js.native
    def cacheISC(skin: String = js.native, modules: js.Array[String] = js.native, onload: OnLoad = js.native): void = js.native
    def cacheLocale(locale: String = js.native, onloa: OnLoad = js.native): void = js.native
    def cacheModules(modules: js.Array[String], onload: OnLoad = js.native): void = js.native
    def cacheShadows(baseDir: String, depths: js.Array[String], baseShadowImage: String = js.native, onload: OnLoad = js.native): void = js.native
    def cacheStretchImgStates(baseURLs: js.Array[String], states: js.Array[String] = js.native, pieces: js.Array[String] = js.native, onload: OnLoad = js.native): void = js.native
    var defaultModules: String = js.native
    var defaultSkin: String = js.native
    def ensureLoaded(callback: Callback): void = js.native
    def loadISC(skin: String = js.native, modules: js.Array[String] = js.native, onload: OnLoad = js.native): void = js.native
    def loadSkin(skin: String, onload: OnLoad = js.native): void = js.native
    def loadJSFiles(URLs: js.Array[String], onload: OnLoad = js.native): void = js.native
    def loadLocale(locale: String = js.native, onload: OnLoad = js.native): void = js.native
    def loadModules(modules: js.Array[String] = js.native, onload: OnLoad = js.native): void = js.native
    val modulesDir: String = js.native
    val versionParamName: String = js.native
}
