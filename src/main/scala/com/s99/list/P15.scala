package com.s99.list

/**
 * Duplicate the elements of a list a given number of times.
 */
object P15 extends App {

  def duplicateN[A](n: Int, list: List[A]): List[A] =
    list flatMap { e => List.fill(n)(e) }

}
