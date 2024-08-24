package com.kevchuang.trading.commands

import cats.derived.*
import cats.{Eq, Show}
import com.kevchuang.trading.domain.{*, given}
import io.circe.Codec
import io.github.iltotore.iron.cats.given
import io.github.iltotore.iron.circe.given

enum TradeCommand derives Codec.AsObject, Eq, Show:
  def id: CommandId
  def cid: CorrelationId
  def symbol: Symbol
  def createdAt: Timestamp

  case Create(
      id: CommandId,
      cid: CorrelationId,
      symbol: Symbol,
      tradeAction: TradeAction,
      price: Price,
      quantity: Quantity,
      source: Source,
      createdAt: Timestamp
  )

  case Update(
      id: CommandId,
      cid: CorrelationId,
      symbol: Symbol,
      tradeAction: TradeAction,
      price: Price,
      quantity: Quantity,
      source: Source,
      createdAt: Timestamp
  )

  case Delete(
      id: CommandId,
      cid: CorrelationId,
      symbol: Symbol,
      tradeAction: TradeAction,
      price: Price,
      source: Source,
      createdAt: Timestamp
  )

end TradeCommand
