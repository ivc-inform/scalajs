package com.simplesys.build

import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import sbt.Keys._
import sbt._

trait UnderscoreJSCrossProj {
    self: Build with commonTypesCrossProj =>

    lazy val underscoreJSCrossProj = crossProject.dependsOn(commonTypesCrossProj).
      settings(
          name := "underscore-js",
          //version := "1.0-SNAPSHOT",

          libraryDependencies ++= Seq(
              CommonDeps.scalaTest.value
          ),

          testFrameworks += new TestFramework("utest.runner.Framework"),
          publishArtifact in(Compile, packageDoc) := false
      ).
      jvmSettings().
      jsSettings(
          libraryDependencies ++= Seq()
      )

    lazy val underscoreJSCrossJVM = underscoreJSCrossProj.jvm
    lazy val underscoreJSCrossJS = underscoreJSCrossProj.js
}
