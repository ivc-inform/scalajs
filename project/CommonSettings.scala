package ru.simplesys.build

import sbt._
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

object CommonSettings {
  val scalaVersion = "2.11.6"
  val organization = "ru.simplesys"
  val scalacOptions = Seq(
    "-feature",
    "-language:higherKinds",
    "-language:implicitConversions",
    "-language:postfixOps",
    "-deprecation",
    "-unchecked")

  object versions {
    val akkaVersion = "2.3.7"
    val akkaHttpVersion = "0.11"
    val kamonVersion = "0.3.5"
    val sprayVersion = "1.3.2"
    val scalaAsyncVersion = "0.9.2"
    val scalajsDOMVersion = "0.7.0"
    //val scalaRxVersion = "0.2.7"
    val uPickleVersion = "0.2.8"
    val prickleVersion = "1.1.4"
    val smartclientVersion = "10.0-v20141114"


    val uTestVersion = "0.3.1"
    val scalaTestVersion = "2.2.2"
  }

  object cmnDependencies {
    val scalaAsync = Def.setting( "org.scala-lang.modules" %% "scala-async" % versions.scalaAsyncVersion )
    val prickle = Def.setting( "com.github.benhutchison" %%% "prickle" % versions.prickleVersion )
    val uPickle = Def.setting( "com.lihaoyi" %%% "upickle" % versions.uPickleVersion )
    val uTest = Def.setting( "com.lihaoyi" %%% "utest" % versions.uTestVersion % "test" )
  }

  object jsDependencies {
    //val scalaRx = Def.setting( "com.scalarx" %%% "scalarx" % versions.scalaRxVersion )
    val scalajsDOM = Def.setting( "org.scala-js" %%% "scalajs-dom" % versions.scalajsDOMVersion )
    val smartClient = Def.setting( "com.simplesys" % "smartclient-js" % versions.smartclientVersion )
  }

  object jvmDependencies {
    //val scalaRx = Def.setting( "com.scalarx" %% "scalarx" % versions.scalaRxVersion )
    val scalaTest = Def.setting( "org.scalatest" %% "scalatest" % versions.scalaTestVersion )
  }

}