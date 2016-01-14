package com.simplesys.SmartClient.Grids.props.listGrid

import com.simplesys.SmartClient.Forms.{FilterBuilder, DynamicForm}
import com.simplesys.SmartClient.Foundation.StatefulCanvas
import com.simplesys.SmartClient.Layout.props.VStackProps
import com.simplesys.SmartClient.System.Types.Callback
import com.simplesys.System.Types.SCImgURL
import com.simplesys.option.{ScOption, ScNone}

import scala.scalajs.js._

class AdvancedHiliteEditorProps extends VStackProps {
    var appearanceGroupTitle: ScOption[String] = ScNone
    var callback: ScOption[Callback] = ScNone
    var cancelButton: ScOption[StatefulCanvas ] = ScNone
    var cancelButtonTitle: ScOption[String] = ScNone
    var filterBuilder: ScOption[FilterBuilder] = ScNone
    var filterGroupTitle: ScOption[String] = ScNone
    var hiliteForm: ScOption[DynamicForm ] = ScNone
    var hiliteIcons: ScOption[Array[SCImgURL]] = ScNone
    var invalidHilitePrompt: ScOption[String] = ScNone
    var saveButton: ScOption[StatefulCanvas ] = ScNone
    var saveButtonTitle: ScOption[String] = ScNone
    var targetFieldsItemTitle: ScOption[String] = ScNone
    var title: ScOption[String] = ScNone
}
