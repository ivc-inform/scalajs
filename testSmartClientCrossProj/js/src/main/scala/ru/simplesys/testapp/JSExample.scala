package ru.simplesys
package testapp

//package example

import ru.simplesys.domains.RegisterDomains
import ru.simplesys.smartclient.nonvisual.databinding.{RestDataSourceProps, RestDataSource, DataSourceFieldProps}
import ru.simplesys.smartclient.nonvisual.rpc.RPCResponse
import ru.simplesys.smartclient.nonvisual.types.builtin._
import ru.simplesys.smartclient.visual.grids.{ListGrid, ListGridProps}
import smartclient.visual.layouts.{VLayoutProps, VLayout, HLayoutProps, HLayout}
import scala.scalajs.js
//import org.scalajs.dom
import smartclient.visual._
import ru.simplesys.macrojs._
import smartclient.ToJSLiteral
import ru.simplesys.cmntypes._

import scala.scalajs.js.Dictionary



object ScalaJSExample extends js.JSApp {
  def main(): Unit = {

    RegisterDomains.register()

    //println(RPCResponse.isc.STATUS_VALIDATION_ERROR)

    val ds = RestDataSource(new RestDataSourceProps {
      dataURL = "/data/testDS"
      fields = Right(Seq(
        new DataSourceFieldProps("testFieldString", SCTextType),
        new DataSourceFieldProps("testFieldBoolean", SCBooleanType)
      ))
    })

    val mainLayout = HLayout(new HLayoutProps {
      width = 100.pct
      height = 100.pct
      autoDraw = true
      members = Seq(VLayout(new VLayoutProps {
        width = 35.pct
        height = 100.pct
        splitterSetting = ShowSplitterResizeOther
        members = Seq(SCButton(new SCButtonProps {
          title = "Vasya Pupkin"
          width = 30.pct
          height = 30.p
        }), SCButton(new SCButtonProps {
          title = "Vasya Pupkin 2"
          width = 30.pct
          height = 30.p
        }))
      }), /*VLayout(new VLayoutProps {
        width = WildCard
        height = 100.pct
      }))*/
      ListGrid(new ListGridProps {
        dataSource = ds
        autoFetchData = true
        width = WildCard
        height = 100.pct
      }))
    })

  }

}