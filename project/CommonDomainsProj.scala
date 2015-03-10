package ru.simplesys.build


import com.simplesys.mergewebapp.MergeWebappPlugin._
import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import sbt.Keys._
import sbt._

trait CommonDomainsProj {
  self: Build with MacroJSProject with MacroJVMProject with SmartClientCrossProj =>

  lazy val commonDomainsCrossProj = crossProject.dependsOn(smartClientCrossProj).
    settings(
      name := "common-domains",
      version := "1.0.0-SNAPSHOT"
    ).
    jvmSettings().
    jsSettings(
      libraryDependencies ++= Seq(
        CommonSettings.jsDependencies.smartClient.value % "provided"
      )
    //jsDependencies += "org.example" %% "js-thing" % "0.1" / "foo.js"
  ).jsConfigure(x => x.dependsOn(macroJsSub)).jvmConfigure(x => x.dependsOn(macroJvmSub))

  // Needed, so sbt finds the projects
  lazy val commonDomainJVM = commonDomainsCrossProj.jvm
  lazy val commonDomainJS = commonDomainsCrossProj.js
}
