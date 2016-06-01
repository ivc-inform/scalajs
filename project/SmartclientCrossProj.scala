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
                  CommonDeps.xmlExtender.value,
                  CommonDeps.scalaIOExtender.value,
                  CommonDeps.scalaTest.value/*,
                  CommonDeps.uTest.value*/
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
              CommonDepsScalaJS.scalajsDOM.value,
              CommonDepsScalaJS.scalajsJQuey.value
          )
      ).dependsOn().jsConfigure(x => x.dependsOn(macroJS)).jvmConfigure(x => x.dependsOn(macroJVM))

    // Needed, so sbt finds the projects
    lazy val smartClientJVM = smartClientCrossProj.jvm
    lazy val smartClientJS = smartClientCrossProj.js

}
