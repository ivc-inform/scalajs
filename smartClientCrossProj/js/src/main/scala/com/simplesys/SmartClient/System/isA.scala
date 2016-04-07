package com.simplesys.SmartClient.System

import com.simplesys.System.JSObject

import scala.scalajs.js

@js.native
trait isAStatic extends JSObject {
    def JSArray(`object`: JSObject): Boolean
    def Boolean(`object`: JSObject): Boolean
    def ClassObject(`object`: JSObject): Boolean
    def Date(`object`: JSObject): Boolean
    def emptyArray(`object`: JSObject): Boolean
    def emptyObject(`object`: JSObject): Boolean
    def emptyString(`object`: JSObject): Boolean
    def Function1(`object`: JSObject): Boolean
    def Instance(`object`: JSObject): Boolean
    def Interface(`object`: JSObject): Boolean
    def List(`object`: JSObject): Boolean
    def nonemptyString(`object`: JSObject): Boolean
    def Int(`object`: JSObject): Boolean
    def Object(`object`: JSObject): Boolean
    def RegularExpression(`object`: JSObject): Boolean
    def String(`object`: JSObject): Boolean
}
