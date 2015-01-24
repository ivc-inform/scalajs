package ru.simplesys
package smartclient
package nonvisual
package databinding

import macrojs._

import cmntypes._
import smartclient.nonvisual.common.SCClass

import scala.scalajs.js

sealed trait DataFormat {
  def asString: String
}

object DataFormat {
  @inline implicit def dataFormatToJS(df: DataFormat): js.Any = df.asString

  case object IscServer extends DataFormat {
    override def asString: String = "iscServer"
  }

  case object Xml extends DataFormat {
    override def asString: String = "xml"
  }

  case object JSon extends DataFormat {
    override def asString: String = "json"
  }

  case object Custom extends DataFormat {
    override def asString: String = "custom"
  }

  val formatMap: Map[String, DataFormat] = Seq(IscServer, Xml, JSon, Custom).map(x => (x.asString, x))(collection.breakOut)
}



class DataSource extends SCClass {
  def dataURL: String = js.native
  def fields: js.Array[DataSourceField[_]] = js.native
  protected def dataFormat: String = js.native
}


class DataSourceProps extends SCProps {
  var dataURL = noSCProp[String]
  //here could be DataSourceField too
  var fields = noSCProp[Either[Seq[DataSourceField[_]], Seq[DataSourceFieldProps[_]]]]
  var dataFormat: SCPropOpt[DataFormat] = DataFormat.JSon
}

object DataSource extends SCApply[DataSource, DataSourceProps] {
    implicit class ToDataSourceExt(ds: DataSource) {
    @inline def dataFormat: DataFormat = DataFormat.formatMap(ds.dataFormat)
  }
}


