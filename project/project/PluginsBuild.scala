
import com.simplesys.build.{CommonSettings, PluginDeps}
import com.typesafe.sbt.SbtGit.git
import sbt._

object PluginsBuild extends Build {
    override def settings: Seq[Def.Setting[_]] = super.settings ++ CommonSettings.defaultProjectSettings ++ Seq(
        git.baseVersion := CommonSettings.settingValues.baseVersion
    )

    lazy val root = Project(id = "buildPlugins", base = file(".")).settings(
        PluginDeps.scalaJSPlugin,
        PluginDeps.xsbtWeb,
        PluginDeps.mergeJS,
        PluginDeps.transpileCoffeeScript
    )
}
