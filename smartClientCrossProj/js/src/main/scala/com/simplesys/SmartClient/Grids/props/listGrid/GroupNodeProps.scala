package com.simplesys.SmartClient.Grids.props.listGrid

import com.simplesys.SmartClient.Grids.listGrid.ListGridRecord
import com.simplesys.System.Types.HTMLString
import com.simplesys.option.{ScOption, ScNone}
import com.simplesys.props.AbstractClassProps
import com.simplesys.types.JSAny

import scala.scalajs.js
import scala.scalajs.js._

class GroupNodeProps extends AbstractClassProps {
    var groupMembers: ScOption[Array[ListGridRecord]] = ScNone
    var groupTitle: ScOption[HTMLString] = ScNone
    var groupValue: ScOption[JSAny] = ScNone
}
