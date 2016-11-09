package com.simplesys.app

import com.simplesys.SmartClient.DataBinding.props.DataViewProps
import com.simplesys.SmartClient.System.{DataView, FileLoader, Page, isc, simpleSyS}
import com.simplesys.System.Types._
import com.simplesys.System._
import com.simplesys.option.DoubleType._
import com.simplesys.option.ScOption._

import scala.scalajs.js.annotation.JSExport

@JSExport
class TestApp {
    val identifier: ID = "5814FE1C-252A-01C4-55A1-557FA9992D3F"
    val appImageDir = "images/"

    @JSExport
    def getUIContent() {
        Page.setEvent(
            PageEvent.load, {
                (target: JSObject) =>

                    isc.params.locale = "ru_RU"
                    //isc.params.locale = "en"

                    isc debugTrap 0

                    val skin: String = simpleSyS.skin.toOption match {
                        case Some(skin) => skin
                        case None => isc.OfflineSS.get(s"Skin$identifier", Skin.Enterprise.toString)
                    }

                    simpleSyS.skin = skin

                    Page setAppImgDir appImageDir

                    FileLoader.loadSkin(
                        skin, {
                            () =>
                                var localeFile = "isomorphic/locales/frameworkMessages.properties"
                                if (isc.params.locale != "en")
                                    localeFile = "isomorphic/locales/frameworkMessages_" + isc.params.locale + ".properties"

                                FileLoader.loadJSFiles(localeFile, {
                                    () =>
                                        isc debugTrap 0
                                        DataView.create(
                                            new DataViewProps {
                                                height = "100%"
                                                width = "100%"
                                                members = Seq(
                                                ).opt
                                            }
                                        )

                                })
                        }
                    )
            }
        )
    }
}
