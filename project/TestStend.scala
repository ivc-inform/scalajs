package com.simplesys.build

import com.earldouglas.xwp.ContainerPlugin.autoImport._
import com.earldouglas.xwp.JettyPlugin
import com.earldouglas.xwp.JettyPlugin.autoImport._
import com.earldouglas.xwp.WebappPlugin.autoImport._
import com.simplesys.build.CommonSettings.versions
import com.simplesys.mergewebapp.MergeWebappPlugin
import com.simplesys.mergewebapp.MergeWebappPlugin._
import com.typesafe.sbt.coffeescript.Import.CoffeeScriptKeys
import com.typesafe.sbt.coffeescript.TranspileCoffeeScript
import com.typesafe.sbt.web.Import.WebKeys._
import com.typesafe.sbt.web.Import._
import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import sbt.Keys._
import sbt._

trait TestStend {
    self: Build with SmartClientCrossProj =>


    lazy val testStend = crossProject.dependsOn(smartClientCrossProj).enablePlugins(
        JettyPlugin
    ).
      settings(
          name := "test-stend",
          libraryDependencies ++= {
              Seq(
              )
          },
          publishArtifact in(Compile, packageDoc) := false,
          containerPort := 8084,
          webappWebInfClasses := true,
          containerArgs := Seq("--path", "/test-stend"),
          containerLibs in Jetty := Seq(("org.eclipse.jetty" % "jetty-runner" % versions.jettyVersion).intransitive())
      ).
      jvmSettings(
          libraryDependencies ++= {
              Seq(
                  //CommonDeps.servletAPI.value
              )
          }
      ).
      jsSettings(
          //scala.js
          crossTarget in fastOptJS := (sourceDirectory in Compile).value / "webapp" / "javascript" / "generated" / "generatedComponents",
          crossTarget in fullOptJS := (sourceDirectory in Compile).value / "webapp" / "javascript" / "generated" / "generatedComponents",
          crossTarget in packageJSDependencies := (sourceDirectory in Compile).value / "webapp" / "javascript" / "generated" / "generatedComponents",

          //coffeeScript
          CoffeeScriptKeys.sourceMap := false,
          CoffeeScriptKeys.bare := false,
          webTarget := (sourceDirectory in Compile).value / "webapp" / "javascript" / "generated" / "generatedComponents" / "coffeescript",
          sourceDirectory in Assets := (sourceDirectory in Compile).value / "webapp" / "coffeescript" / "developed" / "developedComponents",
          (managedResources in Compile) ++= CoffeeScriptKeys.csTranspile.value,

          //merger
          mergeMapping in MergeWebappConfig := Seq(
              ("com.simplesys.core", "isc-components") -> Seq(
                  Seq("webapp", "javascript", "generated", "generatedComponents") -> Some(Seq("webapp", "managed", "javascript", "isc-components", "generated", "generatedComponents")),
                  Seq("webapp", "javascript", "generated", "generatedComponents", "coffeescript") -> Some(Seq("webapp", "managed", "javascript", "isc-components", "generated", "generatedComponents", "coffeescript")),
                  Seq("javascript", "com", "simplesys") -> Some(Seq("webapp", "managed", "javascript", "isc-components", "developed", "developedComponents")),
                  Seq("coffeescript") -> Some(Seq("webapp", "managed", "coffeescript", "isc-components", "developed", "developedComponents"))
              ),
              ("com.simplesys", "smartclient-js") -> Seq(
                  Seq("isomorphic") -> Some(Seq("webapp", "isomorphic"))
              )
          ),
          currentProjectGenerationDirPath in MergeWebappConfig := (sourceDirectory in Compile).value / "webapp" / "javascript" / "generated" / "generatedComponents",
          currentProjectDevelopedDirPath in MergeWebappConfig := (sourceDirectory in Compile).value / "webapp" / "javascript" / "developed",
          currentProjectCoffeeDevelopedDirPath in MergeWebappConfig := (sourceDirectory in Compile).value / "webapp" / "coffeescript" / "developed",
          merge in MergeWebappConfig <<= (merge in MergeWebappConfig).dependsOn(CoffeeScriptKeys.csTranspile in Assets),

          libraryDependencies ++= Seq(
              CommonDeps.ssysIscComponents.value,
              CommonDeps.smartclient.value
          )
      ).dependsOn(smartClientCrossProj).jsConfigure(x => x.dependsOn(smartClientJS).enablePlugins(MergeWebappPlugin, ScalaJSPlugin, TranspileCoffeeScript)).jvmConfigure(x => x.dependsOn(smartClientJVM))

    // Needed, so sbt finds the projects
    lazy val testStendJVM = testStend.jvm
    lazy val testStendJS = testStend.js
}

