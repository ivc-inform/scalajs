package reglection

import com.simplesys.SmartClient.System.props.ClassProps
import com.simplesys.SmartClient.option.{ScNone, ScOption, ScSome}
import com.simplesys.common.Strings._
import org.scalatest.FunSuite

import scala.reflect.runtime.{universe => ru}


class TestSuit extends FunSuite {
    test("1") {
        import ru._

        val cls = new ClassProps {
            override val addPropertiesOnCreate = ScSome(false)
             val addPropertiesOnCreate1 = ScNone
        }

        val tpeAbstractPropsClass = weakTypeOf[cls.type]
        val tsScOption = typeOf[ScOption[_]].typeSymbol
        val tsScSome = typeOf[ScSome[_]].typeSymbol
        val tsUnit = typeOf[Unit].typeSymbol

        val fields = tpeAbstractPropsClass.members.collect { case field if field.isPublic &&
          field.isMethod &&
          //!field.asMethod.isSetter &&
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
    }
}
