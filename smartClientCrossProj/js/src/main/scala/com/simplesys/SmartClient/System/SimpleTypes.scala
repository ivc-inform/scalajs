package com.simplesys.SmartClient.System

import com.simplesys.SmartClient.DataBinding.props.SimpleTypeProps
import com.simplesys.System.Types.OperatorId

object SimpleTypes {
    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "boolean"
        name = "bBoolean_SimpleType"
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "textArea"
        name = "clob_SimpleType"
        validOperators = Seq(
            OperatorId.contains,
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.iContains,
            OperatorId.startsWith,
            OperatorId.inSet,
            OperatorId.iNotEqual,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.notNull,
            OperatorId.endsWith,
            OperatorId.endsWith,
            OperatorId.iStartsWith,
            OperatorId.iEquals
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "date"
        name = "dDate_SimpleType"
        validOperators = Seq(
            OperatorId.contains,
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.notStartsWith,
            OperatorId.lessOrEqual,
            OperatorId.notEndsWith,
            OperatorId.containsPattern,
            OperatorId.equalsField,
            OperatorId.greaterOrEqual,
            OperatorId.startsWith,
            OperatorId.greaterOrEqualField,
            OperatorId.lessOrEqualField,
            OperatorId.notContains,
            OperatorId.inSet,
            OperatorId.lessThan,
            OperatorId.greaterThanField,
            OperatorId.notEqualField,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.lessThanField,
            OperatorId.notNull,
            OperatorId.matchesPattern,
            OperatorId.endsWith,
            OperatorId.regexp,
            OperatorId.between,
            OperatorId.betweenInclusive,
            OperatorId.greaterThan
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "datetime"
        name = "dDateOptTime_SimpleType"
        validOperators = Seq(
            OperatorId.contains,
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.notStartsWith,
            OperatorId.lessOrEqual,
            OperatorId.notEndsWith,
            OperatorId.containsPattern,
            OperatorId.equalsField,
            OperatorId.greaterOrEqual,
            OperatorId.startsWith,
            OperatorId.greaterOrEqualField,
            OperatorId.lessOrEqualField,
            OperatorId.notContains,
            OperatorId.inSet,
            OperatorId.lessThan,
            OperatorId.greaterThanField,
            OperatorId.notEqualField,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.lessThanField,
            OperatorId.notNull,
            OperatorId.matchesPattern,
            OperatorId.endsWith,
            OperatorId.regexp,
            OperatorId.between,
            OperatorId.betweenInclusive,
            OperatorId.greaterThan
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "datetime"
        name = "dDateTime_SimpleType"
        validOperators = Seq(
            OperatorId.contains,
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.notStartsWith,
            OperatorId.lessOrEqual,
            OperatorId.notEndsWith,
            OperatorId.containsPattern,
            OperatorId.equalsField,
            OperatorId.greaterOrEqual,
            OperatorId.startsWith,
            OperatorId.greaterOrEqualField,
            OperatorId.lessOrEqualField,
            OperatorId.notContains,
            OperatorId.inSet,
            OperatorId.lessThan,
            OperatorId.greaterThanField,
            OperatorId.notEqualField,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.lessThanField,
            OperatorId.notNull,
            OperatorId.matchesPattern,
            OperatorId.endsWith,
            OperatorId.regexp,
            OperatorId.between,
            OperatorId.betweenInclusive,
            OperatorId.greaterThan
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "datetime"
        name = "dTimestamp_SimpleType"
        validOperators = Seq(
            OperatorId.contains,
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.notStartsWith,
            OperatorId.lessOrEqual,
            OperatorId.notEndsWith,
            OperatorId.containsPattern,
            OperatorId.equalsField,
            OperatorId.greaterOrEqual,
            OperatorId.startsWith,
            OperatorId.greaterOrEqualField,
            OperatorId.lessOrEqualField,
            OperatorId.notContains,
            OperatorId.inSet,
            OperatorId.lessThan,
            OperatorId.greaterThanField,
            OperatorId.notEqualField,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.lessThanField,
            OperatorId.notNull,
            OperatorId.matchesPattern,
            OperatorId.endsWith,
            OperatorId.regexp,
            OperatorId.between,
            OperatorId.betweenInclusive,
            OperatorId.greaterThan
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "datetime"
        name = "dTimestampWithTZ_SimpleType"
        validOperators = Seq(
            OperatorId.contains,
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.notStartsWith,
            OperatorId.lessOrEqual,
            OperatorId.notEndsWith,
            OperatorId.containsPattern,
            OperatorId.equalsField,
            OperatorId.greaterOrEqual,
            OperatorId.startsWith,
            OperatorId.greaterOrEqualField,
            OperatorId.lessOrEqualField,
            OperatorId.notContains,
            OperatorId.inSet,
            OperatorId.lessThan,
            OperatorId.greaterThanField,
            OperatorId.notEqualField,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.lessThanField,
            OperatorId.notNull,
            OperatorId.matchesPattern,
            OperatorId.endsWith,
            OperatorId.regexp,
            OperatorId.between,
            OperatorId.betweenInclusive,
            OperatorId.greaterThan
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "float"
        name = "di_SimpleType"
        validOperators = Seq(
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.equalsField,
            OperatorId.inSet,
            OperatorId.notEqualField,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.notNull
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "float"
        name = "fDouble_SimpleType"
        validOperators = Seq(
            OperatorId.contains,
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.notStartsWith,
            OperatorId.lessOrEqual,
            OperatorId.notEndsWith,
            OperatorId.containsPattern,
            OperatorId.equalsField,
            OperatorId.greaterOrEqual,
            OperatorId.startsWith,
            OperatorId.greaterOrEqualField,
            OperatorId.lessOrEqualField,
            OperatorId.notContains,
            OperatorId.inSet,
            OperatorId.lessThan,
            OperatorId.greaterThanField,
            OperatorId.notEqualField,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.lessThanField,
            OperatorId.notNull,
            OperatorId.matchesPattern,
            OperatorId.endsWith,
            OperatorId.regexp,
            OperatorId.between,
            OperatorId.betweenInclusive,
            OperatorId.greaterThan
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "float"
        name = "fPrice_SimpleType"
        validOperators = Seq(
            OperatorId.contains,
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.notStartsWith,
            OperatorId.lessOrEqual,
            OperatorId.notEndsWith,
            OperatorId.containsPattern,
            OperatorId.equalsField,
            OperatorId.greaterOrEqual,
            OperatorId.startsWith,
            OperatorId.greaterOrEqualField,
            OperatorId.lessOrEqualField,
            OperatorId.notContains,
            OperatorId.inSet,
            OperatorId.lessThan,
            OperatorId.greaterThanField,
            OperatorId.notEqualField,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.lessThanField,
            OperatorId.notNull,
            OperatorId.matchesPattern,
            OperatorId.endsWith,
            OperatorId.regexp,
            OperatorId.between,
            OperatorId.betweenInclusive,
            OperatorId.greaterThan
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "float"
        name = "fSum_SimpleType"
        validOperators = Seq(
            OperatorId.contains,
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.notStartsWith,
            OperatorId.lessOrEqual,
            OperatorId.notEndsWith,
            OperatorId.containsPattern,
            OperatorId.equalsField,
            OperatorId.greaterOrEqual,
            OperatorId.startsWith,
            OperatorId.greaterOrEqualField,
            OperatorId.lessOrEqualField,
            OperatorId.notContains,
            OperatorId.inSet,
            OperatorId.lessThan,
            OperatorId.greaterThanField,
            OperatorId.notEqualField,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.lessThanField,
            OperatorId.notNull,
            OperatorId.matchesPattern,
            OperatorId.endsWith,
            OperatorId.regexp,
            OperatorId.between,
            OperatorId.betweenInclusive,
            OperatorId.greaterThan
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "integer"
        name = "id_SimpleType"
        validOperators = Seq(
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.equalsField,
            OperatorId.inSet,
            OperatorId.notEqualField,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.notNull
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "integer"
        name = "nInt_SimpleType"
        validOperators = Seq(
            OperatorId.contains,
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.notStartsWith,
            OperatorId.lessOrEqual,
            OperatorId.notEndsWith,
            OperatorId.containsPattern,
            OperatorId.equalsField,
            OperatorId.greaterOrEqual,
            OperatorId.startsWith,
            OperatorId.greaterOrEqualField,
            OperatorId.lessOrEqualField,
            OperatorId.notContains,
            OperatorId.inSet,
            OperatorId.lessThan,
            OperatorId.greaterThanField,
            OperatorId.notEqualField,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.lessThanField,
            OperatorId.notNull,
            OperatorId.matchesPattern,
            OperatorId.endsWith,
            OperatorId.regexp,
            OperatorId.between,
            OperatorId.betweenInclusive,
            OperatorId.greaterThan
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "text"
        name = "sAddress_SimpleType"
        validOperators = Seq(
            OperatorId.contains,
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.iContains,
            OperatorId.startsWith,
            OperatorId.inSet,
            OperatorId.iNotEqual,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.notNull,
            OperatorId.endsWith,
            OperatorId.endsWith,
            OperatorId.iStartsWith,
            OperatorId.iEquals
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "text"
        name = "sBarCode_SimpleType"
        validOperators = Seq(
            OperatorId.contains,
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.iContains,
            OperatorId.startsWith,
            OperatorId.inSet,
            OperatorId.iNotEqual,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.notNull,
            OperatorId.endsWith,
            OperatorId.endsWith,
            OperatorId.iStartsWith,
            OperatorId.iEquals
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "text"
        name = "sCaption_SimpleType"
        validOperators = Seq(
            OperatorId.contains,
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.iContains,
            OperatorId.startsWith,
            OperatorId.inSet,
            OperatorId.iNotEqual,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.notNull,
            OperatorId.endsWith,
            OperatorId.endsWith,
            OperatorId.iStartsWith,
            OperatorId.iEquals
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "text"
        name = "sCode_SimpleType"
        validOperators = Seq(
            OperatorId.contains,
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.iContains,
            OperatorId.startsWith,
            OperatorId.inSet,
            OperatorId.iNotEqual,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.notNull,
            OperatorId.endsWith,
            OperatorId.endsWith,
            OperatorId.iStartsWith,
            OperatorId.iEquals
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "textArea"
        name = "sDescription_SimpleType"
        validOperators = Seq(
            OperatorId.contains,
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.iContains,
            OperatorId.startsWith,
            OperatorId.inSet,
            OperatorId.iNotEqual,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.notNull,
            OperatorId.endsWith,
            OperatorId.endsWith,
            OperatorId.iStartsWith,
            OperatorId.iEquals
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "text"
        name = "sEMail_SimpleType"
        validOperators = Seq(
            OperatorId.contains,
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.iContains,
            OperatorId.startsWith,
            OperatorId.inSet,
            OperatorId.iNotEqual,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.notNull,
            OperatorId.endsWith,
            OperatorId.endsWith,
            OperatorId.iStartsWith,
            OperatorId.iEquals
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "password"
        name = "sPasswordHashSHA_SimpleType"
        validOperators = Seq(
            OperatorId.contains,
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.iContains,
            OperatorId.startsWith,
            OperatorId.inSet,
            OperatorId.iNotEqual,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.notNull,
            OperatorId.endsWith,
            OperatorId.endsWith,
            OperatorId.iStartsWith,
            OperatorId.iEquals
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "password"
        name = "sPasswordPlain_SimpleType"
        validOperators = Seq(
            OperatorId.contains,
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.iContains,
            OperatorId.startsWith,
            OperatorId.inSet,
            OperatorId.iNotEqual,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.notNull,
            OperatorId.endsWith,
            OperatorId.endsWith,
            OperatorId.iStartsWith,
            OperatorId.iEquals
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "text"
        name = "sPhone_SimpleType"
        validOperators = Seq(
            OperatorId.contains,
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.iContains,
            OperatorId.startsWith,
            OperatorId.inSet,
            OperatorId.iNotEqual,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.notNull,
            OperatorId.endsWith,
            OperatorId.endsWith,
            OperatorId.iStartsWith,
            OperatorId.iEquals
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "text"
        name = "sPostalIndex_SimpleType"
        validOperators = Seq(
            OperatorId.contains,
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.iContains,
            OperatorId.startsWith,
            OperatorId.inSet,
            OperatorId.iNotEqual,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.notNull,
            OperatorId.endsWith,
            OperatorId.endsWith,
            OperatorId.iStartsWith,
            OperatorId.iEquals
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "link"
        name = "sURL_SimpleType"
        validOperators = Seq(
            OperatorId.contains,
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.iContains,
            OperatorId.startsWith,
            OperatorId.inSet,
            OperatorId.iNotEqual,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.notNull,
            OperatorId.endsWith,
            OperatorId.endsWith,
            OperatorId.iStartsWith,
            OperatorId.iEquals
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "text"
        name = "sURLDomain_SimpleType"
        validOperators = Seq(
            OperatorId.contains,
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.iContains,
            OperatorId.startsWith,
            OperatorId.inSet,
            OperatorId.iNotEqual,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.notNull,
            OperatorId.endsWith,
            OperatorId.endsWith,
            OperatorId.iStartsWith,
            OperatorId.iEquals
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "image"
        name = "sURLImage_SimpleType"
        validOperators = Seq(
            OperatorId.contains,
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.iContains,
            OperatorId.startsWith,
            OperatorId.inSet,
            OperatorId.iNotEqual,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.notNull,
            OperatorId.endsWith,
            OperatorId.endsWith,
            OperatorId.iStartsWith,
            OperatorId.iEquals
        )
    })

    SimpleType.create(new SimpleTypeProps {
        inheritsFrom = "text"
        name = "ss_SimpleType"
        validOperators = Seq(
            OperatorId.isNull,
            OperatorId.notInSet,
            OperatorId.equalsField,
            OperatorId.inSet,
            OperatorId.notEqualField,
            OperatorId.notEqual,
            OperatorId.equals,
            OperatorId.notNull
        )
    })
}
