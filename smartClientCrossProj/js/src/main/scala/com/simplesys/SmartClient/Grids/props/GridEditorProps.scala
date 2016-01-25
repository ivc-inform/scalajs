package com.simplesys.SmartClient.Grids.props

import com.simplesys.SmartClient.Grids.listGrid.{ListGridField, ListGridRecord}
import com.simplesys.SmartClient.Grids.props.listGrid.ListGridFieldProps
import com.simplesys.SmartClient.Layout.props.VLayoutSSProps
import com.simplesys.option.{ScNone, ScOption}

class GridEditorProps[T <: ListGridField, R <: ListGridRecord] extends VLayoutSSProps {
}

class ListGridEditorProps extends GridEditorProps[ListGridField, ListGridRecord] {
}
