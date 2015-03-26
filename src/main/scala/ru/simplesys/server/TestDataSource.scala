package ru.simplesys.server

import ru.simplesys.smartclient.nonvisual.databinding.{DSRequestSharedProps, DSResponseProps}

object TestDataSource {

   def getGridData( req : DSRequestSharedProps ) = {

      val start = req.startRow.get
      val end   = req.endRow.get
      val total = req.endRow.get + 2

      val returnData = ( start to end  ).toList.map( indx => SomeType( "Задача #" + indx, indx % 2 == 0 ) )

      ServerEndResponse(
        new DSResponseProps[SomeType]{
            status    = 0
            startRow  = start
            endRow    = end
            totalRows = total
            data = returnData
        }
      )

   }

}

case class ServerEndResponse[T]( response : DSResponseProps[T] )
case class SomeType( testFieldString : String, testFieldBoolean : Boolean )


