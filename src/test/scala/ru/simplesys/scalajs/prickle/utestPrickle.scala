package ru.simplesys.scalajs.prickle

import ru.simplesys.smartclient.nonvisual.databinding.{DSRequestSharedProps, DSResponseProps}
import ru.simplesys.smartclient.nonvisual.rpc.DSOperationType
import utest._
import utest.ExecutionContext.RunNow

object MyTestSuite extends TestSuite {
  val tests = TestSuite {
    'testPricklePickle {
      import ru.simplesys.macrojvm.SCPropsPickler._
      import prickle._

      implicit val pickleConfig = new JsConfig(areSharedObjectsSupported = false)

      val dsResp = new DSResponseProps {
        totalRows = 1000
        //var tttt = new DSResponseProps { endRow = 10 }
      }

      case class Test(xxx: Int, yyy: String)

      val dsRespTest = Test(1, "a")


      val str = Pickle.intoString(dsResp)
      val strTest = Pickle.intoString(dsRespTest)
      println(s"json: $str")
      println(s"json test: $strTest")
    }

    'testPrickleUnpickle {
      import ru.simplesys.macrojvm.SCPropsPickler._
      import prickle._

      implicit val pickleConfig = new JsConfig(areSharedObjectsSupported = false)

      //import ru.simplesys.smartclient.nonvisual.rpc.DSOperationType.SimpleStringEnumObjUnpickler

      //def tttt(implicit up: Unpickler[DSOperationType]): Unpickler[DSOperationType] = up
      //val found = tttt
      //val dsType = Unpickle[DSOperationType].fromString("\"fetch\"")
      //println(dsType)

      //def tttt(implicit up: Unpickler[DSRequestSharedProps]): Unpickler[DSRequestSharedProps] = up
      //val found = tttt


      val str = """{ "dataSource":"isc_RestDataSource_0", "operationType":"fetch", "startRow":0, "endRow":75, "textMatchStyle":"substring", "useStrictJSON":true, "componentId":"isc_ListGrid_0", "data":{ }, "oldValues":null }"""
      val dsReq = Unpickle[DSRequestSharedProps].fromString(str)
      println(dsReq.get)

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