package com.s99.list

import scala.annotation.tailrec

/**
 * Find the Kth element of a list.
 */
object P03 extends App {

  @tailrec
  def nthTailRec[A](n: Int, list: List[A]): A = {
    if (n == 0) {
      if (list.isEmpty) throw new NoSuchElementException
      else list.head
    } else {
      if (list.isEmpty) throw new NoSuchElementException
      else nthTailRec(n - 1, list.tail)
    }
  }

  @tailrec
  def nthTailRec2[A](n: Int, list: List[A]): A = {
    (n, list) match {
      case (0, Nil) => throw new NoSuchElementException
      case (0, head :: _) => head
      case (_, Nil) => throw new NoSuchElementException
      case (n, _ :: tail) => nthTailRec2(n - 1, tail)
    }
  }

  def nthBuiltin[A](n: Int, list: List[A]): A =
    if (list.isEmpty) throw new NoSuchElementException
    else list(n)

}
