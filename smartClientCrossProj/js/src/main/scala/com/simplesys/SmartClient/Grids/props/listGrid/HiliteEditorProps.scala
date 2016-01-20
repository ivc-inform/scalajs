package com.simplesys.SmartClient.Grids.props.listGrid

import com.simplesys.SmartClient.Foundation.StatefulCanvas
import com.simplesys.SmartClient.Grids.Grid
import com.simplesys.SmartClient.Grids.listGrid.{HiliteRule, ListGridField, ListGridRecord}
import com.simplesys.SmartClient.Layout.props.VLayoutProps
import com.simplesys.SmartClient.System.Types.Callback
import com.simplesys.System.Types.SCImgURL
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js

class HiliteEditorProps extends VLayoutProps {
    var addAdvancedRuleButton: ScOption[StatefulCanvas] = ScNone
    var addAdvancedRuleButtonTitle: ScOption[String] = ScNone
    var availableFieldsColumnTitle: ScOption[String] = ScNone
    var callback: ScOption[Callback] = ScNone
    var cancelButton: ScOption[StatefulCanvas] = ScNone
    var cancelButtonTitle: ScOption[String] = ScNone
    var fieldList: ScOption[Grid[ListGridField, ListGridRecord]] = ScNone
    var hiliteIcons: ScOption[Seq[SCImgURL]] = ScNone
    var hiliteRule: ScOption[HiliteRule] = ScNone
    var saveButton: ScOption[StatefulCanvas] = ScNone
    var saveButtonTitle: ScOption[String] = ScNone
}
