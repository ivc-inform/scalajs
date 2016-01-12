package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.Layout.{AbstractToolbarCompanion, Toolbar}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait MenuBar extends Toolbar {
}

@js.native
abstract trait AbstractMenuBarCompanion extends AbstractToolbarCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object MenuBar extends AbstractMenuBarCompanion
}

