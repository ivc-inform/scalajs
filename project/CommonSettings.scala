package com.simplesys.build

object CommonSettings {
    object settingValues {
        val baseVersion = "1.3"

        val scalaVersion = "2.12.3"
        val organization = "com.simplesys"
        val scalacOptions = Seq(
            "-feature",
            "-language:higherKinds",
            "-language:implicitConversions",
            "-language:postfixOps",
            "-deprecation",
            "-unchecked")
    }

    object versions {
        val sprayVersion = "1.3.2"
        val uTestVersion = "0.3.1"
        val scalaTestVersion = "3.0.1"
        val ssysCoreVersion = "1.3.1"
        //val ssysCoreVersion = "1.3-SNAPSHOT"
        val scalajsDOMVersion = "0.9.1"
        val scalajsJQueryVersion = "0.9.1"
    }


    val defaultSettings = {
        import sbt.Keys._
        Seq(
            scalacOptions := settingValues.scalacOptions,
            organization := settingValues.organization
        )
    }
}
