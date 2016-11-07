package ru.simplesys.sbprocessingui.sbtbuild

import com.simplesys.build.{CommonDeps, SmartClientCrossProj}
import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import sbt.Keys._
import sbt._

trait TestStend {
    self: Build with SmartClientCrossProj=>


    lazy val testStend = crossProject.dependsOn(smartClientCrossProj).
      settings(
          name := "empty",
          libraryDependencies ++= {
              Seq()
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
    lazy val testStendJVM = testStend.jvm
    lazy val testStendJS = testStend.js
}
