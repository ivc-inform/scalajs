package com.simplesys.build


import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import sbt.Keys._
import sbt._

trait JointJSProj {
    self: Build  with MacroJSProject with MacroJVMProject with CommonTypesProj =>

    lazy val jointJSCrossProj = crossProject.dependsOn(commonTypesCrossProj).
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
          libraryDependencies ++= Seq()
      ).dependsOn().jsConfigure(x => x.dependsOn(macroJS)).jvmConfigure(x => x.dependsOn(macroJVM))

    lazy val jointJSCrossJVM = jointJSCrossProj.jvm
    lazy val jointJSCrossJS = jointJSCrossProj.js
}
