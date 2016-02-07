package com.simplesys.SmartClient

import com.simplesys.SmartClient.Control._
import com.simplesys.SmartClient.Control.props._
import com.simplesys.SmartClient.DataBinding._
import com.simplesys.SmartClient.DataBinding.props._
import com.simplesys.SmartClient.Forms.FormsItems.props.{ButtonItemProps, FormItemProps}
import com.simplesys.SmartClient.Forms.FormsItems.{ButtonItem, FormItem}
import com.simplesys.SmartClient.Forms._
import com.simplesys.SmartClient.Forms.props._
import com.simplesys.SmartClient.Foundation._
import com.simplesys.SmartClient.Foundation.props._
import com.simplesys.SmartClient.Grids._
import com.simplesys.SmartClient.Grids.props._
import com.simplesys.SmartClient.Grids.treeGrid.Tree
import com.simplesys.SmartClient.Layout._
import com.simplesys.SmartClient.Layout.portalLayout.{Portlet, PortletSS}
import com.simplesys.SmartClient.Layout.props._
import com.simplesys.SmartClient.Layout.props.portalLayout.{PortletProps, PortletSSProps}
import com.simplesys.SmartClient.Layout.props.toolStrip.{ToolStripButtonProps, ToolStripMenuButtonProps, ToolStripResizerProps, ToolStripSeparatorProps}
import com.simplesys.SmartClient.Layout.toolStrip.{ToolStripButton, ToolStripMenuButton, ToolStripResizer, ToolStripSeparator}
import com.simplesys.SmartClient.RPC.props.{RPCRequestProps, RPCResponseProps}
import com.simplesys.SmartClient.RPC.{RPCRequest, RPCResponse}
import com.simplesys.SmartClient.System.props.TreeProps

//import com.simplesys.macros.PropsToDictionary
import com.simplesys.macros.PropsToDictionary

