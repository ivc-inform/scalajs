
package com.simplesys.SmartClient.Layout.props

import com.simplesys.SmartClient.Layout.TabSetSS
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js

class TabSetSSProps extends TabSetProps {
    type callbackHandler <: TabSetSS

    var tabsReordered: ScOption[js.ThisFunction0[callbackHandler, _]] = ScNone
}
