//import com.simplesys.build.CommonSettings
//import com.typesafe.sbt.GitVersioning
//import com.typesafe.sbt.SbtGit.git
//import sbt._
//
//object PluginsBuild extends Build {
//    override def settings: Seq[Def.Setting[_]] = super.settings ++ CommonSettings.defaultSettings ++ Seq(
//        git.baseVersion := CommonSettings.settingValues.baseVersion
//    )
//
//    lazy val root = Project(id = "buildPlugins", base = file(".")).enablePlugins(GitVersioning)
//
//}
