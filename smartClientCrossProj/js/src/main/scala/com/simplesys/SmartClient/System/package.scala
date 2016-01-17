package com.simplesys.SmartClient

import com.simplesys.SmartClient.Control._
import com.simplesys.SmartClient.Control.props._
import com.simplesys.SmartClient.Forms.FormsItems.props.{ButtonItemProps, FormItemProps}
import com.simplesys.SmartClient.Forms.FormsItems.{ButtonItem, FormItem}
import com.simplesys.SmartClient.Forms._
import com.simplesys.SmartClient.Forms.props._
import com.simplesys.SmartClient.Foundation._
import com.simplesys.SmartClient.Foundation.props._

//import com.simplesys.macros.PropsToDictionary
import com.simplesys.macros.PropsToDictionary

package object System {

    //<editor-fold desc="Control">
    object Dialog extends SCApply[Dialog, DialogProps]
    object IButton extends SCApply[IButton, IButtonProps]
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
}
