package com.simplesys.build

import sbt._
import Keys._

trait MacroJVMProject {
  self: Build with commonTypesCrossProj =>
  lazy val macroJVM = Project("macrojvm", file("macrojvm")).settings(
    name := "macrojvm",
    version := CommonSettings.settingValues.version,
    libraryDependencies <++= (scalaVersion)(v => Seq(("org.scala-lang" % "scala-compiler" % v), ("org.scala-lang" % "scala-reflect" % v)))
  ).dependsOn(commonTypesJVM)
}
