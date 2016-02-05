package com.simplesys.SmartClient.Grids.listGrid

import com.simplesys.SmartClient.System.Types

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}
import scala.scalajs.js.|

@ScalaJSDefined
trait PKForignMapping extends Types.Object {
    @JSName ("pk")
    val masterGridField: String
    @JSName ("forign")
    val detailGridField: String
}


