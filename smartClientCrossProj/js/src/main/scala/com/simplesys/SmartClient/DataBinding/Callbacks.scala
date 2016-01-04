package com.simplesys.SmartClient.DataBinding

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.Layout.SectionStack

import scala.scalajs.js
import scala.scalajs.js.{ThisFunction0, ThisFunction1}

@js.native
trait AnimationCallback extends ThisFunction1[Canvas#callbackHandler, Boolean, Unit]

@js.native
trait CollapseSectionCallback extends ThisFunction0[SectionStack#callbackHandler, Unit]

@js.native
trait ExpandSectionCallback extends ThisFunction0[SectionStack#callbackHandler, Unit]

@js.native
trait HideSectionCallback extends ThisFunction0[SectionStack#callbackHandler, Unit]

@js.native
trait ShowSectionCallback extends ThisFunction0[SectionStack#callbackHandler, Unit]
