package com.s99.arithmetic

import scala.annotation.tailrec

/**
 * Determine the prime factors of a given positive integer.
 */
object P35 extends App {

  def primeFactors(num: Int): List[Int] = {
    @tailrec
    def iter(acc: List[Int], x: Int): List[Int] = {
      if (x == 1) acc.sorted
      else {
        val res = (2 to x).find(x % _ == 0).getOrElse(throw new IllegalArgumentException)
        iter(res :: acc, x / res)
      }
    }

    iter(Nil, num)
  }

}
