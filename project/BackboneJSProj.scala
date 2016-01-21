package com.simplesys.build

import com.simplesys.build.{CommonSettings, MacroJSProject, MacroJVMProject, CommonTypesProj}
import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import sbt.Keys._
import sbt._

trait BackboneJSProj {
    self: Build with MacroJSProject with MacroJVMProject with CommonTypesProj =>

    lazy val backboneJSCrossProj = crossProject.dependsOn(commonTypesCrossProj).
      settings(
          name := "backbone-js",
          version := "1.0-SNAPSHOT",

          libraryDependencies ++= Seq(
              CommonSettings.cmnDependencies.scalaTest.value
          ),

          testFrameworks += new TestFramework("utest.runner.Framework"),
          publishArtifact in(Compile, packageDoc) := false
      ).
      jvmSettings().
      jsSettings(
          libraryDependencies ++= Seq(
              CommonSettings.jsDependencies.scalajsDOM.value,
              CommonSettings.jsDependencies.scalajsJQuey.value
          )
      ).dependsOn().jsConfigure(x => x.dependsOn(macroJS)).jvmConfigure(x => x.dependsOn(macroJVM))

    lazy val backboneJSCrossJVM = backboneJSCrossProj.jvm
    lazy val backboneJSCrossJS = backboneJSCrossProj.js
}
