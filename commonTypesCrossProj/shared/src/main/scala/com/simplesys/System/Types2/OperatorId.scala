package com.simplesys.System.Types2

import scala.language.implicitConversions

object OperatorId extends Enumeration {
    type OperatorId = Value
    val equals, notEqual, iEquals, iNotEqual, greaterThan, lessThan, greaterOrEqual, lessOrEqual, contains, startsWith, endsWith, iContains, iStartsWith, iEndsWith, notContains, notStartsWith, notEndsWith, iNotContains, iNotStartsWith,
    iNotEndsWith, iBetweenInclusive, matchesPattern, iMatchesPattern, containsPattern, startsWithPattern, endsWithPattern, iContainsPattern, iStartsWithPattern, iEndsWithPattern, regexp, iregexp, isNull, notNull, inSet, notInSet, equalsField,
    notEqualField, iEqualsField, iNotEqualField, greaterThanField, lessThanField, greaterOrEqualField, lessOrEqualField, containsField, startsWithField, endsWithField, iContainsField, iStartsWithField, iEndsWithField, notContainsField,
    notStartsWithField, notEndsWithField, iNotContainsField, iNotStartsWithFieldiNotEndsWithField, and, or, not, between, betweenInclusive = Value
}
