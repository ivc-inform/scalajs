package com.simplesys.System.Types2

import language.implicitConversions

object ExpansionMode extends Enumeration {
    type ExpansionMode = Value
    val detailField, details, related, editor, detailRelated = Value
}
