package com.simplesys.SmartClient.Foundation.props

import com.simplesys.SmartClient.DataBinding.props.DataBoundComponentProps
import com.simplesys.SmartClient.RPC.{RPCRequest, RPCResponse}
import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types.ContentsType.ContentsType
import com.simplesys.System.Types.{void, URL, HTMLString}
import com.simplesys.System.Types.SendMethod.SendMethod
import com.simplesys.option.{ScOption, ScNone}
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js._

class HTMLFlowProps extends CanvasProps with DataBoundComponentProps{
    var allowCaching: ScOption[Boolean] = ScNone
    var captureSCComponents: ScOption[Boolean] = ScNone
    var contentLoaded: ScOption[js.Function1[void, _]] = ScNone
    var contentsType: ScOption[ContentsType] = ScNone
    var contentsURL: ScOption[URL] = ScNone
    var contentsURLParams: ScOption[Types.Object] = ScNone
    var evalScriptBlocks: ScOption[Boolean] = ScNone
    var handleError: ScOption[js.Function2[RPCRequest, RPCResponse, Boolean]] = ScNone
    var httpMethod: ScOption[SendMethod] = ScNone
    var loadingMessage: ScOption[HTMLString] = ScNone
    var selectContentOnSelectAll: ScOption[Boolean] = ScNone
    var transformHTML: ScOption[js.Function1[HTMLElement, _]] = ScNone
}
