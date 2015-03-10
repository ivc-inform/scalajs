package ru.simplesys.build

import sbt._
import Keys._

trait MacroJVMProject {
  self: Build with CommonTypesProj =>
  lazy val macroJvmSub = Project("macrojvm", file("macrojvm")).settings(
    name := "macrojvm",
    version := "1.0.0-SNAPSHOT",
    libraryDependencies <+= scalaVersion("org.scala-lang" % "scala-compiler" % _),
    libraryDependencies ++= Seq(CommonSettings.cmnDependencies.prickle.value)
  ).dependsOn(commonTypesJVM)
}
