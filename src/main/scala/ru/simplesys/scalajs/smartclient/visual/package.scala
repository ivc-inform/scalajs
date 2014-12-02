package ru.simplesys.scalajs
package smartclient

package object visual {
  implicit class ToPointSpec(i: Int) {
    def p = PixelPointSpec(i)
    // % doesnt work. Why?
    def pct = PctPointSpec(i)
  }
}
