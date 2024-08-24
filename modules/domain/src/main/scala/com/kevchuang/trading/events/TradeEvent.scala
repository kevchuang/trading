package com.kevchuang.trading.events

import com.kevchuang.trading.commands.TradeCommand
import com.kevchuang.trading.domain.{CorrelationId, EventId, Timestamp}
import io.circe.Codec
import io.github.iltotore.iron.circe.given

enum TradeEvent derives Codec.AsObject:
  def id: EventId
  def cid: CorrelationId
  def command: TradeCommand
  def createdAt: Timestamp

  case CommandExecuted(
      id: EventId,
      cid: CorrelationId,
      command: TradeCommand,
      createdAt: Timestamp
  )

  case CommandRejected(
      id: EventId,
      cid: CorrelationId,
      command: TradeCommand,
      createdAt: Timestamp
  )
end TradeEvent
