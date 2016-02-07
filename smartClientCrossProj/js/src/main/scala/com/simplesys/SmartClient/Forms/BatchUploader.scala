package com.simplesys.SmartClient.Forms

import com.simplesys.SmartClient.Control.IButton
import com.simplesys.SmartClient.DataBinding.DataSource
import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.Foundation.HTMLFlow
import com.simplesys.SmartClient.Grids.Grid
import com.simplesys.SmartClient.Grids.listGrid.{ListGridField, ListGridRecord}
import com.simplesys.SmartClient.Layout.VStack
import com.simplesys.System.Types.AutoChild
import com.simplesys.System.Types.ImportFormat.ImportFormat
import com.simplesys.System.Types.PartialCommitOption.PartialCommitOption
import com.simplesys.System.JSArray

import scala.scalajs.js


@js.native
trait BatchUploader extends VStack {
    val allRecordsInErrorMessage: String
    val cancelButton: IButton with AutoChild
    val cancelConfirmMessage: String
    val commitButton: IButton with AutoChild
    val commitConfirmationMessage: String
    val dataFormat: ImportFormat
    var dataURL: String
    var defaultDelimiter: String
    var defaultQuoteString: String
    var discardedColumnsMessage: String
    val displayDiscardedColumns: Boolean
    var grid: Grid[ListGridField, ListGridRecord] with AutoChild
    var gridFields: JSArray[ListGridField]
    var partialCommit: PartialCommitOption
    val partialCommitConfirmationMessage: String
    val partialCommitError: String
    val partialCommitPrompt: String
    var requestProperties: js.Object
    val showCommitConfirmation: Boolean
    val uploadButton: IButton with AutoChild
    val uploadButtonTitle: String
    val uploadDataSource: DataSource
    var uploadFieldPrefix: String
    var uploadFileLabel: String
    val uploadForm: DynamicForm with AutoChild
    val uploadFormFields: JSArray[FormItem]
    val uploadOperation: String
    val uploadStatusMessages: HTMLFlow with AutoChild
    var warnOnCancel: Boolean
}




