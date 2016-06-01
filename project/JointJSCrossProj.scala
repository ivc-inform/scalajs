package com.simplesys.build


import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import sbt.Keys._
import sbt._

trait JointJSCrossProj {
    self: Build with  BackboneJSProj =>

    lazy val jointJSCrossProj = crossProject.dependsOn(backboneJSCrossProj).
      settings(
          name := "joint-js",
          version := "1.1-SNAPSHOT",

          libraryDependencies ++= Seq(
              CommonDeps.scalaTest.value
          ),

          testFrameworks += new TestFramework("utest.runner.Framework"),
          publishArtifact in(Compile, packageDoc) := false
      ).
      jvmSettings().
      jsSettings(
          libraryDependencies ++= Seq(
              CommonDepsScalaJS.scalajsDOM.value,
              CommonDepsScalaJS.scalajsJQuey.value
          )
      )//.dependsOn().jsConfigure(x => x.dependsOn(macroJS)).jvmConfigure(x => x.dependsOn(macroJVM))

    lazy val jointJSCrossJVM = jointJSCrossProj.jvm
    lazy val jointJSCrossJS = jointJSCrossProj.js
}
