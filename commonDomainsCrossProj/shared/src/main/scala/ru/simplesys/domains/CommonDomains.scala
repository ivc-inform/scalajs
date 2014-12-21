package ru.simplesys
package domains



case object DI extends DataType[BigDecimal, String] with SCTypeDI {
  def name = "ssDI"
}
