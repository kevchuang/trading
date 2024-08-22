import Dependencies.*
import sbt.Keys.*
import sbt.{Def, *}

object BuildHelper {
  val scala3 = "3.4.1"

  def nameSettings(moduleName: String): List[Setting[String]] = List(
    name             := moduleName,
    organization     := "com.kevchuang",
    organizationName := "kevchuang"
  )

  val commonSettings
      : List[Def.Setting[? >: Boolean & Task[Seq[String]] & Seq[ModuleID] & String & Seq[TestFramework]]] =
    List(
      ThisBuild / scalaVersion := scala3,
      scalacOptions            := ScalaSettings.baseSettings,
      Test / parallelExecution := true,
      ThisBuild / fork         := true,
      run / fork               := true,
      testFrameworks += new TestFramework("weaver.framework.CatsEffect"),
      libraryDependencies ++= List(
        Libraries.catsCore,
        Libraries.catsEffect,
        Libraries.circeCore,
        Libraries.circeParser,
        Libraries.cirisCore,
        Libraries.fs2Core,
        Libraries.kittens,
        Libraries.ip4sCore,
        Libraries.log4catsNoop,
        Libraries.monocleCore,
        Libraries.catsLaws         % Test,
        Libraries.monocleLaw       % Test,
        Libraries.scalacheck       % Test,
        Libraries.weaverCats       % Test,
        Libraries.weaverDiscipline % Test,
        Libraries.weaverScalaCheck % Test
      )
    )

}
