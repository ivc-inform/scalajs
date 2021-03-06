package com.simplesys.backbone

import com.simplesys.macros.PropsToDictionary
import com.simplesys.props.AbstractClassProps

import scala.reflect.ClassTag

class BackboneApply[T <: BackboneObject, P <: AbstractClassProps](implicit classTag_T: ClassTag[T], propsToDictionary: PropsToDictionary[P]) {
    def apply(propsClass: P): T = propsToDictionary.getDictionary(propsClass).asInstanceOf[T]
}

class BackboneApplyProxy[T <: BackboneObject, P <: AbstractClassProps](implicit classTag_T: ClassTag[T], propsToDictionary: PropsToDictionary[P]) {
    def set(propsClass: P): T = propsToDictionary.getDictionary(propsClass).asInstanceOf[T]
}

