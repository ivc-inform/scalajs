package com.simplesys.build

object CommonSettings {
    object settingValues {
        val baseVersion = "1.0"

        val scalaVersion = "2.11.8"
        val scalaOldVersion = "2.10.6"
        val crossScalaVersions = Seq(scalaVersion, scalaOldVersion)
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
        val scalaTestVersion = "3.0.0"
        val ssysCoreVersion = "1.2.100"
        //val ssysCoreVersion = "1.2-SNAPSHOT"
        val scalajsDOMVersion = "0.9.0"
        val scalajsJQueryVersion = "0.9.0"
        val jettyVersion = "9.4.0.v20161208"
        val servletAPIVersion = "3.1.0"
        val akkaVersion = "2.4.14"
        val akkaHttpVersion = "10.0.0"
        val smartclientVersion = "11.0-v20160805.10"
    }


    val
    defaultProjectSettings = {
        import sbt.Keys._
        Seq(
            crossScalaVersions := settingValues.crossScalaVersions,
            scalacOptions := settingValues.scalacOptions,
            organization := settingValues.organization
        )
    }
}
