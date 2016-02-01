package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Layout.SectionStack
import com.simplesys.SmartClient.RPC.{RPCRequest, RPCResponse}
import com.simplesys.System.Types.void
import com.simplesys.types.{JSDictionaryAny, JSAny}

import scala.scalajs.js
import scala.scalajs.js.{ThisFunction2, ThisFunction0, ThisFunction1}

@js.native
trait AnimationCallback extends ThisFunction1[Canvas#callbackHandler, Boolean, _]

@js.native
trait CollapseSectionCallback extends ThisFunction0[SectionStack#callbackHandler, _]

@js.native
trait ExpandSectionCallback extends ThisFunction0[SectionStack#callbackHandler, _]

@js.native
trait HideSectionCallback extends ThisFunction0[SectionStack#callbackHandler, _]

@js.native
trait ShowSectionCallback extends ThisFunction0[SectionStack#callbackHandler, _]

@js.native
trait ClientOnlyDataSourceCallback extends ThisFunction0[DataSource, _]

@js.native
trait  GetFileCallback extends ThisFunction2[DSResponse, String, DSRequest, _]

@js.native
trait  GetFileVersionCallback extends ThisFunction2[DSResponse, String, DSRequest, _]

@js.native
trait  HasFileCallback extends ThisFunction2[DSResponse, String, DSRequest, _]

@js.native
trait DSCallback extends js.Function3[DSResponse,JSDictionaryAny, DSRequest, _]

@js.native
trait RPCCallback extends js.Function3[RPCResponse,JSDictionaryAny, RPCRequest, _]
