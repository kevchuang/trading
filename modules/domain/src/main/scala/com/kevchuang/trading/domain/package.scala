package com.kevchuang.trading

import io.github.iltotore.iron.*
import io.github.iltotore.iron.constraint.all.Positive

import java.time.Instant
import java.util.UUID

package object domain:
  opaque type CommandId = UUID :| Pure
  object CommandId extends RefinedTypeOps[UUID, Pure, CommandId]

  opaque type CorrelationId = UUID :| Pure
  object CorrelationId extends RefinedTypeOps[UUID, Pure, CorrelationId]

  opaque type Quantity = Int :| Positive
  object Quantity extends RefinedTypeOps[Int, Positive, Quantity]

  opaque type Timestamp = Instant :| Pure
  object Timestamp extends RefinedTypeOps[Instant, Pure, Timestamp]
end domain
