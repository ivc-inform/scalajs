import sbt._
import Keys._

//object MacroBuild extends Build {
//  lazy val main = Project("test-app", file(".")) dependsOn(macroSub)
//
//  lazy val macroSub = Project("macrojs", file("macrojs")) settings(
//    libraryDependencies <+= scalaVersion("org.scala-lang" % "scala-compiler" % _)//,
//    //scalaVersion <<= scalaVersion
//    )
//}