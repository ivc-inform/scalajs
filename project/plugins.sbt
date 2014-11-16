addSbtPlugin("org.scala-lang.modules.scalajs" % "scalajs-sbt-plugin" % "0.5.5")

addSbtPlugin("io.spray" % "sbt-revolver" % "0.7.2")

//addSbtPlugin("com.lihaoyi" % "workbench" % "0.2.3")

addSbtPlugin("ru.simplesys" % "merge-js" % "1.0.0-SNAPSHOT")

//addSbtPlugin("com.earldouglas" % "xsbt-web-plugin" % "0.9.0")

//addSbtPlugin("com.earldouglas" % "xsbt-web-plugin" % "1.0.0-M7")

//addSbtPlugin("com.typesafe.sbt" % "sbt-aspectj" % "0.10.0")


scalacOptions := Seq(
  "-feature",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-language:existentials",
  "-deprecation",
  "-unchecked")