package com.simplesys.SmartClient.Forms

import com.simplesys.SmartClient.Control.IButton
import com.simplesys.SmartClient.System.Class
import com.simplesys.SmartClient.Layout.{AbstractWindowCompanion, Window}
import com.simplesys.isc.System.Types.ColorPickerMode.ColorPickerMode
import com.simplesys.isc.System.Types.{SCImgURL, CSSStyleName, AutoChild, HTMLString}

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait ColorPicker extends Window {
    var allowComplexMode: Boolean
    var autoCenterOnShow: Boolean
    var autoPosition: Boolean
    val basicColorLabel: HTMLString
    val blueFieldPrompt: HTMLString
    val blueFieldTitle: HTMLString
    val cancelButton: IButton with AutoChild
    var cancelButtonConstructor: Class
    var cancelButtonTitle: HTMLString
    val colorArray: Array[String]
    val colorButtonBaseStyle: CSSStyleName
    var colorButtonSize: Int
    var colorChanged: js.Function1[Unit, _]
    var colorSelected: js.Function2[String, Int, _]
    val crosshairImageURL: SCImgURL
    val defaultColor: String
    val defaultOpacity: Int
    val defaultPickMode: ColorPickerMode
    def getBlue(): Int
    def getGreen(): Int
    def getHtmlColor(): String
    def getHue(): Int
    def getLuminosity(): Int
    def getOpacity(): Int
    def getRed(): Int
    def getSaturation(): Int
    val greenFieldPrompt: HTMLString
    val greenFieldTitle: HTMLString
    val htmlFieldPrompt: HTMLString
    val htmlFieldTitle: HTMLString
    val hueFieldPrompt: HTMLString
    val hueFieldTitle: HTMLString
    val lessButtonTitle: HTMLString
    val lumFieldPrompt: HTMLString
    val lumFieldTitle: HTMLString
    val lumWidth: Int
    val modeToggleButton: IButton with AutoChild
    val modeToggleButtonConstructor: Class
    val moreButtonTitle: HTMLString
    val okButton: IButton with AutoChild
    val okButtonConstructor: Class
    val okButtonTitle: HTMLString
    val opacitySliderLabel: HTMLString
    val opacityText: HTMLString
    val redFieldPrompt: HTMLString
    val redFieldTitle: HTMLString
    val satFieldPrompt: HTMLString
    val satFieldTitle: HTMLString
    val selectedColorLabel: HTMLString
    def setBlue(newValue: Int): Unit
    def setCurrentPickMode(pickMode: ColorPickerMode): Unit
    def setGreen(newValue: Int): Unit
    def setHtmlColor(newValue: String): Unit
    def setHue(newValue: Int): Unit
    def setLuminosity(newValue: Int): Unit
    def setRed(newValue: Int): Unit
    def setSupportsTransparency(transparencyFlag: Boolean): Unit
    val supportsTransparency: Boolean
    val swatchImageURL: SCImgURL
    val swatchWidth: Int
}

@js.native
abstract trait AbstractColorPickerCompanion extends AbstractWindowCompanion {
}

@js.native
object ColorPicker extends AbstractColorPickerCompanion        
