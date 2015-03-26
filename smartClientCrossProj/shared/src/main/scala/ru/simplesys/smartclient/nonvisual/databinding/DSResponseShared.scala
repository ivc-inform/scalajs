package ru.simplesys
package smartclient
package nonvisual
package databinding

import rpc.RPCResponseProps


class DSResponseProps[T] extends RPCResponseProps {
  var totalRows   = noSCProp[Int]
  var endRow      = noSCProp[Int]
  var startRow    = noSCProp[Int]
  var status      = noSCProp[Int]
  var data        = noSCProp[Seq[T]]
}