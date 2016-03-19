package com.simplesys.build

import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import sbt.Keys._
import sbt._

trait SmartClientCrossProj {
    self: Build with MacroJSProject with MacroJVMProject with commonTypesCrossProj =>

    lazy val smartClientCrossProj = crossProject.dependsOn(commonTypesCrossProj).
      settings(
          name := "smartclient-wrapper",
          version := "1.1-SNAPSHOT",
          libraryDependencies ++= {
              Seq(
                  CommonSettings.cmnDependencies.xmlExtender.value,
                  CommonSettings.cmnDependencies.scalaIOExtender.value,
                  CommonSettings.cmnDependencies.scalaTest.value,
                  CommonSettings.cmnDependencies.uTest.value
              )
          },
          testFrameworks += new TestFramework("utest.runner.Framework"),
          publishArtifact in(Compile, packageDoc) := false
      ).
      jvmSettings(
          libraryDependencies ++= {
              Seq()
          }).
      jsSettings(
          libraryDependencies ++= Seq(
              CommonSettings.jsDependencies.scalajsDOM.value,
              CommonSettings.jsDependencies.scalajsJQuey.value
          )
      ).dependsOn().jsConfigure(x => x.dependsOn(macroJS)).jvmConfigure(x => x.dependsOn(macroJVM))

    // Needed, so sbt finds the projects
    lazy val smartClientJVM = smartClientCrossProj.jvm
    lazy val smartClientJS = smartClientCrossProj.js

}
