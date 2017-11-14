package com.simplesys.SmartClient.App.formItems.props

import com.simplesys.SmartClient.App.formItems.LookupTreeGridEditorItem
import com.simplesys.SmartClient.Control.props.IButtonSSProps
import com.simplesys.SmartClient.Forms.DynamicFormSS
import com.simplesys.SmartClient.Forms.formsItems.props.{CanvasItemProps, TextItemSSProps}
import com.simplesys.SmartClient.Forms.formsItems.{CanvasItem, TextItem}
import com.simplesys.SmartClient.Forms.props.DynamicFormSSProps
import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Grids.listGrid.ListGridRecord
import com.simplesys.SmartClient.Grids.treeGrid.TreeNode
import com.simplesys.SmartClient.Grids.{ListGrid, TreeGridEditor}
import com.simplesys.SmartClient.Layout.props.{HLayoutSSProps, OkCancelPanelProps, WindowSSProps}
import com.simplesys.SmartClient.System.{Common, HLayoutSS, IButtonSS, _}
import com.simplesys.System.Types.ReadOnlyDisplayAppearance.{ReadOnlyDisplayAppearance => _}
import com.simplesys.System.Types._
import com.simplesys.System._
import com.simplesys.function._
import com.simplesys.option.DoubleType._
import com.simplesys.option.ScOption._
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js

class LookupTreeGridEditorItemProps extends CanvasItemProps {
    type classHandler <: LookupTreeGridEditorItem

    var buttonIcon: ScOption[SCImgURL] = ScNone

    var treeGridEditor: ScOption[TreeGridEditor] = ScNone

    align = Alignment.center.opt

    shouldSaveValue = true.opt

    setValue = {
        (thiz: classHandler, value: JSUndefined[JSAny]) =>
            thiz.Super("setValue", IscArray(value))

            thiz.textItem setValue (value)

            if (value.isDefined) {

                if (thiz.treeGridEditor.isEmpty)
                    isc.error("Не определено свойство 'thiz.treeGridEditor' error #38")
                else
                    thiz.treeGridEditor.foreach {
                        editor =>
                            thiz.record.foreach {
                                record =>
                                    if (record != null) {
                                        if (thiz.form.isEmpty)
                                            isc.error("Не определено свойство 'thiz.form' error #45")
                                        else
                                            thiz.form.foreach {
                                                form =>
                                                    if (form.dataSource.isEmpty)
                                                        isc.error("Не определено свойство 'form.dataSource' error #50")
                                                    else
                                                        form.dataSource.foreach {
                                                            dataSource =>
                                                                val foreignIdField = dataSource.getField(thiz.foreignField.get).get

                                                                val id = record.asInstanceOf[JSDynamic].selectDynamic(foreignIdField.name)
                                                                editor.deselectAllRecords()
                                                                editor selectRecordsByKey id
                                                        }
                                            }
                                    }
                            }
                    }
            }
    }.toThisFunc.opt

