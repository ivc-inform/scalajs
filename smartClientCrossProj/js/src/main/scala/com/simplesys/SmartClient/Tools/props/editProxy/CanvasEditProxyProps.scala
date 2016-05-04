package com.simplesys.js.com.simplesys.SmartClient.Tools.props.editProxy

import com.simplesys.SmartClient.System.IscArray
import com.simplesys.SmartClient.Tools.editProxy.CanvasEditProxy
import com.simplesys.SmartClient.Tools.props.EditProxyProps
import com.simplesys.System._
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js

class CanvasEditProxyProps extends EditProxyProps {
    type classHandler <: CanvasEditProxy

    var dropOut: ScOption[js.ThisFunction0[classHandler, Boolean]] = ScNone
    var drop: ScOption[js.ThisFunction1[classHandler,IscArray[JSAny], Boolean]] = ScNone
    var willAcceptDrop: ScOption[js.ThisFunction0[classHandler, Boolean]] = ScNone
}
