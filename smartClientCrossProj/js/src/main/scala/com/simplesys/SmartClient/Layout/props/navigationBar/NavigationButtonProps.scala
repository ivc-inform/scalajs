package com.simplesys.SmartClient.Layout.props.navigationBar

import com.simplesys.SmartClient.Control.props.ButtonProps
import com.simplesys.System.Types2.CSSStyleName
import com.simplesys.System.Types2.NavigationDirection.NavigationDirection
import com.simplesys.option.{ScNone, ScOption}

class NavigationButtonProps extends ButtonProps {
    var backBaseStyle: ScOption[CSSStyleName] = ScNone
    var direction: ScOption[NavigationDirection] = ScNone
    var forwardBaseStyle: ScOption[CSSStyleName] = ScNone
}
