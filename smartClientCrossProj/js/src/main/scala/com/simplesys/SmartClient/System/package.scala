package com.simplesys.SmartClient

import com.simplesys.SmartClient.Control._
import com.simplesys.SmartClient.Control.props._
import com.simplesys.SmartClient.DataBinding._
import com.simplesys.SmartClient.DataBinding.props._
import com.simplesys.SmartClient.Drawing.drawItem._
import com.simplesys.SmartClient.Drawing.drawItem.props._
import com.simplesys.SmartClient.Drawing.gradient.props._
import com.simplesys.SmartClient.Drawing.props.{DrawItemProps, DrawPaneProps, DrawPaneSSProps}
import com.simplesys.SmartClient.Drawing.gradient._
import com.simplesys.SmartClient.Drawing.{DrawItem, DrawPane}
import com.simplesys.SmartClient.Forms.FormsItems._
import com.simplesys.SmartClient.Forms.FormsItems.props._
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
import com.simplesys.SmartClient.Layout.props.tabSet.TabProps
import com.simplesys.SmartClient.Layout.props.toolStrip.{ToolStripButtonProps, ToolStripMenuButtonProps, ToolStripResizerProps, ToolStripSeparatorProps}
import com.simplesys.SmartClient.Layout.tabSet.Tab
import com.simplesys.SmartClient.Layout.toolStrip.{ToolStripButton, ToolStripMenuButton, ToolStripResizer, ToolStripSeparator}
import com.simplesys.SmartClient.RPC.props.{RPCRequestProps, RPCResponseProps}
import com.simplesys.SmartClient.RPC.{RPCRequest, RPCResponse}
import com.simplesys.SmartClient.System.props.TreeProps
import com.simplesys.SmartClient.Tools.editContext.props.{EditPaneProps, EditTreeProps}
import com.simplesys.SmartClient.Tools.editContext.{EditPane, EditTree}
import com.simplesys.SmartClient.Tools.palette._
import com.simplesys.SmartClient.Tools.palette.props._
import com.simplesys.SmartClient.Tools.props._
import com.simplesys.SmartClient.Tools.{EditContext, EditProxy, Palette, PaletteNode}
import com.simplesys.System.JSArray
import com.simplesys.js.com.simplesys.SmartClient.DataBinding.DataSourceSS
import com.simplesys.js.com.simplesys.SmartClient.DataBinding.props.DataSourceSSProps
import com.simplesys.js.com.simplesys.SmartClient.Drawing.DrawPaneSS
import com.simplesys.js.com.simplesys.SmartClient.Layout.props.SectionStackSSProps

//import com.simplesys.macros.PropsToDictionary
import com.simplesys.macros.PropsToDictionary

