package com.simplesys.SmartClient.Grids.props.listGrid

import com.simplesys.SmartClient.Control.Button
import com.simplesys.SmartClient.Grids.props.ListGridProps
import com.simplesys.System.Types.{CSSStyleName, SCImgURL, void, URL}
import com.simplesys.option.{ScOption, ScNone}

import scala.scalajs.js
import scala.scalajs.js._

class RecordEditorProps extends ListGridProps {
    var actionButton: ScOption[Button ] = ScNone
    var actionButtonProperties: ScOption[js.Dictionary[js.Any]] = ScNone
    var actionButtonStyle: ScOption[CSSStyleName] = ScNone
    var filterImg: ScOption[SCImgURL] = ScNone
    var performAction: ScOption[js.ThisFunction0[void, void]] = ScNone
}
