package com.simplesys.SmartClient.Control.inst

import com.simplesys.SmartClient.Foundation.inst.StatefulCanvas
import com.simplesys.isc.System.Types.{CSSStyleName, HTMLString}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Button extends StatefulCanvas {
    var iconClick: js.Function0[Boolean] | String
}

