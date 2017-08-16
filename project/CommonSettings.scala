package com.simplesys.build

object CommonSettings {
    object settingValues {
        val baseVersion = "1.4"

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
        //val sbtssysCoreVersion = "1.3.1"
        val ssysCoreVersion = "1.4-SNAPSHOT"
        val scalajsDOMVersion = "0.9.1"
        val scalajsJQueryVersion = "0.9.1"
        val akkaVersion = "2.5.3"
        val akkaHttpVersion = "10.0.9"
        val smartclientVersion = "11.1-v20170703"
    }


    val defaultSettings = {
        import sbt.Keys._
        Seq(
            scalacOptions := settingValues.scalacOptions,
            organization := settingValues.organization
        )
    }
}
