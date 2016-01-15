package com.simplesys.json

import com.simplesys.common.Strings._

import scala.collection.GenSeq

object Json {
    type funcFormatter = Any => String

    private val defaultFormatter: funcFormatter = (in: Any) => {
        in match {
            case s: String => s.dblQuoted
            case jsonObject: Map[String, Any] => jsonObject toJsonString (defaultFormatter)
            case jsonList: GenSeq[Any] => jsonList toJsonString (defaultFormatter)
            case function: Function0[_] => "$function0$"
            case function: Function1[_, _] => "$function1$"
            case function: Function2[_, _, _] => "$function2$"
            case function: Function3[_, _, _, _] => "$function3$"
            case function: Function4[_, _, _, _, _] => "$function4$"
            case function: Function5[_, _, _, _, _, _] => "$function5$"
            case function: Function6[_, _, _, _, _, _, _] => "$function6$"
            case function: Function7[_, _, _, _, _, _, _, _] => "$function7$"
            case function: Function8[_, _, _, _, _, _, _, _, _] => "$function8$"
            case function: Function9[_, _, _, _, _, _, _, _, _, _] => "$function9$"
            case function: Function10[_, _, _, _, _, _, _, _, _, _, _] => "$function10$"
            case function: Function11[_, _, _, _, _, _, _, _, _, _, _, _] => "$function11$"
            case function: Function12[_, _, _, _, _, _, _, _, _, _, _, _, _] => "$function12$"
            case function: Function13[_, _, _, _, _, _, _, _, _, _, _, _, _, _] => "$function13$"
            case function: Function14[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _] => "$function14$"
            case function: Function15[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _] => "$function15$"
            case function: Function16[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _] => "$function16$"
            case function: Function17[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _] => "$function17$"
            case function: Function18[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _] => "$function18$"
            case function: Function19[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _] => "$function19$"
            case function: Function20[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _] => "$function20$"
            case function: Function21[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _] => "$function21$"
            case function: Function22[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _] => "$function22$"
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
        def toJsonString(formatter: funcFormatter) = "{" + map.map {
            case (key, value) => key.dblQuoted + ":" + formatter(value)
        }.mkString(",") + "}"
    }

    implicit class seq2JsonString(map: GenSeq[Any]) {
        def toJsonString(formatter: funcFormatter) = "[" + map.map(formatter).mkString(s",") + "]"
    }

}
