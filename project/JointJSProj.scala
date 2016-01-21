package com.simplesys.build


import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import sbt.Keys._
import sbt._

trait JointJSProj {
    self: Build with MacroJSProject with MacroJVMProject with CommonTypesProj with  BackboneJSProj =>

    lazy val jointJSCrossProj = crossProject.dependsOn(commonTypesCrossProj).dependsOn(backboneJSCrossProj).
      settings(
          name := "joint-js",
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

    lazy val jointJSCrossJVM = jointJSCrossProj.jvm
    lazy val jointJSCrossJS = jointJSCrossProj.js
}
