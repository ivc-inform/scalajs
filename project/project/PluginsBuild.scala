//package com.simplesys.build
//
//import com.typesafe.sbt.GitVersioning
//import com.typesafe.sbt.SbtGit.git
//import org.scalajs.sbtplugin.ScalaJSPlugin
//import sbt._
//
//object PluginsBuild extends Build {
//    override def settings: Seq[Def.Setting[_]] = super.settings ++ CommonSettings.defaultSettings ++ Seq(
//        git.baseVersion := CommonSettings.settingValues.baseVersion
//    )
//
//    lazy val root = Project(id = "buildPlugins", base = file(".")).enablePlugins(GitVersioning).enablePlugins(ScalaJSPlugin)
//
//}
