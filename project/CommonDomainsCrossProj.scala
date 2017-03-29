package com.simplesys.build


import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import sbt.Keys._
import sbt._

trait CommonDomainsCrossProj {
    self: Build with MacroJSProject with MacroJVMProject with SmartClientCrossProj =>

    lazy val commonDomainsCrossProj = crossProject.dependsOn(smartClientCrossProj).
      settings(
          name := "common-domains",

          libraryDependencies ++= Seq(
              CommonDeps.logbackWrapper.value
          ),

          testFrameworks += new TestFramework("utest.runner.Framework"),
          publishArtifact in(Compile, packageDoc) := false
      ).
      jvmSettings().
      jsSettings(
          libraryDependencies ++= Seq()
      ).jsConfigure(x => x.dependsOn(macroJS)).jvmConfigure(x => x.dependsOn(macroJVM))

    // Needed, so sbt finds the projects
    lazy val commonDomainJVM = commonDomainsCrossProj.jvm
    lazy val commonDomainJS = commonDomainsCrossProj.js
}
