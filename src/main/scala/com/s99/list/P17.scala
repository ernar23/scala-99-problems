package com.s99.list

import scala.annotation.tailrec

/**
 * Split a list into two parts.
 */
object P17 extends App {

  def splitBuiltin[A](n: Int, list: List[A]): (List[A], List[A]) = list.splitAt(n)

  def splitTailRec[A](n: Int, list: List[A]): (List[A], List[A]) = {
    @tailrec
    def iter(n: Int, acc: List[A], ls: List[A]): (List[A], List[A]) = {
      if (ls.isEmpty || n == 0) (acc, ls)
      else iter(n - 1, acc :+ ls.head, ls.tail)
    }

    iter(n, Nil, list)
  }

  def splitBuiltin2[A](n: Int, list: List[A]): (List[A], List[A]) = (list.take(n), list.drop(n))

}
