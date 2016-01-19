import com.simplesys.SmartClient.DataBinding.props.DataSourceProps
import com.simplesys.macros.PropsToDictionary

import scala.scalajs.js
import scala.scalajs.js.Dictionary
import scala.scalajs.js.JSConverters._;

final class QQ extends PropsToDictionary[com.simplesys.SmartClient.DataBinding.props.DataSourceProps] {

    def getDictionary(clazz: com.simplesys.SmartClient.DataBinding.props.DataSourceProps): js.Dictionary[js.Any] = {
        val res = js.Dictionary.empty[js.Any];
        //clazz.fields.foreach(((item) => res.update("fields", item.toJSArray)));
        //clazz.init.foreach(((item) => res.update("init", item)));
        //clazz.addPropertiesOnCreate.foreach(((item) => res.update("addPropertiesOnCreate", item)));
        res
    }
};

object test extends App {
    val res = js.Dictionary.empty[js.Any];
    //val a = new QQ
    //val b = a.getDictionary(new DataSourceProps)
}

