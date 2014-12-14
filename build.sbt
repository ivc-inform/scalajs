import sbt.Keys._
import spray.revolver.RevolverPlugin.Revolver


scalaVersion := "2.11.4"

scalacOptions := Seq(
  "-feature",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:postfixOps",
  //"-Xlog-implicits",
  //"-language:existentials",
  "-deprecation",
  "-unchecked")

lazy val root = Project("scalajs", file(".")) dependsOn(smartClientJVM)

lazy val macroSub = Project("macrojs", file("macrojs")) settings(
  libraryDependencies <+= scalaVersion("org.scala-lang" % "scala-compiler" % _)//,
  //scalaVersion <<= scalaVersion
  )

lazy val smartClientCrossProj = crossProject.
  settings(
    name := "smartclient-wrapper",
    organization := "ru.simplesys",
    version := "1.0.0-SNAPSHOT",
    scalaVersion := "2.11.4",
    scalacOptions := Seq(
      "-feature",
      "-language:higherKinds",
      "-language:implicitConversions",
      "-language:postfixOps",
      //"-Xlog-implicits",
      //"-language:existentials",
      "-deprecation",
      "-unchecked"),
    libraryDependencies ++= {
      Seq(
        "org.scala-lang.modules" %% "scala-async" % "0.9.2",
        "com.scalarx" %% "scalarx" % "0.2.7-M1",
        "com.scalarx" %%% "scalarx" % "0.2.7-M1"
      )
    }
  ).
  jvmSettings(Seq(
  libraryDependencies ++= {
    Seq(
        "org.scalatest" %% "scalatest" % "2.2.2" % "test"
      )
    }):_*
  ).
  jsSettings(mergeWebappSettings ++ Seq(
    scalacOptions += "-Xlog-implicits",
    persistLauncher := true,
    mergeMapping in MergeWebappConfig := Seq(
      ("com.simplesys", "smartclient-js") -> Seq(
        Seq("isomorphic") -> Some(Seq("webapp", "javascript", "isomorphic"))
      )
      ),
    currentProjectGenerationDirPath in MergeWebappConfig <<= (sourceDirectory in Compile) {
      _ / "webapp" / "javascript" / "generated"
    },
    currentProjectDevelopedDirPath in MergeWebappConfig <<= (sourceDirectory in Compile) {
      _ / "webapp" / "javascript" / "developed"
    },

      libraryDependencies ++= {
      Seq(
        "org.scala-js" %%% "scalajs-dom" % "0.7.0",
        "com.simplesys" % "smartclient-js" % "10.0-v20141114"
      )
    }
    //jsDependencies += "org.example" %% "js-thing" % "0.1" / "foo.js"
    ):_*
  ).jsConfigure(x => x.dependsOn(macroSub))

// Needed, so sbt finds the projects
lazy val smartClientJVM = smartClientCrossProj.jvm
lazy val smartClientJS = smartClientCrossProj.js

//lazy val p2 = crossProject.crossType(CrossType.Full).dependsOn(p1 % "smartclient-wrapper")

// Needed, so sbt finds the projects
//lazy val p2JVM = p2.jvm
//lazy val p2JS = p2.js


libraryDependencies ++= {
//  val jettyVer = "9.2.3.v20140905"
  val akkaVersion = "2.3.7"
  val akkaHttpVersion = "0.11"
  val kamonVersion = "0.3.5"
  val sprayVersion = "1.3.2"
  //val scalajsVersion = "0.5.6"
  //val scalaJSVersion = "0.6"
  Seq(
//    "org.scala-lang.modules.scalajs" %% "scalajs-jasmine-test-framework" % scalaJSVersion % "test",
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
    "io.spray"          %%  "spray-can"     % sprayVersion,
    "io.spray"          %%  "spray-routing" % sprayVersion//,
    //"io.spray"          %%  "spray-caching" % sprayVersion
  )
}

Revolver.settings

mainClass in Revolver.reStart := Some("ru.simplesys.server.Boot")

