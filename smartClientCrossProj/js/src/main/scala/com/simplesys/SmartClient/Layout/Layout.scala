package com.simplesys.SmartClient.Layout

import com.simplesys.SmartClient.Foundation.Canvas
import com.simplesys.SmartClient.System.AbstractClassCompanion
import com.simplesys.System.Types.Alignment.Alignment
import com.simplesys.System.Types.LayoutPolicy.LayoutPolicy
import com.simplesys.System.Types.LayoutResizeBarPolicy.LayoutResizeBarPolicy
import com.simplesys.System.Types.LocatorStrategy.LocatorStrategy
import com.simplesys.System.Types.LocatorTypeStrategy.LocatorTypeStrategy
import com.simplesys.System.Types.VerticalAlignment.VerticalAlignment
import com.simplesys.System.Types.{AutoChild, MultiAutoChild, void}
import com.simplesys.System.JSArray

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Layout extends Canvas {
    def addMember(newMember: Canvas | String, position: Int = js.native): void
    def addMembers(newMembers: JSArray[Canvas | String], position: Int = js.native): void
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
    def getMemberOffset(member: Canvas, defaultOffset: Int, alignment: String): void
    def getMembers(): JSArray[Canvas]
    def getMemberSizes(): JSArray[Int]
    def getMembersLength(): Int
    def hasMember(canvas: Canvas): Boolean
    def hideDropLine(): void
    def hideMember(member: Canvas, callback: js.ThisFunction0[callbackHandler, void] = js.native): void
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
    val members: JSArray[Canvas | String]
    var membersChanged: js.ThisFunction0[callbackHandler, void]
    var membersMargin: Int
    var minMemberSize: Int
    var paddingAsLayoutMargin: Boolean
    val placeHolderDefaults: Canvas
    val placeHolderProperties: Canvas
    def reflow(reason: String = js.native): void
    def reflowNow(): void
    def removeMember(member: Canvas): void
    def removeMembers(members: Canvas | JSArray[Canvas]): void
    def reorderMember(memberNum: Int, newPosition: Int): void
    def reorderMembers(start: Int, end: Int, newPosition: Int): void
    var resizeBar: Splitbar with MultiAutoChild
    var resizeBarClass: String
    var resizeBarSize: Int
    var reverseOrder: Boolean
    def setLayoutMargin(newMargin: Int = js.native): void
    def setMembers(members: JSArray[Canvas]): void
    def setVisibleMember(member: Canvas): void
    var showDragPlaceHolder: Boolean
    var showDropLines: Boolean
    def showMember(member: Canvas, callback: js.ThisFunction0[callbackHandler, void] = js.native): void
    val stackZIndex: String
    var vertical: Boolean
    var vPolicy: LayoutPolicy
}

@js.native
abstract trait AbstractLayoutCompanion extends AbstractClassCompanion {
}

@js.native
object Layout extends AbstractLayoutCompanion

