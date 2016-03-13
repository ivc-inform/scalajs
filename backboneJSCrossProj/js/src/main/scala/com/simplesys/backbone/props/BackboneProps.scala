package com.simplesys.backbone.props

import com.simplesys.System._
import com.simplesys.backbone.{Collection, Model}
import com.simplesys.option.{ScNone, ScOption}
import com.simplesys.props.AbstractClassProps
import org.scalajs.jquery.JQueryXHR

import scala.scalajs.js
import scala.scalajs.js._

trait SilenceableProps extends AbstractClassProps {
    var silent: ScOption[Boolean] = ScNone
}

trait AddOptionsProps extends SilenceableProps {
    var at: ScOption[Double] = ScNone
}

trait HistoryOptionsProps extends SilenceableProps {
    var pushState: ScOption[Boolean] = ScNone
    var root: ScOption[String] = ScNone
}

trait NavigateOptionsProps extends AbstractClassProps {
    var trigger: ScOption[Boolean] = ScNone
}

trait RouterOptionsProps extends AbstractClassProps {
    var routes: ScOption[JSAny] = ScNone
}

trait ValidableProps extends AbstractClassProps {
    var validate: ScOption[Boolean] = ScNone
}

trait WaitableProps extends AbstractClassProps {
    var waitJS: ScOption[Boolean] = ScNone
}

trait ParseableProps extends AbstractClassProps {
    var parse: ScOption[JSAny] = ScNone
}

trait PersistenceOptionsProps extends AbstractClassProps {
    var url: ScOption[String] = ScNone
    var beforeSend: ScOption[Function1[JQueryXHR, _]] = ScNone
    var success: ScOption[Function3[JSAny, JSAny, JSAny, _]] = ScNone
    var error: ScOption[Function3[JSAny, JQueryXHR, JSAny, _]] = ScNone
}

trait ModelSetOptions extends SilenceableProps with ValidableProps

trait ModelFetchOptions extends PersistenceOptionsProps with ModelSetOptions with ParseableProps

trait ModelSaveOptions extends SilenceableProps with WaitableProps with ValidableProps with ParseableProps with PersistenceOptionsProps

trait ModelDestroyOptions extends WaitableProps with PersistenceOptionsProps

trait CollectionFetchOptions extends PersistenceOptionsProps with ParseableProps {
    var reset: ScOption[Boolean] = ScNone
}

trait ViewOptionsProps[TModel <: Model] extends AbstractClassProps {
    var model: ScOption[TModel] = ScNone
    var collection: ScOption[Collection[TModel]] = ScNone
    var el: ScOption[JSAny] = ScNone
    var id: ScOption[String] = ScNone
    var className: ScOption[String] = ScNone
    var tagName: ScOption[String] = ScNone
    var attributes: ScOption[JSAny] = ScNone
}


