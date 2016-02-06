package com.simplesys.SmartClient.Forms.props

import com.simplesys.SmartClient.Control.{ImgButton, IButton}
import com.simplesys.SmartClient.DataBinding.{DataSource, AdvancedCriteria}
import com.simplesys.SmartClient.Forms.DynamicForm
import com.simplesys.SmartClient.Forms.FormsItems.{PickList, FormItem, SelectItem}
import com.simplesys.SmartClient.Foundation.{Canvas, Label}
import com.simplesys.SmartClient.Layout.{VStack, HLayout}
import com.simplesys.SmartClient.Layout.props.LayoutProps
import com.simplesys.System.Types.FieldType.FieldType
import com.simplesys.System.Types.LogicalOperator.LogicalOperator
import com.simplesys.System.Types.{void, MultiAutoChild}
import com.simplesys.System.Types.OperatorId.OperatorId
import com.simplesys.System.Types.TopOperatorAppearance.TopOperatorAppearance
import com.simplesys.System.Types.ValueItemType.ValueItemType
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.Types1.JSArray

import scala.scalajs.js
import scala.scalajs.js._

class FilterBuilderProps extends LayoutProps {
    var addButton: ScOption[ImgButton] = ScNone
    var addButtonPrompt: ScOption[String] = ScNone
    var allowEmpty: ScOption[Boolean] = ScNone
    var bracket: ScOption[Canvas] = ScNone
    var clauseStack: ScOption[VStack] = ScNone
    var criteria: ScOption[AdvancedCriteria] = ScNone
    var dataSource: ScOption[DataSource] = ScNone
    var defaultSubClauseOperator: ScOption[LogicalOperator] = ScNone
    var fieldDataSource: ScOption[DataSource] = ScNone
    var fieldPicker: ScOption[PickList] = ScNone
    var fieldPickerProperties: ScOption[FormItem] = ScNone
    var fieldPickerTitle: ScOption[String] = ScNone
    var filterChanged: ScOption[js.Function1[void, _]] = ScNone
    var getValueFieldProperties: ScOption[js.Function4[FieldType, String, OperatorId, ValueItemType, FormItem]] = ScNone
    var inlineAndNotTitle: ScOption[String] = ScNone
    var inlineAndTitle: ScOption[String] = ScNone
    var inlineOrTitle: ScOption[String] = ScNone
    var matchAllTitle: ScOption[String] = ScNone
    var matchAnyTitle: ScOption[String] = ScNone
    var matchNoneTitle: ScOption[String] = ScNone
    var missingFieldPrompt: ScOption[String] = ScNone
    var modeSwitcher: ScOption[Label] = ScNone
    var modeSwitcherAdvancedMessage: ScOption[String] = ScNone
    var modeSwitcherFlattenWarningMessage: ScOption[String] = ScNone
    var modeSwitcherSimpleMessage: ScOption[String] = ScNone
    var operatorPicker: ScOption[SelectItem with MultiAutoChild] = ScNone
    var operatorPickerProperties: ScOption[FormItem] = ScNone
    var operatorPickerTitle: ScOption[String] = ScNone
    var operatorPickerWidth: ScOption[String | Int] = ScNone
    var radioOperatorForm: ScOption[DynamicForm] = ScNone
    var radioOperatorLayout: ScOption[HLayout] = ScNone
    var radioOperatorTitle: ScOption[String] = ScNone
    var rangeSeparator: ScOption[String] = ScNone
    var removeButton: ScOption[ImgButton] = ScNone
    var removeButtonPrompt: ScOption[String] = ScNone
    var retainValuesAcrossFields: ScOption[Boolean] = ScNone
    var saveOnEnter: ScOption[Boolean] = ScNone
    var search: ScOption[js.Function1[AdvancedCriteria, _]] = ScNone
    var showAddButton: ScOption[Boolean] = ScNone
    var showFieldTitles: ScOption[Boolean] = ScNone
    var showModeSwitcher: ScOption[Boolean] = ScNone
    var showRemoveButton: ScOption[Boolean] = ScNone
    var showSelectionCheckbox: ScOption[Boolean] = ScNone
    var showSubClauseButton: ScOption[Boolean] = ScNone
    var sortFields: ScOption[Boolean] = ScNone
    var subClauseButton: ScOption[IButton] = ScNone
    var subClauseButtonPrompt: ScOption[String] = ScNone
    var subClauseButtonTitle: ScOption[String] = ScNone
    var topOperator: ScOption[LogicalOperator] = ScNone
    var topOperatorAppearance: ScOption[TopOperatorAppearance] = ScNone
    var topOperatorForm: ScOption[DynamicForm] = ScNone
    var topOperatorItem: ScOption[SelectItem] = ScNone
    var topOperatorItemWidth: ScOption[String | Int] = ScNone
    var topOperatorOptions: ScOption[JSArray[OperatorId]] = ScNone
    var topOperatorTitle: ScOption[String] = ScNone
    var validateOnChange: ScOption[Boolean] = ScNone
    var valueItemWidth: ScOption[Int | String] = ScNone
}
