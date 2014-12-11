package ru.simplesys.scalajs
package smartclient


import ru.simplesys.macrojs._


import scala.reflect.ClassTag
import scala.scalajs.js


abstract class SCApply[T <: js.Object : ClassTag, P <: SCProps[T, T] : ToLiteralMacro](scClassNameOpt: Option[String] = None)/*(implicit ct: ClassTag[T])*/ {
  val scClassName = scClassNameOpt.getOrElse({
    val ct = implicitly[ClassTag[T]]
    ct.runtimeClass.getSimpleName
  })

  val toLiteral = implicitly[ToLiteralMacro[P]]

  def apply(props: P): T = {
    js.Dynamic.global.isc.selectDynamic(scClassName).create(toLiteral.toLiteralMacro(props)).asInstanceOf[T]
  }
}


