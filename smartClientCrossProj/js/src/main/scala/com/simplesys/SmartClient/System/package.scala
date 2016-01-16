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
    object IButton extends SCApply[IButton, IButtonProps]
    object FormItem extends SCApply[FormItem, FormItemProps]
    object Dialog extends SCApply[Dialog, DialogProps]
    object ButtonItem extends SCApply[ButtonItem, ButtonItemProps]
    object DynamicForm extends SCApply[DynamicForm, DynamicFormProps]
    object Label extends SCApply[Label, LabelProps]
}
