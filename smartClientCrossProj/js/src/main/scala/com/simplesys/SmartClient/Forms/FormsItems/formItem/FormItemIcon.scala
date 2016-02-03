package com.simplesys.SmartClient.Forms.FormsItems.formItem

import com.simplesys.SmartClient.Forms.DynamicForm
import com.simplesys.SmartClient.Forms.FormsItems.FormItem
import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types.Alignment.Alignment
import com.simplesys.System.Types.CharacterCasing.CharacterCasing
import com.simplesys.System.Types.PickListItemIconPlacement.PickListItemIconPlacement
import com.simplesys.System.Types._
import com.simplesys.System.Types.void

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait FormItemIcon extends Types.Object {
    var baseStyle: CSSStyleName
    var click: js.Function3[DynamicForm, FormItem, FormItemIcon, void]
    var disabled: Boolean
    var disableOnReadOnly: Boolean
    var height: Int
    var hspace: Int
    var iconPlacement: PickListItemIconPlacement
    val inline: Boolean
    val inlineIconAlign: Alignment
    var keyPress: js.Function5[String, Char, DynamicForm, FormItem, FormItemIcon, _]
    val name: String
    var neverDisable: Boolean
    var prompt: HTMLString
    var showFocused: Boolean
    var showFocusedWithItem: Boolean
    var showIf: js.Function2[DynamicForm, FormItem, Boolean]
    var showOver: Boolean
    var showRTL: Boolean
    var src: SCImgURL
    val tabIndex: Int
    val width: Int
}


