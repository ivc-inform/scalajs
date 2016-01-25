package com.simplesys.SmartClient.Control.props

import com.simplesys.SmartClient.Grids.ListGridEditor
import com.simplesys.option.{ScNone, ScOption}

class ListGridContextMenuProps extends MenuSSProps {
    var owner: ScOption[ListGridEditor] = ScNone
}
