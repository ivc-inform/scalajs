package com.simplesys.backbone

import com.simplesys.macros.PropsToDictionary
import com.simplesys.props.AbstractClassProps

import scala.reflect.ClassTag

class BackboneApply[T <: Silenceable, P <: AbstractClassProps](implicit classTag_T: ClassTag[T], propsToDictionary: PropsToDictionary[P]) {
    def apply(propsClass: P): T = propsToDictionary.getDictionary(propsClass).asInstanceOf[T]
}
