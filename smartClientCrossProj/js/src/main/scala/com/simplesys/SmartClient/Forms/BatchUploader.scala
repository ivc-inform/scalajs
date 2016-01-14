package com.simplesys.SmartClient.Forms

import com.simplesys.SmartClient.Control.IButton
import com.simplesys.SmartClient.DataBinding.DataSource
import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.Foundation.HTMLFlow
import com.simplesys.SmartClient.Grids.ListGrid
import com.simplesys.SmartClient.Grids.listGrid.{ListGridField, ListGridRecord}
import com.simplesys.SmartClient.Layout.{AbstractVStackCompanion, VStack}
import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types.AutoChild
import com.simplesys.System.Types.ImportFormat.ImportFormat
import com.simplesys.System.Types.PartialCommitOption.PartialCommitOption

import scala.scalajs.js
import scala.scalajs.js.Array
import scala.scalajs.js.annotation.JSName

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
    var grid: ListGrid[ListGridField, ListGridRecord] with AutoChild
    var gridFields: Array[ListGridField]
    var partialCommit: PartialCommitOption
    val partialCommitConfirmationMessage: String
    val partialCommitError: String
    val partialCommitPrompt: String
    var requestProperties: Types.Object
    val showCommitConfirmation: Boolean
    val uploadButton: IButton with AutoChild
    val uploadButtonTitle: String
    val uploadDataSource: DataSource
    var uploadFieldPrefix: String
    var uploadFileLabel: String
    val uploadForm: DynamicForm with AutoChild
    val uploadFormFields: Array[FormItem]
    val uploadOperation: String
    val uploadStatusMessages: HTMLFlow with AutoChild
    var warnOnCancel: Boolean
}

@js.native
abstract trait AbstractBatchUploaderCompanion extends AbstractVStackCompanion {
}

@js.native
@JSName("BatchUploader")
object BatchUploaderStatic extends AbstractBatchUploaderCompanion


