package ru.simplesys.build

import sbt._
import Keys._
import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._

trait TestSmartClientCrossProj {
  self: Build with MacroJSProject with MacroJVMProject with SmartClientCrossProj with CommonDomainsProj =>

  lazy val testSmartClientCrossProj = crossProject.dependsOn(smartClientCrossProj, commonDomainsCrossProj).
    settings(
      name := "test-smartclient-infra",
      version := "1.0.0-SNAPSHOT"
    ).
    jvmSettings(
    libraryDependencies ++= {
      Seq(
        //CommonSettings.cmnDependencies.prickle,
        CommonSettings.jvmDependencies.scalaTest % "test"
      )
    }).
    jsSettings(
    //scalacOptions += "-Xlog-implicits",
    persistLauncher := true,

    libraryDependencies ++= Seq(
        CommonSettings.jsDependencies.smartClient % "provided"
      )
    //jsDependencies += "org.example" %% "js-thing" % "0.1" / "foo.js"
    ).jsConfigure(x => x.dependsOn(macroJsSub)).jvmConfigure(x => x.dependsOn(macroJvmSub))

  // Needed, so sbt finds the projects
  lazy val testSmartClientJVM = testSmartClientCrossProj.jvm
  lazy val testSmartClientJS = testSmartClientCrossProj.js

}
