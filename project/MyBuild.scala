package ru.simplesys.build

import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._
import spray.revolver.RevolverPlugin.Revolver

object MyBuild extends Build with
  MacroJSProject with
  MacroJVMProject with
  SmartClientCrossProj with
  CommonTypesProj with
  CommonDomainsProj{

  override def settings: Seq[Def.Setting[_]] = super.settings ++ Seq(
    scalaVersion := CommonSettings.scalaVersion,
    scalacOptions := CommonSettings.scalacOptions,
    organization := CommonSettings.organization
  )

  lazy val root = Project("core-libs-scalajs", file(".")) settings(
     Seq(
      publishArtifact in (Compile, packageBin) := false,
      publishArtifact in (Compile, packageDoc) := false,
      publishArtifact in (Compile, packageSrc) := false,
      persistLauncher := true,
      libraryDependencies ++= Seq(
        CommonSettings.cmnDependencies.uTest.value
      ),
      mainClass in Revolver.reStart := Some("ru.simplesys.server.AkkaHttpMicroservice"),
      testFrameworks += new TestFramework("utest.runner.Framework")
    ): _*
    ) aggregate(
    commonTypesJS,
    commonTypesJVM,
    macroJsSub,
    smartClientJS,
    smartClientJVM,
    commonDomainJS,
    commonDomainJVM)

}

