package com.s99.list

/**
 * Run-length encoding of a list.
 */
object P10 extends App {

  def encode[A](list: List[A]): List[(Int, A)] =
    P09.pack(list) map { e => (e.size, e.head) }

}
