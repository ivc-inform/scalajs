package com.simplesys.SmartClient.Tools

import com.simplesys.SmartClient.DataBinding.Callbacks.PaletteNodeCallback
import com.simplesys.SmartClient.Grids.treeGrid.Tree
import com.simplesys.SmartClient.System.Class
import com.simplesys.System.Types.HoopSelectionStyle.HoopSelectionStyle
import com.simplesys.System.Types.SelectedAppearance.SelectedAppearance
import com.simplesys.System.Types.SelectionType.SelectionType
import com.simplesys.System.Types.{CSSColor, HTMLString, void}
import com.simplesys.System.{JSArray, JSFunction, JSObject}
import org.scalajs.dom.html.Canvas

import scala.scalajs.js

@js.native
trait EditContext extends Class {
    def addFromPaletteNode(paletteNode: PaletteNode, parentNode: EditNode = js.native): EditNode
    def addFromPaletteNodes(paletteNodes: JSArray[PaletteNode], parentNode: EditNode = js.native): JSArray[EditNode]
    def addNode(newNode: EditNode, parentNode: EditNode = js.native, index: Int = js.native, parentProperty: String = js.native, skipParentComponentAdd: Boolean): EditNode
    def addPaletteNodesFromJS(jsCode: String, parentNode: EditNode = js.native, globals: JSArray[String] = js.native): void
    def addPaletteNodesFromJSON(jsonString: String, parentNode: EditNode = js.native, globals: JSArray[String] = js.native, callback: JSFunction = js.native): void
    def addPaletteNodesFromXML(xmlString: String, parentNode: EditNode = js.native, globals: JSArray[String] = js.native, callback: JSFunction = js.native): void
    val allowNestedDrops: Boolean
    var autoEditNewNodes: Boolean
    val canDragGroup: Boolean
    val canGroupSelect: Boolean
    val canSelectEditNodes: Boolean
    var defaultPalette: Palette
    var defaultParent: EditNode
    def deselectAllEditNodes(): void
    def deselectEditNodes(editNodes: JSArray[EditNode]): void
    def destroyAll(): void
    def editMaskClicked(editNode: EditNode, liveObject: JSObject): void
    val editMaskProperties: JSObject
    var editNodeUpdated: js.Function3[EditNode, EditContext, JSArray[String], _]
    def enableEditing(editNode: EditNode): void
    val enableInlineEdit: Boolean
    var extraPalettes: JSArray[Palette]
    def getDefaultPalette(): Palette
    def getEditNodeTree(): Tree
    def getPaletteNodesFromJS(jsCode: String, callback: PaletteNodeCallback, globals: JSArray[String] = js.native): void
    def getPaletteNodesFromXML(xmlStrong: String, callback: PaletteNodeCallback): void
    def getRootEditNode(): EditNode
    def getSelectedEditNode(): EditNode
    def getSelectedEditNodes(): JSArray[EditNode]
    def getSelectedLabelText(component: JSObject): HTMLString
    val hideGroupBorderOnDrag: Boolean
    val hoopSelectionMode: HoopSelectionStyle
    val hoopSelectorProperties: JSObject
    def isEditNodeSelected(): Boolean
    def isNodeEditingOn(editNode: EditNode): Boolean
    def makeEditNode(paletteNode: PaletteNode): EditNode
    def nodeAdded(newNode: EditNode, parentNode: EditNode, rootNode: EditNode): void
    var persistCoordinates: Boolean
    def removeAll(): void
    def removeNodeProperties(editNode: EditNode, properties: JSArray[String]): void
    val rootComponent: PaletteNode
    def selectAllEditNodes(): void
    val selectedAppearance: SelectedAppearance
    val selectedBorder: String
    def selectedEditNodesUpdated(editNode: EditNode, editNodeList: JSArray[EditNode]): void
    def selectEditNode(editNode: EditNode): void
    val selectedLabelBackgroundColor: String
    val selectedTintColor: CSSColor
    val selectedTintOpacity: Int
    //var selectionType: SelectionType //todo  сделать анотацию @JSPropsName
    def selectSingleEditNode(editNode: EditNode): void
    def serializeAllEditNodes(settings: SerializationSettings = js.native): String
    def serializeAllEditNodesAsJSON(settings: SerializationSettings = js.native): String
    def serializeEditNodes(nodes: JSArray[EditNode], settings: SerializationSettings = js.native): String
    def serializeEditNodesAsJSON(nodes: JSArray[EditNode], settings: SerializationSettings = js.native): String
    def setDefaultPalette(palette: Palette): void
    def setEditProxyProperties(editNode: EditNode, properties: EditProxy): void
    def setNodeProperties(editNode: EditNode, properties: Canvas, skipLiveObjectUpdate: Boolean = js.native): void
    val showSelectedLabel: Boolean
    val showSelectedLabelOnSelect: Boolean
}
