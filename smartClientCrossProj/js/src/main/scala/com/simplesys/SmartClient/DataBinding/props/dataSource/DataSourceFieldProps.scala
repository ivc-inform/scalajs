package com.simplesys.SmartClient.DataBinding.props.dataSource

import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.Forms.props.ValidatorProps
import com.simplesys.System.Types.DateDisplayFormat.DateDisplayFormat
import com.simplesys.System.Types.FieldImportStrategy.FieldImportStrategy
import com.simplesys.System.Types.FieldType.FieldType
import com.simplesys.System.Types.HashAlgorithm.HashAlgorithm
import com.simplesys.System.Types.JoinType.JoinType
import com.simplesys.System.Types.MultipleFieldStorage.MultipleFieldStorage
import com.simplesys.System.Types.OperatorId.OperatorId
import com.simplesys.System.Types.SummaryFunction.SummaryFunction
import com.simplesys.System.Types.TimeDisplayFormat.TimeDisplayFormat
import com.simplesys.System.Types._
import com.simplesys.Types1.JSAny
import com.simplesys.option.{IntString, ScNone, ScOption}
import com.simplesys.props.AbstractClassProps

class DataSourceFieldProps extends AbstractClassProps {
    var allowClientRequestedSummaries: ScOption[Boolean] = ScNone
    var audit: ScOption[Boolean] = ScNone
    var autoGenerated: ScOption[Boolean] = ScNone
    var autoQuoteCustomExpressions: ScOption[Boolean] = ScNone
    var canEdit: ScOption[Boolean] = ScNone
    var canExport: ScOption[Boolean] = ScNone
    var canFilter: ScOption[Boolean] = ScNone
    var canSave: ScOption[Boolean] = ScNone
    var canSortClientOnly: ScOption[Boolean] = ScNone
    var canView: ScOption[Boolean] = ScNone
    var childrenProperty: ScOption[Boolean] = ScNone
    var childTagName: ScOption[String] = ScNone
    var columnCode: ScOption[String] = ScNone
    var creatorOverrides: ScOption[Boolean] = ScNone
    var customCriteriaExpression: ScOption[String] = ScNone
    var customInsertExpression: ScOption[String] = ScNone
    var customSelectExpression: ScOption[String] = ScNone
    var customSQL: ScOption[Boolean] = ScNone
    var customUpdateExpression: ScOption[String] = ScNone
    var dateFormatter: ScOption[DateDisplayFormat] = ScNone
    var decimalPad: ScOption[Int] = ScNone
    var decimalPrecision: ScOption[Int] = ScNone
    var deepCloneOnEdit: ScOption[Boolean] = ScNone
    var detail: ScOption[Boolean] = ScNone
    var displayField: ScOption[Boolean] = ScNone
    var editorType: ScOption[FormItem] = ScNone
    var editRequires: ScOption[VelocityExpression] = ScNone
    var editRequiresAuthentication: ScOption[Boolean] = ScNone
    var editRequiresRole: ScOption[String] = ScNone
    var emptyDisplayValue: ScOption[HTMLString] = ScNone
    var encodeInResponse: ScOption[Boolean] = ScNone
    var escapeHTML: ScOption[Boolean] = ScNone
    var exportFormat: ScOption[FormatString] = ScNone
    var exportTitle: ScOption[String] = ScNone
    var filterEditorType: ScOption[FormItem] = ScNone
    var fkColumnCode: ScOption[String] = ScNone
    var fkTableCode: ScOption[String] = ScNone
    var foreignDisplayField: ScOption[String] = ScNone
    var foreignKey: ScOption[String] = ScNone
    var format: ScOption[FormatString] = ScNone
    var group: ScOption[String] = ScNone
    var hidden: ScOption[Boolean] = ScNone
    var ignore: ScOption[Boolean] = ScNone
    var ignoreTextMatchStyle: ScOption[Boolean] = ScNone
    var imageHeight: ScOption[IntString[Int, String]] = ScNone
    var imageSize: ScOption[IntString[Int, String]] = ScNone
    var imageWidth: ScOption[IntString[Int, String]] = ScNone
    var implicitSequence: ScOption[Boolean] = ScNone
    var importStrategy: ScOption[FieldImportStrategy] = ScNone
    var inapplicable: ScOption[Boolean] = ScNone
    var includeFrom: ScOption[String] = ScNone
    var includeSummaryFunction: ScOption[SummaryFunction] = ScNone
    var includeVia: ScOption[String] = ScNone
    var initRequires: ScOption[VelocityExpression] = ScNone
    var initRequiresAuthentication: ScOption[Boolean] = ScNone
    var initRequiresRole: ScOption[String] = ScNone
    var javaClass: ScOption[String] = ScNone
    var javaCollectionClass: ScOption[String] = ScNone
    var javaKeyClass: ScOption[String] = ScNone
    var joinType: ScOption[JoinType] = ScNone
    var length: ScOption[Int] = ScNone
    var lenientXPath: ScOption[Boolean] = ScNone
    var maxFileSize: ScOption[Int] = ScNone
    var mimeType: ScOption[String] = ScNone
    var multiple: ScOption[Boolean] = ScNone
    var multipleStorage: ScOption[MultipleFieldStorage] = ScNone
    var multipleStorageSeparator: ScOption[Boolean] = ScNone
    var multipleValueSeparator: ScOption[Boolean] = ScNone
    var name: ScOption[ID] = ScNone
    var nativeName: ScOption[String] = ScNone
    var nillable: ScOption[Boolean] = ScNone
    var nullReplacementValue: ScOption[JSAny] = ScNone
    var precision: ScOption[JSAny] = ScNone
    var primaryKey: ScOption[Boolean] = ScNone
    var propertiesOnly: ScOption[Boolean] = ScNone
    var readOnlyEditorType: ScOption[FormItem] = ScNone
    var relatedTableAlias: ScOption[String] = ScNone
    var required: ScOption[Boolean] = ScNone
    var rootValue: ScOption[JSAny] = ScNone
    var sequenceName: ScOption[String] = ScNone
    var showFileInline: ScOption[Boolean] = ScNone
    var sortByField: ScOption[String] = ScNone
    var sqlDateFormat: ScOption[String] = ScNone
    var sqlFalseValue: ScOption[String] = ScNone
    var sqlStorageStrategy: ScOption[String] = ScNone
    var sqlTrueValue: ScOption[String] = ScNone
    var storeMilliseconds: ScOption[Boolean] = ScNone
    var storeWithHash: ScOption[HashAlgorithm] = ScNone
    var stringInBrowser: ScOption[Boolean] = ScNone
    var summaryFunction: ScOption[SummaryFunction] = ScNone
    var summaryValueTitle: ScOption[String] = ScNone
    var tableName: ScOption[String] = ScNone
    var timeFormatter: ScOption[TimeDisplayFormat] = ScNone
    var title: ScOption[String] = ScNone
    var updateRequires: ScOption[VelocityExpression] = ScNone
    var updateRequiresAuthentication: ScOption[Boolean] = ScNone
    var updateRequiresRole: ScOption[String] = ScNone
    var uploadFieldName: ScOption[String] = ScNone
    var validators: ScOption[Seq[ValidatorProps]] = ScNone
    var validOperators: ScOption[Seq[OperatorId]] = ScNone
    var valueMap: ScOption[ValueMap] = ScNone
    var valueMapEnum: ScOption[String] = ScNone
    var valueWriteXPath: ScOption[XPathExpression] = ScNone
    var valueXPath: ScOption[XPathExpression] = ScNone
    var viewRequires: ScOption[VelocityExpression] = ScNone
    var viewRequiresAuthentication: ScOption[Boolean] = ScNone
    var viewRequiresRole: ScOption[String] = ScNone
    var xmlAttribute: ScOption[Boolean] = ScNone
    var `type`: ScOption[FieldType] = ScNone
    var foreignField: ScOption[String] = ScNone
    var lookup: ScOption[Boolean] = ScNone
    var captionClassLookup: ScOption[String] = ScNone
}
