package ru.simplesys.scalajs

import shapeless._
import utest._
import utest.ExecutionContext.RunNow

//import org.scalatest.{Matchers, FunSuite}

trait One
trait Two extends One
trait Three extends Two

class OneProps {
  type X <: One
  var t: Function1[X, Boolean] = ???
}

class TwoProps extends OneProps {
  type X <: Two
  val r: (X) => Boolean = t
}

class ThreeProps extends TwoProps {
  type X <: Three
}


//class TestTry extends FunSuite with Matchers {
//   test("simple test") {
//     val x = new ThreeProps()
//   }
//}

case class TestCaseClass(a: Int, b: String)

object MyTestSuiteSCJVM extends TestSuite {
  val tests = TestSuite {
    'testShapeless {
      val genTestCaseClass = Generic[TestCaseClass]
      println(genTestCaseClass)
    }
  }
}