    createCanvas = {
        (thiz: classHandler, form: DynamicFormSS, item: CanvasItem) =>

            val formItem = thiz

            val df = DynamicFormSS.create(
                new DynamicFormSSProps {
                    cellPadding = 0.opt
                    width = "*"
                    minColWidth = 0.opt
                    colWidths = Seq[JSAny](0, "*").opt
                    items = Seq(
                        TextItemSS(
                            new TextItemSSProps {
                                colSpan = 2
                                nameStrong = s"${item._name}_inner".nameStrongOpt
                                _name = s"${item._name}_inner".opt
                                width = "*"
                                showTitle = false.opt
                                value = item.getValue().opt
                                readOnlyDisplay = ReadOnlyDisplayAppearance.readOnly.opt
                            }
                        )
                    ).opt
                }
            )

            thiz.textItem = df.getItem(0).asInstanceOf[TextItem]

            val button = IButtonSS.create(
                new IButtonSSProps {
                    iconAlign = "center".opt
                    icon = thiz.buttonIcon.getOrElse(Common.ellipsis).opt
                    width = 22
                    click = {
                        (thiz: classHandler) =>
                            if (formItem.treeGridEditor.isEmpty)
                                isc.error("Отсутствует редактор.")
                            else {
                                formItem.treeGridEditor.foreach {
                                    editor =>
                                        //isc debugTrap editor

                                        if (!formItem.lookup.getOrElse(false))
                                            isc.error("Поле не является полем lookup")
                                        else if (formItem.foreignField.isEmpty)
                                            isc.error("Нет значения для foreignField.")
                                        else {
                                            val window = WindowSS.create(
                                                new WindowSSProps {
                                                    height = 400
                                                    width = 300
                                                    isModal = true.opt
                                                    autoPosition = true.opt
                                                    showMaximizeButton = false.opt
                                                    showMinimizeButton = false.opt
                                                    dismissOnEscape = true.opt
                                                    identifier = s"${form.identifier}_lookup_${item._name}".opt
                                                    title = s"${formItem.captionClassLookup.getOrElse("Неизвестное поле captionClassLookup.")}".ellipsis.opt
                                                    headerIconPath = Common.iconEdit.opt
                                                }
                                            )

                                            if (form.dataSource.isEmpty)
                                                isc.error("Не определено свойство 'form.dataSource' error #141")
                                            else
                                                form.dataSource.foreach {
                                                    dataSource =>
                                                        val foreignIdField = dataSource.getField(formItem.foreignField.get).get
                                                        val idFieldName = foreignIdField.foreignKey.substring(foreignIdField.foreignKey.lastIndexOf(".") + 1)
                                                        val idField = form.getItem(formItem.foreignField.get)

                                                        if (idField == null && formItem.record.isEmpty)
                                                            isc.error(s"Нет поля ${formItem.foreignField.get}")
                                                        else
                                                            window.addItems(
                                                                IscArray[Canvas](
                                                                    editor,
                                                                    OkCancelPanel.create(
                                                                        new OkCancelPanelProps {
                                                                            owner = window.opt
                                                                            padding = 5.opt
                                                                            okCaption = "Выбрать".opt
                                                                            ownerDestroy = false.opt
                                                                            ownerHide = true.opt
                                                                            owner = window.opt
                                                                            okFunction = {
                                                                                (thiz: classHandler) =>
                                                                                    if (editor.selectionType.toString == SelectionStyle.multiple.toString) {

                                                                                        val records = editor.getSelectedRecords()

                                                                                        formItem setValueMap records

                                                                                        if (formItem.nameStrong.isEmpty)
                                                                                            formItem.nameStrong = new NameStrong {
                                                                                                override val name = formItem._name
                                                                                            }

                                                                                        val res = editor.getSelectedRecords().map(item => item.asInstanceOf[JSDynamic].selectDynamic(formItem.nameStrong.get.name).toString).mkString(", ")
                                                                                        //isc debugTrap res

                                                                                        val criteria: JSArray[JSObject] = editor.getSelectedRecords().map {
                                                                                            item =>
                                                                                                val obj = js.Object()
                                                                                                val objDyn = obj.asInstanceOf[JSDynamic]
                                                                                                val recordFields = js.Object.keys(records(0))
                                                                                                recordFields.foreach {
                                                                                                    field =>
                                                                                                        //isc debugTrap (field, editor.dataSource.getField(field))
                                                                                                        if (editor.dataSource.getField(field).isDefined) {
                                                                                                            if (editor.dataSource.getField(field).get.primaryKey.getOrElse(false)) {
                                                                                                                objDyn.updateDynamic("fieldName")(formItem.foreignField.get)
                                                                                                                objDyn.updateDynamic("operator")("equals")
                                                                                                                objDyn.updateDynamic("value")(item.asInstanceOf[JSDynamic].selectDynamic(field))
                                                                                                            }
                                                                                                        }
                                                                                                }

                                                                                                obj
                                                                                        }

                                                                                        //isc debugTrap criteria

                                                                                        val advancedCriteria = js.Dynamic.literal(
                                                                                            "_constructor" -> "AdvancedCriteria".dblQuoted,
                                                                                            "operator" -> "or",
                                                                                            "criteria" -> criteria
                                                                                        )

                                                                                        isc debugTrap formItem.filteredGridList

                                                                                        if (formItem.filteredGridList.isEmpty)
                                                                                            isc.error("Нет поля formItem.filteredGrid.")
                                                                                        else
                                                                                            formItem.filteredGridList.foreach(_.fetchData(criteria = advancedCriteria))

                                                                                        formItem setValue (res)

                                                                                    } else {
                                                                                        if (editor.getSelectedRecords().length != 1)
                                                                                            isc.error("Не возможно выделить значение для ввода.")
                                                                                        else {
                                                                                            val record = editor.getSelectedRecord()

                                                                                            val valueId = record.asInstanceOf[JSDynamic].selectDynamic(idFieldName)

                                                                                            if (formItem.record.isEmpty || formItem.record.get == null)
                                                                                                idField.setValue(valueId)
                                                                                            else
                                                                                                formItem.record.foreach(_.asInstanceOf[JSDynamic].updateDynamic(formItem.foreignField.get)(valueId))


                                                                                            val recordFields = js.Object.keys(record)
                                                                                            recordFields.foreach {
                                                                                                field =>
                                                                                                    if (editor.dataSource.getField(field).isDefined)
                                                                                                        if (!editor.dataSource.getField(field).get.primaryKey.getOrElse(false))
                                                                                                            form.setValue(field, editor.getSelectedRecord().asInstanceOf[JSDynamic].selectDynamic(field))
                                                                                            }

                                                                                            val treeGrid = formItem.grid.masterTreeGrid
                                                                                            val listGrid: ListGrid = formItem.grid
                                                                                            val listGridKeys = js.Object()

                                                                                            if (formItem.record.isDefined && formItem.record.get != null)
                                                                                                listGrid.dataSource.foreach {
                                                                                                    _.getPrimaryKeyFieldNames().foreach {
                                                                                                        fieldName =>
                                                                                                            //isc debugTrap (formItem.record, fieldName, formItem.record.get.asInstanceOf[JSDynamic].selectDynamic(fieldName))
                                                                                                            listGridKeys.asInstanceOf[JSDynamic].updateDynamic(fieldName)(formItem.record.get.asInstanceOf[JSDynamic].selectDynamic(fieldName))
                                                                                                    }
                                                                                                }

                                                                                            //isc debugTrap listGridKeys
                                                                                            listGrid.saveAllEdits()
                                                                                            listGrid.cancelEditing()

                                                                                            isc.ask("Перейти в каталог переноса элемента ?", {
                                                                                                (value: Boolean) =>
                                                                                                    if (value) {
                                                                                                        treeGrid.foreach(_.deselectAllRecords())

                                                                                                        val keyValue: TreeNode = treeGrid.get.findByKey(valueId).asInstanceOf[TreeNode]
                                                                                                        treeGrid.foreach(grid => grid.selectRecord(keyValue))

                                                                                                        val rec = listGrid.findByKey(listGridKeys)
                                                                                                        listGrid selectRecord rec.asInstanceOf[ListGridRecord]
                                                                                                    }
                                                                                                    thiz.owner.foreach(_.hide())
                                                                                            })

                                                                                        }
                                                                                    }
                                                                            }.toThisFunc.opt
                                                                        }
                                                                    )
                                                                )
                                                            )
                                                }
                                        }
                                        editor.listGrid.focus()
                                }
                            }

                            false
                    }.toThisFunc.opt
                }
            )
            HLayoutSS.create(
                new HLayoutSSProps {
                    height = 20
                    members = Seq(
                        df,
                        button
                    ).opt
                }
            )
    }.toThisFunc.opt

    `type` = FormItemComponentType.LookupListGridEditorItem
}
