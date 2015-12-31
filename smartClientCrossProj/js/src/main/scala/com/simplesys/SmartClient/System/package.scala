package com.simplesys.SmartClient

import com.simplesys.SmartClient.System.inst.{Page, Class}
import com.simplesys.SmartClient.System.props.{PageProps, ClassProps}
import com.simplesys.macros.PropsToDictionary

package object System {
    object Class extends AbstractClass[Class, ClassProps]
    object Page extends AbstractPage[Page, PageProps]
}
