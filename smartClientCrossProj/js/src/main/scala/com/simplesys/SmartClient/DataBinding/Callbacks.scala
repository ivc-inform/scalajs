package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Layout.SectionStack
import com.simplesys.SmartClient.RPC.{RPCRequest, RPCResponse}
import com.simplesys.Types1.JSDictionaryAny

import scala.scalajs.js
import scala.scalajs.js.{ThisFunction0, ThisFunction1, ThisFunction2}

object Callbacks{
    type AnimationCallback = ThisFunction1[Canvas#callbackHandler, Boolean, _]
    
    type CollapseSectionCallback = ThisFunction0[SectionStack#callbackHandler, _]
    
    type ExpandSectionCallback = ThisFunction0[SectionStack#callbackHandler, _]
    
    type HideSectionCallback = ThisFunction0[SectionStack#callbackHandler, _]
    
    type ShowSectionCallback = ThisFunction0[SectionStack#callbackHandler, _]
    
    type ClientOnlyDataSourceCallback = ThisFunction0[DataSource, _]
    
    type  GetFileCallback = ThisFunction2[DSResponse, String, DSRequest, _]
    
    type  GetFileVersionCallback = ThisFunction2[DSResponse, String, DSRequest, _]
    
    type  HasFileCallback = ThisFunction2[DSResponse, String, DSRequest, _]
    
    type DSCallback = js.Function3[DSResponse,JSDictionaryAny, DSRequest, _]
    
    type RPCCallback = js.Function3[RPCResponse,JSDictionaryAny, RPCRequest, _]
}


