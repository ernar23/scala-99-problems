package com.s99.list

import scala.annotation.tailrec

/**
 * Create a list containing all integers within a given range.
 */
object P22 extends App {

  def range(start: Int, end: Int): List[Int] = {
    @tailrec
    def iter(s: Int, acc: List[Int]): List[Int] = {
      if (s > end) acc
      else iter(s + 1, acc :+ s)
    }

    if (start > end) throw new IllegalArgumentException(s"$start is bigger than $end")
    else iter(start, Nil)
  }

}
