package ru.simplesys.scalajs

//package example

import smartclient.visual.layouts.{VLayoutProps, VLayout, HLayoutProps, HLayout}

import scala.scalajs.js
import org.scalajs.dom
import smartclient.visual._
import ru.simplesys.macrojs._
import smartclient.ToJSLiteral

import scala.scalajs.js.Dictionary


object ScalaJSExample extends js.JSApp {
  def main(): Unit = {
    val paragraph = dom.document.createElement("p")
    paragraph.innerHTML = "<strong>It works!</strong>"
    dom.document.getElementById("playground").appendChild(paragraph)

    //val btn1 = SCButton(IButtonProps("Vasya Pupkin", CanvasProps(0, 0, 30 pct, 30 p)))
    //val btn2 = SCButton(IButtonProps("Vasya Pupkin2", CanvasProps(0, 0, 30 pct, 30 p)))

//    val props: Dictionary[js.Any] = new VLayoutProps[VLayout] {
//      width = (35 pct)
//      height = (100 pct)
//      splitterSetting = ShowSplitterResizeOther
//      members = Seq(SCButton(new SCButtonProps[SCButton] {
//        title = "Vasya Pupkin"
//        width = (30 pct)
//        height = (30 p)
//      }), SCButton(new SCButtonProps[SCButton] {
//        {
//          title = "Vasya Pupkin 2"
//          width = (30 pct)
//          height = (30 p)
//        }
//      }))
//    }.toJSLiteral
//
//    //props.foreach {case}
//
//    for (prop <- js.Object.keys(props)) {
//       val value = props(prop)
//      println(prop + " -> " + value)
//    }


    val mainLayout = HLayout(new HLayoutProps[HLayout] {
      width = 100.pct
      height = 100.pct
      autoDraw = true
      members = Seq(VLayout(new VLayoutProps[VLayout] {
        width = 35.pct
        height = 100.pct
        splitterSetting = ShowSplitterResizeOther
        members = Seq(SCButton(new SCButtonProps[SCButton] {
          title = "Vasya Pupkin"
          width = 30.pct
          height = 30.p
        }), SCButton(new SCButtonProps[SCButton] {
          {
            title = "Vasya Pupkin 2"
            width = 30.pct
            height = 30.p
          }
        }))
      }), VLayout(new VLayoutProps[VLayout] {
        width = WildCard
        height = 100.pct
      }))
    })


/*

    val mainLayout = HLayout(HLayoutProps(
      js.Array(
        VLayout(VLayoutProps(members = js.Array(
          SCButton(SCButtonProps("Vasya Pupkin", 30 pct, 30 p))/*.create*/,
          SCButton(SCButtonProps("Vasya Pupkin2", 30 pct, 30 p))/*.create*/),
        CanvasProps(width = 35 pct, height = 100 pct, splitterSetting = ShowSplitterResizeOther)
        )),
        VLayout(VLayoutProps(members = js.Array(), CanvasProps(width = WildCard, height = 100 pct, splitterSetting = NoSplitter)))
      ),
      CanvasProps(0, 0, 100 pct, 100 pct, NoSplitter, true)))
*/
  }

}