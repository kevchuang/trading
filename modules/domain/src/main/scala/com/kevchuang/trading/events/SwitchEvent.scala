package com.kevchuang.trading.events

import cats.Show
import cats.derived.*
import com.kevchuang.trading.domain.{*, given}
import io.circe.Codec
import io.github.iltotore.iron.cats.given
import io.github.iltotore.iron.circe.given

enum SwitchEvent derives Codec.AsObject, Show:
  def id: EventId
  def cid: CorrelationId
  def createdAt: Timestamp

  case Started(
      id: EventId,
      cid: CorrelationId,
      createdAt: Timestamp
  )

  case Stopped(
      id: EventId,
      cid: CorrelationId,
      createdAt: Timestamp
  )

  case Ignored(
      id: EventId,
      cid: CorrelationId,
      createdAt: Timestamp
  )
end SwitchEvent
