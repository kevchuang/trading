package com.kevchuang.trading.domain

import cats.Monoid
import io.github.iltotore.iron.*
import io.github.iltotore.iron.constraint.all.*

type SymbolConstraint = Match["^[a-zA-Z0-9]{6}$"] DescribedAs "A Symbol should be an alphanumeric of 6 digits"
opaque type Symbol    = String :| SymbolConstraint

object Symbol extends RefinedTypeOps[String, SymbolConstraint, Symbol]:
  lazy val CHFEUR: Symbol = Symbol("CHFEUR")
  lazy val EURPLN: Symbol = Symbol("EURPLN")
  lazy val EURUSD: Symbol = Symbol("EURUSD")
  lazy val GBPUSD: Symbol = Symbol("GBPUSD")
  lazy val AUDCAD: Symbol = Symbol("AUDCAD")
  lazy val USDCAD: Symbol = Symbol("USDCAD")
  lazy val CHFGBP: Symbol = Symbol("CHFGBP")
  lazy val EMPTY: Symbol  = Symbol("XXXXXX")

  given Monoid[Symbol] with
    def empty: Symbol = EMPTY
    def combine(x: Symbol, y: Symbol): Symbol =
      (x, y) match
        case (EMPTY, z) => z
        case (z, EMPTY) => z
        case (_, z)     => z
end Symbol
