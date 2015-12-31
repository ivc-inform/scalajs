package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.System.props.ClassProps

import scala.scalajs.js
import inst.Class

@js.native
abstract class AbstractClass[T <: Class, P <: ClassProps] {
    def create(): T = js.native
}

object Class extends AbstractClass[Class, ClassProps]
