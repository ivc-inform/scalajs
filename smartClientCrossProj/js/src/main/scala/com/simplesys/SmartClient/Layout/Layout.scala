package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.System.AbstractClassCompanion
import com.simplesys.isc.System.Types.Alignment.Alignment
import com.simplesys.isc.System.Types.LayoutPolicy.LayoutPolicy
import com.simplesys.isc.System.Types.LocatorStrategy.LocatorStrategy
import com.simplesys.isc.System.Types.LocatorTypeStrategy.LocatorTypeStrategy
import com.simplesys.isc.System.Types.Overflow.Overflow
import com.simplesys.isc.System.Types.{MultiAutoChild, SCClassName, AutoChild}
import com.simplesys.isc.System.Types.LayoutResizeBarPolicy.LayoutResizeBarPolicy
import com.simplesys.isc.System.Types.VerticalAlignment.VerticalAlignment

import scala.scalajs.js
import scala.scalajs.js.{ThisFunction0, |}

@js.native
trait Layout extends Canvas {
    def addMember(newMember: Canvas, position: Int = js.native): Unit
    def addMembers(newMembers: Canvas | js.Array[Canvas], position: Int = js.native): Unit
    var align: VerticalAlignment | Alignment
    var animateMembers: Boolean
    var animateMemberTime: Int
    val canDropComponents: Boolean
    var defaultLayoutAlign: VerticalAlignment | Alignment
    var defaultResizeBars: LayoutResizeBarPolicy
    val dropLine: Canvas with AutoChild
    val dropLineThickness: Int
    var enforcePolicy: Boolean
    def getDropComponent(dragTarget: Canvas, dropPosition: Int): Canvas
    def getDropPosition(): Int
    def getMember(memberID: String | Canvas): Canvas
    def getMemberDefaultBreadth(member: Canvas, defaultBreadth: Int)
    def getMemberNumber(memberID: String | Canvas): Int
    def getMemberOffset(member: Canvas, defaultOffset: Int, alignment: String): Unit
    def getMembers(): js.Array[Canvas]
    def getMemberSizes(): js.Array[Int]
    def getMembersLength(): Int
    def hasMember(canvas: Canvas): Boolean
    def hideDropLine(): Unit
    def hideMember(member: Canvas, callback: js.ThisFunction0[callbackHandler, Unit] = js.native): Unit
    var hPolicy: LayoutPolicy
    var layoutBottomMargin: Int
    def layoutIsDirty(): Boolean
    var layoutLeftMargin: Int
    var layoutMargin: Int
    var layoutRightMargin: Int
    var layoutTopMargin: Int
    val leaveScrollbarGap: LocatorStrategy
    var locateMembersType: LocatorTypeStrategy
    val managePercentBreadth: Boolean
    val memberOverlap: Int
    val members: js.Array[Canvas]
    var membersChanged: js.ThisFunction0[callbackHandler, Unit]
    var membersMargin: Int
    var minMemberSize: Int
    var paddingAsLayoutMargin: Boolean
    val placeHolderDefaults: Canvas
    val placeHolderProperties: Canvas
    def reflow(reason: String = js.native): Unit
    def reflowNow(): Unit
    def removeMember(member: Canvas): Unit
    def removeMembers(members: Canvas | js.Array[Canvas]): Unit
    def reorderMember(memberNum: Int, newPosition: Int): Unit
    def reorderMembers(start: Int, end: Int, newPosition: Int): Unit
    var resizeBar: Splitbar with MultiAutoChild
    var resizeBarClass: String
    var resizeBarSize: Int
    var reverseOrder: Boolean
    def setLayoutMargin(newMargin: Int = js.native): Unit
    def setMembers(members: js.Array[Canvas]): Unit
    def setVisibleMember(member: Canvas): Unit
    var showDragPlaceHolder: Boolean
    var showDropLines: Boolean
    def showMember(member: Canvas, callback: js.ThisFunction0[callbackHandler, Unit] = js.native): Unit
    val stackZIndex: String
    var vertical: Boolean
    var vPolicy: LayoutPolicy
}

@js.native
abstract trait AbstractLayoutCompanion extends AbstractClassCompanion {
}

@js.native
object Layout extends AbstractLayoutCompanion        
