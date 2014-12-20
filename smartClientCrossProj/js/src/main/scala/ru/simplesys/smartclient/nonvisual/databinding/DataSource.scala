package ru.simplesys
package smartclient
package nonvisual
package databinding

import smartclient.nonvisual.common.SCClass

trait DataSource extends SCClass {
  def dataURL: String
}
