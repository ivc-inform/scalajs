package com.simplesys.SmartClient.Control

import com.simplesys.SmartClient.Control.menu.MenuItem
import com.simplesys.System.Types.{ID, void}
import com.simplesys.types.JSAny

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait MenuSS extends Menu {
    def addItem(item: MenuItem, pos: Int): void
    def addItems(items: Seq[MenuItem], pos: Int): void
    def addItemProperties(identifier:ID, properties: MenuSS): void
    def removeItem(item: MenuItem): void
    def removeItems(items: Seq[MenuItem]): void
    def filter4Visiblity(items: Seq[MenuItem]): void
    def replaceItems(oldItems: Seq[MenuItem], newItems: Seq[MenuItem]): void
    def setData(data: JSAny):void
    val owner: Menu
    def setOwner(owner: Menu): void
}

