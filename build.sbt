import com.simplesys.build.{CommonDeps, CommonDepsScalaJS, CommonSettings}
import com.simplesys.mergewebapp.MergeWebappPlugin._
import com.typesafe.sbt.SbtGit.git
import com.typesafe.sbt.web.Import.WebKeys.webTarget
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
      underscoreJSCrossJVM,
      testStendJS,
      testStendJVM
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

      testFrameworks += new TestFramework("utest.runner.Framework"),
      publishArtifact in(Compile, packageDoc) := false
  ).
  jvmSettings().
  jsSettings(
      scalacOptions += "-P:scalajs:sjsDefinedByDefault",
      scalacOptions += "-P:scalajs:suppressExportDeprecations",
      libraryDependencies ++= Seq()
  ).jsConfigure(x => x.dependsOn(macroJS)).jvmConfigure(x => x.dependsOn(macroJVM))

// Needed, so sbt finds the projects
lazy val commonDomainJVM = commonDomainsCrossProj.jvm
lazy val commonDomainJS = commonDomainsCrossProj.js

lazy val commonTypesCrossProj = crossProject.
  settings(
      name := "common-types",
      libraryDependencies ++= Seq(
          CommonDeps.xmlExtender,
          CommonDeps.common,
          CommonDeps.logbackWrapper
      ),
      testFrameworks += new TestFramework("utest.runner.Framework"),
      publishArtifact in(Compile, packageDoc) := false
  ).
  jvmSettings().
  jsSettings(scalacOptions += "-P:scalajs:suppressExportDeprecations")

// Needed, so sbt finds the projects
lazy val commonTypesJVM = commonTypesCrossProj.jvm
lazy val commonTypesJS = commonTypesCrossProj.js

lazy val jointJSCrossProj = crossProject.dependsOn(backboneJSCrossProj).
  settings(
      name := "joint-js",

      libraryDependencies ++= Seq(
          CommonDeps.scalaTest
      ),

      testFrameworks += new TestFramework("utest.runner.Framework"),
      publishArtifact in(Compile, packageDoc) := false
  ).
  jvmSettings().
  jsSettings(
      scalacOptions += "-P:scalajs:sjsDefinedByDefault",
      scalacOptions += "-P:scalajs:suppressExportDeprecations",
      libraryDependencies ++= Seq(
          CommonDepsScalaJS.scalajsDOM.value,
          CommonDepsScalaJS.scalajsJQuey.value
      )
  ) //.dependsOn().jsConfigure(x => x.dependsOn(macroJS)).jvmConfigure(x => x.dependsOn(macroJVM))

lazy val jointJSCrossJVM = jointJSCrossProj.jvm
lazy val jointJSCrossJS = jointJSCrossProj.js

lazy val macroJS = Project("macrojs", file("macrojs")).settings(
    name := "macrojs",
    libraryDependencies := Seq(("org.scala-lang" % "scala-compiler" % scalaVersion.value), ("org.scala-lang" % "scala-reflect" % scalaVersion.value))
).dependsOn(commonTypesJS).enablePlugins(ScalaJSPlugin)

lazy val macroJVM = Project("macrojvm", file("macrojvm")).settings(
    name := "macrojvm",
    libraryDependencies := Seq(("org.scala-lang" % "scala-compiler" % scalaVersion.value), ("org.scala-lang" % "scala-reflect" % scalaVersion.value))
).dependsOn(commonTypesJVM)

lazy val smartClientCrossProj = crossProject.dependsOn(commonTypesCrossProj).
  settings(
      name := "smartclient-wrapper",
      libraryDependencies ++= {
          Seq(
              CommonDeps.xmlExtender,
              CommonDeps.scalaIOExtender
          )
      },
      testFrameworks += new TestFramework("utest.runner.Framework"),
      publishArtifact in(Compile, packageDoc) := false
  ).
  jvmSettings(
      libraryDependencies ++= {
          Seq()
      }).
  jsSettings(
      scalacOptions += "-P:scalajs:sjsDefinedByDefault",
      scalacOptions += "-P:scalajs:suppressExportDeprecations",
      libraryDependencies ++= Seq(
          CommonDepsScalaJS.scalajsDOM.value,
          CommonDepsScalaJS.scalajsJQuey.value
      )
  ).dependsOn().jsConfigure(x => x.dependsOn(macroJS).enablePlugins(ScalaJSPlugin)).jvmConfigure(x => x.dependsOn(macroJVM))

// Needed, so sbt finds the projects
lazy val smartClientJVM = smartClientCrossProj.jvm
lazy val smartClientJS = smartClientCrossProj.js

