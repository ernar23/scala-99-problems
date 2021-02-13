package com.s99.list

/**
 * Duplicate the elements of a list.
 */
object P14 extends App {

  def duplicate[A](list: List[A]): List[A] =
    list flatMap { e => List.fill(2)(e) }

}
