package ru.simplesys
package smartclient
package nonvisual
package databinding

import rpc.RPCResponseProps


class DSResponseProps extends RPCResponseProps {
  var totalRows = noSCProp[Int]
  var endRow = noSCProp[Int]

  //var test = noSCProp[Seq[String]]

}