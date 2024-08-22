import sbt.*

object Dependencies {
  object V {
    val cats          = "2.12.0"
    val catsEffect    = "3.5.4"
    val circe         = "0.14.6"
    val ciris         = "3.6.0"
    val doobie        = "1.0.0-RC4"
    val flyway        = "8.5.13"
    val fs2Core       = "3.10.2"
    val fs2Kafka      = "3.4.0"
    val http4s        = "1.0.0-M41"
    val http4sMetrics = "1.0.0-M38"
    val http4sWs      = "1.0.0-M9"
    val ip4s          = "3.5.0"
    val iron          = "2.6.0"
    val kittens       = "3.3.0"
    val log4cats      = "2.7.0"
    val monocle       = "3.2.0"
    val natchez       = "0.3.5"
    val natchezHttp4s = "0.5.0"
    val neutron       = "0.8.0"
    val odin          = "0.13.0"
    val redis4cats    = "1.7.1"
    val refined       = "0.11.1"

    val scalajsTime = "2.4.0"
    val tyrian      = "0.6.1"

    val scalacheck = "1.18.0"
    val weaver     = "0.8.4"
  }

  object Libraries {
    val catsCore   = "org.typelevel" %% "cats-core"   % V.cats
    val catsEffect = "org.typelevel" %% "cats-effect" % V.catsEffect
    val kittens    = "org.typelevel" %% "kittens"     % V.kittens
    val fs2Core    = "co.fs2"        %% "fs2-core"    % V.fs2Core

    val circeCore   = "io.circe" %% s"circe-core"   % V.circe
    val circeParser = "io.circe" %% s"circe-parser" % V.circe

    val cirisCore = "is.cir" %% "ciris" % V.ciris

    val http4sDsl    = "org.http4s" %% s"http4s-dsl"          % V.http4s
    val http4sServer = "org.http4s" %% s"http4s-ember-server" % V.http4s
    val http4sClient = "org.http4s" %% s"http4s-ember-client" % V.http4s
    val http4sCirce  = "org.http4s" %% s"http4s-circe"        % V.http4s

    val ip4sCore = "com.comcast" %% "ip4s-core" % V.ip4s

    val ironCore  = "io.github.iltotore" %% "iron"       % V.iron
    val ironCats  = "io.github.iltotore" %% "iron-cats"  % V.iron
    val ironCirce = "io.github.iltotore" %% "iron-circe" % V.iron
    val ironCiris = "io.github.iltotore" %% "iron-ciris" % V.iron

    val monocleCore = "dev.optics" %% "monocle-core" % V.monocle

    val neutronCore       = "dev.profunktor" %% "neutron-core"       % V.neutron
    val redis4catsEffects = "dev.profunktor" %% "redis4cats-effects" % V.redis4cats

    // only for ember
    val log4catsNoop = "org.typelevel" %% "log4cats-noop" % V.log4cats

    // test
    val catsLaws         = "org.typelevel"       %% "cats-laws"         % V.cats
    val monocleLaw       = "dev.optics"          %% "monocle-law"       % V.monocle
    val scalacheck       = "org.scalacheck"      %% "scalacheck"        % V.scalacheck
    val weaverCats       = "com.disneystreaming" %% "weaver-cats"       % V.weaver
    val weaverDiscipline = "com.disneystreaming" %% "weaver-discipline" % V.weaver
    val weaverScalaCheck = "com.disneystreaming" %% "weaver-scalacheck" % V.weaver
  }
}
