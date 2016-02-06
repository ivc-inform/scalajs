package com.simplesys.SmartClient.DataBinding.dataSource

import com.simplesys.SmartClient.System.Types
import com.simplesys.SmartClient.System.Types.VelocityExpression
import com.simplesys.System.Types2.URL

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Mail extends Types.Object {
    val bcc: String
    val cc: String
    val contentType: String
    val encoding: String
    val from: String
    val messageData: VelocityExpression
    val messageTemplate: String
    val multiple: String
    val replyTo: String
    val subject: String
    val templateFile: URL
    val to : String
}


