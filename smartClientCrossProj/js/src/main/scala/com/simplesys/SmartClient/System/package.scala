package com.simplesys.SmartClient

import com.simplesys.SmartClient.Control._
import com.simplesys.SmartClient.Control.props._
import com.simplesys.SmartClient.DataBinding.dataSource.DataSourceField
import com.simplesys.SmartClient.DataBinding.props.dataSource.DataSourceFieldProps
import com.simplesys.SmartClient.DataBinding.{RestDataSource, DataSource, DataView}
import com.simplesys.SmartClient.DataBinding.props.{RestDataSourceProps, DataSourceProps, DataViewProps}
import com.simplesys.SmartClient.Forms.FormsItems.props.{ButtonItemProps, FormItemProps}
import com.simplesys.SmartClient.Forms.FormsItems.{ButtonItem, FormItem}
import com.simplesys.SmartClient.Forms._
import com.simplesys.SmartClient.Forms.props._
import com.simplesys.SmartClient.Foundation._
import com.simplesys.SmartClient.Foundation.props._
import com.simplesys.SmartClient.Grids.{ListGrid, TreeGrid, Grid}
import com.simplesys.SmartClient.Grids.listGrid.{ListGridRecord, ListGridField}
import com.simplesys.SmartClient.Grids.props.{ListGridProps, TreeGridProps, GridProps}
import com.simplesys.SmartClient.Layout._
import com.simplesys.SmartClient.Layout.portalLayout.Portlet
import com.simplesys.SmartClient.Layout.props._
import com.simplesys.SmartClient.Layout.props.portalLayout.PortletProps
import com.simplesys.SmartClient.Layout.props.tabSet.TabProps
import com.simplesys.SmartClient.Layout.props.toolStrip.{ToolStripResizerProps, ToolStripButtonProps, ToolStripSeparatorProps, ToolStripMenuButtonProps}
import com.simplesys.SmartClient.Layout.tabSet.Tab
import com.simplesys.SmartClient.Layout.toolStrip.{ToolStripResizer, ToolStripButton, ToolStripSeparator, ToolStripMenuButton}

//import com.simplesys.macros.PropsToDictionary
import com.simplesys.macros.PropsToDictionary

package object System {

    implicit class StringOpts(x: String) {
            def ellipsis = s"$x..."
    }

    //<editor-fold desc="Control">
    object Dialog extends SCApply[Dialog, DialogProps]
    object IButton extends SCApply[IButton, IButtonProps]
    //</editor-fold>

    //<editor-fold desc="DataBinding">
    object DataView extends SCApply[DataView, DataViewProps]
    object DataSource extends SCApply[DataSource, DataSourceProps]
    object DataSourceField extends SCApply[DataSourceField, DataSourceFieldProps]
    object RestDataSource extends SCApply[RestDataSource, RestDataSourceProps]
    //</editor-fold>

    //<editor-fold desc="Forms">
    object DynamicForm extends SCApply[DynamicForm, DynamicFormProps]
    //</editor-fold>

    //<editor-fold desc="FormsItems">
    object FormItem extends SCApply[FormItem, FormItemProps]
    object ButtonItem extends SCApply[ButtonItem, ButtonItemProps]
    //</editor-fold>

    //<editor-fold desc="Foundation">
    object Label extends SCApply[Label, LabelProps]
    //</editor-fold>

    //<editor-fold desc="Grids">
    object ListGrid extends SCApply[ListGrid, ListGridProps]
    object TreeGrid extends SCApply[TreeGrid, TreeGridProps]
    //</editor-fold>

    //<editor-fold desc="Layout">
    object Deck extends SCApply[Deck, DeckProps]
    object HLayout extends SCApply[HLayout, HLayoutProps]
    object HStack extends SCApply[HStack, HStackProps]
    object IconButton extends SCApply[IconButton, IconButtonProps]
    object IconMenuButton extends SCApply[IconMenuButton, IconMenuButtonProps]
    object ImgSplitbar extends SCApply[ImgSplitbar, ImgSplitbarProps]
    object Layout extends SCApply[Layout, LayoutProps]
    object VLayout extends SCApply[VLayout, VLayoutProps]
    object TabSet extends SCApply[TabSet, TabSetProps]
    object Tab extends SCApply[Tab, TabProps]
    object Window extends SCApply[Window, WindowProps]
    object Portlet extends SCApply[Portlet, PortletProps]
    object PortalLayout	 extends SCApply[PortalLayout	, PortalLayoutProps]
    object ToolStrip extends SCApply[ToolStrip, ToolStripProps]
    object ToolStripMenuButton extends SCApply[ToolStripMenuButton, ToolStripMenuButtonProps]
    object ToolStripSeparator extends SCApply[ToolStripSeparator, ToolStripSeparatorProps]
    object ToolStripButton extends SCApply[ToolStripButton, ToolStripButtonProps]
    object ToolStripResizer extends SCApply[ToolStripResizer, ToolStripResizerProps]
    //</editor-fold>
}
