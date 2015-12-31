package com.simplesys.isc.System.Types

import language.implicitConversions

sealed abstract trait Skin

case object enterpriseSkin extends Skin {
  override def toString = "Enterprise"
}

case object blackOpsSkin extends Skin {
  override def toString = "BlackOps"
}

case object cupertinoSkin extends Skin {
  override def toString = "Cupertino"
}

case object enterpriseBlueSkin extends Skin {
  override def toString = "EnterpriseBlue"
}

case object fleetSkin extends Skin {
  override def toString = "fleet"
}

case object graphiteSkin extends Skin {
  override def toString = "Graphite"
}

case object mobileSkin extends Skin {
  override def toString = "Mobile"
}

case object silverWaveSkin extends Skin {
  override def toString = "SilverWave"
}

case object simplicitySkin extends Skin {
  override def toString = "Simplicity"
}

case object smartClientSkin extends Skin {
  override def toString = "SmartClient"
}

case object standardSkin extends Skin {
  override def toString = "standard"
}

case object treeFrogSkin extends Skin {
  override def toString = "TreeFrog"
}

object Skin extends Enumeration {
    implicit def skin2String (skin:Skin):String = skin.toString
}
