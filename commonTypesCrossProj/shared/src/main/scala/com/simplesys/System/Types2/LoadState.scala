package com.simplesys.System.Types2

import language.implicitConversions

object LoadState extends Enumeration {
    type LoadState = Value
    val unloaded, loading, foldersLoaded, loaded, loadedPartialChildren = Value
}
