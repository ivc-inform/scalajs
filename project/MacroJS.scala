package com.simplesys.build

import sbt._
import Keys._
import org.scalajs.sbtplugin.ScalaJSPlugin

trait MacroJSProject {
  self: Build with commonTypesCrossProj =>
  lazy val macroJS = Project("macrojs", file("macrojs")).settings(
    name := "macrojs",
    version := "1.1-SNAPSHOT",
    libraryDependencies <++= (scalaVersion)(v => Seq(("org.scala-lang" % "scala-compiler" % v), ("org.scala-lang" % "scala-reflect" % v)))
    ).dependsOn(commonTypesJS).enablePlugins(ScalaJSPlugin)
}
