package com.simplesys.SmartClient.Layout.navigationBar

import com.simplesys.SmartClient.Control.{AbstractStretchImgButtonCompanion, StretchImgButton}
import com.simplesys.System.Types.{void, URL, SCImgURL}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait MiniNavControl extends StretchImgButton {
    val downButtonSrc: SCImgURL
    var downClick: js.ThisFunction0[callbackHandler, void]
    val upButtonSrc:SCImgURL
    var upClick: js.ThisFunction0[callbackHandler, void]
}

@js.native
abstract trait AbstractMiniNavControlCompanion extends AbstractStretchImgButtonCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object MiniNavControl extends AbstractMiniNavControlCompanion
}

