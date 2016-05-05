package com.simplesys.System.Types

import language.implicitConversions

object PartialCommitOption extends Enumeration {
    type PartialCommitOption = Value
    val allow, prevent, prompt, retain = Value
}
