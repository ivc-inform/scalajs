package com.simplesys.SmartClient.App

import com.simplesys.SmartClient.Forms.FormsItems.props.{DateTimeItemProps, FormItemProps}
import com.simplesys.SmartClient.Forms.props.DateChooserProps
import com.simplesys.SmartClient.Grids.props.ListGridProps
import com.simplesys.SmartClient.System._
import com.simplesys.SmartClient.System.date.props.DateProps
import com.simplesys.SmartClient.Tools.editProxy.props.DrawItemEditProxyProps
import com.simplesys.SmartClient.Tools.props.editProxy.DrawPaneEditProxyProps
import com.simplesys.System.Types.DateDisplayFormat
import com.simplesys.option.ScOption._

import scala.scalajs.js.annotation.JSExport

@JSExport
class PrepareJSCode extends StaticJSCode {

    @JSExport override def createJS(): Unit = {
        isc.defineClass(RibbonGroupSS.getClass.getSimpleName, RibbonGroup.getClass.getSimpleName)
        isc.defineClass(SettingsEditor.getClass.getSimpleName, WindowSS.getClass.getSimpleName)
        isc.defineClass(ListGridContextMenu.getClass.getSimpleName, MenuSS.getClass.getSimpleName)
        isc.defineClass(ListGridContextMenuWithForm.getClass.getSimpleName, MenuSS.getClass.getSimpleName)
        isc.defineClass(TreeGridContextMenu.getClass.getSimpleName, MenuSS.getClass.getSimpleName)
        isc.defineClass(TreeListGridContextMenu.getClass.getSimpleName, MenuSS.getClass.getSimpleName)
        isc.defineClass(CommonListGridEditorComponent.getClass.getSimpleName, ListGridEditor.getClass.getSimpleName)
        isc.defineClass(CommonTreeGridEditorComponent.getClass.getSimpleName, TreeGridEditor.getClass.getSimpleName)
        isc.defineClass(CommonTreeListGridEditorComponent.getClass.getSimpleName, TreeListGridEditor.getClass.getSimpleName)
        isc.defineClass(LookupListGridEditorItem.getClass.getSimpleName, CanvasItem.getClass.getSimpleName)
        isc.defineClass(LookupTreeGridEditorItem.getClass.getSimpleName, CanvasItem.getClass.getSimpleName)
        isc.defineClass(TextItemSS.getClass.getSimpleName, TextItem.getClass.getSimpleName)
        isc.defineClass(TextAreaItemSS.getClass.getSimpleName, TextAreaItem.getClass.getSimpleName)
        isc.defineClass(DateTimeItemSS.getClass.getSimpleName, DateTimeItem.getClass.getSimpleName)
        isc.defineClass(EditorUsers.getClass.getSimpleName, CommonTreeListGridEditorComponent.getClass.getSimpleName)
        isc.defineClass(EditorUserGroups.getClass.getSimpleName, CommonTreeGridEditorComponent.getClass.getSimpleName)
        isc.defineClass(WindowListGridEditorToolStrip.getClass.getSimpleName, ToolStrip.getClass.getSimpleName)

        isc.ListGrid.addProperties(ListGrid(new ListGridProps))
        isc.FormItem.addProperties(FormItem(new FormItemProps))
        isc.DrawItemEditProxy.addProperties(DrawItemEditProxy(new DrawItemEditProxyProps))

        isc.addMethods(
            isc.Date.prototype,
            Date(new DateProps)
        )
        isc.DateTimeItem.addProperties(
            DateTimeItem(
                new DateTimeItemProps {
                    dateFormatter = DateDisplayFormat.toEuropeanDatetime.opt
                    pickerProperties = DateChooser(
                        new DateChooserProps {
                            showSecondItem = true.opt
                        }
                    ).opt
                }
            )
        )
    }
}

