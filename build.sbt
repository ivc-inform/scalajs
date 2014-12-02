import spray.revolver.RevolverPlugin.Revolver

//import scala.scalajs.sbtplugin.ScalaJSPlugin._
//import com.lihaoyi.workbench.Plugin._


name := "test-app"

organization := "ru.simplesys"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.4"

scalacOptions := Seq(
  "-feature",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:postfixOps",
  //"-language:existentials",
  "-deprecation",
  "-unchecked")

scalaJSSettings

ScalaJSKeys.persistLauncher := true

//ScalaJSKeys.persistLauncher in Test := false

//workbenchSettings


//bootSnippet := "ScalaJSExample().main(document.getElementById('canvas'));"

//bootSnippet := "ScalaJSExample().main()"

//updateBrowsers <<= updateBrowsers.triggeredBy(ScalaJSKeys.fastOptJS in Compile)


libraryDependencies ++= {
  val jettyVer = "9.2.3.v20140905"
  val akkaVersion = "2.3.7"
  val akkaHttpVersion = "0.11"
  val kamonVersion = "0.3.5"
  val sprayVersion = "1.3.2"
  //val scalajsVersion = "0.5.6"
  //val scalaJSVersion = "0.6"
  Seq(
    "org.scala-lang.modules.scalajs" %% "scalajs-jasmine-test-framework" % scalaJSVersion % "test",
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
    "io.spray"          %%  "spray-can"     % sprayVersion,
    "io.spray"          %%  "spray-routing" % sprayVersion,
    "io.spray"          %%  "spray-caching" % sprayVersion,
//    "com.typesafe.akka" %% "akka-http-core-experimental" % akkaHttpVersion,
    "org.scala-lang.modules" %% "scala-async" % "0.9.2",
    "com.scalarx" %% "scalarx" % "0.2.6",
    "org.scala-lang.modules.scalajs" %%% "scalajs-dom" % "0.6",
    "com.scalarx" %%% "scalarx" % "0.2.6",
    "com.simplesys" % "smartclient-js" % "10.0-v20141114",
    "org.scalatest" %% "scalatest" % "2.2.2" % "test"
  )
}

mergeWebappSettings

mergeMapping in MergeWebappConfig := Seq(
  ("com.simplesys", "smartclient-js") -> Seq(
    Seq("isomorphic") -> Some(Seq("webapp", "javascript", "isomorphic"))
  )
)

currentProjectGenerationDirPath in MergeWebappConfig <<= (sourceDirectory in Compile) {
  _ / "webapp" / "javascript" / "generated"
}


currentProjectDevelopedDirPath in MergeWebappConfig <<= (sourceDirectory in Compile) {
  _ / "webapp" / "javascript" / "developed"
}

Revolver.settings

mainClass in Revolver.reStart := Some("ru.simplesys.server.Boot")

//offline := true