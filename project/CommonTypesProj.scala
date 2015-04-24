package ru.simplesys.build

import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import sbt._
import Keys._

trait CommonTypesProj {
  self: Build =>

  lazy val commonTypesCrossProj = crossProject.
    settings(
      name := "common-types",
      version := "1.0.0-SNAPSHOT",
      libraryDependencies ++= Seq(
        CommonSettings.cmnDependencies.prickle.value//,
        //CommonSettings.cmnDependencies.shapeless.value

      )
      //libraryDependencies ++= Seq(CommonSettings.cmnDependencies.uPickle.value)
    ).
    jvmSettings(
      libraryDependencies ++= {
        Seq(
//          CommonSettings.cmnDependencies.shapeless.value
          //CommonSettings.jvmDependencies.scalaTest % "test"
        )
      }).
    jsSettings(
      //scalacOptions += "-Xlog-implicits",
      //persistLauncher := true,

      //jsDependencies += "org.example" %% "js-thing" % "0.1" / "foo.js"
    )

  // Needed, so sbt finds the projects
  lazy val commonTypesJVM = commonTypesCrossProj.jvm
  lazy val commonTypesJS = commonTypesCrossProj.js
}
