import com.simplesys.build.{CommonDeps, CommonDepsScalaJS, CommonSettings}
import com.typesafe.sbt.SbtGit.git
import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport.crossProject

name := "scalajs"

lazy val root = (project in file(".")).
  enablePlugins(GitVersioning).
  aggregate(
      commonTypesJS,
      commonTypesJVM,
      macroJS,
      macroJVM,
      smartClientJS,
      smartClientJVM,
      commonDomainJS,
      commonDomainJVM,
      jointJSCrossJVM,
      jointJSCrossJS,
      backboneJSCrossJVM,
      backboneJSCrossJS,
      underscoreJSCrossJS,
      underscoreJSCrossJVM
  ).
  settings(inThisBuild(Seq(
      git.baseVersion := CommonSettings.settingValues.baseVersion,
      scalaVersion := CommonSettings.settingValues.scalaVersion,
      scalacOptions := CommonSettings.settingValues.scalacOptions,
      organization := CommonSettings.settingValues.organization,
      publishTo := {
          val corporateRepo = "http://toucan.simplesys.lan/"
          if (isSnapshot.value)
              Some("snapshots" at corporateRepo + "artifactory/libs-snapshot-local")
          else
              Some("releases" at corporateRepo + "artifactory/libs-release-local")
      },
      credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
  )
    ++ CommonSettings.defaultSettings),
      publishArtifact in(Compile, packageBin) := false,
      publishArtifact in(Compile, packageDoc) := false,
      publishArtifact in(Compile, packageSrc) := false
  )

lazy val commonDomainsCrossProj = crossProject.dependsOn(smartClientCrossProj).
  settings(
      name := "common-domains",
      libraryDependencies ++= Seq(
          CommonDeps.logbackWrapper
      ),
      publishArtifact := false
  ).
  jvmSettings().
  jsSettings(
      scalacOptions ++= (if (scalaJSVersion.startsWith("0.6.")) Seq("-P:scalajs:sjsDefinedByDefault") else Nil)
  ).jsConfigure(_.dependsOn(macroJS)).jvmConfigure(_.dependsOn(macroJVM))

// Needed, so sbt finds the projects
lazy val commonDomainJVM = commonDomainsCrossProj.jvm
lazy val commonDomainJS = commonDomainsCrossProj.js

lazy val commonTypesCrossProj = crossProject.
  settings(
      name := "common-types",
      libraryDependencies ++= Seq(
          CommonDeps.logbackWrapper
      ),
      publishArtifact in(Compile, packageDoc) := false
  ).
  jvmSettings().
  jsSettings(
      scalacOptions ++= (if (scalaJSVersion.startsWith("0.6.")) Seq("-P:scalajs:sjsDefinedByDefault") else Nil)
  )

// Needed, so sbt finds the projects
lazy val commonTypesJVM = commonTypesCrossProj.jvm
lazy val commonTypesJS = commonTypesCrossProj.js

lazy val jointJSCrossProj = crossProject.dependsOn(backboneJSCrossProj).
  settings(
      name := "joint-js",
      publishArtifact := false
  ).
  jvmSettings().
  jsSettings(
      scalacOptions ++= (if (scalaJSVersion.startsWith("0.6.")) Seq("-P:scalajs:sjsDefinedByDefault") else Nil),
      libraryDependencies ++= Seq(
          CommonDepsScalaJS.scalajsDOM.value,
          CommonDepsScalaJS.scalajsJQuey.value
      )
  )

lazy val jointJSCrossJVM = jointJSCrossProj.jvm
lazy val jointJSCrossJS = jointJSCrossProj.js

lazy val macroJS = Project("macrojs", file("macrojs")).settings(
    name := "macrojs",
    libraryDependencies ++= Seq(
        CommonDeps.scalaCompiler,
        CommonDeps.scalaReflect
    )
).dependsOn(commonTypesJS).enablePlugins(ScalaJSPlugin)

lazy val macroJVM = Project("macrojvm", file("macrojvm")).settings(
    name := "macrojvm",
    libraryDependencies ++= Seq(
        CommonDeps.scalaCompiler,
        CommonDeps.scalaReflect
    ),
    publishArtifact := false
).dependsOn(commonTypesJVM)

lazy val smartClientCrossProj = crossProject.dependsOn(commonTypesCrossProj).
  settings(
      name := "smartclient-wrapper",
      publishArtifact in(Compile, packageDoc) := false
  ).
  jvmSettings().
  jsSettings(
      scalacOptions ++= (if (scalaJSVersion.startsWith("0.6.")) Seq("-P:scalajs:sjsDefinedByDefault") else Nil),
      libraryDependencies ++= Seq(
          CommonDepsScalaJS.scalajsDOM.value,
          CommonDepsScalaJS.scalajsJQuey.value
      )
  ).dependsOn().jsConfigure(x => x.dependsOn(macroJS).enablePlugins(ScalaJSPlugin)).jvmConfigure(x => x.dependsOn(macroJVM))

// Needed, so sbt finds the projects
lazy val smartClientJVM = smartClientCrossProj.jvm
lazy val smartClientJS = smartClientCrossProj.js

lazy val underscoreJSCrossProj = crossProject.dependsOn(commonTypesCrossProj).
  settings(
      name := "underscore-js",
      publishArtifact := false
  ).
  jvmSettings().
  jsSettings()

lazy val underscoreJSCrossJVM = underscoreJSCrossProj.jvm
lazy val underscoreJSCrossJS = underscoreJSCrossProj.js

lazy val backboneJSCrossProj = crossProject.dependsOn(underscoreJSCrossProj).
  settings(
      name := "backbone-js",
      publishArtifact := false
  ).
  jvmSettings().
  jsSettings(
      libraryDependencies ++= Seq(
          CommonDepsScalaJS.scalajsDOM.value,
          CommonDepsScalaJS.scalajsJQuey.value
      )
  ).dependsOn().jsConfigure(x => x.dependsOn(macroJS)).jvmConfigure(x => x.dependsOn(macroJVM))

lazy val backboneJSCrossJVM = backboneJSCrossProj.jvm
lazy val backboneJSCrossJS = backboneJSCrossProj.js
