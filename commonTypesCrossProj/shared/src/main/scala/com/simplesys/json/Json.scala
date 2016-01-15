package com.simplesys.json

import com.simplesys.common.Strings._

import scala.collection.GenSeq

object Json {
    type funcFormatter = Any => String

    private val defaultFormatter: funcFormatter = (in: Any) => {
        in match {
            case s: String => s.dblQuoted
            case jsonObject: Map[String, Any] => jsonObject toString (defaultFormatter)
            case jsonList: GenSeq[Any] => jsonList toString (defaultFormatter)
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
        def toString(formatter: funcFormatter) = "{" + map.map {
            case (key, value) => key.dblQuoted + ":" + formatter(value)
        }.mkString(",") + "}"
    }

    implicit class sew2JsonString(map: GenSeq[Any]) {
        def toString(formatter: funcFormatter) = "[" + map.map(formatter).mkString(s",") + "]"
    }

}
