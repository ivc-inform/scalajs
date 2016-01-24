package com.simplesys

package object common {
    implicit class StringOpts(str: String) {
        def dblQuoted: String = "\"" + str + "\""
    }
}
