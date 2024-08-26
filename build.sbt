import BuildHelper.*
import Dependencies.Libraries

lazy val root = (project in file("."))
  .settings(nameSettings("trading"))
  .aggregate(core)

lazy val core = (project in file("modules/core"))
  .settings(commonSettings)

lazy val domain = (project in file("modules/domain"))
  .settings(commonSettings)
  .settings(
    libraryDependencies ++= List(
      Libraries.ironCore,
      Libraries.ironCirce,
      Libraries.ironCats
    )
  )

lazy val lib = (project in file("modules/lib"))
  .settings(commonSettings)
