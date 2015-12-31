package com.simplesys.SmartClient.System.props

import com.simplesys.SmartClient.System.Types.IconOrientation.IconOrientation
import com.simplesys.SmartClient.System.Types.IconOrientation.IconOrientation
import com.simplesys.SmartClient.System.Types.{IconOrientation, SCImgURL, HTMLString}

import scala.collection.mutable

class ClassProps extends mutable.HashMap[String, Any] {
    def title: HTMLString = ""
    def title_=(value: HTMLString) = update("title", value)

    def icon: HTMLString = ""
    def icon_=(value: SCImgURL) = update("icon", value)

    def iconOrientation: IconOrientation = IconOrientation.left
    def iconOrientation_=(value: IconOrientation) = update("iconOrientation", value.toString)
}
