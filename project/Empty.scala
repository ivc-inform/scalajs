package com.simplesys.build

import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import sbt.Keys._
import sbt._

trait Empty {
    self: Build =>


    lazy val uPickleProj = crossProject.dependsOn().
      settings(
          name := "empty",
          libraryDependencies ++= {
              Seq(CommonDeps.scalaTest.value % "test")
          },
          publishArtifact in(Compile, packageDoc) := false
      ).
      jvmSettings(
          libraryDependencies ++= {
              Seq()
          }).
      jsSettings(
          libraryDependencies ++= Seq(
          )
      ).dependsOn().jsConfigure(x => x.dependsOn()).jvmConfigure(x => x.dependsOn())

    // Needed, so sbt finds the projects
    lazy val uPickleJVM = uPickleProj.jvm
    lazy val uPickleJS = uPickleProj.js
}
