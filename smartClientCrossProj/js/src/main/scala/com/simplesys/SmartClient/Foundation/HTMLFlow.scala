package com.simplesys.SmartClient.Foundation

import com.simplesys.SmartClient.DataBinding.dataSource.DSCallback
import com.simplesys.SmartClient.DataBinding.{DSRequest, DataSource, DataBoundComponent}
import com.simplesys.SmartClient.Grids.listGrid.ListGridRecord
import com.simplesys.SmartClient.RPC.{RPCResponse, RPCRequest}
import com.simplesys.SmartClient.System.Types
import com.simplesys.System.Types.ContentsType.ContentsType
import com.simplesys.System.Types.SendMethod.SendMethod
import com.simplesys.System.Types._
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait HTMLFlow extends Canvas with DataBoundComponent {
    val allowCaching: Boolean
    val captureSCComponents: Boolean
    var contentLoaded: js.Function1[void, _]
    var contentsType: ContentsType
    var contentsURL: URL
    var contentsURLParams: Types.Object
    var evalScriptBlocks: Boolean
    def fetchRelatedData(record: ListGridRecord, schema: Canvas | DataSource | ID, callback: DSCallback = js.native, requestProperties: DSRequest = js.native): void
    var handleError: js.Function2[RPCRequest, RPCResponse, Boolean]
    var httpMethod: SendMethod
    def loadingContent(): Boolean
    val loadingMessage: HTMLString
    var selectContentOnSelectAll: Boolean
    def setContentsURL(url: URL = js.native, params: Types.Object = js.native): void
    var transformHTML: js.Function1[HTMLElement, _]

}

@js.native
abstract trait AbstractHTMLFlowCompanion extends AbstractCanvasCompanion {
}

@js.native
object HTMLFlow extends AbstractHTMLFlowCompanion        
