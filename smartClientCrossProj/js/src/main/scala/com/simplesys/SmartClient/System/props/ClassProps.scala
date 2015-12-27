package com.simplesys.SmartClient.System.props

import com.simplesys.SmartClient.option.{ScSome, ScNone, ScOption}

class ClassProps extends AbstractPropsClass {
    var addPropertiesOnCreate: ScOption[Boolean] = ScSome(true)
}
