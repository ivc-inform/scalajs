package com.simplesys.build

import com.simplesys.build.CommonSettings.{settingValues, versions}
import sbt._

object PluginDeps {
    object versions {
        val scalaCrossProjectPluginVersion = "0.3.3-SNAPSHOT"
    }

    val crossproject = addSbtPlugin("org.scala-native" % "sbt-crossproject" % versions.scalaCrossProjectPluginVersion)
    val sbtCrossproject = addSbtPlugin("org.scala-native" % "sbt-scalajs-crossproject" % versions.scalaCrossProjectPluginVersion)
}


object CommonDeps {

    val common = "com.simplesys.core" %% "common" % versions.ssysCoreVersion
    val coreUtils = "com.simplesys.core" %% "core-utils" % versions.ssysCoreVersion
    val xmlExtender = "com.simplesys.core" %% "xml-extender" % versions.ssysCoreVersion
    val logbackWrapper = "com.simplesys.core" %% "logback-wrapper" % versions.ssysCoreVersion
    val scalaIOExtender = "com.simplesys.core" %% "scala-io-extender" % versions.ssysCoreVersion

    val scalaReflect = "org.scala-lang" % "scala-reflect" % settingValues.scalaVersion
    val scalaCompiler = "org.scala-lang" % "scala-compiler" % settingValues.scalaVersion

    val ssysIscComponents = "com.simplesys.core" %% "isc-components" % versions.ssysCoreVersion
    val scalaTest = "org.scalatest" %% "scalatest" % versions.scalaTestVersion % Test
}
