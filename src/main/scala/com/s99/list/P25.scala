package com.s99.list

/**
 * Generate a random permutation of the elements of a list.
 */
object P25 extends App {

  def randomPermute[A](list: List[A]): List[A] = P23.randomSelect(list.length, list)

}
