package com.simplesys.props

import com.simplesys.macros.PropsToDictionary

class AbstractClassProps extends Dict[AbstractClassProps]

class Dict[P <: AbstractClassProps](implicit propsToDictionary: PropsToDictionary[P]) {
    def create(propsClass: P) = propsToDictionary.getDictionary(propsClass)
}
