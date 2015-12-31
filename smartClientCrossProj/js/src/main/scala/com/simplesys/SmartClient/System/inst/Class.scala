package com.simplesys.SmartClient.System.inst

import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.props.ClassProps

import scala.scalajs.js

@js.native
trait Class extends Types.Object {
    def create[T <: ClassProps](): this.type
}
