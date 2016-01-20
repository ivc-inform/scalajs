import com.simplesys.SmartClient.DataBinding.props.DataSourceProps
import com.simplesys.SmartClient.DataBinding.props.dataSource.DataSourceFieldProps
import com.simplesys.macros.PropsToDictionary
import com.simplesys.option.ScSome

import scala.scalajs.js
import scala.scalajs.js.Dictionary
import scala.scalajs.js.JSConverters._;



object test extends App {
    val clazz = ScSome(Seq(new DataSourceFieldProps))
    val res = js.Dictionary.empty[js.Any];
    clazz.foreach(item => res.update("key", item.toJSArray))
}

