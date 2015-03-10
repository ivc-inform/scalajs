package ru.simplesys.scalajs.prickle

import ru.simplesys.smartclient.nonvisual.databinding.DSResponseProps
import utest._
import utest.ExecutionContext.RunNow

object MyTestSuite extends TestSuite {
  val tests = TestSuite {
    'testPricklePickle {
      import ru.simplesys.macrojvm.SCPropsPickler._
      import prickle._
      //import prickle.Pickler._

      val dsResp = new DSResponseProps {
        totalRows = 1000
        //var tttt = new DSResponseProps { endRow = 10 }
      }

      case class Test(xxx: Int, yyy: String)

      val dsRespTest = Test(1, "a")


      implicit val pickleConfig = new JsConfig(areSharedObjectsSupported = false)
      val str = Pickle.intoString(dsResp)
      val strTest = Pickle.intoString(dsRespTest)
      println(s"json: $str")
      println(s"json test: $strTest")
    }
//    'hello{
//      'world{
//        val x = 1
//        val y = 2
//        assert(x != y)
//        (x, y)
//      }
//    }
//    'test2{
//      val a = 1
//      val b = 2
//      assert(a == b)
//    }
  }
}