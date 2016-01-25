package com.simplesys.SmartClient.Grids.props

import com.simplesys.SmartClient.Control.Menu
import com.simplesys.SmartClient.Grids.props.listGrid.{ListGridFieldProps, ListGridRecordProps}
import com.simplesys.SmartClient.Layout.props.VLayoutSSProps
import com.simplesys.System.Types.AutoFitWidthApproach.AutoFitWidthApproach
import com.simplesys.System.Types.DragTrackerMode.DragTrackerMode
import com.simplesys.System.Types.ListGridEditEvent.ListGridEditEvent
import com.simplesys.System.Types.SelectionAppearance.SelectionAppearance
import com.simplesys.System.Types.TextMatchStyle.TextMatchStyle
import com.simplesys.option.{ScNone, ScOption}

class GridEditorProps[T <: ListGridFieldProps, R <: ListGridRecordProps] extends VLayoutSSProps {
    var canDragSelectText: ScOption[Boolean] = ScNone
    var autoFitFieldWidth: ScOption[Boolean] = ScNone
    var canResizeFields: ScOption[Boolean] = ScNone
    var showAllRecords: ScOption[Boolean] = ScNone
    var showRecordComponentsByCel: ScOption[Boolean] = ScNone
    var showRecordComponents: ScOption[Boolean] = ScNone
    var filterOnKeypress: ScOption[Boolean] = ScNone
    var drawAheadRatio: ScOption[Double] = ScNone
    var autoSaveEdits: ScOption[Boolean] = ScNone
    var canEdit: ScOption[Boolean] = ScNone
    var showRollOve: ScOption[Boolean] = ScNone
    var autoFetchData: ScOption[Boolean] = ScNone
    var showRowNumbers: ScOption[Boolean] = ScNone
    var autoSaveConfig: ScOption[Boolean] = ScNone
    var showAdvancedFilter: ScOption[Boolean] = ScNone
    var emptyMessage: ScOption[String] = ScNone
    var wrapCells: ScOption[Boolean] = ScNone
    var autoFetchTextMatchStyle: ScOption[TextMatchStyle] = ScNone
    var fixedRecordHeights: ScOption[Boolean] = ScNone
    var dragTrackerMode: ScOption[DragTrackerMode] = ScNone
    var autoFitWidthApproach: ScOption[AutoFitWidthApproach] = ScNone
    var modalEditing: ScOption[Boolean] = ScNone
    var canSelectCells: ScOption[Boolean] = ScNone
    var useClientFilteringSorting: ScOption[Boolean] = ScNone
    var selectionAppearance: ScOption[SelectionAppearance] = ScNone
    var cancelEditingConfirmationMessage: ScOption[String] = ScNone
    var fetchDelay: ScOption[Int] = ScNone
    var editEvent: ScOption[ListGridEditEvent] = ScNone
    var canSelectTextExpandedField: ScOption[Boolean] = ScNone
    var showFilterEditor: ScOption[Boolean] = ScNone
    var dataPageSize: ScOption[Int] = ScNone
    var funcMenu: ScOption[Menu] = ScNone
}

class ListGridEditorProps extends GridEditorProps[ListGridFieldProps, ListGridRecordProps] {
    var fields: ScOption[Seq[ListGridFieldProps]] = ScNone
    var defaultFields: ScOption[Seq[ListGridFieldProps]] = ScNone
}
