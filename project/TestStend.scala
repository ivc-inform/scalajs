package com.simplesys.build

import com.earldouglas.xwp.{ContainerPlugin, JettyPlugin}
import com.earldouglas.xwp.ContainerPlugin.autoImport._
import com.earldouglas.xwp.JettyPlugin.autoImport._
import com.simplesys.build.CommonSettings.versions
import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import sbt.Keys._
import sbt._

trait TestStend {
    self: Build with SmartClientCrossProj =>


    lazy val testStend = crossProject.dependsOn(smartClientCrossProj).enablePlugins(
        ScalaJSPlugin, JettyPlugin//, ContainerPlugin
    ).
      settings(
          name := "test-stend",
          libraryDependencies ++= {
              Seq(
                  CommonDeps.servletAPI.value
              )
          },
          publishArtifact in(Compile, packageDoc) := false,
          containerPort := 8084,
          containerArgs := Seq("--path", "/test-stend"),
          containerLibs in Jetty := Seq(("org.eclipse.jetty" % "jetty-runner" % versions.jettyVersion).intransitive())
      ).
      jvmSettings(
          libraryDependencies ++= {
              Seq()
          }
      ).
      jsSettings(
          crossTarget in fastOptJS := (sourceDirectory in Compile).value / "webapp" / "javascript" / "generated" / "generatedComponents",
          crossTarget in fullOptJS := (sourceDirectory in Compile).value / "webapp" / "javascript" / "generated" / "generatedComponents",
          crossTarget in packageJSDependencies := (sourceDirectory in Compile).value / "webapp" / "javascript" / "generated" / "generatedComponents",
          libraryDependencies ++= Seq()
      ).dependsOn(smartClientCrossProj).jsConfigure(x => x.dependsOn(smartClientJS)).jvmConfigure(x => x.dependsOn(smartClientJVM))

    // Needed, so sbt finds the projects
    lazy val testStendJVM = testStend.jvm
    lazy val testStendJS = testStend.js
}

