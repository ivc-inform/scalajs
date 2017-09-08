package com.simplesys.build

import com.simplesys.build.CommonSettings.{settingValues, versions}
import sbt._

object PluginDeps {
    object versions {
        val scalaJSPluginVersion = "0.6.20"
    }

    val scalaJSPlugin = addSbtPlugin("org.scala-js" % "sbt-scalajs" % versions.scalaJSPluginVersion)
}


object CommonDeps {
    val logbackWrapper = "com.simplesys.core" %% "logback-wrapper" % versions.ssysCoreVersion

    val scalaReflect = "org.scala-lang" % "scala-reflect" % settingValues.scalaVersion
    val scalaCompiler = "org.scala-lang" % "scala-compiler" % settingValues.scalaVersion

    val scalaTest = "org.scalatest" %% "scalatest" % versions.scalaTestVersion % Test
}
