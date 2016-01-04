package com.simplesys.SmartClient.DataBinding.dataSource

import com.simplesys.SmartClient.DataBinding.{DSRequest, DSResponse}

import scala.scalajs.js

trait DSCallback extends js.Function3[DSResponse,js.Dictionary[js.Any], DSRequest, Unit]
