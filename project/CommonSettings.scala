package com.simplesys.build

object CommonSettings {
    object settingValues {
        val baseVersion = "1.1"

        val scalaVersion = "2.12.1"
        val crossScalaVersions = Seq(scalaVersion)
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
        //val ssysCoreVersion = "1.2.100"
        val ssysCoreVersion = "1.3-SNAPSHOT"
        val scalajsDOMVersion = "0.9.1"
        val scalajsJQueryVersion = "0.9.1"
        val akkaVersion = "2.4.17"
        val akkaHttpVersion = "10.0.5"
        val smartclientVersion = "11.0-v20160805.10"
    }


    val defaultProjectSettings = {
        import sbt.Keys._
        Seq(
            crossScalaVersions := settingValues.crossScalaVersions,
            scalacOptions := settingValues.scalacOptions,
            organization := settingValues.organization
        )
    }
}
