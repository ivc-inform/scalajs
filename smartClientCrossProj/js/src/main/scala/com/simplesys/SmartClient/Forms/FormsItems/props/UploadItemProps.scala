package com.simplesys.SmartClient.Forms.FormsItems.props

import com.simplesys.option.{ScOption, ScNone}

import scala.scalajs.js._

class UploadItemProps extends TextItemProps {
    var accept: ScOption[String] = ScNone
    var multiple: ScOption[Boolean] = ScNone
}
