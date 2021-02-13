package com.s99.list

import scala.annotation.tailrec
import scala.util.Random

/**
 * Extract a given number of randomly selected elements from a list.
 */
object P23 extends App {

  def randomSelect[A](i: Int, list: List[A]): List[A] = {
    val random: Random = new Random()

    @tailrec
    def iter(acc: List[A], i: Int, list: List[A]): List[A] = {
      if (i == 0) acc
      else {
        val randomIndex = random.nextInt(list.length)
        iter(list(randomIndex) :: acc, i - 1, P20.removeAt(randomIndex, list)._1)
      }
    }

    iter(Nil, i, list)
  }

}
