package com.s99.list

/**
 * Drop every Nth element from a list.
 */
object P16 extends App {

  def dropFunctional[A](n: Int, list: List[A]): List[A] = {
    for {
      (e, idx) <- list.zipWithIndex
      if (idx + 1) % n != 0
    } yield e
  }

  def dropFunctional[A](n: Int, list: List[A]): List[A] =
    list.zipWithIndex.filter(t => (t._2 + 1) % n != 0).map(_._1)

}
