package com.s99.list

import scala.annotation.tailrec

/**
 * Remove the Kth element from a list.
 * Return the list and the removed element in a Tuple. Elements are numbered from 0.
 */
object P20 extends App {

  def removeAt[A](n: Int, list: List[A]): (List[A], A) = {
    @tailrec
    def iter(acc: Int, ls: List[A]): (List[A], A) = {
      if (acc == 0) (list.take(n) ++ ls.tail, ls.head)
      else iter(acc - 1, ls.tail)
    }

    iter(n, list)
  }

}
