package ru.simplesys.build

import sbt._
import Keys._
import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._

trait SmartClientCrossProj {
  self: Build with MacroJSProject with MacroJVMProject with CommonTypesProj =>

  lazy val smartClientCrossProj = crossProject.dependsOn(commonTypesCrossProj).
    settings(
      name := "smartclient-wrapper",
      version := "1.0-SNAPSHOT",
      libraryDependencies ++= {
        Seq(
          CommonSettings.cmnDependencies.xmlExtender.value,
          CommonSettings.cmnDependencies.uTest.value
        )
      },
      testFrameworks += new TestFramework("utest.runner.Framework")
    ).
    jvmSettings(
    libraryDependencies ++= {
      Seq()
    }).
    jsSettings(
    libraryDependencies ++= Seq(     )
    //jsDependencies += "org.example" %% "js-thing" % "0.1" / "foo.js"
    ).dependsOn().jsConfigure(x => x.dependsOn(macroJS)).jvmConfigure(x => x.dependsOn(macroJVM))

  // Needed, so sbt finds the projects
  lazy val smartClientJVM = smartClientCrossProj.jvm
  lazy val smartClientJS = smartClientCrossProj.js

}
