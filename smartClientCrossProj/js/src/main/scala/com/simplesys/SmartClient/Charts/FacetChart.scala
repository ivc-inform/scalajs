package com.simplesys.SmartClient.Charts

import com.simplesys.SmartClient.Foundation.{AbstractDrawPaneCompanion, DrawPane}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait FacetChart extends DrawPane with Chart{
}

@js.native
abstract trait AbstractFacetChartCompanion extends AbstractDrawPaneCompanion {
}

package companion {
    @js.native
    object FacetChart extends AbstractFacetChartCompanion
}

