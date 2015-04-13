package ru.simplesys
package smartclient
package nonvisual
package databinding

import rpc.RPCResponseProps
import cmntypes.SCProps


trait DSResponseProps extends RPCResponseProps {
  self: DSData =>
  var totalRows   = noSCProp[Int]
  var endRow      = noSCProp[Int]
  var startRow    = noSCProp[Int]
  var status      = noSCProp[Int]
//todo... need to think about it
  //var data        = noSCProp[Seq[_]]
}


trait DSData extends SCProps


