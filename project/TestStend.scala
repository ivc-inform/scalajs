package com.simplesys.build

import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import sbt.Keys._
import sbt._

trait TestStend {
    self: Build with SmartClientCrossProj =>


    lazy val testStend = crossProject.dependsOn(smartClientCrossProj).enablePlugins(
        ScalaJSPlugin
    ).
      settings(
          name := "test-stend",
          libraryDependencies ++= {
              Seq(
                  CommonDeps.jettyWebapp.value,
                  CommonDeps.jettyAnnotations.value,
                  CommonDeps.jettyPlus.value
              )
          },
          publishArtifact in(Compile, packageDoc) := false
      ).
      jvmSettings(
          libraryDependencies ++= {
              Seq(

              )
          }).
      jsSettings(
          crossTarget in fastOptJS := (sourceDirectory in Compile).value / "webapp" / "javascript" / "generated" / "generatedComponents",
          crossTarget in fullOptJS := (sourceDirectory in Compile).value / "webapp" / "javascript" / "generated" / "generatedComponents",
          crossTarget in packageJSDependencies := (sourceDirectory in Compile).value / "webapp" / "javascript" / "generated" / "generatedComponents",
          libraryDependencies ++= Seq(

          )
      ).dependsOn().jsConfigure(x => x.dependsOn()).jvmConfigure(x => x.dependsOn())

    // Needed, so sbt finds the projects
    lazy val testStendJVM = testStend.jvm
    lazy val testStendJS = testStend.js
}

