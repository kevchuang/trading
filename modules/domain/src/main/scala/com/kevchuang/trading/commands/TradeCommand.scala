package com.kevchuang.trading.commands

import cats.derived.*
import cats.{Eq, Show}
import com.kevchuang.trading.domain.{CommandId, CorrelationId}
import io.circe.Codec
import io.github.iltotore.iron.cats.given
import io.github.iltotore.iron.circe.given

enum TradeCommand derives Codec.AsObject, Eq, Show:
  def id: CommandId

  case Create(
      id: CommandId,
      cid: CorrelationId
  )

end TradeCommand
