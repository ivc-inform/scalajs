package com.simplesys.build

import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import sbt.Keys._
import sbt._

trait UnderscoreJSProj {
    self: Build with CommonTypesProj =>

    lazy val underscoreJSCrossProj = crossProject.dependsOn(commonTypesCrossProj).
      settings(
          name := "underscore-js",
          version := "1.1-SNAPSHOT",

          libraryDependencies ++= Seq(
              CommonSettings.cmnDependencies.scalaTest.value
          ),

          testFrameworks += new TestFramework("utest.runner.Framework"),
          publishArtifact in(Compile, packageDoc) := false
      ).
      jvmSettings().
      jsSettings(
          libraryDependencies ++= Seq(
//              CommonSettings.jsDependencies.scalajsDOM.value,
//              CommonSettings.jsDependencies.scalajsJQuey.value
          )
      ) //.dependsOn().jsConfigure(x => x.dependsOn(macroJS)).jvmConfigure(x => x.dependsOn(macroJVM))

    lazy val underscoreJSCrossJVM = underscoreJSCrossProj.jvm
    lazy val underscoreJSCrossJS = underscoreJSCrossProj.js
}
