enablePlugins(ScalaJSPlugin)

webSettings

webInfIncludeJarPattern in Compile := Some( """.*com\.simplesys.*/*\.jar$|.*ru\.simplesys.*/*\.jar$|.*/classes/.*""")

container.deploy("/scalajs-testStend" -> testStend)

port in container.Configuration := 8084

addCommandAlias("debug-restart", "; fastOptJS ; packageWar ; container:restart")
