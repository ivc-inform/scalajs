package ru.simplesys.build

import sbt._
import Keys._

trait CommonTypesProj {
  self: Build =>
  lazy val commonTypesProj = Project("common-types", file("common-types")) settings(
      name := "common-types",
      version := "1.0.0-SNAPSHOT"
    )
}