lazy val testStend = crossProject.dependsOn(smartClientCrossProj).
  settings(
      name := "test-stend",
      libraryDependencies ++= {
          Seq(
          )
      },
      publishArtifact in(Compile, packageDoc) := false
  ).
  jvmSettings(
      libraryDependencies ++= {
          Seq()
      }
  ).
  jsSettings(
      scalacOptions += "-P:scalajs:suppressExportDeprecations",
      //scala.js
      crossTarget in fastOptJS := (sourceDirectory in Compile).value / "webapp" / "javascript" / "generated" / "generatedComponents",
      crossTarget in fullOptJS := (sourceDirectory in Compile).value / "webapp" / "javascript" / "generated" / "generatedComponents",
      crossTarget in packageJSDependencies := (sourceDirectory in Compile).value / "webapp" / "javascript" / "generated" / "generatedComponents",

      //coffeeScript
      CoffeeScriptKeys.sourceMap := false,
      CoffeeScriptKeys.bare := false,
      webTarget := (sourceDirectory in Compile).value / "webapp" / "javascript" / "generated" / "generatedComponents" / "coffeescript",
      sourceDirectory in Assets := (sourceDirectory in Compile).value / "webapp" / "coffeescript" / "developed" / "developedComponents",
      (managedResources in Compile) ++= CoffeeScriptKeys.csTranspile.value,

      //merger
      mergeMapping in MergeWebappConfig := Seq(
          ("com.simplesys.core", "isc-components") -> Seq(
              Seq("webapp", "javascript", "generated", "generatedComponents") -> Some(Seq("webapp", "managed", "javascript", "isc-components", "generated", "generatedComponents")),
              Seq("webapp", "javascript", "generated", "generatedComponents", "coffeescript") -> Some(Seq("webapp", "managed", "javascript", "isc-components", "generated", "generatedComponents", "coffeescript")),
              Seq("javascript", "com", "simplesys") -> Some(Seq("webapp", "managed", "javascript", "isc-components", "developed", "developedComponents")),
              Seq("coffeescript") -> Some(Seq("webapp", "managed", "coffeescript", "isc-components", "developed", "developedComponents"))
          ),
          ("com.simplesys", "smartclient-js") -> Seq(
              Seq("isomorphic") -> Some(Seq("webapp", "isomorphic"))
          )
      ),
      currentProjectGenerationDirPath in MergeWebappConfig := (sourceDirectory in Compile).value / "webapp" / "javascript" / "generated" / "generatedComponents",
      currentProjectDevelopedDirPath in MergeWebappConfig := (sourceDirectory in Compile).value / "webapp" / "javascript" / "developed",
      currentProjectCoffeeDevelopedDirPath in MergeWebappConfig := (sourceDirectory in Compile).value / "webapp" / "coffeescript" / "developed",
      merge in MergeWebappConfig ++= (merge in MergeWebappConfig).dependsOn(CoffeeScriptKeys.csTranspile in Assets).value,

      libraryDependencies ++= Seq(
          CommonDeps.ssysIscComponents,
          CommonDeps.smartclient
      )
  ).dependsOn(smartClientCrossProj).jsConfigure(x => x.dependsOn(smartClientJS).enablePlugins(MergeWebappPlugin, ScalaJSPlugin, TranspileCoffeeScript)).jvmConfigure(x => x.dependsOn(smartClientJVM))

// Needed, so sbt finds the projects
lazy val testStendJVM = testStend.jvm
lazy val testStendJS = testStend.js

lazy val underscoreJSCrossProj = crossProject.dependsOn(commonTypesCrossProj).
  settings(
      name := "underscore-js",

      libraryDependencies ++= Seq(
          CommonDeps.scalaTest
      ),

      testFrameworks += new TestFramework("utest.runner.Framework"),
      publishArtifact in(Compile, packageDoc) := false
  ).
  jvmSettings().
  jsSettings(
      scalacOptions += "-P:scalajs:suppressExportDeprecations",
      libraryDependencies ++= Seq()
  )

lazy val underscoreJSCrossJVM = underscoreJSCrossProj.jvm
lazy val underscoreJSCrossJS = underscoreJSCrossProj.js

lazy val backboneJSCrossProj = crossProject.dependsOn(underscoreJSCrossProj).
  settings(
      name := "backbone-js",

      libraryDependencies ++= Seq(),

      testFrameworks += new TestFramework("utest.runner.Framework"),
      publishArtifact in(Compile, packageDoc) := false
  ).
  jvmSettings().
  jsSettings(
      scalacOptions += "-P:scalajs:suppressExportDeprecations",
      libraryDependencies ++= Seq(
          CommonDepsScalaJS.scalajsDOM.value,
          CommonDepsScalaJS.scalajsJQuey.value
      )
  ).dependsOn().jsConfigure(x => x.dependsOn(macroJS)).jvmConfigure(x => x.dependsOn(macroJVM))

lazy val backboneJSCrossJVM = backboneJSCrossProj.jvm
lazy val backboneJSCrossJS = backboneJSCrossProj.js

logLevel := Level.Debug
