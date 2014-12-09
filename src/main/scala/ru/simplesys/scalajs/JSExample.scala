package ru.simplesys.scalajs

//package example

import scala.scalajs.js
import js.annotation.JSExport
import org.scalajs.dom
import smartclient.visual._


object ScalaJSExample extends js.JSApp {
  def main(): Unit = {
    val paragraph = dom.document.createElement("p")
    paragraph.innerHTML = "<strong>It works!</strong>"
    dom.document.getElementById("playground").appendChild(paragraph)

    //val btn1 = SCButton(IButtonProps("Vasya Pupkin", CanvasProps(0, 0, 30 pct, 30 p)))
    //val btn2 = SCButton(IButtonProps("Vasya Pupkin2", CanvasProps(0, 0, 30 pct, 30 p)))



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


    //val mainLayoutProps = mainLayout.toSC
    //mainLayoutProps.props.foreach(println(_))
    //mainLayout.members.foreach(x => println(x.props))
    //mainLayoutProps.create

    //println(btn1.toString)
    //println(btn1.getTitle())
//    btn1.setWidth(30 pct)
//    btn1.setTop(50 pct)
    //btn.setRight(99 pct)
  }

}