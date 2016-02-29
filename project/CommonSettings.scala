package com.simplesys.build

import sbt._
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

object CommonSettings {
    val baseVersion = "10.1"

    val scalaVersion = "2.11.7"
    val crossScalaVersions = Seq("2.11.7", "2.10.6")
    val organization = "com.simplesys"
    val scalacOptions = Seq(
        "-feature",
        "-language:higherKinds",
        "-language:implicitConversions",
        "-language:postfixOps",
        "-deprecation",
        "-unchecked")

    object versions {
        val sprayVersion = "1.3.2"
        val uTestVersion = "0.3.1"
        val scalaTestVersion = "3.0.0-M15"
        val ssysCoreVersion = "1.2-SNAPSHOT"
        val scalajsDOMVersion = "0.9.0"
        val scalajsJQueryVersion = "0.9.0"
    }

    object cmnDependencies {
        val common = Def.setting("com.simplesys.core" %% "common" % versions.ssysCoreVersion)
        val coreUtils = Def.setting("com.simplesys.core" %% "core-utils" % versions.ssysCoreVersion)
        val xmlExtender = Def.setting("com.simplesys.core" %% "xml-extender" % versions.ssysCoreVersion)
        val logbackWrapper = Def.setting("com.simplesys.core" %% "logback-wrapper" % versions.ssysCoreVersion)
        val scalaIOExtender = Def.setting("com.simplesys.core" %% "scala-io-extender" % versions.ssysCoreVersion)
        val scalaReflect = Def.setting("org.scala-lang" % "scala-reflect" % scalaVersion)
        val scalaCompiler = Def.setting("org.scala-lang" % "scala-compiler" % scalaVersion)
        val scalaReflection = Def.setting("org.scala-lang" % "scala-reflection" % scalaVersion)
        val scalaTest = Def.setting("org.scalatest" %% "scalatest" %  versions.scalaTestVersion % "test")
        val spray = Def.setting("io.spray" % "spray-json_2.11" % versions.scalaTestVersion % "test")
        val uTest = Def.setting("com.lihaoyi" %%% "utest" % versions.uTestVersion % "test")
    }

    object jsDependencies {
        val scalajsDOM = Def.setting("org.scala-js" %%% "scalajs-dom" % versions.scalajsDOMVersion)
        val scalajsJQuey = Def.setting("be.doeraene" %%% "scalajs-jquery" % versions.scalajsJQueryVersion)
        val scalaTest = Def.setting("org.scalatest" %%% "scalatest" %  versions.scalaTestVersion % "test")
    }

    object jvmDependencies {}

}
