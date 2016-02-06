package com.simplesys.SmartClient.Grids.listGrid

import com.simplesys.SmartClient.Forms.{DynamicForm, FilterBuilder}
import com.simplesys.SmartClient.Foundation.StatefulCanvas
import com.simplesys.SmartClient.Layout.VStack
import com.simplesys.System.Types.{Callback, AutoChild, SCImgURL, void}
import com.simplesys.Types1.JSArray

import scala.scalajs.js


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
    val hiliteIcons: JSArray[SCImgURL]
    val invalidHilitePrompt: String
    val saveButton: StatefulCanvas with AutoChild
    val saveButtonTitle: String
    def saveHilite(): void
    val targetFieldsItemTitle: String
    val title: String
}



