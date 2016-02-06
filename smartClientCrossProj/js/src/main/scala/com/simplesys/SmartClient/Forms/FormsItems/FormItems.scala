package com.simplesys.SmartClient.Forms.FormsItems

import scala.language.implicitConversions

object FormItems extends Enumeration {
    type FormItems = Value
    val ComboBoxItem, SelectItem, AutoFitTextAreaItem, BlurbItem, BooleanItem, ButtonItem, CancelItem, CheckboxItem, ColorItem, ColorPickerItem, DateItem, DateRangeItem, DateTimeItem, DoubleItem, IntegerItem, IPickTreeItem, LinkItem, MiniDateRangeItem, MultiComboBoxItem, MultiFileItem, NativeCheckboxItem, PasswordItem, RadioGroupItem, RelationItem, SelectOtherItem, SpinnerItem, ToolbarItem, SubmitItem, TextItem, RichTextItem, StaticTextItem, TextAreaItem, RelativeDateItem, PresetDateRangeItem = Value
}
