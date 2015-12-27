package ru.simplesys.build

import sbt._
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

object CommonSettings {
    val scalaVersion = "2.11.7"
    val organization = "ru.simplesys"
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
        val scalaTestVersion = "2.2.5"
        val ssysCoreVersion = "1.2-SNAPSHOT"
    }

    object cmnDependencies {
        val common = Def.setting("com.simplesys.core" %% "common" % versions.ssysCoreVersion)
        val coreUtils = Def.setting("com.simplesys.core" %% "core-utils" % versions.ssysCoreVersion)
        val xmlExtender = Def.setting("com.simplesys.core" %% "xml-extender" % versions.ssysCoreVersion)
        val logbackWrapper = Def.setting("com.simplesys.core" %% "logback-wrapper" % versions.ssysCoreVersion)
        val scalaReflect = Def.setting("org.scala-lang" % "scala-reflect" % scalaVersion)
        val scalaCompiler = Def.setting("org.scala-lang" % "scala-compiler" % scalaVersion)
        val scalaTest = Def.setting("org.scalatest" %% "scalatest" % "2.2.5" % versions.scalaTestVersion)
        val spray = Def.setting("io.spray" % "spray-json_2.11" % versions.scalaTestVersion % "test")
        val uTest = Def.setting("com.lihaoyi" %%% "utest" % versions.uTestVersion % "test")
    }

    object jsDependencies {}

    object jvmDependencies {}

}
