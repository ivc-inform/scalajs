package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.Layout.{AbstractVLayoutCompanion, VLayout}
import com.simplesys.isc.System.Types.void

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait DataView extends VLayout {
    var dataViewLoaded: js.Function1[void, _]
}

@js.native
abstract trait AbstractDataViewCompanion extends AbstractVLayoutCompanion {
}

@js.native
object DataView extends AbstractDataViewCompanion        
