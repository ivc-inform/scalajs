package com.simplesys.build

import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import sbt.Keys._
import sbt._

trait commonTypesCrossProj {
    self: Build =>

    lazy val commonTypesCrossProj = crossProject.
      settings(
          name := "common-types",
          version := "1.1-SNAPSHOT",
          libraryDependencies ++= Seq(
              //CommonDeps.uTest.value,
              CommonDeps.xmlExtender.value,
              CommonDeps.common.value,
              CommonDeps.logbackWrapper.value
          ),
          testFrameworks += new TestFramework("utest.runner.Framework"),
          publishArtifact in(Compile, packageDoc) := false
      ).
      jvmSettings().
      jsSettings(
          //jsDependencies += "org.example" %% "js-thing" % "0.1" / "foo.js"
      )

    // Needed, so sbt finds the projects
    lazy val commonTypesJVM = commonTypesCrossProj.jvm
    lazy val commonTypesJS = commonTypesCrossProj.js
}
