package com.simplesys.SmartClient.Grids.props.listGrid

import com.simplesys.SmartClient.Grids.listGrid.ListGridRecord
import com.simplesys.System.Types.HTMLString
import com.simplesys.option.{ScOption, ScNone}
import com.simplesys.props.AbstractClassProps
import com.simplesys.Types1.{JSArray, JSAny}

import scala.scalajs.js
import scala.scalajs.js._

class GroupNodeProps extends AbstractClassProps {
    var groupMembers: ScOption[JSArray[ListGridRecord]] = ScNone
    var groupTitle: ScOption[HTMLString] = ScNone
    var groupValue: ScOption[JSAny] = ScNone
}
