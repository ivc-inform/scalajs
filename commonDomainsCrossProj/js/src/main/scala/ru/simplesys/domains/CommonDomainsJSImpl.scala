package ru.simplesys
package domains

import smartclient.nonvisual.types.{SCType, SimpleType, SCTextType, SCTypeCustom}

trait SCTypeDI extends SCTypeCustom[String] {
  inheritsFrom = SCTextType
}

object RegisterDomains {
  val customDomains: Seq[DataType[_, _] with SCTypeCustom[_]] = Seq(DI)

  customDomains.foreach {d =>
    // here goes isc.SimpleType.create({})
    SimpleType(d)
  }
  //just do nothing
  def register(): Unit = {}
}