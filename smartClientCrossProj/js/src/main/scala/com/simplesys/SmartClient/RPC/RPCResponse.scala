package com.simplesys.SmartClient.RPC

import com.simplesys.SmartClient.System.{Types, AbstractClassCompanion, Class}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait RPCResponse extends Class {
    val clientContext: Types.Object
    val data: String | Types.Object
    val httpHeaders: Types.Object
    val httpResponseCode: Int
    val httpResponseText: String
    val status: Int
    val transactionNum: Int
}

@js.native
abstract trait AbstractRPCResponseCompanion extends AbstractClassCompanion {
    def create(): Unit = js.native

    val STATUS_CONNECTION_RESET_ERROR: Int = js.native
    //-92

    val STATUS_FAILURE: Int = js.native
    //-1

    val STATUS_LOGIN_INCORRECT: Int = js.native
    //-5

    val STATUS_LOGIN_REQUIRED: Int = js.native
    //-7

    val STATUS_LOGIN_SUCCESS: Int = js.native
    //-8

    val STATUS_MAX_FILE_SIZE_EXCEEDED: Int = js.native
    //-11

    val STATUS_MAX_LOGIN_ATTEMPTS_EXCEEDED: Int = js.native
    //-6

    val STATUS_MAX_POST_SIZE_EXCEEDED: Int = js.native
    //-12

    val STATUS_OFFLINE: Int = js.native
    //-12

    val STATUS_SERVER_TIMEOUT: Int = js.native
    //-100

    val STATUS_SUCCESS: Int = js.native
    // 0

    val STATUS_TRANSACTION_FAILED: Int = js.native
    // -10

    val STATUS_TRANSPORT_ERROR: Int = js.native
    // -90

    val STATUS_UNKNOWN_HOST_ERROR: Int = js.native
    // -91

    val STATUS_UPDATE_WITHOUT_PK_ERROR: Int = js.native
    // -9

    val STATUS_VALIDATION_ERROR: Int = js.native // -4
}

@js.native
object RPCResponse extends AbstractRPCResponseCompanion        
