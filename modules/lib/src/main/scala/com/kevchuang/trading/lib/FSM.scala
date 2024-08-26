package com.kevchuang.trading.lib

import cats.{Functor, Id}
import cats.syntax.all.*

final case class FSM[F[_], S, I, O](run: (S, I) => F[(S, O)]):
  def runS(using Functor[F]): (S, I) => F[S] =
    (s, i) => run(s, i).map((s, _) => s)

object FSM:
  def identity[S, I, O](run: (S, I) => Id[(S, O)]): FSM[Id, S, I, O] =
    FSM(run)
end FSM
