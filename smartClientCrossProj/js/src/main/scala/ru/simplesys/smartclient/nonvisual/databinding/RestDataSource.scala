package ru.simplesys
package smartclient
package nonvisual
package databinding

import macrojs._

import cmntypes._
import smartclient.nonvisual.common.SCClass

import scala.scalajs.js

trait RestDataSource extends DataSource {

}

class RestDataSourceProps extends DataSourceProps

object RestDataSource extends SCApply[RestDataSource, RestDataSourceProps]
