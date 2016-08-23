package com.simplesys.SmartClient.DataBinding.props

import com.simplesys.SmartClient.DataBinding._
import com.simplesys.SmartClient.RPC.{RPCManagerSS, RPCResponseStatic}
import com.simplesys.SmartClient.System.isc
import com.simplesys.System.Types.void
import com.simplesys.System._
import com.simplesys.function._
import com.simplesys.option.ScOption._
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js
import scala.scalajs.js.Function1
import scala.scalajs.js.UndefOr._

class RestDataSourceProps extends DataSourceProps {
    type classHandler <: RestDataSource

    var addDataURL: ScOption[String] = ScNone
    var disableQueuing: ScOption[Boolean] = ScNone
    var fetchDataURL: ScOption[String] = ScNone
    var jsonRecordXPath: ScOption[String] = ScNone
    var metaDataPrefix: ScOption[String] = ScNone
    var prettyPrintJSON: ScOption[Boolean] = ScNone
    var removeDataURL: ScOption[String] = ScNone
    var sendMetaData: ScOption[Boolean] = ScNone
    var transformRequest: ScOption[js.Function1[void, _]] = ScNone
    var updateDataURL: ScOption[String] = ScNone
    var xmlRecordXPath: ScOption[String] = ScNone

    var getError: ScOption[Function1[JSObject, ErrorStruct]] = {
        (data: JSObject) ⇒
            if (isc.isA.Object(data)) {
                val _data = data.asInstanceOf[ResponseData].data.toOption match {
                    case None ⇒
                        data
                    case Some(data) ⇒
                        data
                }
                _data.asInstanceOf[ErrorStruct]
            } else {
                new ErrorStruct {
                    override val stackTrace: JSUndefined[String] = jSUndefined
                    override val errorMessage: JSUndefined[String] = jSUndefined
                    override val status: JSUndefined[Int] = RPCResponseStatic.STATUS_SUCCESS
                }
            }

    }.toFunc.opt

    transformResponse = {
        (thiz: classHandler, resp: DSResponse, req: DSRequest, data: JSObject) ⇒

            val errorStruct = thiz.getError(data)

            if (errorStruct.status.getOrElse(RPCResponseStatic.STATUS_SUCCESS) == RPCResponseStatic.STATUS_LOGIN_REQUIRED) {
                RPCManagerSS.loginRequired(
                    {
                        (res: Boolean, captionUser: JSUndefined[String], codeGroup: JSUndefined[String]) =>
                            if (!res)
                                isc error "Ayтентификация не прошла (( !"
                    }
                )
                resp.asInstanceOf[JSDynamic].updateDynamic("errorStruct")(new ErrorStruct {
                    override val stackTrace: JSUndefined[String] = errorStruct.stackTrace
                    override val errorMessage: JSUndefined[String] = errorStruct.errorMessage
                    override val status: JSUndefined[Int] = errorStruct.status
                })
            }
            else {
                val error = any2undefOrA(errorStruct.asInstanceOf[JSDynamic].response.data.error)
                val _status = any2undefOrA(errorStruct.asInstanceOf[JSDynamic].response.status)

                resp.asInstanceOf[JSDynamic].updateDynamic("errorStruct")(new ErrorStruct {
                    override val stackTrace: JSUndefined[String] = error.map(_.stackTrace.asInstanceOf[String])
                    override val errorMessage: JSUndefined[String] = error.map(_.message.asInstanceOf[String])
                    override val status: JSUndefined[Int] = _status.asInstanceOf[Int]
                })

            }

            resp
    }.toThisFunc.opt
}
