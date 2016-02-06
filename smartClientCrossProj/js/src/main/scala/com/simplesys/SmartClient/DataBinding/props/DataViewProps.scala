package com.simplesys.SmartClient.DataBinding.props

import com.simplesys.SmartClient.Layout.props.VLayoutProps
import com.simplesys.System.Types2.void
import com.simplesys.option.{ScOption, ScNone}

import scala.scalajs.js
import scala.scalajs.js._

class DataViewProps extends VLayoutProps with DataBoundComponentProps{
    var dataViewLoaded: ScOption[js.Function1[void, _]] = ScNone
}
