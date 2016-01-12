package System

import com.simplesys.SmartClient.Control.IButton
import com.simplesys.SmartClient.option.{Type1, Type2, DoubleType}
import org.scalatest.FunSuite

import scala.io.StdIn

class TestSuit extends FunSuite {
    test("className") {
        //        println(com.simplesys.SmartClient.System.Class.className)
        //        println(IButton.className)
    }

    test("either") {
        val in = StdIn.readLine("Type DoubleType a string or an Int: ")
        val result: DoubleType[String, Int] = try {
            Type2(in.toInt)
        } catch {
            case e: Exception =>
                Type1(in)
        }

        println(result match {
            case Type2(x) => "You passed me the Int: " + x + ", which I will increment. " + x + " + 1 = " + (x + 1)
            case Type1(x) => "You passed me the String: " + x
        })
    }

}
