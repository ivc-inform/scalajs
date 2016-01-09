package com.simplesys.SmartClient.Grids.listGrid

import com.simplesys.SmartClient.Control.ImgButton
import com.simplesys.SmartClient.Forms.{DynamicForm, FilterClause}
import com.simplesys.SmartClient.Foundation.Label
import com.simplesys.SmartClient.Grids.listGrid.Hilite.Hilite
import com.simplesys.SmartClient.Layout.{AbstractHLayoutCompanion, HLayout}
import com.simplesys.isc.System.Types.{void, AutoChild}

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait HiliteRule extends HLayout {
    val advancedClauseEditButton: ImgButton with AutoChild
    val advancedClauseLabel: Label with AutoChild
    val backgroundColorTitle: String
    val clause: FilterClause with AutoChild
    val colorFieldTitle: String
    val foregroundColorTitle: String
    def getHilite(): Hilite
    val hiliteForm: DynamicForm with AutoChild
    val iconFieldTitle: String
    def remove(): void
    val removeButton: ImgButton with AutoChild
    val removeButtonPrompt: String
    val showRemoveButton: Boolean
}

@js.native
abstract trait AbstractHiliteRuleCompanion extends AbstractHLayoutCompanion {
}

@js.native
object HiliteRule extends AbstractHiliteRuleCompanion        
