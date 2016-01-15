package com.simplesys.json

//import com.simplesys.common.Strings._

import scala.collection.GenSeq

object Json extends {
    type funcFormatter = Any => String

    private val defaultFormatter: funcFormatter = (in: Any) => {
        in match {
            case s: String => s /*.dblQuoted*/
            case jsonObject: Map[String, Any] => jsonObject toJsonString()
            case jsonList: GenSeq[Any] => jsonList toJsonString()
            case other if other.toString.indexOf("function") > -1 => "undefined"
            case other =>
                other match {
                    case null =>
                        "null"
                    case _ =>
                        other toString
                }
        }
    }

    implicit class map2JsonString(map: Map[String, Any]) {
        def toJsonString(formatter: funcFormatter = defaultFormatter) = "{" + map.map {
            case (key, value) => "\"" + key + "\"" /*.dblQuoted*/ + ":" + formatter(value)
        }.mkString(",") + "}"
    }

    implicit class seq2JsonString(map: GenSeq[Any]) {
        def toJsonString(formatter: funcFormatter = defaultFormatter) = "[" + map.map(formatter).mkString(s",") + "]"
    }
}
