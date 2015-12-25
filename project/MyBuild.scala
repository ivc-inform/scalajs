package ru.simplesys.build

import java.util

import sbt._
import sbt.Keys._

import spray.revolver.RevolverPlugin.Revolver
import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import com.simplesys.mergewebapp.MergeWebappPlugin._


//trait RootProject {
//  self: Build with MacroProject with SmartClientCrossProj =>
//
//
//}

object MyBuild extends Build with
  MacroJSProject with
  MacroJVMProject with
  SmartClientCrossProj with
  ScalaJSStubsProj with
  CommonTypesProj with
  CommonDomainsProj with
  TestSmartClientCrossProj {

  override def settings: Seq[Def.Setting[_]] = super.settings ++ Seq(
    scalaVersion := CommonSettings.scalaVersion,
    scalacOptions := CommonSettings.scalacOptions,
    organization := CommonSettings.organization
//    ,
//
//
//    publishTo <<= version { (v: String) =>
//      val corporateRepo = "http://toucan.simplesys.lan/"
//      if (v.trim.endsWith("SNAPSHOT"))
//        Some("snapshots" at corporateRepo + "artifactory/libs-snapshot-local")
//      else
//        Some("releases"  at corporateRepo + "artifactory/libs-release-local")
//    },
//    credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
  ) //++ aetherSettings ++ aetherPublishSettings


  lazy val root = Project("core-libs-scalajs", file(".")) settings(
    Revolver.settings ++ mergeWebappSettings ++ Seq(
      publishArtifact in (Compile, packageBin) := false,
      publishArtifact in (Compile, packageDoc) := false,
      publishArtifact in (Compile, packageSrc) := false,

      //scalacOptions += "-Xlog-implicits",
      persistLauncher := true,
      mergeMapping in MergeWebappConfig := Seq(
        ("com.simplesys", "smartclient-js") -> Seq(
          Seq("isomorphic") -> Some(Seq("webapp", "javascript", "isomorphic"))
        )
      ),
      currentProjectGenerationDirPath in MergeWebappConfig <<= (sourceDirectory in Compile) {
        _ / "webapp" / "javascript" / "generated"
      },
      currentProjectDevelopedDirPath in MergeWebappConfig <<= (sourceDirectory in Compile) {
        _ / "webapp" / "javascript" / "developed"
      },
      libraryDependencies ++= Seq(
        "com.typesafe.akka" %% "akka-actor" % CommonSettings.versions.akkaVersion,
        "com.typesafe.akka" %% "akka-slf4j" % CommonSettings.versions.akkaVersion,
        CommonSettings.jvmDependencies.akkaHttp.value,
        //"io.spray"          %%  "spray-can"     % CommonSettings.versions.sprayVersion,
        //"io.spray"          %%  "spray-routing" % CommonSettings.versions.sprayVersion,
        CommonSettings.jsDependencies.smartClient.value,
        CommonSettings.cmnDependencies.uTest.value
      ),
      mainClass in Revolver.reStart := Some("ru.simplesys.server.AkkaHttpMicroservice"),
      testFrameworks += new TestFramework("utest.runner.Framework")
    ): _*
    ) dependsOn(testSmartClientJVM) aggregate(
    commonTypesJS,
    commonTypesJVM,
    macroJsSub,
    smartClientJS,
    smartClientJVM,
    scalaJSStubJVM,
    commonDomainJS,
    commonDomainJVM,
    testSmartClientJVM,
    testSmartClientJS)

}

