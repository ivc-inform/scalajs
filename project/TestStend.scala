package ru.simplesys.sbprocessingui.sbtbuild

import com.simplesys.build.{CommonDeps, CommonSettings, SmartClientCrossProj}
import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import sbt.Keys._
import sbt._



trait TestStend {
    self: Build with SmartClientCrossProj =>

    lazy val testStend = Project(id = "test-stend", base = file("test-stend")).enablePlugins(
        ScalaJSPlugin
    ).dependsOn(
        smartClientCrossProj.jvm, smartClientCrossProj.js
    ).settings(

        libraryDependencies ++= Seq(

            CommonDeps.jettyWebapp.value % "container",
            CommonDeps.jettyAnnotations.value % "container",
            CommonDeps.jettyPlus.value % "container"
        )

    ).settings({

        Seq(
            //scala.js
            crossTarget in fastOptJS := (sourceDirectory in Compile).value / "webapp" / "javascript" / "generated" / "generatedComponents",
            crossTarget in fullOptJS := (sourceDirectory in Compile).value / "webapp" / "javascript" / "generated" / "generatedComponents",
            crossTarget in packageJSDependencies := (sourceDirectory in Compile).value / "webapp" / "javascript" / "generated" / "generatedComponents"
        )
    }).settings(CommonSettings.defaultSettings)
}

