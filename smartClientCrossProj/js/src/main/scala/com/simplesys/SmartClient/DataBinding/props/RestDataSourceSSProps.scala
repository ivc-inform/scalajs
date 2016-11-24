package com.simplesys.SmartClient.DataBinding.props

import com.simplesys.SmartClient.DataBinding._
import com.simplesys.SmartClient.System.{IscArray, isc}
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.System.{JSDynamic, JSUndefined}
import com.simplesys.System.Types.DSOperationType
import com.simplesys.function._
import com.simplesys.option.ScOption._

class RestDataSourceSSProps extends RestDataSourceProps {
    type classHandler <: RestDataSourceSS

    var fullClassName: ScOption[String] = ScNone
    var lobName: ScOption[String] = ScNone

    transformResponse = {
        (thiz: classHandler, resp: DSResponse, req: DSRequest, data: JSUndefined[ResponseData]) ⇒
            //isc debugTrap (resp, req, data)
            thiz.Super("transformResponse", IscArray(resp, req, data))

            //isc debugTrap (resp, req, data)

            val status: Int = {
                if (data.isDefined && data.get.status.isDefined)
                    data.get.status.get
                else if (data.isDefined && data.get.data.isDefined && data.get.data.get.status.isDefined)
                    data.get.data.get.status.get
                else
                    resp.status
            }

            if (resp.data.isDefined && resp.data.get.length == 0 && (req.operationType.get.toString == DSOperationType.add.toString || req.operationType.get.toString == DSOperationType.update.toString) && status >= 0) {
                data.foreach(resp.data.get add _.data)
            }

            if (data.isDefined && data.get.data.isDefined && status < 0) {
                //isc debugTrap data

                val errorStruct = data.get.data.get
                resp.asInstanceOf[JSDynamic].updateDynamic("errorStruct")(errorStruct)

                //isc debugTrap resp
            }

            //isc debugTrap (status)

            if (resp.errorStruct.isDefined && resp.status != status) {
                //isc debugTrap (resp)
                resp.status = status
                //isc debugTrap (resp)
            }

            resp
    }.toThisFunc.opt
}