package object System {

    type Point =  JSArray[Int]

    implicit class StringOpts(x: String) {
        def ellipsis = s"$x..."
        def fromSkinPath = s"[SKIN]$x"
        def dblQuoted: String = "\"" + x + "\""
    }

    //<editor-fold desc="Control">
//    object Dialog extends SCApply[Dialog, DialogProps]
//    object IButton extends SCApply[IButton, IButtonProps]
//    object Button extends SCApply[Button, ButtonProps]
//    object LoginDialog extends SCApply[LoginDialog, LoginDialogProps]
//    object Slider extends SCApply[Slider, SliderProps]
//    object RangeSlider extends SCApply[RangeSlider, RangeSliderProps]
//    object Hover extends SCApply[Hover, HoverProps]
//    object Menu extends SCApply[Menu, MenuProps]
//    object MenuSS extends SCApply[MenuSS, MenuSSProps]
//    object MenuButton extends SCApply[MenuButton, MenuButtonProps]
//    object IMenuButton extends SCApply[IMenuButton, IMenuButtonProps]
//    object Progressbar extends SCApply[Progressbar, ProgressbarProps]
//    object SelectionTreeMenu extends SCApply[SelectionTreeMenu, SelectionTreeMenuProps]
//    object TreeMenuButton extends SCApply[TreeMenuButton, TreeMenuButtonProps]
//    object ITreeMenuButton extends SCApply[ITreeMenuButton, ITreeMenuButtonProps]
//    object MenuBar extends SCApply[MenuBar, MenuBarProps]
//    object ImgButton extends SCApply[ImgButton, ImgButtonProps]
//    object StretchImgButton extends SCApply[StretchImgButton, StretchImgButtonProps]
    //</editor-fold>

    //<editor-fold desc="DataBinding">
//    object DataView extends SCApply[DataView, DataViewProps]
//    object DataSource extends SCApply[DataSource, DataSourceProps]
//    object DataSourceSS extends SCApply[DataSourceSS, DataSourceSSProps]
//    object RestDataSource extends SCApply[RestDataSource, RestDataSourceProps]
//    object RestDataSourceSS extends SCApply[RestDataSourceSS, RestDataSourceSSProps]
    object SimpleType extends SCApply[SimpleType, SimpleTypeProps]
    //</editor-fold>

    //<editor-fold desc="Forms">
//    object DynamicForm extends SCApply[DynamicForm, DynamicFormProps]
//    object DynamicFormSS extends SCApply[DynamicFormSS, DynamicFormSSProps]
    //</editor-fold>

    //<editor-fold desc="FormsItems">
//    object FormItem extends SCApply[FormItem, FormItemProps]
//    object ButtonItem extends SCApply[ButtonItem, ButtonItemProps]
//    object AutoFitTextAreaItem extends SCApply[AutoFitTextAreaItem, AutoFitTextAreaItemProps]
//    object BlurbItem extends SCApply[BlurbItem, BlurbItemProps]
//    object BooleanItem extends SCApply[BooleanItem, BooleanItemProps]
//    object CancelItem extends SCApply[CancelItem, CancelItemProps]
//    object CanvasItem extends SCApply[CanvasItem, CanvasItemProps]
//    object CheckboxItem extends SCApply[CheckboxItem, CheckboxItemProps]
//    object ColorItem extends SCApply[ColorItem, ColorItemProps]
//    object ColorPickerItem extends SCApply[ColorPickerItem, ColorPickerItemProps]
//    object ComboBoxItem extends SCApply[ComboBoxItem, ComboBoxItemProps]
//    object CycleItem extends SCApply[CycleItem, CycleItemProps]
//    object DataPathItem extends SCApply[DataPathItem, DataPathItemProps]
//    object DateItem extends SCApply[DateItem, DateItemProps]
//    object DateRangeItem extends SCApply[DateRangeItem, DateRangeItemProps]
//    object DateTimeItem extends SCApply[DateTimeItem, DateTimeItemProps]
//    object DoubleItem extends SCApply[DoubleItem, DoubleItemProps]
//    object FileItem extends SCApply[FileItem, FileItemProps]
//    object FloatItem extends SCApply[FloatItem, FloatItemProps]
//    object HeaderItem extends SCApply[HeaderItem, HeaderItemProps]
//    object HiddenItem extends SCApply[HiddenItem, HiddenItemProps]
//    object IntegerItem extends SCApply[IntegerItem, IntegerItemProps]
//    object IPickTreeItem extends SCApply[IPickTreeItem, IPickTreeItemProps]
//    object LinkItem extends SCApply[LinkItem, LinkItemProps]
//    object MiniDateRangeItem extends SCApply[MiniDateRangeItem, MiniDateRangeItemProps]
//    object MultiComboBoxItem extends SCApply[MultiComboBoxItem, MultiComboBoxItemProps]
//    object MultiFileItem extends SCApply[MultiFileItem, MultiFileItemProps]
//    object NativeCheckboxItem extends SCApply[NativeCheckboxItem, NativeCheckboxItemProps]
//    object PasswordItem extends SCApply[PasswordItem, PasswordItemProps]
//    object PickList extends SCApply[PickList, PickListProps]
//    object PickListMenu extends SCApply[PickListMenu, PickListMenuProps]
//    object PickTreeItem extends SCApply[PickTreeItem, PickTreeItemProps]
//    object PresetCriteriaItem extends SCApply[PresetCriteriaItem, PresetCriteriaItemProps]
//    object PresetDateRangeItem extends SCApply[PresetDateRangeItem, PresetDateRangeItemProps]
//    object RadioGroupItem extends SCApply[RadioGroupItem, RadioGroupItemProps]
//    object RelationItem extends SCApply[RelationItem, RelationItemProps]
//    object RelativeDateItem extends SCApply[RelativeDateItem, RelativeDateItemProps]
//    object ResetItem extends SCApply[ResetItem, ResetItemProps]
//    object RichTextItem extends SCApply[RichTextItem, RichTextItemProps]
//    object RowSpacerItem extends SCApply[RowSpacerItem, RowSpacerItemProps]
//    object ScrollingMenu extends SCApply[ScrollingMenu, ScrollingMenuProps]
//    object SectionItem extends SCApply[SectionItem, SectionItemProps]
//    object SelectItem extends SCApply[SelectItem, SelectItemProps]
//    object SelectOtherItem extends SCApply[SelectOtherItem, SelectOtherItemProps]
//    object SliderItem extends SCApply[SliderItem, SliderItemProps]
//    object SpacerItem extends SCApply[SpacerItem, SpacerItemProps]
//    object SpinnerItem extends SCApply[SpinnerItem, SpinnerItemProps]
//    object StaticTextItem extends SCApply[StaticTextItem, StaticTextItemProps]
//    object SubmitItem extends SCApply[SubmitItem, SubmitItemProps]
//    object TextAreaItem extends SCApply[TextAreaItem, TextAreaItemProps]
//    object TextItem extends SCApply[TextItem, TextItemProps]
//    object TimeItem extends SCApply[TimeItem, TimeItemProps]
//    object ToolbarItem extends SCApply[ToolbarItem, ToolbarItemProps]
//    object UploadItem extends SCApply[UploadItem, UploadItemProps]
//    object ViewFileItem extends SCApply[ViewFileItem, ViewFileItemProps]
//    object Tab extends SCApply4Object[Tab, TabProps]
    //</editor-fold>

    //<editor-fold desc="Foundation">
//    object Canvas extends SCApply[Canvas, CanvasProps]
//    object JoinJSCanvas extends SCApply[JoinJSCanvas, JoinJSCanvasProps]
//    object Label extends SCApply[Label, LabelProps]
//    object Img extends SCApply[Img, ImgProps]
//    object ImgTab extends SCApply[ImgTab, ImgTabProps]
//    object RichTextEditor extends SCApply[RichTextEditor, RichTextEditorProps]
//    object ViewLoader extends SCApply[ViewLoader, ViewLoaderProps]
//    object HTMLFlow extends SCApply[HTMLFlow, HTMLFlowProps]
//    object HTMLPane extends SCApply[HTMLPane, HTMLPaneProps]
    //</editor-fold>

    //<editor-fold desc="RPC">
//    object RPCRequest extends SCApply[RPCRequest, RPCRequestProps]
//    object RPCResponse extends SCApply[RPCResponse, RPCResponseProps]
//    object DSRequest extends SCApply[DSRequest, DSRequestProps]
//    object DSResponse extends SCApply[DSResponse, DSResponseProps]
    //</editor-fold>

    //<editor-fold desc="Grids">
//    object ListGrid extends SCApply[ListGrid, ListGridProps]
//    object ListGridEditor extends SCApply[ListGridEditor, ListGridEditorProps]
//    object TreeGrid extends SCApply[TreeGrid, TreeGridProps]
//    object TileGrid extends SCApply[TileGrid, TileGridProps]
//    object TreeGridEditor extends SCApply[TreeGridEditor, TreeGridEditorProps]
//    object TreeListGridEditor extends SCApply[TreeListGridEditor, TreeListGridEditorProps]
//    object Tree extends SCApply[Tree, TreeProps]
//    object ResultTree extends SCApply[ResultTree, ResultTreeProps]
    //</editor-fold>

    //<editor-fold desc="Layout">
//    object Deck extends SCApply[Deck, DeckProps]
//    object HLayout extends SCApply[HLayout, HLayoutProps]
//    object HLayoutSS extends SCApply[HLayoutSS, HLayoutSSProps]
//    object HStack extends SCApply[HStack, HStackProps]
//    object IconButton extends SCApply[IconButton, IconButtonProps]
//    object IconMenuButton extends SCApply[IconMenuButton, IconMenuButtonProps]
//    object ImgSplitbar extends SCApply[ImgSplitbar, ImgSplitbarProps]
//    object Layout extends SCApply[Layout, LayoutProps]
//    object LayoutSS extends SCApply[LayoutSS, LayoutSSProps]
//    object HPanelSS extends SCApply[HPanelSS, HPanelSSProps]
//    object OkCancelPanel extends SCApply[OkCancelPanel, OkCancelPanelProps]
//    object VLayout extends SCApply[VLayout, VLayoutProps]
//    object VLayoutSS extends SCApply[VLayoutSS, VLayoutSSProps]
//    object ChainMasterDetail extends SCApply[ChainMasterDetail, ChainMasterDetailProps]
//    object TabSet extends SCApply[TabSet, TabSetProps]
//    object TabSetSS extends SCApply[TabSetSS, TabSetSSProps]
//    object Window extends SCApply[Window, WindowProps]
//    object WindowSS extends SCApply[WindowSS, WindowSSProps]
//    object LoginWindow extends SCApply[LoginWindow, LoginWindowProps]
//    object Portlet extends SCApply[Portlet, PortletProps]
//    object PortletSS extends SCApply[PortletSS, PortletSSProps]
//    object PortalLayout extends SCApply[PortalLayout, PortalLayoutProps]
//    object PortalLayoutSS extends SCApply[PortalLayoutSS, PortalLayoutSSProps]
//    object ToolStrip extends SCApply[ToolStrip, ToolStripProps]
//    object ToolStripMenuButton extends SCApply[ToolStripMenuButton, ToolStripMenuButtonProps]
//    object ToolStripSeparator extends SCApply[ToolStripSeparator, ToolStripSeparatorProps]
//    object ToolStripButton extends SCApply[ToolStripButton, ToolStripButtonProps]
//    object ToolStripResizer extends SCApply[ToolStripResizer, ToolStripResizerProps]
//    object SectionStackSS extends SCApply[SectionStackSS, SectionStackSSProps]
    //</editor-fold>

    //<editor-fold desc="drawing">
    //object DrawPaneSS extends SCApply[DrawPaneSS, DrawPaneSSProps]
    object DrawPane extends SCApply[DrawPane, DrawPaneProps]
//    object EditProxy extends SCApply[EditProxy, EditProxyProps]
//    object EditContext extends SCApply[EditContext, EditContextProps]
//    object EditPane extends SCApply[EditPane, EditPaneProps]
//    object EditTree extends SCApply[EditTree, EditTreeProps]
//    object PaletteNode extends SCApply4Object[PaletteNode, PaletteNodeProps]
//    object SelectionOutline extends SCApply4Props[SelectionOutlineProps]

    //<editor-fold desc="gradient">
//    object ColorStop extends  SCApply4Object[ColorStop, ColorStopProps]
//    object Gradient extends  SCApply4Object[Gradient, GradientProps]
//    object LinearGradient extends SCApply4Object[LinearGradient, LinearGradientProps]
//    object RadialGradient extends SCApply4Object[RadialGradient, RadialGradientProps]
//    object SimpleGradient extends SCApply4Object[SimpleGradient, SimpleGradientProps]
    //</editor-fold>

    //<editor-fold desc="Palette">
//    object Palette extends SCApply[Palette, PaletteProps]
//    object HiddenPalette extends SCApply[HiddenPalette, HiddenPaletteProps]
//    object TreePalette extends SCApply[TreePalette, TreePaletteProps]
//    object ListPalette extends SCApply[ListPalette, ListPaletteProps]
//    object TilePalette extends SCApply[TilePalette, TilePaletteProps]
//    object MenuPalette extends SCApply[MenuPalette, MenuPaletteProps]
    //</editor-fold>

    //<editor-fold desc="DrawItem">
//    object DrawItem extends SCApplyDrawItem[DrawItem, DrawItemProps]
//    object DrawGroup extends SCApplyDrawItem[DrawGroup, DrawGroupProps]
//    object DrawLine extends SCApplyDrawItem[DrawLine, DrawLineProps]
//    object DrawRect extends SCApplyDrawItem[DrawRect, DrawRectProps]
//    object DrawOval extends SCApplyDrawItem[DrawOval, DrawOvalProps]
//    object DrawSector extends SCApplyDrawItem[DrawSector, DrawSectorProps]
//    object DrawLabel extends SCApplyDrawItem[DrawLabel, DrawLabelProps]
//    object DrawImage extends SCApplyDrawItem[DrawImage, DrawImageProps]
//    object DrawCurve extends SCApplyDrawItem[DrawCurve, DrawCurveProps]
//    object DrawBlockConnector extends SCApplyDrawItem[DrawBlockConnector, DrawBlockConnectorProps]
//    object DrawPath extends SCApplyDrawItem[DrawPath, DrawPathProps]
//    object DrawPolygon extends SCApplyDrawItem[DrawPolygon, DrawPolygonProps]
//    object DrawTriangle extends SCApplyDrawItem[DrawTriangle, DrawTriangleProps]
//    object DrawDiamond extends SCApplyDrawItem[DrawDiamond, DrawDiamondProps]
//    object DrawLinePath extends SCApplyDrawItem[DrawLinePath, DrawLinePathProps]
//    object DrawShape extends SCApplyDrawItem[DrawShape, DrawShapeProps]

    //</editor-fold>
    //</editor-fold>
}
