package com.simplesys.build

object CommonSettings {
    object settingValues {
        val baseVersion = "1.5"

        val scalaVersion = "2.12.4"
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
        val uTestVersion = "0.3.1"
        val scalaTestVersion = "3.0.4"
        //val ssysCoreVersion = "1.4.0.2"
        val ssysCoreVersion = "1.5-SNAPSHOT"
        val scalajsDOMVersion = "0.9.3"
        val scalajsJQueryVersion = "0.9.2"
        val smartclientVersion = "11.1-v20170703.1"
    }


    val defaultSettings = {
        import sbt.Keys._
        Seq(
            scalacOptions := settingValues.scalacOptions,
            organization := settingValues.organization
        )
    }
}
