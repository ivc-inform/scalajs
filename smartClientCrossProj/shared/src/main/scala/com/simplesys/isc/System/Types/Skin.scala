package com.simplesys.isc.System.Types

import language.implicitConversions

object Skin extends Enumeration {
    type Skin = Value
    val Enterprise, BlackOps, Cupertino, EnterpriseBlue, fleet, Graphite, Mobile, SilverWave, Simplicity, SmartClient, standard, ToolSkin, ToolSkinNative, TreeFrog = Value

    implicit def skin2String (skin:Skin) = skin.toString
}
