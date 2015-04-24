package ru.simplesys.server

import java.io.IOException

import akka.actor.ActorSystem
import akka.event.LoggingAdapter
import akka.http.Http
import akka.http.client.RequestBuilding
import akka.http.marshalling.ToResponseMarshallable
import akka.http.model.StatusCodes._
import akka.http.model.{HttpResponse, HttpRequest}
import akka.http.server.Directives._
import akka.http.server.PathMatchers.Segment
import akka.http.unmarshalling.Unmarshal
import akka.stream.FlowMaterializer
import akka.stream.scaladsl.{Sink, Source, Flow}
import com.typesafe.config.Config
import ru.simplesys.smartclient.nonvisual.databinding.DSRequestSharedProps

import scala.concurrent.{Future, ExecutionContextExecutor}

trait HttpService /*extends Protocols*/ {
  implicit val system: ActorSystem
  implicit def executor: ExecutionContextExecutor
  implicit val materializer: FlowMaterializer

  def config: Config
  val logger: LoggingAdapter

//  lazy val telizeConnectionFlow: Flow[HttpRequest, HttpResponse, Any] =
//    Http().outgoingConnection(config.getString("services.telizeHost"), config.getInt("services.telizePort"))
//
//  def telizeRequest(request: HttpRequest): Future[HttpResponse] = Source.single(request).via(telizeConnectionFlow).runWith(Sink.head)
//
//  def fetchIpInfo(ip: String): Future[Either[String, IpInfo]] = {
//    telizeRequest(RequestBuilding.Get(s"/geoip/$ip")).flatMap { response =>
//      response.status match {
//        case OK => Unmarshal(response.entity).to[IpInfo].map(Right(_))
//        case BadRequest => Future.successful(Left(s"$ip: incorrect IP format"))
//        case _ => Unmarshal(response.entity).to[String].flatMap { entity =>
//          val error = s"Telize request failed with status code ${response.status} and entity $entity"
//          logger.error(error)
//          Future.failed(new IOException(error))
//        }
//      }
//    }
//  }

  val routes = {
    logRequestResult("akka-http-microservice") {
      get {
          path("index-dev.html") {
            getFromFile("src/main/webapp/index-dev.html")
          } ~
          path("ping") {
            complete("PONG!")
          } ~
          pathPrefix("javascript") {
            getFromDirectory("src/main/webapp/javascript/")
          } ~
          pathPrefix("scalajs") {
            getFromDirectory("testSmartClientCrossProj/js/target/scala-2.11/")
          } ~
          path("crash") { ctx =>
            sys.error("crash boom bang")
          } ~
          path("fail") {
            failWith(new RuntimeException("aaaahhh"))
          }
      } ~
        post {
          pathPrefix("data") {
            path("testDS") {
              entity(as[String]) { postBody =>


                import prickle._
                import ru.simplesys.smartclient.macrojvm.SCPropsPickler._

                implicit val pickleConfig = new JsConfig(areSharedObjectsSupported = false)

                val dsReqTry = Unpickle[DSRequestSharedProps].fromString(postBody)

                dsReqTry match {
                  case scala.util.Success(dsReq) =>
                    //val r = dsReq
                    val dsReqToStr = Pickle.intoString(dsReq)
                    println(dsReqToStr)

                    val resp =  TestDataSource.getGridData(dsReq)
                    val str = Pickle.intoString(resp)
                    complete(str)
                  case scala.util.Failure(other) =>
                    failWith(other)
                }
                //complete("ouououou!")

              }
            }
          }
        }

//      pathPrefix("ip") {
//        (get & path(Segment)) { ip =>
//          complete {
//            fetchIpInfo(ip).map[ToResponseMarshallable] {
//              case Right(ipInfo) => ipInfo
//              case Left(errorMessage) => BadRequest -> errorMessage
//            }
//          }
//        } ~
//          (post & entity(as[IpPairSummaryRequest])) { ipPairSummaryRequest =>
//            complete {
//              val ip1InfoFuture = fetchIpInfo(ipPairSummaryRequest.ip1)
//              val ip2InfoFuture = fetchIpInfo(ipPairSummaryRequest.ip2)
//              ip1InfoFuture.zip(ip2InfoFuture).map[ToResponseMarshallable] {
//                case (Right(info1), Right(info2)) => IpPairSummary(info1, info2)
//                case (Left(errorMessage), _) => BadRequest -> errorMessage
//                case (_, Left(errorMessage)) => BadRequest -> errorMessage
//              }
//            }
//          }
//      }
    }
  }
}