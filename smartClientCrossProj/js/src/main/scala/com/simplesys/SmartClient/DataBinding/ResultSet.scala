package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.System.{Types, AbstractClassCompanion, Class, List}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ResultSet extends Class with List{
}

@js.native
abstract trait AbstractResultSetCompanion extends AbstractClassCompanion {
}

@js.native
object ResultSet extends AbstractResultSetCompanion        
