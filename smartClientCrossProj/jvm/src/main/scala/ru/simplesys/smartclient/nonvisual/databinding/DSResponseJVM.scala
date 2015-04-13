package ru.simplesys
package smartclient
package nonvisual
package databinding

trait DSUntyped extends DSData {
  var data = noSCProp[Map[String, upickle.Js.Value]]
}
