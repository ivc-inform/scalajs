package com.simplesys.System.Types

import language.implicitConversions

object EditCompletionEvent extends Enumeration {
    type EditCompletionEvent = Value
    val click_outside, click, doubleClick, enter, escape, arrow_up, arrow_down, tab, shift_tab, field_change, programmatic = Value
}
