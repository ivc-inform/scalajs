package reglection

import com.simplesys.SmartClient.Foundation.props.CanvasProps
import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.SmartClient.option.ScOption._
import com.simplesys.SmartClient.option.{ScOption, ScSome}
import com.simplesys.common.Strings._
import com.simplesys.log.Logging
import com.simplesys.macros.PropsToMap
import org.scalatest.FunSuite

import scala.reflect.runtime.{universe => ru}
import scala.scalajs.js


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

        import scala.collection.mutable

        val a = new PropsToMap[CanvasProps] with Logging {
            def getMap(props: CanvasProps) = {
                val res = mutable.HashMap.empty[String, Any]
                println(props.addPropertiesOnCreate.isEmpty);
                println(false);
                props.addPropertiesOnCreate.foreach(((v) => res.update("addPropertiesOnCreate", v)))
                props.animateAcceleration.foreach(((v) => res.update("addPropertiesOnCreate", v)))
                res.toMap
            }

            def getDictionary(props: CanvasProps): js.Dictionary[js.Any] = {
                val res = js.Dictionary.empty[js.Any]
                props.children.foreach(((item) => res.update("children", item)));
                res
            }
        }

        println(s"Size map: ${
            a.getMap(new CanvasProps {
                override val addPropertiesOnCreate: ScOption[Boolean] = true
            }).size
        }")

        println(s"Size dict: ${
            a.getDictionary(new CanvasProps {
                override val addPropertiesOnCreate: ScOption[Boolean] = true
            }).size
        }")
    }
}


