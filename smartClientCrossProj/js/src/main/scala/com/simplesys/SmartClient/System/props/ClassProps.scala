package com.simplesys.SmartClient.System.props

import com.simplesys.SmartClient.option.{ScSome, ScNone, ScOption}

class ClassProps extends AbstractPropsClass {
    var addPropertiesOnCreate: ScOption[Boolean] = ScSome(true)
    val addPropertiesOnCreate1: ScOption[Boolean] = ScNone
    val click : ScOption[Function1[_, Boolean]] = ScNone
    val click1 = 1
}
