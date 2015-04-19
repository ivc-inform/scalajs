package ru.simplesys
package smartclient
package nonvisual
package rpc

import cmntypes.SCProps

class RPCResponseProps extends SCProps {

}

case class ServerResponse[T <: RPCResponseProps](response: T)
