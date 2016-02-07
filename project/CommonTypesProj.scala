package com.simplesys.build

import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import sbt.Keys._
import sbt._

trait CommonTypesProj {
    self: Build =>

    lazy val commonTypesCrossProj = crossProject.
      settings(
          name := "common-types",
          version := "1.0-SNAPSHOT",
          libraryDependencies ++= Seq(
              CommonSettings.cmnDependencies.uTest.value,
              CommonSettings.cmnDependencies.xmlExtender.value,
              CommonSettings.cmnDependencies.common.value,
              CommonSettings.cmnDependencies.logbackWrapper.value
          ),
          testFrameworks += new TestFramework("utest.runner.Framework"),
          publishArtifact in(Compile, packageDoc) := false
      ).
      jvmSettings(
          libraryDependencies ++= {
              Seq(
              )
          }).
      jsSettings(
          //jsDependencies += "org.example" %% "js-thing" % "0.1" / "foo.js"
      ).enablePlugins(ScalaJSPlugin)

    // Needed, so sbt finds the projects
    lazy val commonTypesJVM = commonTypesCrossProj.jvm
    lazy val commonTypesJS = commonTypesCrossProj.js
}
