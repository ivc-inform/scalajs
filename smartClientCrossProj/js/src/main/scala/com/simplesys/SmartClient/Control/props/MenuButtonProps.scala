package com.simplesys.SmartClient.Control.props

import com.simplesys.SmartClient.Control.{MenuButton, Menu}
import com.simplesys.System.Types.Alignment.Alignment
import com.simplesys.System.Types.SCImgURL
import com.simplesys.option.{ScNone, ScOption}

class MenuButtonProps extends ButtonProps {
    type buttonHandler <: MenuButton
    var autoDestroyMenu: ScOption[Boolean] = ScNone
    var menu: ScOption[MenuSSItem] = ScNone
    var menuAlign: ScOption[Alignment] = ScNone
    var menuAnimationEffect: ScOption[String] = ScNone
    var menuButtonImage: ScOption[SCImgURL] = ScNone
    var menuButtonImageUp: ScOption[SCImgURL] = ScNone
    var rollOverMenuHideDelay: ScOption[Int] = ScNone
    var showMenuBelow: ScOption[Boolean] = ScNone
    var showMenuButtonImage: ScOption[Boolean] = ScNone
    var showMenuOnRollOver: ScOption[Boolean] = ScNone
}
