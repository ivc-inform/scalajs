package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Layout.SectionStack
import com.simplesys.isc.System.Types.void

import scala.scalajs.js
import scala.scalajs.js.{ThisFunction0, ThisFunction1}

@js.native
trait AnimationCallback extends ThisFunction1[Canvas#callbackHandler, Boolean, void]

@js.native
trait CollapseSectionCallback extends ThisFunction0[SectionStack#callbackHandler, void]

@js.native
trait ExpandSectionCallback extends ThisFunction0[SectionStack#callbackHandler, void]

@js.native
trait HideSectionCallback extends ThisFunction0[SectionStack#callbackHandler, void]

@js.native
trait ShowSectionCallback extends ThisFunction0[SectionStack#callbackHandler, void]
