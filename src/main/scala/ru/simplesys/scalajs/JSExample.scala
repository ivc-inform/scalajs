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

    //import PointSpec._
    val btn = SCButton(10 pct, 10 p, WildCard, WildCard, "Vasya Pupkin")
    println(btn.toString)
    println(btn.title)
    btn.setWidth(30 pct)
    btn.setTop(50 pct)
    btn.setRight(99 pct)
  }

  /** Computes the square of an integer.
    *  This demonstrates unit testing.
    */
  def square(x: Int): Int = x*x
}