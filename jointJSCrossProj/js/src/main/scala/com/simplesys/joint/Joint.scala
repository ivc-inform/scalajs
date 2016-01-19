package com.simplesys.joint

import com.simplesys.joint.dia.Dia

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait Joint extends js.Object {
    val dia: Dia
}


@js.native
@JSName("joint")
object JointStatic extends js.Object {
    val joint: Joint = js.native
}
