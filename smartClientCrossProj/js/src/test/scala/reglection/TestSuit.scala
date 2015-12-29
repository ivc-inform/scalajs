package reglection

import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.SmartClient.option.ScOption._
import com.simplesys.SmartClient.option.{ScNone, ScOption, ScSome}
import com.simplesys.common.Strings._
import com.simplesys.macros.PropsToMap
import org.scalatest.FunSuite

import scala.reflect.runtime.{universe => ru}


class TestSuit extends FunSuite {
    test("1") {
        import ru._

        val cls = new ClassProps {
            override val addPropertiesOnCreate: ScOption[Boolean] = false
        }

        val tpeAbstractPropsClass = weakTypeOf[cls.type]
        val tsScOption = typeOf[ScOption[_]].typeSymbol
        val tsScSome = typeOf[ScSome[_]].typeSymbol
        val tsUnit = typeOf[Unit].typeSymbol

        val fields = tpeAbstractPropsClass.members.collect { case field if field.isPublic &&
          field.isMethod &&
          !field.asMethod.isConstructor &&
          (field.asMethod.returnType.typeSymbol == tsScOption || field.asMethod.returnType.typeSymbol == tsScSome) &&
          field.asTerm.isGetter
        => field
        }

        println(s"$newLine// Class: $tpeAbstractPropsClass ///////////////////////////////////////////////////////////////".newLine)

        println("//////////////////////////////////////////////// Fields: ///////////////////////////////////////////////////////////////")
        fields.foreach {
            field =>
                val f = field
                val typeSymbol = f.asMethod.returnType.typeSymbol
                val typeParams = f.asMethod.returnType.typeArgs
                val typeParams1 = f.asTerm.isVal
                val typeParams2 = f.asTerm.isVar
                f.
                println(s"field.name ${field.name.toString}, typeSymbol: $typeSymbol. typeParams: $typeParams")
        }
        println("//////////////////////////////////////////////// End Fields: ///////////////////////////////////////////////////////////".newLine)

        val (fAbstractPropsClass, fSimple) = fields.map { field =>
            field.typeSignature.baseType(typeOf[ScOption[_]].typeSymbol) match {
                case TypeRef(_, _, tArg) => (field, tArg.head, true)
                case NoType => (field, field.typeSignature, false)
            }
        }.partition { case (f, t, p) => p }
    }

    test("2") {
        import collection.immutable.HashMap

        new PropsToMap[ClassProps] {
            def getMap(t: ClassProps): Map[String, Any] = {
                val res = HashMap.empty[String, Any]
                res.updated("", 1)
                t.addPropertiesOnCreate.foreach(((_) => res.updated("addPropertiesOnCreate", _)))
                res
            }
        }
    }
}


