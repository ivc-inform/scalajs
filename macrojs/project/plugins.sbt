
//addSbtPlugin("org.scala-lang.modules.scalajs" % "scalajs-sbt-plugin" % "0.5.6")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.0-M2")


scalacOptions := Seq(
  "-feature",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:postfixOps",
//  "-language:existentials",
  "-deprecation",
  "-unchecked")
