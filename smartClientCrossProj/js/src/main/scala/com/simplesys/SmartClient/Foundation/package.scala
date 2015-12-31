package com.simplesys.SmartClient

import com.simplesys.SmartClient.Foundation.inst.{StatefulCanvas, Canvas}
import com.simplesys.SmartClient.Foundation.props.{StatefulCanvasProps, CanvasProps}
import com.simplesys.SmartClient.System.AbstractClass
import com.simplesys.macros.PropsToDictionary

import scala.scalajs.js

package object Foundation {

    @js.native
    object Canvas extends AbstractClass[Canvas, CanvasProps]

    @js.native
    object StatefulCanvas extends AbstractClass[StatefulCanvas, StatefulCanvasProps]

}
