package com.simplesys.System.Types

import scala.language.implicitConversions

object FormItemType extends Enumeration {
    type FormItemType = Value
    val text, boolean, integer, float, date, time, enum, sequence, link, image, imageFile, binary = Value
}

object FormItemComponentType extends Enumeration {
    type FormItemComponentType = Value
    val AutoFitTextAreaItem,
    BlurbItem,
    BooleanItem,
    ButtonItem,
    CancelItem,
    CanvasItem,
    CheckboxItem,
    ColorItem,
    ColorPickerItem,
    ComboBoxItem,
    CycleItem,
    DataPathItem,
    DateItem,
    DateRangeItem,
    DateTimeItem,
    DoubleItem,
    FileItem,
    FloatItem,
    FormItem,
    HeaderItem,
    HiddenItem,
    IntegerItem,
    IPickTreeItem,
    LinkItem,
    MiniDateRangeItem,
    MultiComboBoxItem,
    MultiFileItem,
    NativeCheckboxItem,
    PasswordItem,
    PickList,
    PickListMenu,
    PickTreeItem,
    PresetCriteriaItem,
    PresetDateRangeItem,
    RadioGroupItem,
    RelationItem,
    RelativeDateItem,
    ResetItem,
    RichTextItem,
    RowSpacerItem,
    ScrollingMenu,
    SectionItem,
    SelectItem,
    SelectOtherItem,
    SliderItem,
    SpacerItem,
    SpinnerItem,
    StaticTextItem,
    SubmitItem,
    TextAreaItem,
    TextItem,
    TimeItem,
    ToolbarItem,
    UploadItem,
    ViewFileItem = Value
}
