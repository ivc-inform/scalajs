package com.simplesys.SmartClient.Foundation

import com.simplesys.SmartClient.Foundation.inst._
import com.simplesys.SmartClient.Foundation.props.StatefulCanvasProps
import com.simplesys.SmartClient.System.SCApply
import com.simplesys.macros.PropsToMap

import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
object StatefulCanvas extends AbstractCanvasCompanion {
    private val sCApply = new SCApply[StatefulCanvas, StatefulCanvasProps]()
    def create(props: StatefulCanvasProps): StatefulCanvas = sCApply create props
}
