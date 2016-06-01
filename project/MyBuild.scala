package com.simplesys.build

import com.typesafe.sbt.GitVersioning
import com.typesafe.sbt.SbtGit.git
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._

object MyBuild extends Build with
  MacroJSProject with
  MacroJVMProject with
  SmartClientCrossProj with
  commonTypesCrossProj with
  CommonDomainsCrossProj with
  JointJSCrossProj with
  BackboneJSProj with
  UnderscoreJSCrossProj {

    override def settings: Seq[Def.Setting[_]] = super.settings ++ Seq(
        scalaVersion := CommonSettings.settingValues.scalaVersion,
        scalacOptions := CommonSettings.settingValues.scalacOptions,
        organization := CommonSettings.settingValues.organization,

        git.baseVersion := CommonSettings.settingValues.baseVersion,
        scalaVersion := CommonSettings.settingValues.scalaVersion,
        crossScalaVersions := CommonSettings.settingValues.crossScalaVersions,

        publishTo <<= version { (v: String) =>
            val corporateRepo = "http://toucan.simplesys.lan/"
            if (v.trim.endsWith("SNAPSHOT"))
                Some("snapshots" at corporateRepo + "artifactory/libs-snapshot-local")
            else
                Some("releases" at corporateRepo + "artifactory/libs-release-local")
        },

        credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
    )

    lazy val root = Project("scalajs", file(".")).enablePlugins(GitVersioning) settings (
      Seq(
          publishArtifact in(Compile, packageBin) := false,
          publishArtifact in(Compile, packageDoc) := false,
          publishArtifact in(Compile, packageSrc) := false,
          persistLauncher := true,
          libraryDependencies ++= Seq(
              //CommonDeps.uTest.value
          ),
          testFrameworks += new TestFramework("utest.runner.Framework")
      ): _*
      ) aggregate(
      commonTypesJS,
      commonTypesJVM,
      macroJS,
      macroJVM,
      smartClientJS,
      smartClientJVM,
      commonDomainJS,
      commonDomainJVM,
      jointJSCrossJVM,
      jointJSCrossJS,
      backboneJSCrossJVM,
      backboneJSCrossJS,
      underscoreJSCrossJS,
      underscoreJSCrossJVM)

}

