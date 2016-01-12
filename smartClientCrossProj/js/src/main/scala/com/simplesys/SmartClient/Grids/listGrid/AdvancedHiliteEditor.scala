package com.simplesys.SmartClient.Grids.listGrid

import com.simplesys.SmartClient.Forms.{DynamicForm, FilterBuilder}
import com.simplesys.SmartClient.Foundation.StatefulCanvas
import com.simplesys.SmartClient.Layout.{AbstractVStackCompanion, VStack}
import com.simplesys.SmartClient.System.Types.Callback
import com.simplesys.System.Types.{void, SCImgURL, AutoChild}

import scala.scalajs.js
import scala.scalajs.js.{Array, |}

@js.native
trait AdvancedHiliteEditor extends VStack {
    val appearanceGroupTitle: String
    val callback: Callback
    val cancelButton: StatefulCanvas with AutoChild
    val cancelButtonTitle: String
    def cancelEditing(): void
    val filterBuilder: FilterBuilder
    val filterGroupTitle: String
    val hiliteForm: DynamicForm with AutoChild
    val hiliteIcons: Array[SCImgURL]
    val invalidHilitePrompt: String
    val saveButton: StatefulCanvas with AutoChild
    val saveButtonTitle: String
    def saveHilite(): void
    val targetFieldsItemTitle: String
    val title: String
}

@js.native
abstract trait AbstractAdvancedHiliteEditorCompanion extends AbstractVStackCompanion {
}

package companion {

import scala.scalajs.js

@js.native
   object AdvancedHiliteEditor extends AbstractAdvancedHiliteEditorCompanion
}

