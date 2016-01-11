package System

import com.simplesys.SmartClient.Control.IButton
import org.scalatest.FunSuite

import scala.io.StdIn

class TestSuit extends FunSuite{
    test("className") {
//        println(com.simplesys.SmartClient.System.Class.className)
//        println(IButton.className)
    }

    test("either") {
        val in = StdIn.readLine("Type Either a string or an Int: ")
        val result: Either[String,Int] = try {
            Right(in.toInt)
          } catch {
            case e: Exception =>
              Left(in)
        }

        println( result match {
          case Right(x) => "You passed me the Int: " + x + ", which I will increment. " + x + " + 1 = " + (x+1)
          case Left(x) => "You passed me the String: " + x
        })
    }

}
