package com.simplesys.SmartClient.Grids.props

import com.simplesys.SmartClient.Grids.props.listGrid.ListGridRecordProps
import com.simplesys.SmartClient.Grids.props.treeGrid.TreeGridFieldProps
import com.simplesys.option.{ScNone, ScOption}

class TreeGridEditorProps extends GridEditorProps[TreeGridFieldProps, ListGridRecordProps] {
    var fields: ScOption[Seq[TreeGridFieldProps]] = ScNone
    var defaultFields: ScOption[Seq[TreeGridFieldProps]] = ScNone
}