package object System {

    implicit class StringOpts(x: String) {
        def ellipsis = s"$x..."
        def dblQuoted: String = "\"" + x + "\""
    }

    //<editor-fold desc="Control">
    object Dialog extends SCApply[Dialog, DialogProps]
    object IButton extends SCApply[IButton, IButtonProps]
    object Button extends SCApply[Button, ButtonProps]
    object LoginDialog extends SCApply[LoginDialog, LoginDialogProps]
    object Slider extends SCApply[Slider, SliderProps]
    object RangeSlider extends SCApply[RangeSlider, RangeSliderProps]
    object Hover extends SCApply[Hover, HoverProps]
    object Menu extends SCApply[Menu, MenuProps]
    object MenuSS extends SCApply[MenuSS, MenuSSProps]
    object MenuButton extends SCApply[MenuButton, MenuButtonProps]
    object IMenuButton extends SCApply[IMenuButton, IMenuButtonProps]
    object Progressbar extends SCApply[Progressbar, ProgressbarProps]
    object SelectionTreeMenu extends SCApply[SelectionTreeMenu, SelectionTreeMenuProps]
    object TreeMenuButton extends SCApply[TreeMenuButton, TreeMenuButtonProps]
    object ITreeMenuButton extends SCApply[ITreeMenuButton, ITreeMenuButtonProps]
    object MenuBar extends SCApply[MenuBar, MenuBarProps]
    object ImgButton extends SCApply[ImgButton, ImgButtonProps]
    object StretchImgButton extends SCApply[StretchImgButton, StretchImgButtonProps]
    //</editor-fold>

    //<editor-fold desc="DataBinding">
    object DataView extends SCApply[DataView, DataViewProps]
    object DataSource extends SCApply[DataSource, DataSourceProps]
    object RestDataSource extends SCApply[RestDataSource, RestDataSourceProps]
    object RestDataSourceSS extends SCApply[RestDataSourceSS, RestDataSourceSSProps]
    object SimpleType extends SCApply[SimpleType, SimpleTypeProps]
    //</editor-fold>

    //<editor-fold desc="Forms">
    object DynamicForm extends SCApply[DynamicForm, DynamicFormProps]
    object DynamicFormSS extends SCApply[DynamicFormSS, DynamicFormSSProps]
    //</editor-fold>

    //<editor-fold desc="FormsItems">
    object FormItem extends SCApply[FormItem, FormItemProps]
    object ButtonItem extends SCApply[ButtonItem, ButtonItemProps]
    //</editor-fold>

    //<editor-fold desc="Foundation">
    object Canvas extends SCApply[Canvas, CanvasProps]
    object JoinJSCanvas extends SCApply[JoinJSCanvas, JoinJSCanvasProps]
    object Label extends SCApply[Label, LabelProps]
    object Img extends SCApply[Img, ImgProps]
    object ImgTab extends SCApply[ImgTab, ImgTabProps]
    object RichTextEditor extends SCApply[RichTextEditor, RichTextEditorProps]
    object ViewLoader extends SCApply[ViewLoader, ViewLoaderProps]
    object HTMLFlow extends SCApply[HTMLFlow, HTMLFlowProps]
    object HTMLPane extends SCApply[HTMLPane, HTMLPaneProps]
    //</editor-fold>

    //<editor-fold desc="RPC">
    object RPCRequest extends SCApply[RPCRequest, RPCRequestProps]
    object RPCResponse extends SCApply[RPCResponse, RPCResponseProps]
    object DSRequest extends SCApply[DSRequest, DSRequestProps]
    object DSResponse extends SCApply[DSResponse, DSResponseProps]
    //</editor-fold>

    //<editor-fold desc="Grids">
    object ListGrid extends SCApply[ListGrid, ListGridProps]
    object ListGridEditor extends SCApply[ListGridEditor, ListGridEditorProps]
    object TreeGrid extends SCApply[TreeGrid, TreeGridProps]
    object TreeGridEditor extends SCApply[TreeGridEditor, TreeGridEditorProps]
    object TreeListGridEditor extends SCApply[TreeListGridEditor, TreeListGridEditorProps]
    object Tree extends SCApply[Tree, TreeProps]
    object ResultTree extends SCApply[ResultTree, ResultTreeProps]
    //</editor-fold>

    //<editor-fold desc="Layout">
    object Deck extends SCApply[Deck, DeckProps]
    object HLayout extends SCApply[HLayout, HLayoutProps]
    object HLayoutSS extends SCApply[HLayoutSS, HLayoutSSProps]
    object HStack extends SCApply[HStack, HStackProps]
    object IconButton extends SCApply[IconButton, IconButtonProps]
    object IconMenuButton extends SCApply[IconMenuButton, IconMenuButtonProps]
    object ImgSplitbar extends SCApply[ImgSplitbar, ImgSplitbarProps]
    object Layout extends SCApply[Layout, LayoutProps]
    object LayoutSS extends SCApply[LayoutSS, LayoutSSProps]
    object HPanelSS extends SCApply[HPanelSS, HPanelSSProps]
    object OkCancelPanel extends SCApply[OkCancelPanel, OkCancelPanelProps]
    object VLayout extends SCApply[VLayout, VLayoutProps]
    object VLayoutSS extends SCApply[VLayoutSS, VLayoutSSProps]
    object ChainMasterDetail extends SCApply[ChainMasterDetail, ChainMasterDetailProps]
    object TabSet extends SCApply[TabSet, TabSetProps]
    object Window extends SCApply[Window, WindowProps]
    object WindowSS extends SCApply[WindowSS, WindowSSProps]
    object LoginWindow extends SCApply[LoginWindow, LoginWindowProps]
    object Portlet extends SCApply[Portlet, PortletProps]
    object PortletSS extends SCApply[PortletSS, PortletSSProps]
    object PortalLayout extends SCApply[PortalLayout, PortalLayoutProps]
    object PortalLayoutSS extends SCApply[PortalLayoutSS, PortalLayoutSSProps]
    object ToolStrip extends SCApply[ToolStrip, ToolStripProps]
    object ToolStripMenuButton extends SCApply[ToolStripMenuButton, ToolStripMenuButtonProps]
    object ToolStripSeparator extends SCApply[ToolStripSeparator, ToolStripSeparatorProps]
    object ToolStripButton extends SCApply[ToolStripButton, ToolStripButtonProps]
    object ToolStripResizer extends SCApply[ToolStripResizer, ToolStripResizerProps]
    //</editor-fold>
}
