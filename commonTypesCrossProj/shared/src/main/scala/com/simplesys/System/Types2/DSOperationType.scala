package com.simplesys.System.Types2

import language.implicitConversions

object DSOperationType extends Enumeration {
    type DSOperationType = Value
    val fetch, add, update, remove, custom, validate, viewFile, downloadFile, storeTestData, clientExport, getFile, hasFile, listFiles, removeFile, saveFile, renameFile, getFileVersion, hasFileVersion, listFileVersions, removeFileVersion = Value
}
