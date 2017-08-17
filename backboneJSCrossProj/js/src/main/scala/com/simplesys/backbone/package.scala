package com.simplesys

import com.simplesys.backbone.props._
import org.scalajs.jquery.{JQueryAjaxSettings, JQueryStatic, JQueryXHR}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSName}

//import com.simplesys.macros.PropsToDictionary
import com.simplesys.macros.PropsToDictionary

package object backbone {

    import com.simplesys.System.{JSDynamic, JSObject}

    @js.native
    @JSGlobal("Backbone")
    object Backbone extends JSObject {
        var history: History = js.native
        def sync(method: String, model: Model, options: JQueryAjaxSettings = js.native): JSDynamic = js.native
        def ajax(options: JQueryAjaxSettings = js.native): JQueryXHR = js.native
        var emulateHTTP: Boolean = js.native
        var emulateJSON: Boolean = js.native
        var `$`: JQueryStatic = js.native
    }

    object RouterOptions extends BackboneApply[RouterOptions, RouterOptionsProps]
    object CollectionFetchOptions extends BackboneApply[CollectionFetchOptions, CollectionFetchOptionsProps]
    class ViewOptionsProxy[TModel <: Model] extends BackboneApplyProxy[ViewOptions[TModel], ViewOptionsProps[TModel]]
}
