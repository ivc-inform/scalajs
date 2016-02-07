package com.simplesys.SmartClient.Forms.props

import com.simplesys.SmartClient.Control.IButton
import com.simplesys.SmartClient.DataBinding.DataSource
import com.simplesys.SmartClient.Forms.DynamicForm
import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.Foundation.HTMLFlow
import com.simplesys.SmartClient.Grids.Grid
import com.simplesys.SmartClient.Grids.listGrid.{ListGridField, ListGridRecord}
import com.simplesys.SmartClient.Layout.props.VStackProps
import com.simplesys.System.Types.ImportFormat.ImportFormat
import com.simplesys.System.Types.PartialCommitOption.PartialCommitOption
import com.simplesys.System.JSArray
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js

class BatchUploaderProps extends VStackProps {
    var allRecordsInErrorMessage: ScOption[String] = ScNone
    var cancelButton: ScOption[IButton] = ScNone
    var cancelConfirmMessage: ScOption[String] = ScNone
    var commitButton: ScOption[IButton] = ScNone
    var commitConfirmationMessage: ScOption[String] = ScNone
    var dataFormat: ScOption[ImportFormat] = ScNone
    var dataURL: ScOption[String] = ScNone
    var defaultDelimiter: ScOption[String] = ScNone
    var defaultQuoteString: ScOption[String] = ScNone
    var discardedColumnsMessage: ScOption[String] = ScNone
    var displayDiscardedColumns: ScOption[Boolean] = ScNone
    var grid: ScOption[Grid[ListGridField, ListGridRecord]] = ScNone
    var gridFields: ScOption[JSArray[ListGridField]] = ScNone
    var partialCommit: ScOption[PartialCommitOption] = ScNone
    var partialCommitConfirmationMessage: ScOption[String] = ScNone
    var partialCommitError: ScOption[String] = ScNone
    var partialCommitPrompt: ScOption[String] = ScNone
    var requestProperties: ScOption[js.Object] = ScNone
    var showCommitConfirmation: ScOption[Boolean] = ScNone
    var uploadButton: ScOption[IButton] = ScNone
    var uploadButtonTitle: ScOption[String] = ScNone
    var uploadDataSource: ScOption[DataSource] = ScNone
    var uploadFieldPrefix: ScOption[String] = ScNone
    var uploadFileLabel: ScOption[String] = ScNone
    var uploadForm: ScOption[DynamicForm] = ScNone
    var uploadFormFields: ScOption[JSArray[FormItem]] = ScNone
    var uploadOperation: ScOption[String] = ScNone
    var uploadStatusMessages: ScOption[HTMLFlow] = ScNone
    var warnOnCancel: ScOption[Boolean] = ScNone

}
