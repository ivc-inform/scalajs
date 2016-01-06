package com.simplesys.SmartClient.Grids


import com.simplesys.SmartClient.DataBinding.DataBoundComponent
import com.simplesys.SmartClient.Layout.{Layout, AbstractLayoutCompanion}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ColumnTree extends Layout with DataBoundComponent{
}

@js.native
abstract trait AbstractColumnTreeCompanion extends AbstractLayoutCompanion {
}

@js.native
object ColumnTree extends AbstractColumnTreeCompanion        
