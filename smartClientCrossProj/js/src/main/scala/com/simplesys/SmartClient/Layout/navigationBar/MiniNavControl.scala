package com.simplesys.SmartClient.Layout.navigationBar

import com.simplesys.SmartClient.Control.{AbstractStretchImgButtonCompanion, StretchImgButton}
import com.simplesys.isc.System.Types.{URL, SCImgURL}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait MiniNavControl extends StretchImgButton {
    val downButtonSrc: SCImgURL
    var downClick: js.ThisFunction0[callbackHandler, Unit]
    val upButtonSrc:SCImgURL
    var upClick: js.ThisFunction0[callbackHandler, Unit]
}

@js.native
abstract trait AbstractMiniNavControlCompanion extends AbstractStretchImgButtonCompanion {
}

@js.native
object MiniNavControl extends AbstractMiniNavControlCompanion        
