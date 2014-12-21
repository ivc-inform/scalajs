package ru.simplesys
package domains



//isc.SimpleType.create({
//name:"zipCodeUS",
//inheritsFrom:"text",
//validators:[
//{type:"regexp", expression:"^\\d{5}(-\\d{4})?$",
//errorMessage:"Zip Codes should be in the format ##### or #####-####."}
//]
//});

import smartclient.nonvisual.types.SCTypeCustom

trait DataType[S, JS] {
  self: SCTypeCustom[JS] =>
}

trait DataTypeUni[T] extends DataType[T, T] {
  self: SCTypeCustom[T] =>
}

trait DataTypeConv[S, JS] {
  self: SCTypeCustom[JS] =>
  def toJS: S => JS
  def fromJS: JS => S
}
