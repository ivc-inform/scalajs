package com.simplesys.build

import com.simplesys.build.CommonSettings.{settingValues, versions}
import sbt._

object PluginDeps {
  object versions {
    val scalaJSPluginVersion = "0.6.10"
  }

  val scalaJSPlugin = addSbtPlugin("org.scala-js" % "sbt-scalajs" % versions.scalaJSPluginVersion)
}


object CommonDeps {

    val common = Def.setting("com.simplesys.core" %% "common" % versions.ssysCoreVersion)
    val coreUtils = Def.setting("com.simplesys.core" %% "core-utils" % versions.ssysCoreVersion)
    val xmlExtender = Def.setting("com.simplesys.core" %% "xml-extender" % versions.ssysCoreVersion)
    val logbackWrapper = Def.setting("com.simplesys.core" %% "logback-wrapper" % versions.ssysCoreVersion)
    val scalaIOExtender = Def.setting("com.simplesys.core" %% "scala-io-extender" % versions.ssysCoreVersion)
    val scalaReflect = Def.setting("org.scala-lang" % "scala-reflect" % settingValues.scalaVersion)
    val scalaCompiler = Def.setting("org.scala-lang" % "scala-compiler" % settingValues.scalaVersion)
    val scalaReflection = Def.setting("org.scala-lang" % "scala-reflection" % settingValues.scalaVersion)
    val scalaTest = Def.setting("org.scalatest" %% "scalatest" % versions.scalaTestVersion % "test")
    val spray = Def.setting("io.spray" % "spray-json_2.11" % versions.scalaTestVersion % "test")
}
