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
    val akkaVersion = "2.3.7"
    val uTestVersion = "0.3.1"
    val scalaTestVersion = "2.2.5"
  }

  object cmnDependencies {
    val uTest = Def.setting( "com.lihaoyi" %%% "utest" % versions.uTestVersion % "test" )
    val scalaTest = Def.setting( "org.scalatest" %% "scalatest" % versions.scalaTestVersion )
  }

  object jsDependencies {}

  object jvmDependencies {}

}
