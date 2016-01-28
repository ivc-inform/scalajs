package com.simplesys.SmartClient.DataBinding.props.dataSource

import com.simplesys.option.{ScOption, ScNone}

class DataSourceSSFieldProps extends DataSourceFieldProps {
    var foreignField: ScOption[String] = ScNone
    var lookup: ScOption[Boolean] = ScNone
    var captionClassLookup: ScOption[String] = ScNone
}
