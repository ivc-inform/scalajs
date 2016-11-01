package com.simplesys.build

import com.simplesys.build.CommonSettings.{settingValues, versions}
import sbt._

object PluginDeps {
  object versions {
    val scalaJSPluginVersion = "0.6.13"
  }

  val scalaJSPlugin = addSbtPlugin("org.scala-js" % "sbt-scalajs" % versions.scalaJSPluginVersion)
}


object CommonDeps {

    val common = Def.setting("com.simplesys.core" %% "common" % versions.ssysCoreVersion)
    val coreUtils = Def.setting("com.simplesys.core" %% "core-utils" % versions.ssysCoreVersion)
    val xmlExtender = Def.setting("com.simplesys.core" %% "xml-extender" % versions.ssysCoreVersion)
    val logbackWrapper = Def.setting("com.simplesys.core" %% "logback-wrapper" % versions.ssysCoreVersion)
    val scalaIOExtender = Def.setting("com.simplesys.core" %% "scala-io-extender" % versions.ssysCoreVersion)

    val scalaReflect = Def.setting(DepsHelper.moduleIdOpt(settingValues.scalaVersion, Some("org.scala-lang" % "scala-reflect" % settingValues.scalaVersion), Some("org.scala-lang" % "scala-reflect" % settingValues.scalaVersion)))
    val scalaCompiler = Def.setting(DepsHelper.moduleIdOpt(settingValues.scalaVersion, Some("org.scala-lang" % "scala-compiler" % settingValues.scalaVersion), Some("org.scala-lang" % "scala-compiler" % settingValues.scalaVersion)))
    val scalaReflection = Def.setting(DepsHelper.moduleIdOpt(settingValues.scalaVersion, Some("org.scala-lang" % "scala-reflection" % settingValues.scalaVersion), Some("org.scala-lang" % "scala-reflection" % settingValues.scalaVersion)))

    val scalaTest = Def.setting("org.scalatest" %% "scalatest" % versions.scalaTestVersion % "test")
    val spray = Def.setting("io.spray" % "spray-json_2.11" % versions.scalaTestVersion % "test")
}

object DepsHelper {
    def moduleIdOpt(scalaVer: String, moduleId_2_11: Option[ModuleID], moduleId_2_10: Option[ModuleID]): Option[ModuleID] =
        CrossVersion.partialVersion(scalaVer) match {
            case Some((2, scalaMajor)) if scalaMajor >= 11 => moduleId_2_11
            case _ => moduleId_2_10
        }

    def moduleId(scalaVer: String, moduleId_2_11: ModuleID, moduleId_2_10: ModuleID): ModuleID =
        CrossVersion.partialVersion(scalaVer) match {
            case Some((2, scalaMajor)) if scalaMajor >= 11 => moduleId_2_11
            case _ => moduleId_2_10
        }
}
