package com.simplesys.SmartClient.Tools.editContext.props

import com.simplesys.SmartClient.Grids.props.TreeGridProps
import com.simplesys.SmartClient.Tools.editContext.EditTree
import com.simplesys.SmartClient.Tools.props.EditContextProps

class EditTreeProps extends TreeGridProps with EditContextProps{
    type classHandler <: EditTree
}
