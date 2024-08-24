package com.kevchuang.trading.domain

import cats.{Eq, Order, Show}

import java.time.Instant

object OrphanInstances:
  given Eq[Instant]    = Eq.by(_.getEpochSecond)
  given Order[Instant] = Order.by(_.getEpochSecond)
  given Show[Instant]  = Show.show[Instant](_.toString)
end OrphanInstances
