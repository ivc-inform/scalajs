package com.simplesys.build

import com.simplesys.build.CommonSettings.versions
import sbt._
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

object CommonDepsScalaJS {

    val scalajsDOM = Def.setting("org.scala-js" %%% "scalajs-dom" % versions.scalajsDOMVersion)
    val scalajsJQuey = Def.setting("be.doeraene" %%% "scalajs-jquery" % versions.scalajsJQueryVersion)
    val scalaTest = Def.setting("org.scalatest" %%% "scalatest" % versions.scalaTestVersion % Test)
    val uTest = Def.setting("com.lihaoyi" %%% "utest" % versions.uTestVersion % Test)
}
