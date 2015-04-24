package ru.simplesys.server

import akka.actor.ActorSystem
import akka.event.Logging
import akka.http.Http
import akka.stream.ActorFlowMaterializer
import com.typesafe.config.ConfigFactory



object AkkaHttpMicroservice extends App with HttpService {
  override implicit val system = ActorSystem()
  override implicit val executor = system.dispatcher
  override implicit val materializer = ActorFlowMaterializer()

  override val config = ConfigFactory.load()
  override val logger = Logging(system, getClass)

  Http().bindAndHandle(routes, config.getString("http.interface"), config.getInt("http.port"))
}
