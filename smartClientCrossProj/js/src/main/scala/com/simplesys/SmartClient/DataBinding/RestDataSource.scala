package com.simplesys.SmartClient.DataBinding

import com.simplesys.System._

import scala.scalajs.js

@js.native
trait ErrorStruct extends JSObject {
    val errorMessage: JSUndefined[String]
    val stackTrace: JSUndefined[String]
    val status: JSUndefined[Int]
}


@js.native
trait ErrorStructOld extends JSObject {
    val error: JSUndefined[Error]
}

@js.native
trait ResponseData extends JSObject {
    val data: JSUndefined[ErrorStruct]
    val status: JSUndefined[Int]
}

@js.native
trait RestDataSource extends DataSource {
    val addDataURL: String
    val disableQueuing: Boolean
    val fetchDataURL: String
    val jsonRecordXPath: String
    val metaDataPrefix: String
    val prettyPrintJSON: Boolean
    val removeDataURL: String
    val sendMetaData: Boolean
    var updateDataURL: String
    val xmlRecordXPath: String
}



