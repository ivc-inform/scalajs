package com.simplesys.System.Types

import language.implicitConversions

object ValidatorType extends Enumeration {
    type ValidatorType = Value
    val isBoolean, isString, isInteger, isFloat, isFunction, requiredIf, matchesField, isOneOf, integerRange, lengthRange, contains, doesntContain, substringCount, regexp, mask, dateRange, floatLimit, floatRange, floatPrecision,
    required, readOnly, visibility, enable, isUnique, hasRelatedRecord, custom, serverCustom = Value
}
