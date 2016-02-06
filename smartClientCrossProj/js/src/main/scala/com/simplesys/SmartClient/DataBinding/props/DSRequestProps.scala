package com.simplesys.SmartClient.DataBinding.props

import com.simplesys.SmartClient.DataBinding.Callbacks.DSCallback
import com.simplesys.SmartClient.DataBinding._
import com.simplesys.SmartClient.Grids.treeGrid.TreeNode
import com.simplesys.SmartClient.RPC.props.RequestCommon
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types.Record
import com.simplesys.System.Types2.DSOperationType.DSOperationType
import com.simplesys.System.Types2.DSProtocol.DSProtocol
import com.simplesys.System.Types2.ExportDisplay.ExportDisplay
import com.simplesys.System.Types2.ExportFormat.ExportFormat
import com.simplesys.System.Types2.ExportImageFormat.ExportImageFormat
import com.simplesys.System.Types2.PropertyIdentifier.PropertyIdentifier
import com.simplesys.System.Types2.TextMatchStyle.TextMatchStyle
import com.simplesys.System.Types2.ValidationMode.ValidationMode
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.Types1.{JSArray, JSDictionaryAny}

class DSRequestProps extends RequestCommon[DSCallback] {
    var additionalOutputs: ScOption[String] = ScNone
    var componentId: ScOption[String] = ScNone
    var dataProtocol: ScOption[DSProtocol] = ScNone
    var dataSource: ScOption[String] = ScNone
    var data: ScOption[JSDictionaryAny] = ScNone
    var endRow: ScOption[Int] = ScNone
    var exportAs: ScOption[ExportFormat] = ScNone
    var exportCSS: ScOption[String] = ScNone
    var exportData: ScOption[JSArray[Record]] = ScNone
    var exportDatesAsFormattedString: ScOption[Boolean] = ScNone
    var exportDelimiter: ScOption[String] = ScNone
    var exportDisplay: ScOption[ExportDisplay] = ScNone
    var exportFields: ScOption[JSArray[String]] = ScNone
    var exportFilename: ScOption[String] = ScNone
    var exportFooter: ScOption[String] = ScNone
    var exportHeader: ScOption[String] = ScNone
    var exportHeaderless: ScOption[Boolean] = ScNone
    var exportImageFormat: ScOption[ExportImageFormat] = ScNone
    var exportImageQuality: ScOption[Float] = ScNone
    var exportPath: ScOption[String] = ScNone
    var exportPropertyIdentifier: ScOption[PropertyIdentifier] = ScNone
    var exportRawValues: ScOption[Boolean] = ScNone
    var exportResults: ScOption[Boolean] = ScNone
    var exportShowHeaderSpanTitles: ScOption[Boolean] = ScNone
    var exportSpanTitleSeparator: ScOption[String] = ScNone
    var exportStreaming: ScOption[Boolean] = ScNone
    var exportTitleSeparatorChar: ScOption[String] = ScNone
    var exportToClient: ScOption[Boolean] = ScNone
    var exportToFilesystem: ScOption[Boolean] = ScNone
    var exportValueFields: ScOption[Boolean] = ScNone
    var fieldValueExpressions: ScOption[Types.Object] = ScNone
    var generateRelatedUpdates: ScOption[Boolean] = ScNone
    var groupBy: ScOption[JSArray[String]] = ScNone
    var headerData: ScOption[Types.Object] = ScNone
    var keepParentsOnFilter: ScOption[Boolean] = ScNone
    var lineBreakStyle: ScOption[String] = ScNone
    var oldValues: ScOption[Record] = ScNone
    var operationId: ScOption[String] = ScNone
    var operationType: ScOption[DSOperationType] = ScNone
    var outputs: ScOption[String] = ScNone
    var parentNode: ScOption[TreeNode] = ScNone
    var pendingAdd: ScOption[Boolean] = ScNone
    var progressiveLoading: ScOption[Boolean] = ScNone
    var requestId: ScOption[String] = ScNone
    var resultSet: ScOption[ResultSet] = ScNone
    var resultTree: ScOption[ResultTree] = ScNone
    var shouldUseCache: ScOption[Boolean] = ScNone
    var sortBy: ScOption[Seq[SortSpecifier]] = ScNone
    var startRow: ScOption[Int] = ScNone
    var streamResults: ScOption[Boolean] = ScNone
    var summaryFunctions: ScOption[Types.Object] = ScNone
    var textMatchStyle: ScOption[TextMatchStyle] = ScNone
    var useFlatFields: ScOption[Boolean] = ScNone
    var useFlatHeaderFields: ScOption[Boolean] = ScNone
    var useStrictJSON: ScOption[Boolean] = ScNone
    var validationMode: ScOption[ValidationMode] = ScNone

}
