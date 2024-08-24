package com.kevchuang.trading.commands

import cats.derived.*
import cats.{Eq, Show}
import com.kevchuang.trading.domain.{*, given}
import io.circe.Codec
import io.github.iltotore.iron.cats.given
import io.github.iltotore.iron.circe.given

enum SwitchCommand derives Codec.AsObject, Eq, Show:
  def id: CommandId
  def cid: CorrelationId
  def createdAt: Timestamp

  case Start(
      id: CommandId,
      cid: CorrelationId,
      createdAt: Timestamp
  )

  case Stop(
      id: CommandId,
      cid: CorrelationId,
      createdAt: Timestamp
  )
end SwitchCommand
