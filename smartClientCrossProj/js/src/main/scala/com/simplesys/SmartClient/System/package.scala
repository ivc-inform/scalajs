package com.simplesys.SmartClient

import com.simplesys.SmartClient.Control._
import com.simplesys.SmartClient.Control.props._
import com.simplesys.SmartClient.DataBinding.DataView
import com.simplesys.SmartClient.DataBinding.props.DataViewProps
import com.simplesys.SmartClient.Forms.FormsItems.props.{ButtonItemProps, FormItemProps}
import com.simplesys.SmartClient.Forms.FormsItems.{ButtonItem, FormItem}
import com.simplesys.SmartClient.Forms._
import com.simplesys.SmartClient.Forms.props._
import com.simplesys.SmartClient.Foundation._
import com.simplesys.SmartClient.Foundation.props._
import com.simplesys.SmartClient.Layout._
import com.simplesys.SmartClient.Layout.props._

//import com.simplesys.macros.PropsToDictionary
import com.simplesys.macros.PropsToDictionary

package object System {

    //<editor-fold desc="Control">
    object Dialog extends SCApply[Dialog, DialogProps]
    object IButton extends SCApply[IButton, IButtonProps]
    //</editor-fold>

    //<editor-fold desc="DataBinding">
    object DataView extends SCApply[DataView, DataViewProps]
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

    //<editor-fold desc="Layout">
    object Deck extends SCApply[Deck, DeckProps]
    object HLayout extends SCApply[HLayout, HLayoutProps]
    object HStack extends SCApply[HStack, HStackProps]
    object IconButton extends SCApply[IconButton, IconButtonProps]
    object IconMenuButton extends SCApply[IconMenuButton, IconMenuButtonProps]
    object ImgSplitbar extends SCApply[ImgSplitbar, ImgSplitbarProps]
    object Layout extends SCApply[Layout, LayoutProps]
    object VLayout extends SCApply[VLayout, VLayoutProps]
    //</editor-fold>
}
