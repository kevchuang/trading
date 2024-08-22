import BuildHelper.*

lazy val root = (project in file("."))
  .settings(nameSettings("trading"))
  .aggregate(core)

lazy val core = (project in file("modules/core"))
  .settings(commonSettings)
