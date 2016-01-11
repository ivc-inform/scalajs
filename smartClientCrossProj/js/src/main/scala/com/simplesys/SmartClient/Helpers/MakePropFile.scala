package com.simplesys.SmartClient.Helpers

import com.simplesys.io._

import scala.io.Codec._
import scala.io.Source
import scala.collection.JavaConversions
import scala.util.matching.Regex.Match

object MakePropFile extends App {
    val f = "/home/andrew/JOB/scalajs/smartClientCrossProj/js/src/main/resources/Fasade.rc".toFile

    val rExp = """(?:\w+)(?:\s+)(\w+)\s*(?:\:)\s*(.*)""".r("name", "type")

    Source.fromFile(f)(UTF8)getLines() foreach {
        line =>
         for (x<- rExp.findAllMatchIn(line)){
             val name = x.group("name")
             val `type` = x.group("type").replace("with AutoChild", "")

             val res = s"var $name: ScOption[${`type`}] = ScNone"

             println(res)
         }

    }
}
