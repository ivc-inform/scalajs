package com.simplesys.SmartClient.Forms.props

import com.simplesys.SmartClient.Forms.SearchForm
import com.simplesys.SmartClient.System.Types.Criteria
import com.simplesys.option.{ScNone, ScOption}

import scala.scalajs.js
import scala.scalajs.js._

class SearchFormProps extends DynamicFormProps {
    var search: ScOption[js.Function2[Criteria, SearchForm, _]] = ScNone
    var showFilterFieldsOnly: ScOption[Boolean] = ScNone
}
