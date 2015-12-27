package ru.simplesys.build

import sbt._
import Keys._

trait MacroJVMProject {
  self: Build with CommonTypesProj =>
  lazy val macroJVM = Project("macrojvm", file("macrojvm")).settings(
    name := "macrojvm",
    version := "1.0.0-SNAPSHOT",
    libraryDependencies <++= (scalaVersion)(v => Seq(("org.scala-lang" % "scala-compiler" % v), ("org.scala-lang" % "scala-reflect" % v)))
  ).dependsOn(commonTypesJVM)
}
