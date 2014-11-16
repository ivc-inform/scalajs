name := "test-app"

organization := "ru.simplesys"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.4"

scalacOptions := Seq(
  "-feature",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-language:existentials",
  "-deprecation",
  "-unchecked")


scalaJSSettings

libraryDependencies ++= {
  val jettyVer = "9.2.3.v20140905"
  val akkaVersion = "2.3.7"
  val akkaHttpVersion = "0.11"
  val kamonVersion = "0.3.5"
  //val scalaJSVersion = "0.6"
  Seq(
    "org.scala-lang.modules.scalajs" %%% "scalajs-dom" % "0.6",
    "org.scala-lang.modules.scalajs" %% "scalajs-jasmine-test-framework" % scalaJSVersion % "test",
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
    "com.typesafe.akka" %% "akka-http-core-experimental" % akkaHttpVersion,
    "com.scalarx" %% "scalarx" % "0.2.6",
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
