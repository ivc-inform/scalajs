package com.simplesys.SmartClient.Grids.props.listGrid

import com.simplesys.SmartClient.Grids.listGrid.HeaderSpan
import com.simplesys.System.Types2.Alignment.Alignment
import com.simplesys.System.Types2.SCClassName
import com.simplesys.System.Types2.VerticalAlignment.VerticalAlignment
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.props.AbstractClassProps
import com.simplesys.Types1.JSArray

import scala.scalajs.js._

class HeaderSpanProps extends AbstractClassProps {
    var align: ScOption[Alignment] = ScNone
    var fields: ScOption[JSArray[String]] = ScNone
    var headerBaseStyle: ScOption[SCClassName] = ScNone
    var headerTitle: ScOption[String] = ScNone
    var headerTitleStyle: ScOption[SCClassName] = ScNone
    var height: ScOption[Int] = ScNone
    var name: ScOption[String] = ScNone
    var spans: ScOption[JSArray[HeaderSpan]] = ScNone
    var title: ScOption[String] = ScNone
    var valign: ScOption[VerticalAlignment] = ScNone
}
