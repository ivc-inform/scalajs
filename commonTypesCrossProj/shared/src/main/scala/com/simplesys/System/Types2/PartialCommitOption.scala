package com.simplesys.System.Types2

import language.implicitConversions

object PartialCommitOption extends Enumeration {
    type PartialCommitOption = Value
    val allow, prevent, prompt, retain = Value
}
