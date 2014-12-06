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

    //val btn1 = SCButton(IButtonProps("Vasya Pupkin", CanvasProps(None, None, 30 pct, 30 p)))
    //val btn2 = SCButton(IButtonProps("Vasya Pupkin2", CanvasProps(None, None, 30 pct, 30 p)))
    val mainLayout = VLayout(VLayoutProps(js.Array(SCButton(IButtonProps("Vasya Pupkin", CanvasProps(None, None, 30 pct, 30 p))), SCButton(IButtonProps("Vasya Pupkin2", CanvasProps(None, None, 30 pct, 30 p)))), CanvasProps(None, None, 100 pct, 100 pct, true)))

    //println(btn1.toString)
    //println(btn1.getTitle())
//    btn1.setWidth(30 pct)
//    btn1.setTop(50 pct)
    //btn.setRight(99 pct)
  }

}