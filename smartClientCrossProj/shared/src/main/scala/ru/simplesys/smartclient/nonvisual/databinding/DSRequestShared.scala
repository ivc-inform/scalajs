package ru.simplesys
package smartclient
package nonvisual
package databinding

import rpc._

//import rpc.RPCRe

trait DSRequestSharedProps extends RPCRequestSharedProps {
  var componentId = noSCProp[String]

  // usually autopopulated
  var dataSource = noSCProp[String]
  // usually autopopulated
  var operationType = noSCProp[DSOperationType]

  var startRow = noSCProp[Int]
  var endRow = noSCProp[Int]

  var streamResults = noSCProp[Boolean]
}