package com.simplesys.SmartClient.DataBinding.dataSource

import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.Forms.Validator
import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types._
import com.simplesys.System.Types.DateDisplayFormat.DateDisplayFormat
import com.simplesys.System.Types.FieldImportStrategy.FieldImportStrategy
import com.simplesys.System.Types.FieldType.FieldType
import com.simplesys.System.Types.HashAlgorithm.HashAlgorithm
import com.simplesys.System.Types.JoinType.JoinType
import com.simplesys.System.Types.MultipleFieldStorage.MultipleFieldStorage
import com.simplesys.System.Types.OperatorId.OperatorId
import com.simplesys.System.Types.SummaryFunction.SummaryFunction
import com.simplesys.System.Types.TimeDisplayFormat.TimeDisplayFormat
import com.simplesys.System.Types.{ID, FormatString, void, HTMLString}
import com.simplesys.types.JSAny

import scala.scalajs.js
import scala.scalajs.js.|


@js.native
trait DataSourceField extends Types.Object {
    val allowClientRequestedSummaries: Boolean
    val audit: Boolean
    val autoGenerated: Boolean
    val autoQuoteCustomExpressions: Boolean
    val canEdit: Boolean
    val canExport: Boolean
    val canFilter: Boolean
    val canSave: Boolean
    val canSortClientOnly: Boolean
    val canView: Boolean
    val childrenProperty: Boolean
    val childTagName: String
    val columnCode: String
    val creatorOverrides: Boolean
    val customCriteriaExpression: String
    val customInsertExpression: String
    val customSelectExpression: String
    val customSQL: Boolean
    val customUpdateExpression: String
    var dateFormatter: DateDisplayFormat
    var decimalPad: Int
    var decimalPrecision: Int
    var deepCloneOnEdit: Boolean
    var detail: Boolean
    var displayField: Boolean
    val editorType: FormItem
    val editRequires: VelocityExpression
    val editRequiresAuthentication: Boolean
    val editRequiresRole: String
    val emptyDisplayValue: HTMLString
    var encodeInResponse: Boolean
    var escapeHTML: Boolean
    def exportForceText(): void
    var exportFormat: FormatString
    val exportTitle: String
    var filterEditorType: FormItem
    var fkColumnCode: String
    var fkTableCode: String
    var foreignDisplayField: String
    val foreignKey: String
    var format: FormatString
    def getFieldValue(record: Record | XMLElement, value: JSAny, field: DataSourceField, fieldName: String): void
    var group: String
    val hidden: Boolean
    val ignore: Boolean
    var ignoreTextMatchStyle: Boolean
    val imageHeight: Int | String
    val imageSize: Int | String
    val imageWidth: Int | String
    var implicitSequence: Boolean
    val importStrategy: FieldImportStrategy
    val inapplicable: Boolean
    val includeFrom: String
    val includeSummaryFunction: SummaryFunction
    val includeVia: String
    val initRequires: VelocityExpression
    val initRequiresAuthentication: Boolean
    var initRequiresRole: String
    val javaClass: String
    val javaCollectionClass: String
    val javaKeyClass: String
    val joinType: JoinType
    val length: Int
    val lenientXPath: Boolean
    val maxFileSize: Int
    val mimeType: String
    val multiple: Boolean
    val multipleStorage: MultipleFieldStorage
    val multipleStorageSeparator: Boolean
    val multipleValueSeparator: Boolean
    val name: ID
    val nativeName: String
    val nillable: Boolean
    val nullReplacementValue: JSAny
    var precision: JSAny
    val primaryKey: Boolean
    val propertiesOnly: Boolean
    val readOnlyEditorType: FormItem
    val relatedTableAlias: String
    val required: Boolean
    val rootValue: JSAny
    val sequenceName: String
    val showFileInline: Boolean
    val sortByField: String
    val sqlDateFormat: String
    val sqlFalseValue: String
    val sqlStorageStrategy: String
    val sqlTrueValue: String
    val storeMilliseconds: Boolean
    val storeWithHash: HashAlgorithm
    val stringInBrowser: Boolean
    val summaryFunction: SummaryFunction
    val summaryValueTitle: String
    val tableName: String
    val timeFormatter: TimeDisplayFormat
    val title: String
    val `type`: FieldType
    val updateRequires: VelocityExpression
    val updateRequiresAuthentication: Boolean
    val updateRequiresRole: String
    val uploadFieldName: String
    val validators: Array[Validator]
    val validOperators: Array[OperatorId]
    val valueMap: ValueMap
    val valueMapEnum: String
    val valueWriteXPath: XPathExpression
    val valueXPath: XPathExpression
    val viewRequires: VelocityExpression
    val viewRequiresAuthentication: Boolean
    val viewRequiresRole: String
    val xmlAttribute: Boolean
}
