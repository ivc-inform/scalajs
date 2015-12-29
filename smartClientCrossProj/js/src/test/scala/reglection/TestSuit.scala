package reglection

import com.simplesys.SmartClient.System.props.ClassProps
import org.scalatest.FunSuite

import scala.reflect.runtime.{universe => ru}


class TestSuit extends FunSuite{
    test("1") {
        val tpeAbstractPropsClass = ru.weakTypeOf[ClassProps]
        println(tpeAbstractPropsClass)
    }
}
