package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.Grids.treeGrid.TreeNode
import com.simplesys.SmartClient.RPC.{AbstractRPCRequestCompanion, RPCRequest}
import com.simplesys.System.Types.DSOperationType.DSOperationType
import com.simplesys.System.Types.DSProtocol.DSProtocol
import com.simplesys.System.Types.ExportDisplay.ExportDisplay
import com.simplesys.System.Types.ExportFormat.ExportFormat
import com.simplesys.System.Types.ExportImageFormat.ExportImageFormat
import com.simplesys.System.Types.PropertyIdentifier.PropertyIdentifier
import com.simplesys.System.Types.Record
import com.simplesys.System.Types.TextMatchStyle.TextMatchStyle
import com.simplesys.System.Types.ValidationMode.ValidationMode
import com.simplesys.System.JSArray

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait DSRequest extends RPCRequest {
    val additionalOutputs: String
    val componentId: String
    val dataProtocol: DSProtocol
    val dataSource: String
    val endRow: Int
    val exportAs: ExportFormat
    val exportCSS: String
    val exportData: JSArray[Record]
    val exportDatesAsFormattedString: Boolean
    val exportDelimiter: String
    val exportDisplay: ExportDisplay
    val exportFields: JSArray[String]
    val exportFilename: String
    val exportFooter: String
    val exportHeader: String
    val exportHeaderless: Boolean
    val exportImageFormat: ExportImageFormat
    val exportImageQuality: Float
    val exportPath: String
    val exportPropertyIdentifier: PropertyIdentifier
    val exportRawValues: Boolean
    val exportResults: Boolean
    val exportShowHeaderSpanTitles: Boolean
    val exportSpanTitleSeparator: String
    val exportStreaming: Boolean
    val exportTitleSeparatorChar: String
    val exportToClient: Boolean
    val exportToFilesystem: Boolean
    val exportValueFields: Boolean
    val fieldValueExpressions: js.Object
    val generateRelatedUpdates: Boolean
    val groupBy: JSArray[String]
    val headerData: js.Object
    val keepParentsOnFilter: Boolean
    val lineBreakStyle: String
    val oldValues: Record
    val operationId: String
    val operationType: DSOperationType
    val outputs: String
    val parentNode: TreeNode
    val pendingAdd: Boolean
    val progressiveLoading: Boolean
    val requestId: String
    val resultSet: ResultSet
    val resultTree: ResultTree
    val shouldUseCache: Boolean
    val sortBy: String | JSArray[String] | JSArray[SortSpecifier]
    val startRow: Int
    val streamResults: Boolean
    val summaryFunctions: js.Object
    val textMatchStyle: TextMatchStyle
    val useFlatFields: Boolean
    val useFlatHeaderFields: Boolean
    val useStrictJSON: Boolean
    val validationMode: ValidationMode
}

@js.native
abstract trait AbstractDSRequestCompanion extends AbstractRPCRequestCompanion {
}

@js.native
object DSRequest extends AbstractDSRequestCompanion

