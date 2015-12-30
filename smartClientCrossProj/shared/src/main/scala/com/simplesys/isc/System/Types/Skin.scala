package com.simplesys.isc.System.Types

import scala.language.implicitConversions

//object Skin extends Enumeration {
//    type Skin = Value
//    val Enterprise = Value
//    val BlackOps = Value
//    val Cupertino = Value
//    val EnterpriseBlue = Value
//    val fleet = Value
//    val Graphite = Value
//    val Mobile = Value
//    val SilverWave = Value
//    val Simplicity = Value
//    val SmartClient = Value
//    val standard = Value
//    val ToolSkin = Value
//    val ToolSkinNative = Value
//    val TreeFrog = Value
//
//    implicit def skin2String(skin: Skin) = skin.toString
//}

sealed abstract trait Skin

case object EnterpriseSkin extends Skin {
  override def toString = "Enterprise"
}

case object BlackOpsSkin extends Skin {
  override def toString = "BlackOps"
}

case object CupertinoSkin extends Skin {
  override def toString = "Cupertino"
}

case object EnterpriseBlueSkin extends Skin {
  override def toString = "EnterpriseBlue"
}

case object FleetSkin extends Skin {
  override def toString = "fleet"
}

case object GraphiteSkin extends Skin {
  override def toString = "Graphite"
}

case object MobileSkin extends Skin {
  override def toString = "Mobile"
}

case object SilverWaveSkin extends Skin {
  override def toString = "SilverWave"
}

case object SimplicitySkin extends Skin {
  override def toString = "Simplicity"
}

case object SmartClientSkin extends Skin {
  override def toString = "SmartClient"
}

case object StandardSkin extends Skin {
  override def toString = "standard"
}

case object ToolSkinSkin extends Skin {
  override def toString = "ToolSkin"
}

case object ToolSkinNativeSkin extends Skin {
  override def toString = "ToolSkinNative"
}

case object TreeFrogSkin extends Skin {
  override def toString = "TreeFrog"
}

object Skin {
    implicit def skin2String(skin: Skin) = skin.toString
}


