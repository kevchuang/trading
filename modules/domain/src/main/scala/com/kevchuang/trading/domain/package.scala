package com.kevchuang.trading

import io.github.iltotore.iron.*
import io.github.iltotore.iron.constraint.all.*

import java.time.Instant
import java.util.UUID

package object domain:
  export OrphanInstances.given

  opaque type CommandId = UUID :| Pure
  object CommandId extends RefinedTypeOps[UUID, Pure, CommandId]

  opaque type CorrelationId = UUID :| Pure
  object CorrelationId extends RefinedTypeOps[UUID, Pure, CorrelationId]

  opaque type EventId = UUID :| Pure
  object EventId extends RefinedTypeOps[UUID, Pure, EventId]
  
  opaque type Price = BigDecimal :| Positive
  object Price extends RefinedTypeOps[BigDecimal, Positive, Price]

  opaque type Source = String :| Not[Empty]
  object Source extends RefinedTypeOps[String, Not[Empty], Source]

  opaque type Quantity = Int :| Positive
  object Quantity extends RefinedTypeOps[Int, Positive, Quantity]

  opaque type Timestamp = Instant :| Pure
  object Timestamp extends RefinedTypeOps[Instant, Pure, Timestamp]
end domain
