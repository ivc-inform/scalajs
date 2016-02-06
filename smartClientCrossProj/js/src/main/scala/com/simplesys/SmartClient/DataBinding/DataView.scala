package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.Layout.VLayout
import com.simplesys.System.Types2.void

import scala.scalajs.js

@js.native
trait DataView extends VLayout {

    var dataViewLoaded: js.Function1[void, _]
}


