package com.simplesys.build


import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import sbt.Keys._
import sbt._

trait JointJSProj {
    self: Build  =>

    lazy val jointJSCrossProj = crossProject.
      settings(
          name := "joint-js",
          version := "1.0-SNAPSHOT",

          libraryDependencies ++= Seq(

          ),

          testFrameworks += new TestFramework("utest.runner.Framework"),
          publishArtifact in(Compile, packageDoc) := false
      ).
      jvmSettings().
      jsSettings(
          libraryDependencies ++= Seq()
      ).jsConfigure(x => x)

    lazy val jointJSCrossJVM = jointJSCrossProj.jvm
    lazy val jointJSCrossJS = jointJSCrossProj.js
}
