package com.simplesys.SmartClient

import com.simplesys.SmartClient.Control._
import com.simplesys.SmartClient.Control.props._
import com.simplesys.SmartClient.Forms.FormsItems.{ButtonItem, FormItem, TextItem}
import com.simplesys.SmartClient.Forms.FormsItems.props.{ButtonItemProps, FormItemProps, TextItemProps}
import com.simplesys.SmartClient.Forms._
import com.simplesys.SmartClient.Forms.props._
import com.simplesys.SmartClient.Foundation._
import com.simplesys.SmartClient.Foundation.props._
import com.simplesys.macros.PropsToDictionary

package object System {
    object IButton extends SCApply[IButton, IButtonProps]
    object ButtonItem extends SCApply[ButtonItem, ButtonItemProps]
    object FormItem extends SCApply[FormItem, FormItemProps]
    object TextItem extends SCApply[TextItem, TextItemProps]
    object DynamicForm extends SCApply[DynamicForm, DynamicFormProps]
    object Label extends SCApply[Label, LabelProps]
}
