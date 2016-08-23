package com.simplesys.SmartClient.Layout

import scala.scalajs.js

@js.native
trait ChainMasterDetail extends LayoutSS {
    def setViewState(): ChainMasterDetail
    def getViewState(): ChainMasterDetail
}

@js.native
abstract trait AbstractChainMasterDetailCompanion extends AbstractLayoutSSCompanion {
}

