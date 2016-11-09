enablePlugins(ScalaJSPlugin)

webSettings

webInfIncludeJarPattern in Compile := Some( """.*com\.simplesys.*/*\.jar$|.*ru\.simplesys.*/*\.jar$|.*/classes/.*""")

container.deploy("/rtm-processing" -> testStend)

port in container.Configuration := 8084

addCommandAlias("debug-restart", "; fastOptJS ; packageWar ; container:restart")

//addCommandAlias("restart", "; fastOptJS ; container:restart")

//val HostingDeploy = config("hostingDeploy") extend (Compile)
//
//packageWar in HostingDeploy <<= packageWar in Compile
//
//warPostProcess in HostingDeploy <<= (target) map {
//    (target) => {
//        (x) => {
//            val webapp = target / "webapp"
//        }
//    }
//}
