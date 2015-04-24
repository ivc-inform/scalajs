package ru.simplesys.server

import ru.simplesys.json
import ru.simplesys.smartclient.nonvisual.databinding._
import ru.simplesys.smartclient.nonvisual.rpc.ServerResponse

object TestDataSource {

   def getGridData(req: DSRequestSharedProps) = {

      val start = req.startRow.get
      val end   = req.endRow.get
      val total = req.endRow.get + 2

      val returnData: List[SomeType] = ( start to end  ).toList.map( indx => SomeType( "Задача #" + indx, indx % 2 == 0 ) )

      val ret = new DSResponseTypedProps[SomeType] {
            status    = 0
            startRow  = start
            endRow    = end
            totalRows = total
            data = returnData
        }
     ServerResponse(ret)
   }

}

case class SomeType( testFieldString : String, testFieldBoolean : Boolean )


object testSome {

}