package com.simplesys

import org.scalajs.jquery.{JQueryStatic, JQueryXHR, JQueryAjaxSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

package object backbone {

    import com.simplesys.System.{JSDynamic, JSObject}

    @js.native
    @JSName("Backbone")
    object Backbone extends JSObject {
        var history: History = js.native
        def sync(method: String, model: Model, options: JQueryAjaxSettings = js.native): JSDynamic = js.native
        def ajax(options: JQueryAjaxSettings = js.native): JQueryXHR = js.native
        var emulateHTTP: Boolean = js.native
        var emulateJSON: Boolean = js.native
        var `$`: JQueryStatic = js.native
    }
}
