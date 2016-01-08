package com.simplesys.SmartClient.Forms

import com.simplesys.SmartClient.System.Types.Criteria

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait SearchForm extends DynamicForm {
    var search:js.Function2[Criteria, SearchForm, _]
    var showFilterFieldsOnly:Boolean
}

@js.native
abstract trait AbstractSearchFormCompanion extends AbstractDynamicFormCompanion {
}

@js.native
object SearchForm extends AbstractSearchFormCompanion        
