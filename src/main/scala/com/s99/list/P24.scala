package com.s99.list

import scala.annotation.tailrec
import scala.util.Random

/**
 * Lotto: Draw N different random numbers from the set 1..M.
 */
object P24 extends App {

  def lottoTailRec(n: Int, max: Int): List[Int] = {
    @tailrec
    def iter(acc: List[Int], i: Int): List[Int] = {
      if (i == 0) acc
      else iter(acc :+ Random.nextInt(max), i - 1)
    }

    iter(Nil, n)
  }

  def lottoBuiltin(n: Int, max: Int): List[Int] = {
    P23.randomSelect(n, List.range(1, max + 1))
  }

}
