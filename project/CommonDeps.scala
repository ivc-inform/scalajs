package com.simplesys.build

import com.simplesys.build.CommonSettings.{settingValues, versions}
import sbt._

object PluginDeps {
    object versions {
        val scalaJSPluginVersion = "0.6.13"
        val xsbtWebVersion = "2.1.0"
        val mergeJSVersion = "1.0.9"
        val transpileCoffeScriptVersion = "1.0.12-2.11.1"
    }

    val scalaJSPlugin = addSbtPlugin("org.scala-js" % "sbt-scalajs" % versions.scalaJSPluginVersion)
    val xsbtWeb = addSbtPlugin("com.earldouglas" % "xsbt-web-plugin" % versions.xsbtWebVersion)
    val mergeJS = addSbtPlugin("ru.simplesys" % "merge-js" % versions.mergeJSVersion)
    val transpileCoffeeScript = addSbtPlugin("ru.simplesys" % "transpile-coffeescript" % versions.transpileCoffeScriptVersion)
}


object CommonDeps {

    val common = Def.setting("com.simplesys.core" %% "common" % versions.ssysCoreVersion)
    val coreUtils = Def.setting("com.simplesys.core" %% "core-utils" % versions.ssysCoreVersion)
    val xmlExtender = Def.setting("com.simplesys.core" %% "xml-extender" % versions.ssysCoreVersion)
    val logbackWrapper = Def.setting("com.simplesys.core" %% "logback-wrapper" % versions.ssysCoreVersion)
    val scalaIOExtender = Def.setting("com.simplesys.core" %% "scala-io-extender" % versions.ssysCoreVersion)

    val scalaReflect = Def.setting(DepsHelper.moduleIdOpt(settingValues.scalaVersion, Some("org.scala-lang" % "scala-reflect" % settingValues.scalaVersion), Some("org.scala-lang" % "scala-reflect" % settingValues.scalaVersion)))
    val scalaCompiler = Def.setting(DepsHelper.moduleIdOpt(settingValues.scalaVersion, Some("org.scala-lang" % "scala-compiler" % settingValues.scalaVersion), Some("org.scala-lang" % "scala-compiler" % settingValues.scalaVersion)))
    val scalaReflection = Def.setting(DepsHelper.moduleIdOpt(settingValues.scalaVersion, Some("org.scala-lang" % "scala-reflection" % settingValues.scalaVersion), Some("org.scala-lang" % "scala-reflection" % settingValues.scalaVersion)))

    val servletAPI = Def.setting("javax.servlet" % "javax.servlet-api" % versions.servletAPIVersion)
    val jettyWebapp = Def.setting("org.eclipse.jetty" % "jetty-webapp" % versions.jettyVersion)
    val jettyAnnotations = Def.setting("org.eclipse.jetty" % "jetty-annotations" % versions.jettyVersion)
    val jettyPlus = Def.setting("org.eclipse.jetty" % "jetty-plus" % versions.jettyVersion)

    val akkaActor = Def.setting("com.typesafe.akka" %% "akka-actor" % versions.akkaVersion)
    val akkaSLF4J = Def.setting("com.typesafe.akka" %% "akka-slf4j" % versions.akkaVersion)
    val akkaPersistence = Def.setting("com.typesafe.akka" %% "akka-persistence" % versions.akkaVersion)
    val akkaTestKit = Def.setting("com.typesafe.akka" %% "akka-testkit" % versions.akkaVersion)
    val akkaHTTPCore = Def.setting("com.typesafe.akka" %% "akka-http-core" % versions.akkaVersion)
    val smartclient = Def.setting("com.simplesys" % "smartclient-js" % versions.smartclientVersion)
    val ssysIscComponents = Def.setting("com.simplesys.core" %% "isc-components" % versions.ssysCoreVersion)

    val scalaTest = Def.setting("org.scalatest" %% "scalatest" % versions.scalaTestVersion % "test")
    val spray = Def.setting("io.spray" % "spray-json_2.11" % versions.scalaTestVersion % "test")
}

object DepsHelper {
    def moduleIdOpt(scalaVer: String, moduleId_2_11: Option[ModuleID], moduleId_2_10: Option[ModuleID]): Option[ModuleID] =
        CrossVersion.partialVersion(scalaVer) match {
            case Some((2, scalaMajor)) if scalaMajor >= 11 => moduleId_2_11
            case _ => moduleId_2_10
        }

    def moduleId(scalaVer: String, moduleId_2_11: ModuleID, moduleId_2_10: ModuleID): ModuleID =
        CrossVersion.partialVersion(scalaVer) match {
            case Some((2, scalaMajor)) if scalaMajor >= 11 => moduleId_2_11
            case _ => moduleId_2_10
        }
}
