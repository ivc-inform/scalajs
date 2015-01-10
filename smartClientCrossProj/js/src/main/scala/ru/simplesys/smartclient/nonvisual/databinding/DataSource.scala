package ru.simplesys
package smartclient
package nonvisual
package databinding

import cmntypes._
import smartclient.nonvisual.common.SCClass

import scala.scalajs.js

trait DataSource extends SCClass {
  def dataURL: String = js.native
  def fields: js.Array[DataSourceField[_]] = js.native
}

trait DataSourceProps extends SCProps {
  var dataURL = noSCProp[String]
  var fields = noSCProp[Seq[DataSourceField[_]]]
}

